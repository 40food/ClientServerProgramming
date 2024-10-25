package server.Service;

import io.grpc.stub.StreamObserver;
import io.jsonwebtoken.Jwts;
import org.example.*;

import java.util.Date;

public class DataServiceImpl extends DataServiceGrpc.DataServiceImplBase {

    private static final BaseService baseGrpcService = new BaseService();
    private ServerStudentServiceGrpc.ServerStudentServiceBlockingStub stub;
    public DataServiceImpl(ServerStudentServiceGrpc.ServerStudentServiceBlockingStub studentStub) {
        this.stub=studentStub;
    }

    @Override
    public void login(StudentCertRequest request, StreamObserver<Response> responseObserver) {
        String token=findToken(request,stub);
        baseGrpcService.handleRequest(
                request,
                responseObserver,
                token,
                "로그인",
                req-> Response.newBuilder().setMessage(token).build());
    }

    private static String findToken(StudentCertRequest request, ServerStudentServiceGrpc.ServerStudentServiceBlockingStub stub){
        StudentsListResponse students=stub.getStudentList(Request.newBuilder()
                .setType("로그인")
                .build());
        for(Student s:students.getStudentList()){
            if(request.getId().equals(s.getId()) && request.getPw().equals(s.getPw())){
                return generateToken(s.getStudentId());
            }
        }
        return null;
    }

    private static String generateToken(String studentId){
        return Jwts.builder()
                .setSubject(studentId)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 600000)) // 10분 유효
                .signWith(BaseService.SECRET_KEY)
                .compact();
    }
}