package client;

import client.exception.CommonException;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.example.*;

import java.util.Scanner;

public class Client {

    private final StudentClient studentClient;
    private final CourseClient courseClient;
    private final RegistrationClient registrationClient;
    private final ManagedChannel channel;
    private static Scanner scanner;
    private String token;

    private Client(){
        channel= ManagedChannelBuilder.forAddress("localhost",8080)
                .usePlaintext()
                .build();
        StudentServiceGrpc.StudentServiceBlockingStub sStub=StudentServiceGrpc.newBlockingStub(channel);
        CourseServiceGrpc.CourseServiceBlockingStub cStub=CourseServiceGrpc.newBlockingStub(channel);
        RegistrationServiceGrpc.RegistrationServiceBlockingStub rStub=RegistrationServiceGrpc.newBlockingStub(channel);
        scanner=new Scanner(System.in);
        studentClient=new StudentClient(scanner, sStub);
        courseClient=new CourseClient(scanner, cStub);
        registrationClient=new RegistrationClient(scanner, rStub);
    }

    public static void main(String[] args){
        Client client=new Client();
        client.token=client.login();
        while(client.token!=null){
            printMenu();
            String value=scanner.next();
            switch(value){
                case "1":client.studentClient.getAllStudent(client.token); break;
                case "2":client.courseClient.getAllCourse(client.token); break;
                case "3":client.studentClient.addStudent(client.token);break;
                case "4":client.studentClient.deleteStudent(client.token);break;
                case "5":client.courseClient.addCourse(client.token);break;
                case "6":client.courseClient.deleteCourse(client.token);break;
                case "7":client.registrationClient.registration(client.token);break;
                case "x":logout(client); break;
                default: System.out.println("메뉴에 없는 요청입니다.");
            }
        }
    }

    private String login() {
        try{
            System.out.println("========로그인을 진행해주세요.========");
            System.out.print("id:");
            String id=scanner.next();
            System.out.print("pw:");
            String pw=scanner.next();
            DataServiceGrpc.DataServiceBlockingStub stub = DataServiceGrpc.newBlockingStub(channel);
            Response token=stub.login(StudentCertRequest.newBuilder()
                    .setId(id)
                    .setPw(pw)
                    .build());
            System.out.println("로그인 성공");
            return token.getMessage();
        }catch (Exception e) {
            CommonException.handleRpcException(e);
        }
        return null;
    }

    private static void printMenu(){
        System.out.println("\n========메뉴========");
        System.out.println("1. 전체 학생 정보 불러오기");
        System.out.println("2. 전체 과목 정보 불러오기");
        System.out.println("3. 학생 추가하기");
        System.out.println("4. 학생 지우기");
        System.out.println("5. 과목 추가하기");
        System.out.println("6. 과목 지우기");
        System.out.println("7. 수강 신청하기");
        System.out.println("x. 나가기");
    }

    private static void logout(Client client){
        try {
            client.token=null;
            client.channel.shutdown().awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS);// 채널을 안전하게 종료
            scanner.close();
            System.out.println("로그아웃 되었습니다.");
        } catch (InterruptedException e) {
            System.err.println("채널 종료 중 인터럽트 발생: " + e.getMessage());
        }
    }
}