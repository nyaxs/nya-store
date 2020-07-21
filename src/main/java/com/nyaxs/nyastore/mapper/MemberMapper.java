package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Members;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.nyastore.mapper
 * @date 2020/7/12 20:55
 */
@Mapper
@Repository

public interface MemberMapper {

    /**
     * 根据指定的列和值查询一条member记录
     * 示例： getMemberByColumn("name","nyaxs")
     * @param value: 查找条件值
     * @param column: 数据库字段
     * @return Member: 返回数据库表映射的Member实体类
     */
    @Select("SELECT * FROM member WHERE ${column} = #{value}")
    Members getMemberByColumn(String column, Object value);

    /**
     * 根据用户名和密码查询用户记录
     * 一般用于登录
     * @param name 用户名
     * @param password 密码
     * @return Member 返回Member对象
     */
    @Select("SELECT * FROM member WHERE name = #{name} AND password = #{password} LIMIT 1")
    Members getMemberByNameAndPassword(String name, String password);

    /**
     * 向member表增加一条用户记录
     * 该记录只添加用户名name，密码password，创建时间create_time，常用于注册
     * @param member 传入的Member对象参数
     * @return int 返回影响行数
     */
    @Insert("INSERT INTO member(name, password, create_time) VALUES (#{name}, #{password}, #{createTime})")
    int insertMemberByRegister(Members member);

    /**
     * 更新member表一条记录
     * 更新用户的全部信息
     * @param member 传入Member对象参数
     * @return int 影响行数
     */
    @Update("UPDATE member SET name = #{name}, nickname = #{nickname}," +
            " password = #{password}, phone = #{phone}, " +
            "gender = #{gender},birthday = #{birthday}," +
            "email = #{email}, personalized_signature = #{personalizedSignature} ")
    int updateMemberById(Members member);


    @Select("SELECT * FROM member WHERE phone = #{phone} LIMIT 1")
    Members getMemberByPhone(int phone);


    @Delete("DELETE FROM member WHERE id = #{id}")
    int deleteMemberById(int id);

    @Delete("DELETE FROM member WHERE name = #{name}")
    int deleteMemberByName(String name);

    @Update("UPDATE member SET birthday = #{date} WHERE id = #{id}")
    int updateMemberBirthdayById(LocalDate date, int id);

    int updateMemberByName(Members member);

}
