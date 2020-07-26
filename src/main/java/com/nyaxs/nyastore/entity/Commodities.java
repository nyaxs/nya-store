package com.nyaxs.nyastore.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
public class Commodities implements Serializable {
    private Integer id;

    private String name;

    private String description;

    private Integer storeId;

    private Integer buyNumber;

    private Double price;

    private LocalDate createTime;

    private static final long serialVersionUID = 1L;


}