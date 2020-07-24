package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Inventories;
import java.util.List;

public interface InventoriesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Inventories record);

    Inventories selectByPrimaryKey(Integer id);

    List<Inventories> selectAll();

    int updateByPrimaryKey(Inventories record);
}