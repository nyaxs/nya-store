package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Members;
import org.apache.ibatis.annotations.*;

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

    @Update("update members set name = #{name}, password = #{password}, " +
            "nickname = #{nickname}, birthday = #{birthday}, " +
            "gender = #{gender}, personalized_signature = #{personalizedSignature}," +
            "email = #{email}, phone = #{phone}")
    int updateMember(Members member);

    @Delete("delete from members where id = #{id}")
    int deleteMemberById(int id);
}
