package client;

import client.exception.CommonException;
import org.example.*;

public class CourseClient {
    private DataServiceGrpc.DataServiceBlockingStub stub;
    public CourseClient(DataServiceGrpc.DataServiceBlockingStub stub) {
        this.stub=stub;
    }

    public void getAllCourse(String id){
        try{
            ResponseList studentList=stub.multiRequest(Request.newBuilder()
                    .setRequestId(id)
                    .setType("전체과목 불러오기")
                    .build());

            for(String s:studentList.getResponseList()){
                System.out.println(s+"\n");
            }
        } catch (Exception e) {
            CommonException.handleRpcException(e);
        }
    }

}
