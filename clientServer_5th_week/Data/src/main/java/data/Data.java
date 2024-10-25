package data;

import data.Service.CourseServiceImpl;
import data.Service.StudentServiceImpl;
import data.Service.RegistrationServiceImpl;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Data {

    private static final String studentPath="src/main/java/data/file/Students.txt";
    private static final String coursePath="src/main/java/data/file/Courses.txt";
    private static final String registrationPath="src/main/java/data/file/Resgistraions.txt";

    public static void main(String[] args) throws IOException, InterruptedException {
        io.grpc.Server server= ServerBuilder
                .forPort(8081)
                .addService(new StudentServiceImpl(studentPath))
                .addService(new CourseServiceImpl(coursePath))
                .addService(new RegistrationServiceImpl(registrationPath))
                .build();

        System.out.println("port 8081 Data server start");

        server.start();
        server.awaitTermination();
    }
}
