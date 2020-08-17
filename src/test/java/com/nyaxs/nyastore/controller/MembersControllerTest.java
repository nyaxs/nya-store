package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Members;
import com.nyaxs.nyastore.entity.ResultBean;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName MembersControllerTest
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-08-17 17:37
 * @Version 1.0
 **/
class MembersControllerTest {

    @Test
    @GetMapping("member")
    ResultBean updateMember(@Valid @RequestBody Members member) {
        return ResultBean.success();
    }
}