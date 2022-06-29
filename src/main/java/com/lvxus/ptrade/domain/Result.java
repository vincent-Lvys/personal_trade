package com.lvxus.ptrade.domain;

import lombok.Data;

@Data
public class Result<T> {

    private Integer code;
    private String message;
    private T data;

    public Result(Integer code,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(String message){
        this.code = -1;
        this.message = message;
        this.data = null;
    }
    public Result(Integer code,String message){
        this.code = code;
        this.message = message;
        this.data = null;
    }

    public static Result fail(String message){
        return new Result(message);
    }
    public static Result success(String message){
        return new Result(200, message);
    }

    public Result<T> data(T data){
        this.data = data;
        return this;
    }
}
