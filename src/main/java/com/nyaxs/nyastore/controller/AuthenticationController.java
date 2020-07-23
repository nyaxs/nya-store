package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.version1.Members;
import com.nyaxs.nyastore.mapper.MembersMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @Autowired
    private MembersMapper memberMapper;

    @GetMapping("login")
    public Members login(@RequestBody Members member){
        log.info("进入登录方法，传入的member name和password为：" + member.getName() + member.getPassword());
        Members memberRead = new Members();

        memberRead = memberMapper.getMemberByNameAndPassword(member.getName(), member.getPassword());
        if(memberRead == null || memberRead.equals("")){
            return null;
        }
        return memberRead;
    }

    @PostMapping("register")
    public int register(@RequestBody Members member){
        log.info("进入注册方法，提交的member数据为：" + member.toString());
        member.setCreateTime(LocalDate.now());
        int result = memberMapper.insertMemberByRegister(member);
        log.info("插入member表返回值：result = " + result);
        if (result > 0){
            return result;
        }
        return -1;
    }

    @GetMapping("hello")
    public String hello(){
        return "hello world";
    }


}
