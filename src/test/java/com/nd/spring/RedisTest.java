package com.nd.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nd.spring.controller.AuthorController;
import com.nd.spring.dao.ValueRedisDao;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(AuthorController.class)
public class RedisTest {
    @Autowired
    private ValueRedisDao valueRedisDao;

    @Test
    public void test() throws Exception {
        this.valueRedisDao.save("cc");
        System.out.println(this.valueRedisDao.getParam());
    }
}
