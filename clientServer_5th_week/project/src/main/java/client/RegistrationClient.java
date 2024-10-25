package client;

import client.exception.CommonException;
import org.example.DataServiceGrpc;
import org.example.RegistrationServiceGrpc;
import org.example.Request;
import org.example.Response;

import java.util.Scanner;

public class RegistrationClient {

    private Scanner scanner;
    private RegistrationServiceGrpc.RegistrationServiceBlockingStub registrationStub;
    public RegistrationClient(Scanner scanner, RegistrationServiceGrpc.RegistrationServiceBlockingStub rStub) {
        this.scanner=scanner;
        this.registrationStub=rStub;
    }

    public void registration(String token) {
        try{
            System.out.println("========수강신청할 과목 ID를 입력하세요.========");
            System.out.print("과목 ID:");
            String registId=scanner.next();
            Response response=registrationStub.registration(Request.newBuilder()
                    .setToken(token)
                    .setType("수강 신청하기")
                    .setPayload(registId)
                    .build());
            System.out.println(response.getMessage());
        }catch(Exception e){
            CommonException.handleRpcException(e);
        }
    }
}
