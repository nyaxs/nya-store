package com.nyaxs.nyastore.entity.exception;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName ExceptionEnum
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-31 15:56
 * @Version 1.0
 **/
@Getter
public enum ExceptionEnum {

    SUCCESS(200, "成功"),

    FAIL(100, "失败"),

    EXCEPTION(300, "系统异常"),

    UNLOGIN(201, "未登录");


    private Integer code;

    private String msg;

    private ExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {

        return code;

    }


    public void setCode(Integer code) {

        this.code = code;

    }


    public String getMsg() {

        return msg;


    }
}
