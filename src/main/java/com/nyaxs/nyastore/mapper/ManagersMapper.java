package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Managers;
import java.util.List;

public interface ManagersMapper {
    int insert(Managers record);

    List<Managers> selectAll();
}