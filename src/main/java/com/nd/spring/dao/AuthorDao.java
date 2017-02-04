package com.nd.spring.dao;

import java.util.List;

import com.nd.spring.entity.Author;

public interface AuthorDao {

    int add(Author author);

    int update(Author author);

    int delete(Long id);

    Author findAuthor(Long id);

    List<Author> findAuthorList();
}
