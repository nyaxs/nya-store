package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Stores;
import com.nyaxs.nyastore.mapper.StoresMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @ClassName StoresController
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-25 20:56
 * @Version 1.0
 **/
@Slf4j
@RestController
public class StoresController {


    private final StoresMapper storesMapper;

    @Autowired
    public StoresController(StoresMapper storesMapper) {
        this.storesMapper = storesMapper;
    }

    @GetMapping("store/id/{id}")
    public Stores getStoreById(@PathVariable int id) {
        return storesMapper.getStoreById(id);
    }

    @GetMapping("store/name/{name}")
    public Stores getStoreByName(@PathVariable String name) {
        return storesMapper.getStoreByName(name);
    }

    @GetMapping("storesList/name/{name}")
    public List<Stores> getStoresListByName(@PathVariable String name) {
        return storesMapper.getStoresByName(name);
    }

    @PostMapping("store")
    public int insertStore(@RequestBody @Validated Stores store){
        store.setCreateTime(LocalDate.now());
        return storesMapper.insertStore(store);
    }

    @DeleteMapping("store")
    public int deleteStore(int id,String code){
        log.info("验证权限code: " + code);
        if (!code.equals("qwq")){
            return -1;
        }
        return storesMapper.deleteStoreById(id);
    }

}
