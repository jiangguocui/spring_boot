package com.nd.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nd.spring.entity.Author;
import com.nd.spring.service.AuthorService2;

@RestController
@RequestMapping(value="author2")
@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("com.nd.spring.dao")
@ComponentScan(basePackages = { "com.nd.spring" })
public class AuthorController2 {

    
    @Autowired
    private AuthorService2 authorService; 
    /**
     * 查询用户信息
     */
    @RequestMapping(value = "/{userId:\\d+}", method = RequestMethod.GET)
    public Author getAuthor(@PathVariable Long userId, HttpServletRequest request) {
      Author author = this.authorService.findAuthor(userId);
      if(author == null){
          throw new RuntimeException("查询错误");
      }
      return author;
    }
    
    public static void main(String[] args) {
        SpringApplication.run(AuthorController2.class, args);
    }
}
