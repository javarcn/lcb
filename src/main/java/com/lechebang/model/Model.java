package com.lechebang.model;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Model {

    /**
     * costTime : 16
     * msg : ok
     * result :
     * resultCode : 200
     * statusCode : 200
     * validationErrors : null
     */

    private int costTime;
    private String msg;
    private Object result;
    private String resultCode;
    private String statusCode;
    private Object validationErrors;

    public int getCostTime() {
        return costTime;
    }

    public void setCostTime(int costTime) {
        this.costTime = costTime;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Object getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(Object validationErrors) {
        this.validationErrors = validationErrors;
    }
}
