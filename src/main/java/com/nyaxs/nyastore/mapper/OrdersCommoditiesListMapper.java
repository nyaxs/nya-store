package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.OrdersCommoditiesList;
import java.util.List;

public interface OrdersCommoditiesListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrdersCommoditiesList record);

    OrdersCommoditiesList selectByPrimaryKey(Integer id);

    List<OrdersCommoditiesList> selectAll();

    int updateByPrimaryKey(OrdersCommoditiesList record);
}