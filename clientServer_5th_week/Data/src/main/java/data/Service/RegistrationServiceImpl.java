package data.Service;

import data.Course.Course;
import data.Course.CourseList;
import data.Registration.Registration;
import data.Registration.RegistrationList;
import data.Student.StudentList;
import data.exception.NullDataException;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.example.*;

import java.io.IOException;
import java.util.ArrayList;

public class RegistrationServiceImpl extends ServerRegistrationServiceGrpc.ServerRegistrationServiceImplBase {

    protected static RegistrationList registrationList;

    private final String registrationPath;

    public RegistrationServiceImpl(String registrationPath) {
        this.registrationPath=registrationPath;
    }


    @Override
    public void getRegistrationList(Request request, StreamObserver<RegistrationListResponse> responseObserver) {
        try {
            registrationList=new RegistrationList(registrationPath);
            RegistrationListResponse.Builder builder=RegistrationListResponse.newBuilder();
            for(Registration i: registrationList.getAllRegistration()){
                RegistrationResponse.Builder b=RegistrationResponse.newBuilder()
                        .setStudentId(i.getStudentId())
                        .addAllCourseId(i.getRegistCourses());
                builder.addRegistration(b.build());
            }
            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void getRegistration(Request request, StreamObserver<RegistrationResponse> responseObserver) {
        try {
            registrationList=new RegistrationList(registrationPath);
            RegistrationResponse.Builder builder=RegistrationResponse.newBuilder();
            Registration result=registrationList.getRegistration(request.getPayload());
            if(result!=null){builder.setStudentId(result.getStudentId()).addAllCourseId(result.getRegistCourses());
            }else{builder.setStudentId("").addAllCourseId(new ArrayList<>());}
            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addRegistration(Request request, StreamObserver<Response> responseObserver) {
        try {
            registrationList=new RegistrationList(registrationPath);
            if(registrationList.addRegist(request)){
                Response response = Response.newBuilder()
                        .setMessage("수강신청 성공")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
