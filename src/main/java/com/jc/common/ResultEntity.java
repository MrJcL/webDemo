package com.jc.common;

/**
 * @program: webDemo
 * @Date: 2019/4/12 0:07
 * @Author: JcLi
 * @Description:
 */
public class ResultEntity<T> {

    /**
     * 成功/失败
     */
    private boolean isSuccess = true;

    /**
     * 信息
     */
    private String message;

    /**
     * 业务对象
     */
    private T businessObject;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getBusinessObject() {
        return businessObject;
    }

    public void setBusinessObject(T businessObject) {
        this.businessObject = businessObject;
    }
}
