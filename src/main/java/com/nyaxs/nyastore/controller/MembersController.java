package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Members;
import com.nyaxs.nyastore.mapper.MembersMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
public class MembersController {

    @Autowired
    private MembersMapper memberMapper;


    @GetMapping("member")
    public Members login(@RequestParam int id){
        log.info("进入getId方法，传入id为：" + id);
        Members memberRead = new Members();

        memberRead = memberMapper.selectById(id);
        if(memberRead == null || memberRead.equals("")){
            return null;
        }
        return memberRead;
    }

    @PostMapping("member")
    public int updateMember(@RequestBody Members member){
        return memberMapper.updateMember(member);

    }

    @GetMapping("member")
    public Members getMember(String key, String value){
        return memberMapper.getMemberByColumn(key,value);
    }

}
