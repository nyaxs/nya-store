package com.nyaxs.nyastore.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ShoppingCarts implements Serializable {
    private Integer id;

    private Integer memberId;

    private static final long serialVersionUID = 1L;


}