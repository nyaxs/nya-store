package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Managers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName ManagersMapper
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-25 20:42
 * @Version 1.0
 **/

@Mapper
public interface ManagersMapper {

    @Select("select * from managers where name = #{name} and password = #{password}")
    Managers getManagerByNameAndPassword(String name, String password);



}
