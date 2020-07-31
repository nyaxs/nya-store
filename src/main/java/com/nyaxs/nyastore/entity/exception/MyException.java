package com.nyaxs.nyastore.entity.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName ExceptionInfo
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-30 22:58
 * @Version 1.0
 **/
@Getter
@Setter
public class MyException extends RuntimeException {

    private Integer code;

    public MyException(String msg) {
        super(msg);
    }

    public MyException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

}
