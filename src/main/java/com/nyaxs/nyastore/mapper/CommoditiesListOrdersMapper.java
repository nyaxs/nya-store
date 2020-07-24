package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.CommoditiesListOrders;
import java.util.List;

public interface CommoditiesListOrdersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommoditiesListOrders record);

    CommoditiesListOrders selectByPrimaryKey(Integer id);

    List<CommoditiesListOrders> selectAll();

    int updateByPrimaryKey(CommoditiesListOrders record);
}