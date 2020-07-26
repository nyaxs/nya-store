package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Stores;
import com.nyaxs.nyastore.mapper.StoresMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName StoresController
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-25 20:56
 * @Version 1.0
 **/
@RestController
public class StoresController {


    @Autowired
    private StoresMapper storesMapper;

   @GetMapping("store/id/{id}")
    public Stores getStoreById(@PathVariable int id){
        return storesMapper.getStoreById(id);
    }

    @GetMapping("store/name/{name}")
    public Stores getStoreByName(@PathVariable String name){
        return storesMapper.getStoreByName(name);
    }
}
