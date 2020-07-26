package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Stores;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName StoresMapper
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-25 20:51
 * @Version 1.0
 **/

@Mapper
public interface StoresMapper {

    @Select("select * from stores where id = #{id}")
    Stores getStoreById(int id);

    @Select("select * from stores where name = #{name}")
    Stores getStoreByName(String name);

    @Select("select * from stores where name like  concat('%',#{name},'%')  ")
    List<Stores> getStoresByName(String name);
}
