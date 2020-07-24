package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Members;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName MembersMapper
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-24 17:20
 * @Version 1.0
 **/

@Mapper
public interface MembersMapper {

    @Select("select * from members where name = #{name} and password = #{password}")
    Members getMemberByNameAndPassword(String name, String password);

    @Select("select * from members where id = #{id}")
    Members selectById(int id);

    @Insert("insert into members(name,password) values(#{name},#{password})")
    int insertMemberByRegister(Members member);

    @Select("select * from members where ${key} = #{value}")
    Members getMemberByColumn(String key, String value);
}
