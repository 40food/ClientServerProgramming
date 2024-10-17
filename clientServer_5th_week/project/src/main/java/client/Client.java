package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import org.example.DataServiceGrpc;
import org.example.StudentResponse;

import java.util.Scanner;

public class Client {

    private final StudentClient studentClient;
    private final CourseClient courseClient;
    private final ManagedChannel channel;
    private final DataServiceGrpc.DataServiceBlockingStub stub;
    private static Scanner scanner;
    private StudentResponse loginStudent;

    private Client(){
        channel= ManagedChannelBuilder.forAddress("localhost",8080)
                .usePlaintext()
                .build();
        stub=DataServiceGrpc.newBlockingStub(channel);
        scanner=new Scanner(System.in);
        studentClient=new StudentClient(scanner,stub);
        courseClient=new CourseClient(scanner,stub);
    }

    public static void main(String[] args){
        Client client=new Client();
        client.loginStudent=client.studentClient.login();
        while(client.loginStudent!=null){
            printMenu();
            String value=scanner.next();
            switch(value){
                case "1":client.studentClient.getAllStudent(client.loginStudent.getId()); break;
                case "2":client.courseClient.getAllCourse(client.loginStudent.getId()); break;
                case "3":client.studentClient.addStudent(client.loginStudent.getId());break;
                case "4":client.studentClient.deleteStudent(client.loginStudent.getId());break;
                case "x":logout(client); break;
                default: System.out.println("메뉴에 없는 요청입니다.");
            }
        }
    }

    private static void printMenu(){
        System.out.println("\n========메뉴========");
        System.out.println("1. 전체 학생 정보 불러오기");
        System.out.println("2. 전체 과목 정보 불러오기");
        System.out.println("3. 학생 추가하기");
        System.out.println("4. 학생 지우기");
        System.out.println("5. 과목 추가하기-미완");
        System.out.println("6. 과목 지우기-미완");
        System.out.println("7. 수강 신청하기-미완");
        System.out.println("x. 나가기");
    }

    private static void logout(Client client){
        try {
            client.loginStudent=null;
            client.channel.shutdown().awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS);// 채널을 안전하게 종료
            scanner.close();
            System.out.println("로그아웃 되었습니다.");
        } catch (InterruptedException e) {
            System.err.println("채널 종료 중 인터럽트 발생: " + e.getMessage());
        }
    }
}