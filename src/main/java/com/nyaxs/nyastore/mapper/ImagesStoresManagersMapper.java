package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.ImagesStoresManagers;
import java.util.List;

public interface ImagesStoresManagersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImagesStoresManagers record);

    ImagesStoresManagers selectByPrimaryKey(Integer id);

    List<ImagesStoresManagers> selectAll();

    int updateByPrimaryKey(ImagesStoresManagers record);
}