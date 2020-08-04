package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Managers;
import com.nyaxs.nyastore.entity.Members;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * @ClassName ManagersMapper
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-25 20:42
 * @Version 1.0
 **/

@Repository
@Mapper
public interface ManagersMapper {

    @Select("select * from managers where name = #{name} and password = #{password}")
    Managers getManagerByNameAndPassword(String name, String password);

    @Select("select * from managers where id = #{id}")
    Managers selectById(int id);

    @Insert("insert into managers(name,password) values(#{name},#{password})")
    int insertManagerByRegister(Managers managers);

    @Select("select * from managers where ${key} = #{value}")
    Managers getManagersByColumn(String key, String value);

    @Update("update managers set name = #{name}, password = #{password}, " +
            "email = #{email}")
    int updateMember(Managers managers);

    @Delete("delete from managers where id = #{id}")
    int deleteManagersById(int id);

}
