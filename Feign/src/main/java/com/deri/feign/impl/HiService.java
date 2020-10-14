package com.deri.feign.impl;

import org.springframework.stereotype.Component;

@Component
public class HiService implements HiServiceImpl {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name +", i'm feign + Hystric";
    }
}
