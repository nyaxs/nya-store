package com.nyaxs.nyastore.advice;

import com.nyaxs.nyastore.entity.ResultBean;
import com.nyaxs.nyastore.entity.exception.ExceptionEnum;
import com.nyaxs.nyastore.entity.exception.ExceptionResult;
import com.nyaxs.nyastore.entity.exception.MyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName MyExceptionAdvice
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-31 16:28
 * @Version 1.0
 **/

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

//    @ExceptionHandler(Exception.class)
//    public ResultBean unknownException(Exception e){
//        log.error("发生了未知异常", e);
//        // 邮件通知技术人员
//        return ResultBean.fail(-999,"系统出现异常，请联系客服或管理员");
//    }
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(
            Exception ex, @Nullable Object body, HttpHeaders headers, HttpStatus status, WebRequest request){
        if (HttpStatus.INTERNAL_SERVER_ERROR.equals(status)){
            request.setAttribute(WebUtils.ERROR_EXCEPTION_ATTRIBUTE,ex,WebRequest.SCOPE_REQUEST);
        }
        logger.error(ex.getMessage(),ex);
        ResultBean resultBean = ResultBean.fail(status.value(),ex.getMessage());
        return new ResponseEntity<>(resultBean,headers,status);

    }



}
