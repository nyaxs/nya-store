package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Managers;
import com.nyaxs.nyastore.mapper.ManagersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName ManagersController
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-25 20:40
 * @Version 1.0
 **/
@RestController
public class ManagersController {

    private final ManagersMapper managersMapper;

    @Autowired
    public ManagersController(ManagersMapper managersMapper) {
        this.managersMapper = managersMapper;
    }

    @GetMapping("manager")
    public Managers login(@RequestBody Managers manager) {

        return managersMapper.getManagerByNameAndPassword(manager.getName(), manager.getPassword());
    }

    @PostMapping("manager")
    public int insertManager(@RequestBody @Validated Managers manager){
        return managersMapper.insertManagerByRegister(manager);
    }

    @DeleteMapping("manager/{id}")
    public int deleteManager(@PathVariable int id){
        return managersMapper.deleteManagersById(id);
    }

    @PutMapping("manager")
    public int updateManagerName(@RequestBody Managers manager){
        return managersMapper.updateManager(manager);
    }

}
