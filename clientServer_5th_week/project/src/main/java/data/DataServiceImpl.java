package data;

import data.Course.Course;
import data.Course.CourseList;
import data.Student.Student;
import data.Student.StudentList;
import io.grpc.Context;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.example.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;

public class DataServiceImpl extends DataServiceGrpc.DataServiceImplBase {
    protected static StudentList studentList;
    protected static CourseList courseList;

    private final String studentPath="src/main/java/data/file/Students.txt";
    private final String coursePath="src/main/java/data/file/Courses.txt";
    private final String logPath="src/main/java/data/file/Log.txt";


    @Override
    public void login(StudentCertRequest request, StreamObserver<StudentResponse> responseObserver) {
//        super.login(request, responseObserver);
        try {
            studentList = new StudentList(studentPath);
            Student student=studentList.isRegisteredStudent(request.getId(),request.getPw());

            logging(student.getStudentId(),"<로그인>", Instant.now());
            StudentResponse.Builder builder=StudentResponse.newBuilder()
                    .setId(student.getStudentId())
                    .setName(student.getName())
                    .setDepartment(student.getDepartment())
                    .addAllCourseList(student.getCompletedCoursesList());
            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();
        }catch (IOException e) {
            //파일 경로 오류
            StatusRuntimeException statusException= Status.INTERNAL
                    .withDescription(e.toString())
                    .asRuntimeException();
            responseObserver.onError(statusException);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void getStudentList(Request request, StreamObserver<StudentsListResponse> responseObserver) {
//        super.getStudentsList(request, responseObserver);
        logging(request.getRequestId(),"<전체 학생 조회>", Instant.now());
        try{
            //작업 디렉토리 기준 상대경로로
            studentList= new StudentList(studentPath);

            StudentsListResponse.Builder builder=StudentsListResponse.newBuilder();
            for(Student i: studentList.getAllStudentRecords()){
                StudentResponse.Builder b=StudentResponse.newBuilder()
                        .setId(i.getStudentId())
                        .setName(i.getName())
                        .setDepartment(i.getDepartment())
                        .addAllCourseList(i.getCompletedCoursesList());
                builder.addStudent(b.build());
            }

            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();
        }catch (IOException e) {
            //파일 경로 오류
            StatusRuntimeException statusException= Status.INTERNAL
                    .withDescription(e.toString())
                    .asRuntimeException();
            responseObserver.onError(statusException);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void getCourseList(Request request, StreamObserver<CourseListResponse> responseObserver) {
//        super.getCourseList(request, responseObserver);
        logging(request.getRequestId(),"<전체 과목 조회>", Instant.now());
        try{
            //작업 디렉토리 기준 상대경로로
            courseList = new CourseList(coursePath);

            CourseListResponse.Builder builder=CourseListResponse.newBuilder();
            for(Course i: courseList.getAllCourseRecords()){
                CourseResponse.Builder b=CourseResponse.newBuilder()
                        .setId(i.getCourseId())
                        .setProfessor(i.getProfessor())
                        .setClassName(i.getCourseName())
                        .addAllPreClass(i.getPreClass());
                builder.addCourse(b.build());
            }

            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();
        }catch (IOException e) {
            //파일 경로 오류
            StatusRuntimeException statusException= Status.INTERNAL
                    .withDescription(e.toString())
                    .asRuntimeException();
            responseObserver.onError(statusException);
            throw new RuntimeException(e);
        }
    }

    private void logging(String id, String type, Instant now){
        try {
            FileWriter fileWriter = new FileWriter(logPath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(id+" "+type+" "+now);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
