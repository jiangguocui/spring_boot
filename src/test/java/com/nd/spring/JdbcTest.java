package com.nd.spring;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nd.spring.controller.AuthorController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(AuthorController.class)
public class JdbcTest {
    @Resource(name="oneJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;
    @Resource(name="twoJdbcTemplate")
    protected JdbcTemplate jdbcTemplate2;

    @Test
    public void test() throws Exception {
        jdbcTemplate1.update("insert into t_author(real_name, nick_name) values(?, ?)", "xx", "xx");
        jdbcTemplate2.update("insert into user(name, dept, website, phone) values(?, ?,?,?)", "xx", "xx", "xx", "cx");
    }
}
