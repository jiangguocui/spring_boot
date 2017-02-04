package com.nd.spring.dao;

import org.apache.ibatis.annotations.Param;

import com.nd.spring.entity.Author;

public interface AuthorMapper {
    Author findAuthor(@Param("id") Long id);

}
