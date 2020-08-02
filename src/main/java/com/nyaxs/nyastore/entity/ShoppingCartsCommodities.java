package com.nyaxs.nyastore.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

@Data
public class ShoppingCartsCommodities implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer shoppingCartId;

    @NotEmpty
    private Integer commodityId;

    @NotEmpty
    private Integer buyNumber;

    private Integer storeId;

    private static final long serialVersionUID = 1L;

}