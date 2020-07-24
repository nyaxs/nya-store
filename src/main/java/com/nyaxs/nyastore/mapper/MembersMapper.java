package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Members;
import java.util.List;

public interface MembersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Members record);

    Members selectByPrimaryKey(Integer id);

    List<Members> selectAll();

    int updateByPrimaryKey(Members record);
}