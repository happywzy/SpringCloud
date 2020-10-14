package com.deri.grpc.provider.service;

import com.deri.grpc.lib.HelloGrpc;
import com.deri.grpc.lib.HelloOuterClass;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

/**
 * @ClassName: HelloService
 * @Description: TODO
 * @Author: wuzhiyong
 * @Time: 2019/9/2 15:13
 * @Version: v1.0
 **/
@Slf4j
@GrpcService(HelloOuterClass.class)
public class HelloService extends HelloGrpc.HelloImplBase {

    @Override
    public void sayHello(HelloOuterClass.HelloRequest request, StreamObserver<HelloOuterClass.HelloReply> responseObserver) {
        String message = "Hello " + request.getName();
        final HelloOuterClass.HelloReply.Builder replyBuilder = HelloOuterClass.HelloReply.newBuilder().setMessage(message);
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
        log.info("Returning " +message);
    }
}
