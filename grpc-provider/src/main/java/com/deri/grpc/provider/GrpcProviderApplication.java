package com.deri.grpc.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: com.deri.grpc.provider.GrpcProviderApplication
 * @Description: TODO
 * @Author: wuzhiyong
 * @Time: 2019/9/2 15:07
 * @Version: v1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class GrpcProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(GrpcProviderApplication.class, args);
    }
}
