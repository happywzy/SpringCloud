package com.deri.servicehi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "deri") String name,
                       @RequestParam(value = "openid", required = false) String openid) {
        System.out.println("hi");
        System.out.println("openid:" + openid);
        return "hi " + name + " ,i am from port:" + port;
    }

    @RequestMapping("/hi/{time}")
    public String timeout(@PathVariable(value = "time") int time) {
        System.out.println("hi" + time);
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {

        }
        return "hi time:" + time + " ,i am from port:" + port;
    }

}
