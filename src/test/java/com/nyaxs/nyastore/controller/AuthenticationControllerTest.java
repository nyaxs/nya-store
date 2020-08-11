package com.nyaxs.nyastore.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName AuthenticationControllerTest
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-08-11 10:44
 * @Version 1.0
 **/


class AuthenticationControllerTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Test
    void login() {
        stringRedisTemplate.opsForValue().set("test","hello");
        System.out.println(stringRedisTemplate.opsForValue().get("test"));

    }

    @Test
    void register() {
    }
}