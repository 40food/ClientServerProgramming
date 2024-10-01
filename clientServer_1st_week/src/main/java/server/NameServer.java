package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class NameServer {
    public static void main(String[] args) throws IOException,InterruptedException{
        Server server= ServerBuilder
                .forPort(8080)
                .addService(new NameServiceImpl()).build();

        System.out.println("port 8080 server start");

        server.start();
        server.awaitTermination();
    }
}
