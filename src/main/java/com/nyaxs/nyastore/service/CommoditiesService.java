package com.nyaxs.nyastore.service;

import com.nyaxs.nyastore.entity.Commodities;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CommoditiesService
 * @Description TODO: 处理商品业务逻辑
 * @Author nyaxs
 * @Date 2020-08-19 22:24
 * @Version 1.0
 **/

@Service
public interface CommoditiesService {

    public List<Commodities> getRandomCommodities();

}
