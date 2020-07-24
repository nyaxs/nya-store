package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.ImagesCommodities;
import java.util.List;

public interface ImagesCommoditiesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImagesCommodities record);

    ImagesCommodities selectByPrimaryKey(Integer id);

    List<ImagesCommodities> selectAll();

    int updateByPrimaryKey(ImagesCommodities record);
}