package com.nyaxs.nyastore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.nyastore.controller
 * @date 2020/7/11 13:49
 */
@RestController
public class AuthenticationController {

    @GetMapping("login")
    public String login(){
        return "userLogin";
    }

    @PostMapping("register")
    public int register(){

        return 0;
    }

    @GetMapping("hello")
    public String hello(){
        return "hello world";
    }


}
