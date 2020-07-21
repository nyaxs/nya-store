package com.nyaxs.nyastore.entity;

import java.time.LocalDate;
import java.util.List;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.nyastore.entity
 * @date 2020/7/16 17:53
 */
public class Orders {
    private int id;
    private List<Commodities> goods_list;
    private LocalDate createTime;
    private int status;
    private String address;
}
