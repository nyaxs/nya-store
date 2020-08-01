package com.nyaxs.nyastore.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

@Data
public class Members implements Serializable {
    private Integer id;

    @NotBlank
    @Size(max = 12,min = 1)
    private String name;

    @NotBlank
    private String password;


    private String nickname;

    private Integer rankInfo;

    private Integer phone;

    private LocalDate createTime;

    private Integer gender;

    private Integer status;

    private LocalDate birthday;

    private String personalizedSignature;

    private String email;

    private static final long serialVersionUID = 1L;


}