package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.ShoppingCarts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @ClassName ShoppingCartsMapper
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-27 14:18
 * @Version 1.0
 **/
@Repository
@Mapper
public interface ShoppingCartsMapper {

    @Select("select id, member_id from shopping_carts where member_id = #{memberId}")
    ShoppingCarts getShoppingCarts(int memberId);

}
