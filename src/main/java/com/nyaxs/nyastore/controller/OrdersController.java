package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Orders;
import com.nyaxs.nyastore.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("order")
    int addOrder(@RequestBody Orders orders){
        return ordersMapper.insertOrders(orders);
    }

}
