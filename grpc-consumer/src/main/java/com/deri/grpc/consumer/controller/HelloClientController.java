package com.deri.grpc.consumer.controller;

import com.deri.grpc.consumer.service.HelloClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloClientController
 * @Description: TODO
 * @Author: wuzhiyong
 * @Time: 2019/9/2 15:22
 * @Version: v1.0
 **/
@RestController
public class HelloClientController {
    @Autowired
    private HelloClientService grpcClientService;

    @RequestMapping("/hello")
    public String printMessage(@RequestParam(defaultValue = "wuzy") String name) {
        return grpcClientService.sendMessage(name);
    }
}
