package server;

import data.Student;
import data.StudentList;
import exception.InvalidValueException;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.example.*;

import java.sql.*;

public class ClassServiceImpl extends DataServiceGrpc.DataServiceImplBase {

    @Override
    public void getStudentList(Request request, StreamObserver<StudentsListResponse> responseObserver) {
//        super.getStudentList(request, responseObserver);
        ManagedChannel channel=null;
        try{
             channel= ManagedChannelBuilder.forAddress("localhost",8081)
                    .usePlaintext()
                    .build();

            DataServiceGrpc.DataServiceBlockingStub stub=DataServiceGrpc.newBlockingStub(channel);
            StudentsListResponse studentList=stub.getStudentList(Request.newBuilder()
                    .setType("전체학생 불러오기-server")
                    .build());

            responseObserver.onNext(studentList);
            responseObserver.onCompleted();
        }catch (StatusRuntimeException e){
            //서버 측에서 실패하면 Status 객체로 변환하여 전달받을 수 있음
            if(e.getStatus().equals(Status.UNAVAILABLE)){
                System.err.println("DB와 연결이 되지 않습니다.");
            }else{
                System.err.println("RPC 실패: " + e.getStatus());
                StatusRuntimeException statusException= Status.INTERNAL
                        .withDescription(e.getMessage())
                        .asRuntimeException();
                responseObserver.onError(statusException);
            }
        } catch (Exception e) {
            System.err.println("예상치 못한 오류 발생: " + e.getMessage());
        } finally {
            if (channel != null) {
                try {
                    // 채널을 안전하게 종료
                    channel.shutdown().awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    System.err.println("채널 종료 중 인터럽트 발생: " + e.getMessage());
                }
            }
        }
    }

    @Override
    public void getCourseList(Request request, StreamObserver<CourseListResponse> responseObserver) {
//        super.getCourseList(request, responseObserver);
        ManagedChannel channel=null;
        try{
            channel= ManagedChannelBuilder.forAddress("localhost",8081)
                    .usePlaintext()
                    .build();

            DataServiceGrpc.DataServiceBlockingStub stub=DataServiceGrpc.newBlockingStub(channel);
            CourseListResponse courseList=stub.getCourseList(Request.newBuilder()
                    .setType("전체과목 불러오기-server")
                    .build());

            responseObserver.onNext(courseList);
            responseObserver.onCompleted();
        }catch (StatusRuntimeException e){
            //서버 측에서 실패하면 Status 객체로 변환하여 전달받을 수 있음
            if(e.getStatus().equals(Status.UNAVAILABLE)){
                System.err.println("DB와 연결이 되지 않습니다.");
            }else{
                System.err.println("RPC 실패: " + e.getStatus());
                StatusRuntimeException statusException= Status.INTERNAL
                        .withDescription(e.getMessage())
                        .asRuntimeException();
                responseObserver.onError(statusException);
            }
        } catch (Exception e) {
            System.err.println("예상치 못한 오류 발생: " + e.getMessage());
        } finally {
            if (channel != null) {
                try {
                    // 채널을 안전하게 종료
                    channel.shutdown().awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    System.err.println("채널 종료 중 인터럽트 발생: " + e.getMessage());
                }
            }
        }
    }
}