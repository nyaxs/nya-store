package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Managers;
import com.nyaxs.nyastore.mapper.ManagersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ManagersController
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-25 20:40
 * @Version 1.0
 **/
@RestController
public class ManagersController {

    @Autowired
    private ManagersMapper managersMapper;

    @GetMapping("manager")
    public Managers login(@RequestBody Managers manager){

        return managersMapper.getManagerByNameAndPassword(manager.getName(),manager.getPassword());
    }

}
