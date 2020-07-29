package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.ShoppingCartsCommodities;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName ShoppingCartsCommoditiesMapper
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-27 14:36
 * @Version 1.0
 **/
@Repository
@Mapper
public interface ShoppingCartsCommoditiesMapper {

    @Select("select * from shopping_carts_commodities where shopping_cart_id = #{shoppingCartId}")
    List<ShoppingCartsCommodities> getShoppingCartsCommodities(int shoppingCartId);

    @Insert("insert into shopping_carts_commodities(shopping_cart_id,commodity_id,buy_number,store_id) " +
            "values(#{shoppingCartId},#{commodityId},#{buyNumber},#{storeId})")
    int addCommodityToShoppingCartsById(ShoppingCartsCommodities shoppingCartsCommodities);

    @Update("update shopping_carts_commodities set buy_number = #{buyNumber} " +
            "where shopping_cart_id = #{shoppingCartId}" +
            "and commodity_id = #{commodityId}")
    int updateBuyNumber(ShoppingCartsCommodities cartsCommodities);

    @Delete("delete from shopping_carts_commodities where shopping_cart_id = #{shoppingCartId} and commodity_id = #{commodityId}")
    int deleteCommodityFromCarts(ShoppingCartsCommodities cartsCommodity);

}
