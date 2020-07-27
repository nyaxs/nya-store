package com.nyaxs.nyastore.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrdersCommoditiesList implements Serializable {
    private Integer id;

    private Integer orderId;

    private Integer commodityId;

    private Integer buyNumber;

    private Integer storeId;

    private static final long serialVersionUID = 1L;


}