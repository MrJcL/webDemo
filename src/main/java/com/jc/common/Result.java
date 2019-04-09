package com.jc.common;

/**
 * @program: webDemo
 * @Date: 2019/4/8 20:41
 * @Author: JcLi
 * @Description:
 *              返回前端的数据格式
 */
public class Result {

    /**
     * 状态码：
     *      200：成功
     *      500：服务器错误
     *      501：bean验证错误，map形式返回
     *      502：拦截器拦截到用户token出错
     *      555：抛出异常信息
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String msg;

    /**
     * 响应数据
     */
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result() {
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(Object data) {
        this.code = 200;
        this.msg = "OK";
        this.data = data;
    }

    public static Result ok(){
        return new Result(null);
    }

    public static Result ok(Object data){
        return new Result(data);
    }

    public static Result errorMsg(String msg){
        return new Result(500, msg,null);
    }

    public static Result errorMap(Object data){
        return new Result(500, null, data);
    }
}
