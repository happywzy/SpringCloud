package com.deri.servicehello.controller;

import com.deri.servicehello.config.HiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;


//    String test;

    @Autowired
    HiConfig hiConfig;

    @RequestMapping("/hello")
    public String home(@RequestParam(value = "name", defaultValue = "deri") String name) {
        return "hello " + name + " ,i am from port:" + port;
    }

    @RequestMapping("/test")
    public String test() {
        return hiConfig.getTest();
    }
}
