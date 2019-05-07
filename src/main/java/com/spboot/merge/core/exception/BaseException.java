package com.spboot.merge.core.exception;

/**
 * @ClassName BaseException
 * @description 基础异常类
 * @author hellozhaoxudong@163.com
 * @date 2019/4/28 11:19
 * @version 1.0
 * @since JDK 1.8
 */
public class BaseException extends RuntimeException {

    /** 异常编码 **/
    private String errorCode;

    /** 异常信息 **/
    private String errorMsg;


    public BaseException(String errorMsg) {
        this(null, errorMsg, null);
    }

    public BaseException(String errorMsg, Throwable throwable) {
        this(null, errorMsg, throwable);
    }

    public BaseException(String errorCode, String errorMsg) {
        this(errorCode, errorMsg, null);
    }

    public BaseException(String errorCode, String errorMsg, Throwable throwable) {
        super(errorMsg, throwable);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    /** getter & setter **/
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
