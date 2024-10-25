package data.Service;

import data.Course.Course;
import data.Course.CourseList;
import data.Student.Student;
import data.Student.StudentList;
import data.exception.NullDataException;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.example.*;

import java.io.*;
import java.time.Instant;

public class StudentServiceImpl extends ServerStudentServiceGrpc.ServerStudentServiceImplBase {
    protected static StudentList studentList;
    private final String studentPath;

    public StudentServiceImpl(String studentPath) {
        this.studentPath=studentPath;
    }

    @Override
    public void getStudentList(Request request, StreamObserver<StudentsListResponse> responseObserver) {
        try{
            //작업 디렉토리 기준 상대경로로
            studentList= new StudentList(studentPath);
            StudentsListResponse.Builder builder=StudentsListResponse.newBuilder();
            for(Student i: studentList.getAllStudentRecords()){
                StudentResponse.Builder b=StudentResponse.newBuilder()
                        .setStudentId(i.getStudentId())
                        .setName(i.getName())
                        .setDepartment(i.getDepartment())
                        .addAllCourseList(i.getCompletedCoursesList())
                        .setId(i.getId())
                        .setPw(i.getPw());
                builder.addStudent(b.build());
            }
            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();
        }catch (IOException e) {
            StatusRuntimeException statusException= Status.INTERNAL
                    .withDescription(e.toString())
                    .asRuntimeException();
            responseObserver.onError(statusException);
            throw new RuntimeException(e);
        } catch (NullDataException e) {
            responseObserver.onError(Status.FAILED_PRECONDITION
                    .withDescription(e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void getStudent(Request request, StreamObserver<StudentResponse> responseObserver) {
        try {
            studentList=new StudentList(studentPath);
            StudentResponse.Builder builder=StudentResponse.newBuilder();
            Student result=studentList.getStudent(request.getPayload());
            builder.setId(result.getId())
                    .setPw(result.getPw())
                    .setStudentId(result.getStudentId())
                    .setName(result.getName())
                    .setDepartment(result.getDepartment())
                    .addAllCourseList(result.getCompletedCoursesList());
            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NullDataException e) {
            StatusRuntimeException statusException= Status.INTERNAL
                    .withDescription(e.toString())
                    .asRuntimeException();
            responseObserver.onError(statusException);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addStudent(Request request, StreamObserver<Response> responseObserver) {
        try{
            studentList=new StudentList(studentPath);
            boolean result= studentList.addStudentRecord(request.getPayload());
            if(result) {
                Response response = Response.newBuilder()
                        .setMessage("학생 추가 성공")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }else{
                throw new NullDataException("학생 추가 실패");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NullDataException e) {
            responseObserver.onError(Status.FAILED_PRECONDITION
                    .withDescription(e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void deleteStudent(Request request, StreamObserver<Response> responseObserver) {
        try{
            studentList=new StudentList(studentPath);
            boolean result= studentList.deleteStudentRecord(request.getPayload());
            if(result) {
                Response response = Response.newBuilder()
                        .setMessage("학생 삭제 성공")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }else{
                throw new NullDataException("학생 삭제 실패");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NullDataException e) {
            responseObserver.onError(Status.FAILED_PRECONDITION
                    .withDescription(e.getMessage())
                    .asRuntimeException());
        }
    }
}
