package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Managers;
import java.util.List;

public interface ManagersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Managers record);

    Managers selectByPrimaryKey(Integer id);

    List<Managers> selectAll();

    int updateByPrimaryKey(Managers record);
}