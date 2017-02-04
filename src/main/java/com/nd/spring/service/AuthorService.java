package com.nd.spring.service;

import java.util.List;

import com.nd.spring.entity.Author;

public interface AuthorService {
    int add(Author author);

    int update(Author author);

    int delete(Long id);

    Author findAuthor(Long id);

    List<Author> findAuthorList();
}
