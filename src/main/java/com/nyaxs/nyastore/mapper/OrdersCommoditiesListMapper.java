package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.OrdersCommoditiesList;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName OrdersCommoditiesListMapper
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-27 19:21
 * @Version 1.0
 **/

@Repository
@Mapper
public interface OrdersCommoditiesListMapper {

    @Insert("insert into orders_commodities_list (order_id, commodity_id,buy_number,store_id)" +
            "values(#{orderId},#{commodityId},#{buyNumber},#{storeId})")
    int insertOrdersCommoditiesList(OrdersCommoditiesList ordersList);

    @Select("select id, order_id, commodity_id, buy_number, store_id " +
            "from orders_commodities_list " +
            "where order_id = #{order_id}")
    List<OrdersCommoditiesList> getOrdersCommoditiesList(int orderId);

}
