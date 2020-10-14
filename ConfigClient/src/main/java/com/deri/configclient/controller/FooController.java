package com.deri.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class FooController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/foo")
    @RefreshScope
    public String getFoo(){
        return foo;
    }
}
