package com.nyaxs.nyastore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;


/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.nyastore.Member
 * @date 2020/7/11 20:27
 */
@Data
@AllArgsConstructor
public class CommodityImages {
    private int id;
    private int commodityId;
    private String address;
}
