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

    /**
     * todo：根据名字精确搜索商品
     * @param name 商品名
     * @return Commodities 对象，商品的实体类
     */
    @Select("select * from commodities where name = #{name} ")
    Commodities getCommodityByName(String name);

    /**
     * todo: 根据 id 精确搜索商品
     * @param id 商品 id
     * @return Commodities 对象，商品的实体类
     */
    @Select("select * from commodities where id = #{id}")
    Commodities getCommodityById(int id);

    @Select("select * from commodities where name like concat('%',#{name},'%')")
    List<Commodities> getCommoditiesListByName(String name);

    /**
     * todo: 添加一项 commodities 商品 记录
     * @param commodity Commodities 对象，商品的实体类
     * @return int 影响行数
     */
    @Insert("insert into commodities(name,description,store_id,price,create_time,)" +
            " values(#{name},#{description},#{store_id},#{price},#{createTime})")
    int insertCommodity(Commodities commodity);

    /**
     * todo: 根据指定的列名和值查询数据
     * @param key 表的字段名
     * @param value 条件值
     * @return Commodities 对象，商品的实体类
     */
    @Select("select * from commodities where ${key} = #{value}")
    Commodities getCommodityByColumn(String key, String value);

    /**
     * todo: 更新一条商品记录的 name 名字 字段
     * @param commodity Commodities 对象，商品的实体类
     * @return int 影响行数
     */
    @Update("update commodities set name = #{name}")
    int updateCommodityName(Commodities commodity);

    @Delete("delete from commodities where id = #{id}")
    int deleteCommodityById(int id);


}
