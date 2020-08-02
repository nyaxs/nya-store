package com.nyaxs.nyastore.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author nyaxs
 */
@Data
public class Categories implements Serializable {
    private Integer id;

    @NotBlank
    private String category;

    @NotBlank
    @NotNull
    private Integer commodityId;

    private static final long serialVersionUID = 1L;

}