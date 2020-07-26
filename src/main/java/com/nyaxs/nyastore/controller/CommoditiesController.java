package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Commodities;
import com.nyaxs.nyastore.mapper.CommoditiesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CommoditiesController
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-25 20:52
 * @Version 1.0
 **/
@RestController
public class CommoditiesController {

    @Autowired
    private CommoditiesMapper commoditiesMapper;

    @GetMapping("commodity/{name}")
    public Commodities getCommodityByName(@PathVariable String name){
        return commoditiesMapper.getCommodityByName(name);
    }

    @GetMapping("commodity/{id}")
    public Commodities getCommodityById(@PathVariable int id){
        return commoditiesMapper.getCommodityById(id);
    }

}
