package com.nyaxs.nyastore.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
public class Orders implements Serializable {
    private Integer id;

    private LocalDate createTime;

    private Integer status;

    private String address;

    private static final long serialVersionUID = 1L;


}