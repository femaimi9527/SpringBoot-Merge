package com.sboot.merge.core.reponseDate;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @ClassName ResponseData
 * @description 统一返回格式
 * @author hellozhaoxudong@163.com
 * @date 2019/4/26 18:04
 * @version 1.0
 * @since JDK 1.8
 */
public class ResponseData {

    /** 调用成功标识 **/
    private boolean success;

    /** 调用异常编码 **/
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorCode;

    /** 调用异常信息 **/
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorMsg;

    /** 返回的数据 **/
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object datas;


    public ResponseData(){
        setSuccess(true);
    }

    public ResponseData(boolean success){
        setSuccess(success);
    }

    public ResponseData(String errorMsg){
        setSuccess(false);
        setErrorMsg(errorMsg);
    }

    public ResponseData(String errorCode, String errorMsg){
        setSuccess(false);
        setErrorCode(errorCode);
        setErrorMsg(errorMsg);
    }

    public ResponseData(Object datas){
        setSuccess(true);
        setDatas(datas);
    }

    /** getter & setter **/
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

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

    public Object getDatas() {
        return datas;
    }

    public void setDatas(Object datas) {
        this.datas = datas;
    }
}
