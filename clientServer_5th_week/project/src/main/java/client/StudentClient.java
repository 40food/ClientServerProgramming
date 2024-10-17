package client;

import client.exception.CommonException;
import io.grpc.Metadata;
import org.example.*;

import java.util.Scanner;

public class StudentClient {
    private static Metadata metaData;
    private DataServiceGrpc.DataServiceBlockingStub stub;
    private Scanner scanner;

    public StudentClient(Scanner scanner,DataServiceGrpc.DataServiceBlockingStub stub) {
        this.scanner=scanner;
        this.stub=stub;
    }

    public void getAllStudent(String id){
        try{
            ResponseList studentList=stub.multiRequest(Request.newBuilder()
                    .setRequestId(id)
                    .setType("전체학생 불러오기")
                    .build());

            for(String s:studentList.getResponseList()){
                System.out.println(s+"\n");
            }
        } catch (Exception e) {
            CommonException.handleRpcException(e);
        }
    }

    public StudentResponse login() {
        try{
            System.out.println("========로그인을 진행해주세요.========");
            System.out.print("id:");
            String id=scanner.next();
            System.out.print("pw:");
            String pw=scanner.next();
            StudentResponse student=stub.login(StudentCertRequest.newBuilder()
                    .setId(id)
                    .setPw(pw)
                    .build());
            if(student!=null){
                System.out.println("로그인 성공");
                System.out.println("현재 사용자: "+student.getName()+"\n");
                return student;
            }
        }catch (Exception e) {
            System.out.println("로그인 실패");
//            CommonException.handleRpcException(e);
        }
        return null;
    }

    public void addStudent(String userid) {
        try{
            System.out.println("========추가할 학생 정보를 입력해주세요.========");
            System.out.print("ID:"); String id=scanner.next();
            System.out.print("PW:"); String pw=scanner.next();
            System.out.print("Student ID:"); String studentId=scanner.next();
            System.out.print("Name:"); String name=scanner.next();
            System.out.print("Department:"); String dept=scanner.next(); scanner.nextLine();
            System.out.print("completed course(띄어쓰기로 구분):"); String completedCourse=scanner.nextLine();
            Response response=stub.request(Request.newBuilder()
                    .setRequestId(userid)
                    .setType("학생 추가하기")
                    .setPayload(id+" "+pw+" "+studentId+" "+name+" "+dept+" "+completedCourse)
                    .build());
            System.out.println(response.getMessage());
        }catch (Exception e){
            CommonException.handleRpcException(e);
        }
    }

    public void deleteStudent(String id){
        try{
            System.out.println("========삭제할 학생 아이디를 입력해주세요.========");
            System.out.print("Student ID:");
            String deleteId=scanner.next();
            Response response=stub.request(Request.newBuilder()
                    .setRequestId(id)
                    .setType("학생 삭제하기")
                    .setPayload(deleteId)
                    .build());
            System.out.println(response.getMessage());
        }catch(Exception e){
            CommonException.handleRpcException(e);
        }
    }
}
