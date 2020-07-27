package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Orders;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;

/**
 * @ClassName OrdersMapper
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-25 20:46
 * @Version 1.0
 **/
@Mapper
public interface OrdersMapper {


    @Insert("insert into orders (create_time, address) values (#{createTime},#{address})")
    int insertOrders(LocalDate createTime, String address);

    @Select("select * from orders where id = #{id}")
    Orders getOrderById(int id);

    @Select("insert into orders(create_time, status, address) values (#{createTime},#{status},#{address})")
    int insertOrders(Orders order);

    @Update(" update orders set address = #{address} where id = #{id} ")
    int updateOrderAddressById(int id, String address);

    @Update("update orders set status = #{status} where id = #{id}")
    int updateOrderStatusById(int id, int status);

    @Delete(" delete orders where id = #{id} ")
    int deleteOrderById(int id);
}
