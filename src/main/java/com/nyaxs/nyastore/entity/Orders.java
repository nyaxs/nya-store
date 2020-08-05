package com.nyaxs.nyastore.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
public class Orders implements Serializable {


    @NotEmpty(message = "orders id不为空")
    private Integer id;


    private LocalDate createTime;

    /**
     * '订单状态：1-待付款，2-代发货，3-待收货，4-待评价'
     */
    private Integer status;

    @NotBlank(message = "orders 地址不为空")
    private String address;

    private static final long serialVersionUID = 1L;


}