package com.cag2050.spring_cloud_consul_producer2_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    String hello() {
        return "Hello consul two";
    }
}
