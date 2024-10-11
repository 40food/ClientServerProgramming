package client;

import client.exception.CommonException;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import org.example.*;

public class StudentClient {
    private static Metadata metaData;
    private DataServiceGrpc.DataServiceBlockingStub stub;

    public StudentClient(DataServiceGrpc.DataServiceBlockingStub stub) {
        this.stub=stub;
    }

    public void getAllStudent(String id){
        try{
            ResponseList studentList=stub.multiRequest(Request.newBuilder()
                    .setRequestId(id)
                    .setType("전체학생 불러오기")
                    .build());

            for(String s:studentList.getResponseList()){
                System.out.println(s+"\n");
            }
        } catch (Exception e) {
            CommonException.handleRpcException(e);
        }
    }

    public StudentResponse login(String id, String pw) {
        try{
            StudentResponse student=stub.login(StudentCertRequest.newBuilder()
                    .setId(id)
                    .setPw(pw)
                    .build());

            if(student!=null){
                System.out.println("로그인 성공");
                System.out.println("현재 사용자: "+student.getName()+"\n");
                return student;
            }
        }catch (Exception e) {
            System.out.println("로그인 실패");
//            CommonException.handleRpcException(e);
        }
        return null;
    }
}
