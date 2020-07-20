package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Member;
import com.nyaxs.nyastore.mapper.MemberMapper;
import org.springframework.web.bind.annotation.GetMapping;

public class MembersController {

    private MemberMapper memberMapper;

    @GetMapping("member")
    public Member getMember(String key, String value){
        memberMapper.getMemberByColumn(key,value);
    }

}
