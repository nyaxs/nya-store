package com.nyaxs.nyastore.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Email;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author nyaxs
 */
@Data
public class Members implements Serializable {
    private Integer id;

    @NotBlank(message = "用户名不能为空")
    @Length(min = 1, max = 12, message = "用户名长度长度在1-12之间")
    private String name;

    @NotBlank(message = "密码不能为空")
    @Size(min = 6, max = 16, message = "密码长度长度在6-16之间")
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