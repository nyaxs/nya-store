package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Stores;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName StoresMapper
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-25 20:51
 * @Version 1.0
 **/
@Repository
@Mapper
public interface StoresMapper {

    /**
     * todo: 根据指定的 id, 查找商店记录
     * @param id 商店 id 参数
     * @return 返回 一条 stores 记录对应的 Stores 对象
     */
    @Select("select * from stores where id = #{id}")
    Stores getStoreById(int id);


    /**
     * todo: 根据指定的商店名，进行精确匹配对应的商店
     * @param name 商店名参数
     * @return 返回stores表一条记录对应的商店对象
     */
    @Select("select * from stores where name = #{name}")
    Stores getStoreByName(String name);

    /**
     * todo: 根据指定的商店名，进行模糊查询
     * @param name 传入的商店名参数
     * @return 返回一组匹配的商店列表
     */

    @Select("select * from stores where name like  concat('%',#{name},'%')  ")
    List<Stores> getStoresByName(String name);

    /**
     * todo: 添加商店，插入商店表stores中
     * @param  store 传入的商店实体类
     * @return int,影响行数
     */
    @Insert("insert into stores(name,manager_id,description,create_time,address,email)" +
            "values(#{name},#{managerId},#{description},#{createTime},#{address},#{email})")
    int insertStore(Stores store);


    /**
     * todo: 根据 id 删除 stores 表中一条记录
     * @alert: 危险操作，请验证权限
     * @param id 商店的id
     * @return int 影响行数
     */
    @Delete("delete from stores where id = #{id}")
    int deleteStoreById(int id);

}
