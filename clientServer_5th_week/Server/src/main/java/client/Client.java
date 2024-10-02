package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import java.util.Scanner;

public class Client {

    private StudentClient studentClient;
    private CourseClient courseClient;

    private Client(){
        studentClient=new StudentClient();
        courseClient=new CourseClient();
    }

    public static void main(String[] args){
        Client client=new Client();
        Scanner scanner=new Scanner(System.in);

        System.out.println("========수강 신청 시스템========");
        System.out.println("1. 전체 학생 정보 불러오기");
        System.out.println("2. 전체 과목 정보 불러오기");

        String value=scanner.nextLine();

        switch(value){
            case "1":
                client.studentClient.getAllStudent();
                break;
            case "2":
                client.courseClient.getAllCourse();
                break;
            default:
                System.out.println("메뉴에 없는 요청입니다.");
        }
    }
}
