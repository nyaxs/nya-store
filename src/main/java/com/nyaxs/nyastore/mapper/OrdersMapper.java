package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName OrdersMapper
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-25 20:46
 * @Version 1.0
 **/
@Mapper
public interface OrdersMapper {

    @Select("select * from orders where id = #{id}")
    Orders getOrderById(int id);

    @Select("insert into orders(create_time, status, address) values (#{createTime},#{status},#{address})")
    int insertOrders(Orders order);
}
