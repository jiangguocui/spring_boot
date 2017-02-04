package com.nd.spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationDemo {
    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(ApplicationDemo.class, args);
    }
}
