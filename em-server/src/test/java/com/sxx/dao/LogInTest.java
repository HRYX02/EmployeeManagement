package com.sxx.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author SHIXINXI
 * @create 2023-03-08-19:06
 */

@SpringBootTest
public class LogInTest {

    @Autowired
    private LogInDao logInDao;

    @Test
    void test(){
        System.out.println(logInDao.selectById(1));
    }
}
