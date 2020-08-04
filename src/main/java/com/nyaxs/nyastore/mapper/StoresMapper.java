package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Stores;
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

    @Select("select * from stores where id = #{id}")
    Stores getStoreById(int id);

    @Select("select * from stores where name = #{name}")
    Stores getStoreByName(String name);

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

}
