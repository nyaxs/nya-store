package com.nyaxs.nyastore.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author nyaxs
 */
@Data
public class CommoditiesListOrders implements Serializable {
    private Integer id;

    private Integer goodsId;

    private Integer ordersId;

    private Integer size;

    private static final long serialVersionUID = 1L;

}