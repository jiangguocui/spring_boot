package com.nd.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nd.spring.dao.AuthorDao;
import com.nd.spring.entity.Author;
import com.nd.spring.service.AuthorService;
@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorDao authorDao;

    public int add(Author author) {
        return this.authorDao.add(author);
    }

    public int update(Author author) {
      return this.authorDao.update(author);
    }

    public int delete(Long id) {
        return this.authorDao.delete(id);
    }

    public Author findAuthor(Long id) {
       return this.authorDao.findAuthor(id);
    }

    public List<Author> findAuthorList() {
       return this.authorDao.findAuthorList();
    }
}
