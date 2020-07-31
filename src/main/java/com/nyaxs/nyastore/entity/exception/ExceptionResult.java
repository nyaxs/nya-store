package com.nyaxs.nyastore.entity.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName ExceptionResult
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-31 16:33
 * @Version 1.0
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ExceptionResult implements Serializable {

    private Integer code;
    private String message;
    private Object data;
}
