package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Commodities;
import com.nyaxs.nyastore.entity.ShoppingCarts;
import com.nyaxs.nyastore.entity.ShoppingCartsCommodities;
import com.nyaxs.nyastore.mapper.ShoppingCartsCommoditiesMapper;
import com.nyaxs.nyastore.mapper.ShoppingCartsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName ShoppingCartsController
 * @Description TODO: 处理用户购物车
 * @Author nyaxs
 * @Date 2020-07-28 16:40
 * @Version 1.0
 **/

@RestController
public class ShoppingCartsController {

    @Autowired
    private ShoppingCartsCommoditiesMapper cartsCommoditiesMapper;

    private ShoppingCartsMapper cartMapper;

    @GetMapping("shoppingCarts")
    public ShoppingCarts getCartByMemberId(int memberId){
        return cartMapper.getShoppingCarts(memberId);
    }

    @PostMapping("cart/commodities")
    public int addCommoditiesIntoCarts(@RequestBody ShoppingCartsCommodities cartsCommodities){
        return cartsCommoditiesMapper.addCommodityToShoppingCartsById(cartsCommodities);
    }

    

}
