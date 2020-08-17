package com.nyaxs.nyastore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

/**
 * @ClassName ResultBean
 * @Description TODO:规范返回结果集
 * @Author nyaxs
 * @Date 2020-08-17 13:30
 * @Version 1.0
 **/


@Data
public class ResultBean<T> {
    private int code;
    private String message;
    private T data;

    public ResultBean(){
        this.code = 0;
        this.message = "success";
    }

    public ResultBean(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultBean(T data){
        this.code = 0;
        this.message = "success";
        this.data = data;
    }

    public static <T> ResultBean<T> fail(int code, String message){
        return new ResultBean(code,message);
    }

    public static <T> ResultBean<T> success(){
        return new ResultBean();
    }

    public static <T> ResultBean<T> success(T data){
        return new ResultBean(data);
    }

}
