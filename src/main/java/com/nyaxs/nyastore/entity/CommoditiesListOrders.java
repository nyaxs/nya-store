package com.nyaxs.nyastore.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * @author nyaxs
 */
@Data
public class CommoditiesListOrders implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer commodityId;
    @NotEmpty
    private Integer ordersId;
    @NotEmpty
    private Integer size;

    private static final long serialVersionUID = 1L;

}