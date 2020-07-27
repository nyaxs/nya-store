package com.nyaxs.nyastore.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @ClassName LevelsMapper
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-26 22:09
 * @Version 1.0
 **/
@Repository
@Mapper
public interface LevelsMapper {

    @Select(" select role from levels where rank = '#{rank} ")
    String getLevelRoleByRank(int rank);



}
