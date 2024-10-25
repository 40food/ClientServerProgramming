package server.Service;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.example.*;
import server.ServerService.ServerCourseService;
import server.ServerService.ServerStudentService;
import server.exception.ErrorList;
import server.exception.InvalidValueException;

import java.time.Instant;
import java.util.stream.Stream;

public class CourseServiceImpl extends CourseServiceGrpc.CourseServiceImplBase {
    private final BaseService baseGrpcService = new BaseService();

    private ServerCourseServiceGrpc.ServerCourseServiceBlockingStub stub;

    public CourseServiceImpl(ServerCourseServiceGrpc.ServerCourseServiceBlockingStub courseStub) {
        this.stub=courseStub;
    }

    @Override
    public void getCourseList(Request request, StreamObserver<ResponseList> responseObserver) {
        baseGrpcService.handleRequest(
                request,
                responseObserver,
                request.getToken(),
                "전체 과목 가져오기",
                (req) -> {
                    CourseListResponse response=ServerCourseService.getCourseList(stub);
                    ResponseList.Builder builder=ResponseList.newBuilder();
                    for(Course c:response.getCourseList()){
                        builder.addResponse("과목ID:"+c.getId()
                                +"\n교수:"+c.getProfessor()
                                +"\n과목명:"+c.getClassName()
                                +"\n선수 과목:"+String.join(" ",c.getPreClassList()));
                    }
                    return builder.build();
                });
    }

    @Override
    public void addCourse(Course request, StreamObserver<Response> responseObserver) {
        baseGrpcService.handleRequest(request,responseObserver,request.getToken(),"과목 추가하기",
            (req)->{
                //필수 값이 null일 때
                if (Stream.of(request.getId(), request.getProfessor(), request.getClassName()).anyMatch(String::isBlank))
                    throw new InvalidValueException(ErrorList.NULL_DATA);
                //이미 존재하는 course id일 때
                CourseListResponse response=ServerCourseService.getCourseList(stub);
                for(Course c:response.getCourseList()){
                    if(request.getId().equals(c.getId()))throw new InvalidValueException(ErrorList.DUPLICATION_ID);
                }
                //선수과목이 모두 존재하는지 확인
                boolean allExist = request.getPreClassList().stream()
                        .allMatch(prec -> response.getCourseList().stream()
                        .anyMatch(c -> c.getId().equals(prec)));
                if(allExist){
                    return ServerCourseService.addCourse(request, stub);
                }else{
                    throw new InvalidValueException(ErrorList.NO_PRECOURSE);
                }
            });
    }

    @Override
    public void deleteCourse(Request request, StreamObserver<Response> responseObserver) {
        baseGrpcService.handleRequest(request, responseObserver,request.getToken(),"과목 삭제하기",
            (req)->{
                //온 값이 null일 때
                if (request.getPayload().isBlank()) throw new InvalidValueException(ErrorList.NULL_DATA);
                //존재하지 않는 과목일 경우
                CourseListResponse response=ServerCourseService.getCourseList(stub);
                if(response.getCourseList().stream().noneMatch(course -> course.getId().equals(request.getPayload())))
                    throw new InvalidValueException(ErrorList.NO_ID);
                //누군가의 선수과목일 경우
                if(response.getCourseList().stream().anyMatch(c -> c.getPreClassList().contains(request.getPayload()))) {
                    throw new InvalidValueException(ErrorList.IS_PRECOURSE);
                }else{
                    return ServerCourseService.deleteCourse(request, stub);
                }
            });
    }
}
