package com.nyaxs.nyastore.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Email;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

@Data
public class Members implements Serializable {
    private Integer id;

    @NotBlank
    @Size(min = 1, max = 12)
    private String name;

    @NotBlank
    @Size(min = 6, max = 16)
    private String password;

    private String nickname;

    private Integer rankInfo;

    private Integer phone;

    private LocalDate createTime;

    private Integer gender;

    private Integer status;

    @Past
    private LocalDate birthday;

    private String personalizedSignature;

    @Email
    private String email;

    private static final long serialVersionUID = 1L;


}