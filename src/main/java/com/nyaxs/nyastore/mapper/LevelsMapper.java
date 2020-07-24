package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Levels;
import java.util.List;

public interface LevelsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Levels record);

    Levels selectByPrimaryKey(Integer id);

    List<Levels> selectAll();

    int updateByPrimaryKey(Levels record);
}