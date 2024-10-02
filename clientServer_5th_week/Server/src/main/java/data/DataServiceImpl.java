package data;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.example.*;

import java.io.IOException;

public class DataServiceImpl extends DataServiceGrpc.DataServiceImplBase {
    protected static StudentList studentList;
    protected static CourseList courseList;

    @Override
    public void getStudentList(Request request, StreamObserver<StudentsListResponse> responseObserver) {
//        super.getStudentsList(request, responseObserver);
        try{
            //작업 디렉토리 기준 상대경로로
            studentList= new StudentList("src/main/java/data/Students.txt");

            StudentsListResponse.Builder builder=StudentsListResponse.newBuilder();
            for(Student i: studentList.getAllStudentRecords()){
                StudentResponse.Builder b=StudentResponse.newBuilder()
                        .setId(i.studentId)
                        .setName(i.name)
                        .setDepartment(i.department)
                        .addAllCourseList(i.completedCoursesList);
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
        try{
            //작업 디렉토리 기준 상대경로로
            courseList = new CourseList("src/main/java/data/Courses.txt");

            CourseListResponse.Builder builder=CourseListResponse.newBuilder();
            for(Course i: courseList.getAllCourseRecords()){
                CourseResponse.Builder b=CourseResponse.newBuilder()
                        .setId(i.courseId)
                        .setProfessor(i.professor)
                        .setClassName(i.courseName)
                        .addAllPreClass(i.preClass);
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
}
