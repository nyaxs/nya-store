package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Stores;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName StoresMapper
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-25 20:51
 * @Version 1.0
 **/
@Mapper
public interface StoresMapper {
    @Select("select * from store where id = #{id}")
    Stores getStoreById(int id);
}
