package server.ServerService;

import org.example.*;

public class ServerStudentService {

    public static StudentsListResponse getStudentList(ServerStudentServiceGrpc.ServerStudentServiceBlockingStub stub) {
        return stub.getStudentList(Request.newBuilder()
                .setType("전체학생 불러오기-server")
                .build());
    }
    public static Student getStudent(String id, ServerStudentServiceGrpc.ServerStudentServiceBlockingStub stub){
        return stub.getStudent(Request.newBuilder()
                .setPayload(id)
                .build());
    }
    public static Response addStudent(Student request, ServerStudentServiceGrpc.ServerStudentServiceBlockingStub stub) {
        Response result=stub.addStudent(Request.newBuilder()
                .setPayload(request.getId()
                        +" "+request.getPw()
                        +" "+request.getStudentId()
                        +" "+request.getName()
                        +" "+request.getDepartment()
                        +" "+String.join(" ",request.getCourseListList()))
                .build());
        return Response.newBuilder().setMessage(result.getMessage()).build();
    }

    public static Response deleteStudent(Request request, ServerStudentServiceGrpc.ServerStudentServiceBlockingStub stub) {
        Response result=stub.deleteStudent(Request.newBuilder()
                .setPayload(request.getPayload())
                .build());
        return Response.newBuilder().setMessage(result.getMessage()).build();
    }
}
