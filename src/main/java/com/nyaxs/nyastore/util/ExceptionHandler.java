package com.nyaxs.nyastore.util;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName ExceptionHandler
 * @Description TODO:
 * @Author nyaxs
 * @Date 2020-07-30 23:00
 * @Version 1.0
 **/
@Slf4j
public class ExceptionHandler {

    public void catchError(int errId){
      log.info("errId = " + errId);
    }

}
