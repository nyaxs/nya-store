package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Commodities;
import java.util.List;

public interface CommoditiesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Commodities record);

    Commodities selectByPrimaryKey(Integer id);

    List<Commodities> selectAll();

    int updateByPrimaryKey(Commodities record);
}