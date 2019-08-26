package com.sboot.merge.core.exception;

import com.sboot.merge.core.reponseDate.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName GlobalExceptionHandler
 * @description 统一异常处理类
 * @author hellozhaoxudong@163.com
 * @date 2019/4/28 11:44
 * @version 1.0
 * @since JDK 1.8
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private final static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResponseData exceptionHandler(Exception e){
        if(e instanceof BaseException){
            BaseException baseException = (BaseException)e;
            logger.error("exception! errorCode: " + baseException.getErrorCode() + ", errorMsg: " + baseException.getErrorMsg());
            return new ResponseData(baseException.getErrorCode(), baseException.getErrorMsg());

        }else{
            logger.error("exception! errorCode: 0000, errorMsg: " + e.getMessage());
            return new ResponseData("0000",e.getMessage());
        }
    }
}
