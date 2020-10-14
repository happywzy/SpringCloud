package com.deri.servicehello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: WatcherController
 * @Description: TODO
 * @Author: wuzhiyong
 * @Time: 2019/10/8 13:49
 * @Version: v1.0
 **/
@RestController
public class WatcherController {
    @RequestMapping("/watch")
    public void watcher(HttpServletRequest request) throws IOException {
        System.out.println(request.getMethod());
        BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String str = "";
        String wholeStr = "";
        while ((str = reader.readLine()) != null) {
            wholeStr += str;
        }
        System.out.println("body:" + wholeStr);
    }
}
