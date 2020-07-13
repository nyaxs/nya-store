package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private MemberMapper memberMapper;

    @GetMapping("login")
    public String login(String name, String password){
        System.out.println(memberMapper.getMemberByNameAndPassword("nyaxs", "123456"));
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
