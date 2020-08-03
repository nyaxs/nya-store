package com.nyaxs.nyastore.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
public class Commodities implements Serializable {

    private Integer id;

    @NotBlank
    @Size(max = 18,min = 1, message = "商品名长度1-18")
    private String name;

    private String description;

    @NotEmpty(message = "storeId不为空")
    private Integer storeId;

    private Integer buyNumber;

    @NotEmpty(message = "price不为空")
    private Double price;

    private LocalDate createTime;

    private static final long serialVersionUID = 1L;


}