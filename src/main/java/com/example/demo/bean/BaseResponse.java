package com.example.demo.bean;

import org.springframework.http.HttpStatus;

public class BaseResponse<T> {
    private T data;
    private Integer code;
    private String message;

    public BaseResponse(T data, Integer code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    //接口请求成功
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(data, HttpStatus.OK.value(), "success");
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
