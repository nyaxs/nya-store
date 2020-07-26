package com.nyaxs.nyastore.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
public class Stores implements Serializable {
    private Integer id;

    private String name;

    private Integer managerId;

    private String description;

    private LocalDate createTime;

    private String address;

    private String email;

    private static final long serialVersionUID = 1L;


}