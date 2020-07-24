package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.ShoppingCartsCommodities;
import java.util.List;

public interface ShoppingCartsCommoditiesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShoppingCartsCommodities record);

    ShoppingCartsCommodities selectByPrimaryKey(Integer id);

    List<ShoppingCartsCommodities> selectAll();

    int updateByPrimaryKey(ShoppingCartsCommodities record);
}