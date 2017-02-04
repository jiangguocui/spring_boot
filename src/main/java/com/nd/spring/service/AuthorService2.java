package com.nd.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nd.spring.dao.AuthorMapper;
import com.nd.spring.entity.Author;

@Service
public class AuthorService2 {

    @Autowired
    private AuthorMapper authorMapper;
    
    public Author findAuthor(Long id) {
        return this.authorMapper.findAuthor(id);
    }
}
