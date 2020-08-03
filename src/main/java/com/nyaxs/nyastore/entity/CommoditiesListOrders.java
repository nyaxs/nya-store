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

    @NotEmpty(message = "commodityId不为空")
    private Integer commodityId;
    @NotEmpty(message = "ordersId 不为空")
    private Integer ordersId;
    @NotEmpty(message = "size不为空")
    private Integer size;

    private static final long serialVersionUID = 1L;

}