package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Members;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper

public interface MembersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Members record);

    Members selectByPrimaryKey(Integer id);

    List<Members> selectAll();

    int updateByPrimaryKey(Members record);

    Members getMemberByNameAndPassword(String name, String password);

    int insertMemberByRegister(Members member);

    Members getMemberByColumn(String key, String value);
}