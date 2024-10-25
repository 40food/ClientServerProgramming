package server.ServerService;

import org.example.*;

public class ServerCourseService {

    public static CourseListResponse getCourseList(ServerCourseServiceGrpc.ServerCourseServiceBlockingStub stub) {
        return stub.getCourseList(Request.newBuilder()
                .setType("전체과목 불러오기-server")
                .build());
    }
    public static Course getCourse(String id, ServerCourseServiceGrpc.ServerCourseServiceBlockingStub stub){
        return stub.getCourse(Request.newBuilder()
                .setPayload(id)
                .build());
    }
    public static Response addCourse(Course request, ServerCourseServiceGrpc.ServerCourseServiceBlockingStub stub){
        Response response=stub.addCourse(Request.newBuilder()
                .setPayload(request.getId()
                    +" "+request.getProfessor()
                    +" "+request.getClassName()
                    +" "+String.join(" ",request.getPreClassList()))
                .build());
        return Response.newBuilder().setMessage(response.getMessage()).build();
    }
    public static Response deleteCourse(Request request, ServerCourseServiceGrpc.ServerCourseServiceBlockingStub stub){
        Response response=stub.deleteCourse(Request.newBuilder()
                .setPayload(request.getPayload())
                .build());
        return Response.newBuilder().setMessage(response.getMessage()).build();
    }
}
