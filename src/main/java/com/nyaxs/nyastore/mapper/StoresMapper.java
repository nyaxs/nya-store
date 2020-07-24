package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Stores;
import java.util.List;

public interface StoresMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stores record);

    Stores selectByPrimaryKey(Integer id);

    List<Stores> selectAll();

    int updateByPrimaryKey(Stores record);
}