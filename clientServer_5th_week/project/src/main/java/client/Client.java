package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import org.example.DataServiceGrpc;
import org.example.StudentResponse;

import java.util.Scanner;

public class Client {

    private StudentClient studentClient;
    private CourseClient courseClient;
    private ManagedChannel channel;
    private DataServiceGrpc.DataServiceBlockingStub stub;
    private static Scanner scanner;
    private StudentResponse loginStudent;

    private Client(){
        channel= ManagedChannelBuilder.forAddress("localhost",8080)
                .usePlaintext()
                .build();
        stub=DataServiceGrpc.newBlockingStub(channel);
        scanner=new Scanner(System.in);
        studentClient=new StudentClient(stub);
        courseClient=new CourseClient(stub);
    }

    public static void main(String[] args){
        Client client=new Client();

        System.out.println("========로그인을 진행해주세요.========");
        System.out.print("id:");
        String id=scanner.next();
        System.out.print("pw:");
        String pw=scanner.next();
        client.loginStudent=client.studentClient.login(id,pw);

        while(client.loginStudent!=null){
            System.out.println("========메뉴========");
            System.out.println("1. 전체 학생 정보 불러오기");
            System.out.println("2. 전체 과목 정보 불러오기");
            System.out.println("3. 나가기");

            String value=scanner.next();
            switch(value){
                case "1":client.studentClient.getAllStudent(client.loginStudent.getId()); break;
                case "2":client.courseClient.getAllCourse(client.loginStudent.getId()); break;
                case "3":logout(client); break;
                default: System.out.println("메뉴에 없는 요청입니다.");
            }
        }
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