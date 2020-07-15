package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Member;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.nyastore.mapper
 * @date 2020/7/12 20:55
 */
@Mapper
@Repository

public interface MemberMapper {

    @Select("SELECT * FROM member WHERE id = #{id}")
    Member getMemberById(int id);

    Member getMemberByName();

    @Select("SELECT * FROM member WHERE name = #{name} AND password = #{password} LIMIT 1")
    Member getMemberByNameAndPassword(String name, String password);

    @Select("SELECT * FROM member WHERE phone = #{phone} LIMIT 1")
    Member getMemberByPhone(int phone);

    @Insert("INSERT INTO member(name, password, create_time) VALUES (#{name}, #{password}, #{createTime})")
    int insertMemberByRegister(Member member);

    @Delete("DELETE FROM member WHERE id = #{id}")
    int deleteMemberById(int id);

    @Delete("DELETE FROM member WHERE name = #{name}")
    int deleteMemberByName(String name);

    @Update("UPDATE member SET birthday = #{date} WHERE id = #{id}")
    int updateMemberBirthdayById(Date date, int id);

    int updateMemberByName(Member member);

}
