package com.nyaxs.nyastore.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

@Data
public class ImagesCommodities implements Serializable {
    private Integer id;

    @NotBlank
    private Integer commodityId;

    @NotBlank
    private String imgAddress;

    private static final long serialVersionUID = 1L;
}