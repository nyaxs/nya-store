package com.nyaxs.nyastore.controller;

import com.nyaxs.nyastore.entity.Commodities;
import com.nyaxs.nyastore.entity.ShoppingCarts;
import com.nyaxs.nyastore.entity.ShoppingCartsCommodities;
import com.nyaxs.nyastore.mapper.ShoppingCartsCommoditiesMapper;
import com.nyaxs.nyastore.mapper.ShoppingCartsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    private final ShoppingCartsCommoditiesMapper cartsCommoditiesMapper;

    private final ShoppingCartsMapper cartMapper;

    @Autowired
    public ShoppingCartsController(ShoppingCartsCommoditiesMapper cartsCommoditiesMapper, ShoppingCartsMapper cartMapper) {
        this.cartsCommoditiesMapper = cartsCommoditiesMapper;
        this.cartMapper = cartMapper;
    }

    @GetMapping("shoppingCart/{memberId}")
    public ShoppingCarts getCartByMemberId(@PathVariable int memberId){
        return cartMapper.getShoppingCarts(memberId);
    }

    @GetMapping("shoppingCart/commoditiesList/{cartId}")
    public List<ShoppingCartsCommodities> getCommoditiesListInCart(@PathVariable int cartId){
        return cartsCommoditiesMapper.getShoppingCartsCommodities(cartId);
    }

    @PostMapping("cart/commodities")
    public int addCommoditiesIntoCarts(@RequestBody ShoppingCartsCommodities cartsCommodities){
        return cartsCommoditiesMapper.addCommodityToShoppingCartsById(cartsCommodities);
    }

    @PutMapping("cart/commodity/buyNumber")
    public int updateBuyNumber(@RequestBody ShoppingCartsCommodities cartsCommodities){
        return cartsCommoditiesMapper.updateBuyNumber(cartsCommodities);
    }

    @DeleteMapping("cart/commodity")
    public int deleteCommodity(@RequestBody ShoppingCartsCommodities cartsCommodity){
        return cartsCommoditiesMapper.deleteCommodityFromCarts(cartsCommodity);
    }


        

}
