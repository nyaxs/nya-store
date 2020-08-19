package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Members;
import com.nyaxs.nyastore.mapper.MembersMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    private final StringRedisTemplate stringRedisTemplate;

    @Autowired
    public AuthenticationController(MembersMapper memberMapper, StringRedisTemplate stringRedisTemplate) {
        this.memberMapper = memberMapper;
        this.stringRedisTemplate = stringRedisTemplate;
    }

    @GetMapping("login")
    public Members login( @Valid @RequestBody Members member) {
        log.info("进入登录方法，传入的member name和password为：" + member.getName() + member.getPassword());
        Members memberRead = new Members();
        memberRead = memberMapper.getMemberByNameAndPassword(member.getName(), member.getPassword());
        stringRedisTemplate.opsForValue().set("member",memberRead.toString());
        log.info("从redis中取出member的值：" + stringRedisTemplate.opsForValue().get("member"));
        return memberRead;
    }


    @PostMapping("register")
    public int register(@RequestBody @Validated Members member) {
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
