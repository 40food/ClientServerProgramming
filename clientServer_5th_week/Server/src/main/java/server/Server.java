package server;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.ServerBuilder;
import org.example.*;
import server.Service.CourseServiceImpl;
import server.Service.DataServiceImpl;
import server.Service.RegistrationServiceImpl;
import server.Service.StudentServiceImpl;

import java.io.IOException;

public class Server {

    private static ServerStudentServiceGrpc.ServerStudentServiceBlockingStub studentStub;
    private static ServerCourseServiceGrpc.ServerCourseServiceBlockingStub courseStub;
    private static ServerRegistrationServiceGrpc.ServerRegistrationServiceBlockingStub registrationStub;

    private Server(){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8081)
                .usePlaintext()
                .build();
        studentStub = ServerStudentServiceGrpc.newBlockingStub(channel);
        courseStub = ServerCourseServiceGrpc.newBlockingStub(channel);
        registrationStub = ServerRegistrationServiceGrpc.newBlockingStub(channel);
    }

    public static void main(String[] args) throws IOException,InterruptedException{
        new Server();
        io.grpc.Server server= ServerBuilder
                .forPort(8080)
                .addService(new DataServiceImpl(studentStub))
                .addService(new StudentServiceImpl(studentStub))
                .addService(new CourseServiceImpl(courseStub))
                .addService(new RegistrationServiceImpl(registrationStub,studentStub,courseStub))
                .build();

        System.out.println("port 8080 server start");

        server.start();
        server.awaitTermination();
    }
}
