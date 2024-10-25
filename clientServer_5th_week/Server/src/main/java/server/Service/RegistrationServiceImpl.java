package server.Service;

import com.google.protobuf.ProtocolStringList;
import io.grpc.stub.StreamObserver;
import org.example.*;
import server.ServerService.ServerCourseService;
import server.ServerService.ServerRegistrationService;
import server.ServerService.ServerStudentService;
import server.exception.ErrorList;
import server.exception.InvalidValueException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;

public class RegistrationServiceImpl extends RegistrationServiceGrpc.RegistrationServiceImplBase {
    private static final BaseService baseGrpcService = new BaseService();
    private ServerRegistrationServiceGrpc.ServerRegistrationServiceBlockingStub stub;
    private ServerStudentServiceGrpc.ServerStudentServiceBlockingStub sStub;
    private ServerCourseServiceGrpc.ServerCourseServiceBlockingStub cStub;

    public RegistrationServiceImpl(ServerRegistrationServiceGrpc.ServerRegistrationServiceBlockingStub registrationStub, ServerStudentServiceGrpc.ServerStudentServiceBlockingStub studentStub, ServerCourseServiceGrpc.ServerCourseServiceBlockingStub courseStub) {
        this.stub=registrationStub;
        this.sStub=studentStub;
        this.cStub=courseStub;
    }

    @Override
    public void registration(Request request, StreamObserver<Response> responseObserver) {
        baseGrpcService.handleRequest(request, responseObserver, request.getToken(), "수강신청",
            (req)-> {
                //존재하지 않는 과목
                CourseListResponse courselist=ServerCourseService.getCourseList(cStub);
                if(courselist.getCourseList().stream().noneMatch(c->c.getId().equals(req.getPayload())))throw new InvalidValueException(ErrorList.NO_ID);
                //선수과목 안 들음
                String user= baseGrpcService.getTokenSubject(req.getToken());
                Student student=ServerStudentService.getStudent(user,sStub);
                Course course= ServerCourseService.getCourse(req.getPayload(),cStub);
                if(student==null) throw new InvalidValueException(ErrorList.UNUSABLE_TOKEN);
                if(!student.getCourseListList().containsAll(course.getPreClassList())) throw new InvalidValueException(ErrorList.NO_COMPLETE_COURSE);
                //이미 들었던 과목
                if(student.getCourseListList().contains(req.getPayload())) throw new InvalidValueException(ErrorList.DUPLICATION_COMPLETE_COURSE);
                //이미 신청한 과목
                Registration registration=ServerRegistrationService.getRegistration(user,stub);
                if(registration!=null&&registration.getCourseIdList().contains(req.getPayload())) throw new InvalidValueException(ErrorList.DUPLICATION_REGIST);
                return ServerRegistrationService.registration(user+" "+req.getPayload(),stub);
            }
        );
    }
}
