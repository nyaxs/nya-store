package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Orders;
import com.nyaxs.nyastore.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName OrdersController
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-27 20:17
 * @Version 1.0
 **/
@RestController
public class OrdersController {

    @Autowired
    private OrdersMapper ordersMapper;

    @GetMapping("order/{id}")
    Orders getOrderById(@PathVariable int id){
        return ordersMapper.getOrderById(id);
    }

    @GetMapping("ordersList/{memberId}")
    List<Orders> getOrdersListByMemberId(@PathVariable int memberId){
        return ordersMapper.getOrdersListByMemberId(memberId);
    }

    @PostMapping("order")
    int addOrder(@RequestBody Orders orders){
        return ordersMapper.insertOrders(orders);
    }

    @PostMapping("order/status")
    int updateOrderStatus(@RequestBody int orderId, int status){
        return ordersMapper.updateOrderStatusById(orderId,status);
    }

    @PostMapping("order/address")
    int updateOrderAddress(@RequestBody int orderId, String address){
        return ordersMapper.updateOrderAddressById(orderId,address);
    }

    @DeleteMapping("order/{id}")
    int deleteOrderById(@PathVariable int id){
        return ordersMapper.deleteOrderById(id);
    }



}
