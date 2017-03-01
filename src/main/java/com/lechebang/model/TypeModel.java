package com.lechebang.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/1.
 */
public class TypeModel {
    private int costTime;
    private String msg;
    private List<TypeDetail> result=new ArrayList<TypeDetail>();
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

    public List<TypeDetail> getResult() {
        return result;
    }

    public void setResult(List<TypeDetail> result) {
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
