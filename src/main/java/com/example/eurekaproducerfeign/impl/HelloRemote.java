package com.example.eurekaproducerfeign.impl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author youzhanghao [m13732916591_1@163.com]
 * @description
 * @date 2018/12/19 下午5:07
 */
@FeignClient(name = "eureka-producer")
// 避免注入报错
@Component
public interface HelloRemote {

    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);

}
