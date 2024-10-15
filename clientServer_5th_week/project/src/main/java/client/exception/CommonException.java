package client.exception;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;

public class CommonException extends Exception {
    // 공통 예외 처리 메서드
    public static void handleRpcException(Exception e) {
        if (e instanceof StatusRuntimeException) {
            StatusRuntimeException statusEx = (StatusRuntimeException) e;
            if (statusEx.getStatus().equals(Status.UNAVAILABLE)) {
                System.err.println("서버와 연결이 되지 않습니다.");
            } else {
                System.err.println("RPC 실패: " + statusEx.getStatus());
            }
        } else {
            System.err.println("예상치 못한 오류 발생: " + e.getMessage());
        }
    }
}
