package com.ting723.github.springcloudex.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @GetMapping(value = "/hi")
    String sayHiFormClientOne(@RequestParam("name") String name);
}
