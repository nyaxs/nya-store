package com.nyaxs.nyastore.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
public class Commodities implements Serializable {

    private Integer id;

    @NotBlank
    @Size(max = 18,min = 1)
    private String name;

    private String description;

    @NotBlank
    private Integer storeId;

    private Integer buyNumber;

    private Double price;

    private LocalDate createTime;

    private static final long serialVersionUID = 1L;


}