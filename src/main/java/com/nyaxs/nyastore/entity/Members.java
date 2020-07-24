package com.nyaxs.nyastore.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class Members implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private String nickname;

    private Integer rank;

    private Integer phone;

    private LocalDate createTime;

    private Integer gender;

    private Integer status;

    private LocalDate birthday;

    private String personalizedSignature;

    private String email;

    private static final long serialVersionUID = 1L;


}