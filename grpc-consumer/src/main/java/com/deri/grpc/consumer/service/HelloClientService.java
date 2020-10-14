package com.deri.grpc.consumer.service;

import com.deri.grpc.lib.HelloGrpc;
import com.deri.grpc.lib.HelloOuterClass;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * @ClassName: HelloClientService
 * @Description: TODO
 * @Author: wuzhiyong
 * @Time: 2019/9/2 15:20
 * @Version: v1.0
 **/
@Service
public class HelloClientService {

    @GrpcClient("grpc-provider-hello")
    private Channel serverChannel;

    public String sendMessage(String name) {
        HelloGrpc.HelloBlockingStub stub= HelloGrpc.newBlockingStub(serverChannel);
        HelloOuterClass.HelloReply response = stub.sayHello(HelloOuterClass.HelloRequest.newBuilder().setName(name).build());
        return response.getMessage();
    }
}
