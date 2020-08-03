package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Members;
import com.nyaxs.nyastore.mapper.MembersMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.nyastore.controller
 * @date 2020/7/11 13:49
 */
@Slf4j
@RestController
public class AuthenticationController {

    private final MembersMapper memberMapper;

    @Autowired
    public AuthenticationController(MembersMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @GetMapping("login")
    public Members login(@RequestBody @Validated Members member) {
        log.info("进入登录方法，传入的member name和password为：" + member.getName() + member.getPassword());
        Members memberRead = new Members();

        memberRead = memberMapper.getMemberByNameAndPassword(member.getName(), member.getPassword());
        return memberRead;
    }


    @PostMapping("register")
    public int register(@RequestBody Members member) {
        log.info("进入注册方法，提交的member数据为：" + member.toString());
        log.info("注册时仅 name 和 password 为必须，其余可为 null 或者默认指定");
        member.setCreateTime(LocalDate.now());
        int result = memberMapper.insertMemberByRegister(member);
        log.info("插入member表返回值：result = " + result);
        if (result > 0) {
            return result;
        }
        return -1;
    }

    @GetMapping("hello")
    public String hello() {
        return "hello world";
    }


}
