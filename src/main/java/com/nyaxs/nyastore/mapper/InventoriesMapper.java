package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Inventories;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName InventoriesMapper
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-27 13:45
 * @Version 1.0
 **/

@Repository
@Mapper
public interface InventoriesMapper {

    @Select("select * from inventories where store_id = #{storeId} and commodity_id =  #{commodityId}")
    Inventories getOneInventories(int storeId, int commodityId);

    @Select("select * from inventories where store_id = #{storeId}")
    List<Inventories> getInventoriesListByStoreId(int storeId);

    @Select("select * from inventories where store_id = #{storeId}")
    List<Inventories> getInventoriesListByStoreIdAndCommoditiesId(int storeId, List<Integer> commoditiesId);

    @Update("update inventories set amount = #{amount} where commodity_id = #{commodity_id} and store_id = #{storeId}")
    int updateInventories(int storeId, int commodityId, int amount);

    
}
