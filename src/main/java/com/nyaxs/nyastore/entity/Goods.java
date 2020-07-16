package com.nyaxs.nyastore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.nyastore.entity
 * @date 2020/7/16 15:54
 */
@Data
@AllArgsConstructor
public class Goods {
    private int id;
    private int storeId;
    private String name;
    private String description;
    public Goods(){
        storeId = 0;
        name = "无名商品";
        description = "商品无描述";
    }
}
