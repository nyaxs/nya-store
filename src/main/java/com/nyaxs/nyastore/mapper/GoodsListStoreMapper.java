package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.GoodsListStore;
import java.util.List;

public interface GoodsListStoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsListStore record);

    GoodsListStore selectByPrimaryKey(Integer id);

    List<GoodsListStore> selectAll();

    int updateByPrimaryKey(GoodsListStore record);
}