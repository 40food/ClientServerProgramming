package client;

import client.exception.CommonException;
import org.example.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentClient {
    private StudentServiceGrpc.StudentServiceBlockingStub studentStub;
    private Scanner scanner;

    public StudentClient(Scanner scanner, StudentServiceGrpc.StudentServiceBlockingStub sStub) {
        this.scanner=scanner;
        this.studentStub=sStub;
    }

    public void getAllStudent(String token){
        try{
            ResponseList studentList=studentStub.getStudentList(Request.newBuilder()
                    .setToken(token)
                    .setType("전체학생 불러오기")
                    .build());

            for(String s:studentList.getResponseList()){
                System.out.println(s+"\n");
            }
        } catch (Exception e) {
            CommonException.handleRpcException(e);
        }
    }

    public void addStudent(String token) {
        try{
            System.out.println("========추가할 학생 정보를 입력해주세요.========");
            System.out.print("아이디:"); String id=scanner.next();
            System.out.print("비밀번호:"); String pw=scanner.next();
            System.out.print("학생ID:"); String studentId=scanner.next();
            System.out.print("이름:"); String name=scanner.next();
            System.out.print("학과:"); String dept=scanner.next(); scanner.nextLine();
            System.out.print("수강 과목(띄어쓰기로 구분):"); String courses=scanner.nextLine();
            ArrayList<String> completedCourses=new ArrayList<>(Arrays.asList(courses.split(" ")));
            Response response=studentStub.addStudent(Student.newBuilder()
                            .setStudentId(studentId)
                            .setName(name)
                            .setDepartment(dept)
                            .addAllCourseList(completedCourses)
                            .setToken(token)
                            .setId(id)
                            .setPw(pw)
                            .build());
            System.out.println(response.getMessage());
        }catch (Exception e){
            CommonException.handleRpcException(e);
        }
    }

    public void deleteStudent(String token){
        try{
            System.out.println("========삭제할 학생 아이디를 입력해주세요.========");
            System.out.print("학생ID:");
            String deleteId=scanner.next();
            Response response=studentStub.deleteStudent(Request.newBuilder()
                    .setToken(token)
                    .setType("학생 삭제하기")
                    .setPayload(deleteId)
                    .build());
            System.out.println(response.getMessage());
        }catch(Exception e){
            CommonException.handleRpcException(e);
        }
    }
}
