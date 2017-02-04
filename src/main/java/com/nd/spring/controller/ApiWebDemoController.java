package com.nd.spring.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ApiWebDemoController {

    @RequestMapping("/")
    public String home(){
        return "hello world, spring boot";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(ApiWebDemoController.class, args);
    }
}
