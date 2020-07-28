package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Commodities;
import com.nyaxs.nyastore.entity.Members;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName CommoditiesMapper
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-24 17:20
 * @Version 1.0
 **/

@Repository
@Mapper
public interface CommoditiesMapper {

    @Select("select * from commodities where name = #{name} ")
    Commodities getCommodityByName(String name);

    @Select("select * from commodities where id = #{id}")
    Commodities getCommodityById(int id);

    @Select("select * from commodities where name like concat('%',#{name},'%')")
    List<Commodities> getCommoditiesListByName(String name);

    @Insert("insert into commodities(name,description,store_id,price,create_time,)" +
            " values(#{name},#{description},#{store_id},#{price},#{createTime})")
    int insertCommodity(Commodities commodity);

    @Select("select * from commodities where ${key} = #{value}")
    Commodities getCommodityByColumn(String key, String value);

    @Update("update commodities set name = #{name}")
    int updateMember(Commodities commodity);

    @Delete("delete from commodities where id = #{id}")
    int deleteCommodityById(int id);


}
