package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import org.example.*;

public class LoadClient {

    static int id=3;
    public static void main(String[] args){
        ManagedChannel channel=null;

        try{
            channel=ManagedChannelBuilder.forAddress("localhost",8080)
                .usePlaintext()
                .build();

            NameServiceGrpc.NameServiceBlockingStub stub=NameServiceGrpc.newBlockingStub(channel);
            LoadResponse loadResponse=stub.loadName(LoadRequest.newBuilder()
                    .setRequest(id)
                    .build());

            System.out.println(loadResponse.getName());
        }catch (StatusRuntimeException e){
            //서버 측에서 실패하면 Status 객체로 변환하여 전달받을 수 있음
            if(e.getStatus().equals(Status.UNAVAILABLE)){
                System.err.println("서버와 연결이 되지 않습니다.");
            }else{
                System.err.println("RPC 실패: " + e.getStatus());
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
