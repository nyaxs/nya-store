package com.nyaxs.nyastore.entity;

import lombok.Data;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
public class Stores implements Serializable {
    private Integer id;

    @NotBlank
    @Size(min = 1,max = 12)
    private String name;

    private Integer managerId;

    private String description;

    private LocalDate createTime;

    private String address;

    private String email;

    private static final long serialVersionUID = 1L;


}