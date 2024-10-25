package client;

import client.exception.CommonException;
import org.example.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CourseClient {
    private Scanner scanner;
    private CourseServiceGrpc.CourseServiceBlockingStub courseStub;
    public CourseClient(Scanner scanner, CourseServiceGrpc.CourseServiceBlockingStub cStub) {
        this.scanner=scanner;
        this.courseStub=cStub;
    }

    public void getAllCourse(String token){
        try{
            ResponseList studentList=courseStub.getCourseList(Request.newBuilder()
                    .setToken(token)
                    .setType("전체과목 불러오기")
                    .build());
            for(String s:studentList.getResponseList()){
                System.out.println(s+"\n");
            }
        } catch (Exception e) {
            CommonException.handleRpcException(e);
        }
    }

    public void addCourse(String token) {
        try{
            System.out.println("========추가할 과목 정보를 입력해주세요.========");
            System.out.print("과목 ID:"); String courseId=scanner.next();
            System.out.print("교수명:"); String professor=scanner.next();
            System.out.print("과목명:"); String className=scanner.next();scanner.nextLine();
            System.out.print("선수과목(띄어쓰기로 구분):"); String courses=scanner.nextLine();
            ArrayList<String> preCourses=new ArrayList<>(Arrays.asList(courses.split(" ")));
            Response response=courseStub.addCourse(Course.newBuilder()
                            .setId(courseId)
                            .setProfessor(professor)
                            .setClassName(className)
                            .addAllPreClass(preCourses)
                            .setToken(token)
                            .build());
            System.out.println(response.getMessage());
        }catch (Exception e){
            CommonException.handleRpcException(e);
        }
    }

    public void deleteCourse(String token) {
        try{
            System.out.println("========삭제할 과목 아이디를 입력해주세요.========");
            System.out.print("과목 ID:");
            String deleteId=scanner.next();
            Response response=courseStub.deleteCourse(Request.newBuilder()
                    .setToken(token)
                    .setType("과목 삭제하기")
                    .setPayload(deleteId)
                    .build());
            System.out.println(response.getMessage());
        }catch(Exception e){
            CommonException.handleRpcException(e);
        }
    }
}
