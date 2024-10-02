package server;

import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException,InterruptedException{
        io.grpc.Server server= ServerBuilder
                .forPort(8080)
                .addService(new ClassServiceImpl()).build();

        System.out.println("port 8080 server start");

        server.start();
        server.awaitTermination();
    }
}
