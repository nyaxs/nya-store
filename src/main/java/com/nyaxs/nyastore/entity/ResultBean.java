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

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResultBean<T> {
    private int code;
    private String message;
    private Collection<T> data;

    public static ResultBean error(int code, String message){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(code);
        resultBean.setMessage(message);
        return resultBean;
    }

    public static ResultBean success(){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(0);
        resultBean.setMessage("success");
        return resultBean;
    }

    public static <V> ResultBean<V> success(Collection<V> data){
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(0);
        resultBean.setMessage("success");
        resultBean.setData(data);
        return resultBean;
    }

}
