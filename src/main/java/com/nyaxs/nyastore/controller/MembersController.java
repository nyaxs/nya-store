package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Members;
import com.nyaxs.nyastore.entity.ResultBean;
import com.nyaxs.nyastore.mapper.MembersMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
public class MembersController {

    private final MembersMapper memberMapper;

    @Autowired
    public MembersController(MembersMapper memberMapper) {
        this.memberMapper = memberMapper;
    }


    @GetMapping("member")
    public Members login(@RequestParam int id) {
        log.info("进入getId方法，传入id为：" + id);
        Members memberRead = new Members();

        memberRead = memberMapper.selectById(id);
        if (memberRead == null || memberRead.equals("")) {
            return null;
        }
        return memberRead;
    }

    @PostMapping("member")
    public ResultBean<Object> updateMember(@Valid @RequestBody Members member) {
        //return memberMapper.updateMember(member);
        return ResultBean.success();
    }

    @GetMapping("member/{key}/{value}")
    public Members getMember(@PathVariable String key, @PathVariable String value) {
        return memberMapper.getMemberByColumn(key, value);
    }

}
