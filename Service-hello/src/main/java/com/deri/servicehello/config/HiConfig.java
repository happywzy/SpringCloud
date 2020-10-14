package com.deri.servicehello.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: HiConfig
 * @Description: TODO
 * @Author: wuzhiyong
 * @Time: 2019/10/10 15:29
 * @Version: v1.0
 **/
@ConfigurationProperties(prefix = "ttt")
@Configuration
public class HiConfig {

    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
