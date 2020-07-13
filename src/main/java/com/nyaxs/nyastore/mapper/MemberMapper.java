package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

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
    int getMemberById(int id);

    int getMemberByName();

    @Select("SELECT * FROM member WHERE name = #{name} AND password = #{password} LIMIT 1")
    int getMemberByNameAndPassword(String name, String password);

    int getMemberByPhone();

    int createMember(Member member);

    int deleteMemberById(int id);

    int deleteMemberByName(String name);

    int updateMemberById(Member member);

    int updateMemberByName(Member member);

}
