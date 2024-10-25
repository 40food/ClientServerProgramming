package data.Service;

import data.Course.Course;
import data.Course.CourseList;
import data.exception.NullDataException;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.example.*;

import java.io.IOException;

public class CourseServiceImpl extends ServerCourseServiceGrpc.ServerCourseServiceImplBase {
    private CourseList courseList;
    private final String filePath;

    public CourseServiceImpl(String filePath){
        this.filePath = filePath;
    }

    @Override
    public void getCourseList(Request request, StreamObserver<CourseListResponse> responseObserver) {
        try{
            courseList = new CourseList(filePath);

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
        }catch (IOException e) {//파일 경로 오류
            StatusRuntimeException statusException= Status.INTERNAL
                    .withDescription(e.toString())
                    .asRuntimeException();
            responseObserver.onError(statusException);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void getCourse(Request request, StreamObserver<CourseResponse> responseObserver) {
        try {
            courseList=new CourseList(filePath);
            CourseResponse.Builder builder=CourseResponse.newBuilder();
            Course result=courseList.getCourse(request.getPayload());
            builder.setId(result.getCourseId())
                    .setProfessor(result.getProfessor())
                    .setClassName(result.getCourseName())
                    .addAllPreClass(result.getPreClass());
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
    public void addCourse(Request request, StreamObserver<Response> responseObserver) {
        try{
            courseList=new CourseList(filePath);
            boolean result= courseList.addCourse(request.getPayload());
            if(result) {
                Response response = Response.newBuilder()
                        .setMessage("과목 추가 성공")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }else{
                throw new NullDataException("과목 추가 실패");
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
    public void deleteCourse(Request request, StreamObserver<Response> responseObserver) {
        try{
            courseList=new CourseList(filePath);
            boolean result= courseList.deleteCourse(request.getPayload());
            if(result) {
                Response response = Response.newBuilder()
                        .setMessage("과목 삭제 성공")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }else{
                throw new NullDataException("과목 삭제 실패");
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
