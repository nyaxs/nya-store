package com.nyaxs.nyastore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Managers implements Serializable {
    private Integer id;

    @NotBlank
    @Size(min = 1,max = 12)
    private String name;

    @Size(min = 1,max = 12)
    private Integer storeId;

    @Size(min = 1,max = 12)
    private String password;

    private Integer rankInfo;

    @Email
    private String email;

    private Integer phone;

    private static final long serialVersionUID = 1L;

}