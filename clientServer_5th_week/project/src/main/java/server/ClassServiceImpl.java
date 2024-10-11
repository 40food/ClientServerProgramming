package server;

import io.grpc.Context;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;
import org.example.*;

import java.time.Instant;

public class ClassServiceImpl extends DataServiceGrpc.DataServiceImplBase {

    DataServiceGrpc.DataServiceBlockingStub stub;

    public ClassServiceImpl(DataServiceGrpc.DataServiceBlockingStub stub) {
        super();
        this.stub=stub;
    }

    @Override
    public void login(StudentCertRequest request, StreamObserver<StudentResponse> responseObserver) {
//        super.login(request, responseObserver);
        StudentResponse student=stub.login(StudentCertRequest.newBuilder()
                .setId(request.getId())
                .setPw(request.getPw())
                .build());
        responseObserver.onNext(student);
        responseObserver.onCompleted();
    }

    @Override
    public void multiRequest(Request request, StreamObserver<ResponseList> responseObserver) {
//        super.multiRequest(request, responseObserver);
        try {
            String id=request.getRequestId();
            String type = request.getType();
            ResponseList response = null;
            switch (type) {
                case "전체학생 불러오기": response = getStudentList(id,stub);break;
                case "전체과목 불러오기": response = getCourseList(id,stub);break;
                default: break;
            }
            responseObserver.onNext(response);
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
        }
    }

    private static ResponseList getStudentList(String id,DataServiceGrpc.DataServiceBlockingStub stub) {
        StudentsListResponse response = stub.getStudentList(Request.newBuilder()
                .setRequestId(id)
                .setType("전체학생 불러오기-server")
                .build());
        ResponseList.Builder builder=ResponseList.newBuilder();
        for(StudentResponse s:response.getStudentList()){
            builder.addResponse(s.toString());
        }
        return builder.build();
    }
    private static ResponseList getCourseList(String id,DataServiceGrpc.DataServiceBlockingStub stub) {
        CourseListResponse courseList=stub.getCourseList(Request.newBuilder()
                .setRequestId(id)
                .setType("전체과목 불러오기-server")
                .build());
        ResponseList.Builder builder=ResponseList.newBuilder();
        for(CourseResponse c:courseList.getCourseList()){
            builder.addResponse(c.toString());
        }
        return builder.build();
    }
}