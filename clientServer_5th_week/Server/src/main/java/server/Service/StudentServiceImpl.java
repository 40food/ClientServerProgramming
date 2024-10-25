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
import java.util.List;
import java.util.stream.Stream;

public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {

    private final BaseService baseGrpcService = new BaseService();
    private ServerStudentServiceGrpc.ServerStudentServiceBlockingStub stub;
    public StudentServiceImpl(ServerStudentServiceGrpc.ServerStudentServiceBlockingStub studentStub) {
        this.stub=studentStub;
    }

    @Override
    public void getStudentList(Request request, StreamObserver<ResponseList> responseObserver) {
        baseGrpcService.handleRequest(
                request,
                responseObserver,
                request.getToken(),
                "전체 학생 가져오기",
                (req)->{
                    StudentsListResponse response=ServerStudentService.getStudentList(stub);
                    ResponseList.Builder builder=ResponseList.newBuilder();
                    for(Student s:response.getStudentList()){
                        builder.addResponse("학번:"+s.getStudentId()
                                +"\n이름:"+s.getName()
                                +"\n학과:"+s.getDepartment()
                                +"\n수강 완료 과목:"+String.join(" ",s.getCourseListList()));
                    }
                    return builder.build();
                });
    }
    @Override
    public void addStudent(Student request, StreamObserver<Response> responseObserver) {
        baseGrpcService.handleRequest(request, responseObserver, request.getToken(), "학생 추가하기",
            (req)->{
                //필수 값이 null일 때
                if (Stream.of(request.getId(), request.getPw(), request.getStudentId(), request.getName(), request.getDepartment()).anyMatch(String::isBlank))
                    throw new InvalidValueException(ErrorList.NULL_DATA);
                //이미 존재하는 id, student id일 때
                StudentsListResponse students=ServerStudentService.getStudentList(stub);
                for(Student s:students.getStudentList()){
                    if(request.getId().equals(s.getId())) throw new InvalidValueException(ErrorList.DUPLICATION_ID);
                    if(request.getStudentId().equals(s.getStudentId()))throw new InvalidValueException(ErrorList.DUPLICATION_SID);
                }
                return ServerStudentService.addStudent(req,stub);
            });
    }
    @Override
    public void deleteStudent(Request request, StreamObserver<Response> responseObserver) {
        baseGrpcService.handleRequest(request, responseObserver, request.getToken(), "학생 삭제하기",
            (req)->{
                //필수 값이 null일 때
                if(request.getPayload().isBlank()) throw new InvalidValueException(ErrorList.NULL_DATA);
                //존재하지 않는 학생일 때
                StudentsListResponse response= ServerStudentService.getStudentList(stub);
                if(response.getStudentList().stream().noneMatch(student -> student.getStudentId().equals(request.getPayload())))
                    throw new InvalidValueException(ErrorList.NO_ID);
                return ServerStudentService.deleteStudent(req,stub);
            });
    }
}
