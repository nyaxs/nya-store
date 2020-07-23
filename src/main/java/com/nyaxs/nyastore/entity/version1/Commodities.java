package com.nyaxs.nyastore.entity.version1;

import lombok.AllArgsConstructor;
import lombok.Data;
import sun.util.resources.LocaleData;

import java.util.List;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.nyastore.entity
 * @date 2020/7/16 15:54
 */
@Data
@AllArgsConstructor
public class Commodities {
    private int id;
    private int storeId;
    private int categoryId;
    private int amount;
    private int buyNumber;
    private double price;
    private String name;
    private String categoryDetail;
    private String description;
    private LocaleData createTime;
    private List<CommodityImages> imagesList;
    public Commodities(){
        storeId = 0;
        name = "无名商品";
        description = "商品无描述";
    }
}
