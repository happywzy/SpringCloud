package com.deri.grpc.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: GrpcConsumerApplication
 * @Description: TODO
 * @Author: wuzhiyong
 * @Time: 2019/9/2 15:17
 * @Version: v1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class GrpcConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GrpcConsumerApplication.class, args);
    }
}
