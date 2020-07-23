package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.version1.Commodities;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.nyastore.mapper
 * @date 2020/7/12 20:55
 */
@Mapper
@Repository

public interface CommoditiesMapper {

    /**
     * 根据指定的列和值查询一条 commodities 记录
     * 示例： getCommoditiesByColumn("name","三得利红茶")
     * @param value: 查找条件值
     * @param column: 数据库字段
     * @return Commodities: 返回数据库表映射的 Commodities 实体类
     */
    @Select("SELECT * FROM commodities WHERE ${column} = #{value}")
    Commodities getCommodityByColumn(Object column, Object value);

    /**
     * 根据指定的 id 查询一条 commodities 记录
     * @param id: 查找的id
     * @return Commodities: 返回数据库商品表映射的 Commodities 实体类
     */
    @Select("SELECT * FROM commodities WHERE id = #{id}")
    Commodities getCommodityById(int id);

    /**
     * 根据指定的 storeId 查询该商店拥有的全部 commodities 记录
     * @param storeId: 查找的 storeId
     * @return List<Commodities>: 返回数据库商品表映射的 Commodities 实体类列表
     */
    @Select("SELECT * FROM commodities WHERE storeId = #{storeId}")
    List<Commodities> getCommoditiesListById(int storeId);

    /**
     * 根据给定的商店 id 和 模糊商品名 获取一组商品 id
     * @param name
     * @return
     */
    @Select("SELECT id FROM commodities WHERE storeId = #{storeId} AND name = #{name}")
    List<Integer> getCommodityIdListByName(int storeId,String name);

    /**
     * 根据给定的精确商品名获取一个商品记录
     * @param name
     * @return Commodities 表对应的实体类
     */

    @Select("SELECT id FROM commodities WHERE name = #{name}")
    Commodities getCommodityByName(String name);


    /**
     * 向 commodities 表增加一条商品记录
     * 添加字段: 商店id: storeId, 数目: amount, 价格: price, 商品名: name, 类别: category_detail, 描述: description, 创建时间: create_time
     * @param commodities 传入的 Commodities 对象参数
     * @return int 返回影响行数
     */
    @Insert("INSERT INTO commodities(storeId, amount, price, name, category_detail, description, create_time) VALUES (#{name}, #{password}, #{createTime})")
    int insertCommodityByRegister(Commodities commodities);

    /**
     * 根据传入的商品 id 删除一条商品记录
     * @param id 传入的商品 id
     * @return int 返回影响行数
     */
    @Delete("DELETE FROM commodities WHERE id = #{id}")
    int deleteMemberById(int id);



}
