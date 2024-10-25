package server.ServerService;

import org.example.*;

public class ServerRegistrationService {

    public static RegistrationListResponse getAllRegistration(ServerRegistrationServiceGrpc.ServerRegistrationServiceBlockingStub stub){
        return stub.getRegistrationList(Request.newBuilder()
                .setPayload("수강신청 정보 가져오기")
                .build());
    }
    public static Registration getRegistration(String studentId,ServerRegistrationServiceGrpc.ServerRegistrationServiceBlockingStub stub){
        return stub.getRegistration(Request.newBuilder()
                .setPayload(studentId)
                .build());
    }

    public static Response registration(String request, ServerRegistrationServiceGrpc.ServerRegistrationServiceBlockingStub stub){
        Response response=stub.addRegistration(Request.newBuilder()
                .setPayload(request)
                .build());
        return Response.newBuilder().setMessage(response.getMessage()).build();
    }
}
