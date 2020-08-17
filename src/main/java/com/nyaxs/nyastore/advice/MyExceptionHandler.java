package com.nyaxs.nyastore.advice;

import com.nyaxs.nyastore.entity.ResultBean;
import com.nyaxs.nyastore.entity.exception.ExceptionEnum;
import com.nyaxs.nyastore.entity.exception.ExceptionResult;
import com.nyaxs.nyastore.entity.exception.MyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName MyExceptionAdvice
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-31 16:28
 * @Version 1.0
 **/

@RestControllerAdvice
@Slf4j
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResultBean unknownException(Exception e){
        log.error("发生了未知异常", e);
        // 邮件通知技术人员
        return ResultBean.error(-999,"系统出现异常，请联系客服或管理员");
    }



    @ExceptionHandler(value = MyException.class)
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
