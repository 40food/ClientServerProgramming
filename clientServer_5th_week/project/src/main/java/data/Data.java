package data;

import io.grpc.ServerBuilder;

import java.io.IOException;

public class Data {

    public static void main(String[] args) throws IOException, InterruptedException {
        io.grpc.Server server= ServerBuilder
                .forPort(8081)
                .addService(new DataServiceImpl()).build();

        System.out.println("port 8081 Data server start");

        server.start();
        server.awaitTermination();
    }
}
