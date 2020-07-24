package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.ShoppingCarts;
import java.util.List;

public interface ShoppingCartsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShoppingCarts record);

    ShoppingCarts selectByPrimaryKey(Integer id);

    List<ShoppingCarts> selectAll();

    int updateByPrimaryKey(ShoppingCarts record);
}