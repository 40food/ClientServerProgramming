package server;

import client.Client;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.ServerBuilder;
import org.example.DataServiceGrpc;

import java.io.IOException;

public class Server {

    private static DataServiceGrpc.DataServiceBlockingStub stub;

    private Server(){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8081)
                .usePlaintext()
                .build();
        stub = DataServiceGrpc.newBlockingStub(channel);
    }

    public static void main(String[] args) throws IOException,InterruptedException{
        new Server();
        io.grpc.Server server= ServerBuilder
                .forPort(8080)
                .addService(new ClassServiceImpl(stub))
                .build();

        System.out.println("port 8080 server start");

        server.start();
        server.awaitTermination();
    }
}
