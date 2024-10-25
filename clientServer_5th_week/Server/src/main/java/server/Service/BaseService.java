package server.Service;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import server.exception.ErrorList;
import server.exception.InvalidValueException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Key;
import java.time.Instant;
import java.util.Date;

public class BaseService {

    protected static final Key SECRET_KEY= Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private static final String logPath="src/main/java/server/file/Log.txt";

    protected <ReqT,T> void handleRequest(ReqT request, StreamObserver<T> responseObserver,
                                          String token,
                                          String type,
                                          ThrowingFunction<ReqT, T> serviceFunction) {
        try {
            checkToken(token);
            T response = serviceFunction.apply(request);
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            logging(token,type,"성공");
        } catch (InvalidValueException e) {
            handleException(e,responseObserver,token,type);
        } catch (Exception e){
            handleException(e,responseObserver,token,type);
        }
    }

    //custom 예외를 던지기 위한 함수형 인터페이스
    @FunctionalInterface
    protected interface ThrowingFunction<ReqT, RespT> {
        RespT apply(ReqT request) throws InvalidValueException;
    }

    //토큰 검증
    private void checkToken(String token) throws InvalidValueException {
        if(token==null){throw new InvalidValueException(ErrorList.FAIL_LOGIN);}
        if(validateToken(token)){throw new InvalidValueException(ErrorList.UNUSABLE_TOKEN);}
    }

    private boolean validateToken(String token) throws InvalidValueException{
        try {
            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(SECRET_KEY)
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            Date expiration = claims.getExpiration();
            if (expiration.before(new Date())) {
                return true;
            }
            return false;
        }catch (JwtException e){
            throw new InvalidValueException(ErrorList.UNUSABLE_TOKEN);
        }
    }
    protected String getTokenSubject(String token) throws InvalidValueException{
        try{
            Claims claims= Jwts.parserBuilder()
                    .setSigningKey(SECRET_KEY)
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            return claims.getSubject();
        }catch (JwtException e){
            throw new InvalidValueException(ErrorList.UNUSABLE_TOKEN);
        }
    }

    // 예외 처리
    private <T> void handleException(InvalidValueException e, StreamObserver<T> responseObserver, String token, String type) {
        System.err.println("RPC 실패: " + e.getStatusCode());
        // 에러 응답 전송
        StatusRuntimeException statusException = Status.INTERNAL
                .withDescription(e.getMessage())
                .asRuntimeException();
        responseObserver.onError(statusException);
        // 실패 로깅
        try {
            logging(getTokenSubject(token), type, e.getMessage());
        } catch (InvalidValueException ex) {
            logging(token,type,ex.getMessage());
        }
    }
    private <T> void handleException(Exception e, StreamObserver<T> responseObserver, String token, String type) {
        System.err.println("RPC 실패: " + e.getMessage());
        // 에러 응답 전송
        StatusRuntimeException statusException = Status.INTERNAL
                .withDescription("내부 오류로 실패했습니다. 관리자에게 문의주세요.")
                .asRuntimeException();
        responseObserver.onError(statusException);
        // 실패 로깅
        try {
            logging(getTokenSubject(token), type, e.getMessage());
        } catch (InvalidValueException ex) {
            logging(token, type, ex.getMessage());
        }
    }

    private void logging(String token, String type, String statusMessage) {
        //logging
        try {
            FileWriter fileWriter = new FileWriter(logPath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(token+" "+type+" "+ Instant.now()+" "+statusMessage);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            logging("-","JWT",e.getMessage());
        }
    }
}
