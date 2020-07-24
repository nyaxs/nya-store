package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Members;
import com.nyaxs.nyastore.mapper.MembersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class MembersController {

    @Autowired
    private MembersMapper memberMapper;

    @GetMapping("member")
    public Members getMember(String key, String value){
        return memberMapper.getMemberByColumn(key,value);

    }

}
