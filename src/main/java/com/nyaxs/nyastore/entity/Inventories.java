package com.nyaxs.nyastore.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Inventories implements Serializable {
    private Integer id;

    private Integer storeId;

    private Integer commodityId;

    private Integer amount;

    private String details;

    private static final long serialVersionUID = 1L;


}