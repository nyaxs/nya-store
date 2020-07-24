package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Categories;
import java.util.List;

public interface CategoriesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Categories record);

    Categories selectByPrimaryKey(Integer id);

    List<Categories> selectAll();

    int updateByPrimaryKey(Categories record);
}