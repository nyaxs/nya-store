package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Orders;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * @ClassName OrdersMapper
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-25 20:46
 * @Version 1.0
 **/
@Repository
@Mapper
public interface OrdersMapper {


    @Select("select * from orders where id = #{id}")
    Orders getOrderById(int id);

    @Select("select * from orders_members_list where member_id = #{memberId} ")
    List<Orders> getOrdersListByMemberId(int memberId);

    @Select("insert into orders(create_time, status, address) values (#{createTime},#{status},#{address})")
    int insertOrders(Orders order);

    @Update(" update orders set address = #{address} where id = #{id} ")
    int updateOrderAddressById(int id, String address);

    @Update("update orders set status = #{status} where id = #{id}")
    int updateOrderStatusById(int id, int status);

    @Delete(" delete orders where id = #{id} ")
    int deleteOrderById(int id);
}
