package com.nyaxs.nyastore.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
public class Orders implements Serializable {


    private Integer id;

    private LocalDate createTime;

    /**
     * '订单状态：1-待付款，2-代发货，3-待收货，4-待评价'
     */
    private Integer status;

    private String address;

    private static final long serialVersionUID = 1L;


}