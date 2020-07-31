package com.nyaxs.nyastore.advice;

import com.nyaxs.nyastore.entity.exception.ExceptionEnum;
import com.nyaxs.nyastore.entity.exception.ExceptionResult;
import com.nyaxs.nyastore.entity.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName MyExceptionAdvice
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-31 16:28
 * @Version 1.0
 **/

@ControllerAdvice
public class MyExceptionAdvice {
    @ExceptionHandler(value = Exception.class)

    @ResponseBody

    public ExceptionResult defaultException(HttpServletRequest request, Exception e){

        e.printStackTrace();

        return ExceptionResult.builder()

                .code(ExceptionEnum.EXCEPTION.getCode())

                .message(ExceptionEnum.EXCEPTION.getMsg())

                .build();

    }



    @ExceptionHandler(value = MyException.class)

    @ResponseBody

    public ExceptionResult myException(HttpServletRequest request,MyException e){

        e.printStackTrace();

        Integer code=e.getCode();

        String message=e.getMessage();



        if (e.getCode()==null){

            code=ExceptionEnum.EXCEPTION.getCode();

        }

        if (e.getMessage()==null){

            message=ExceptionEnum.EXCEPTION.getMsg();

        }

        return ExceptionResult.builder()

                .code(code)

                .message(message)

                .build();

    }



}
