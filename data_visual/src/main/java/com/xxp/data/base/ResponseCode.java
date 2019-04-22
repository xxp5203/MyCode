package com.xxp.data.base;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseCode {


    /**
     * 添加枚举类的变量，一定是写在第一行的。
     */
    OK(200,"成功"), ERROR(500,"系统异常，请稍后再试"),
    Code_404(404,"找不到资源");

    /*
     * 枚举类定义自定义变量，就是上面括号里的类型
     */
    private  int code;
    private  String msg;

    /**
     *默认并强制构造方法是private
     * @param code
     * @param msg
     *//*
    ResponseCode(int code, String msg){

        this.code=code;
        this.msg=msg;
    }

    public int getCode(){return this.code;}
    public String getMsg(){return this.msg;}*/
}
