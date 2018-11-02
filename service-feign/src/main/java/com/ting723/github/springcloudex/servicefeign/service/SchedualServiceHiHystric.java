package com.ting723.github.springcloudex.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFormClientOne(String name) {
        return "sorry " + name;
    }
}
