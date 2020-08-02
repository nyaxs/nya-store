package com.nyaxs.nyastore.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

@Data
public class ShoppingCarts implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer memberId;

    private static final long serialVersionUID = 1L;


}