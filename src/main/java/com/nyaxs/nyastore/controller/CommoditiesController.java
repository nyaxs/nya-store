package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Commodities;
import com.nyaxs.nyastore.mapper.CommoditiesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName CommoditiesController
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-25 20:52
 * @Version 1.0
 **/
@RestController
public class CommoditiesController {

    private final CommoditiesMapper commoditiesMapper;

    @Autowired
    public CommoditiesController(CommoditiesMapper commoditiesMapper) {
        this.commoditiesMapper = commoditiesMapper;
    }

    @GetMapping("commoditiesList/{name}")
    public List<Commodities> getCommoditiesListByName(@PathVariable String name) {
        return commoditiesMapper.getCommoditiesListByName(name);
    }

    @GetMapping("commodity/{name}")
    public Commodities getCommodityByName(@PathVariable String name) {
        return commoditiesMapper.getCommodityByName(name);
    }

    @GetMapping("commodity/{id}")
    public Commodities getCommodityById(@PathVariable int id) {
        return commoditiesMapper.getCommodityById(id);
    }

    @PostMapping("commodity")
    public int insertCommodity(Commodities commodity) {
        return commoditiesMapper.insertCommodity(commodity);
    }

    @DeleteMapping("commodity/{id}")
    public int deleteCommodityById(@PathVariable int id) {
        return commoditiesMapper.deleteCommodityById(id);
    }

}
