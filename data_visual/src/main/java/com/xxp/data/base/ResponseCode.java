package com.xxp.data.base;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseCode {

    /**
     * 操作成功
     */
    OK(200,"成功"),

    /**
     * 系统错误
     */
    ERROR(500,"系统异常，请稍后再试"),

    /**
     * 找不到资源
     */
    Code_404(404,"找不到资源");

    private  int code;
    private  String msg;

    ResponseCode(int code, String msg){

        this.code=code;
        this.msg=msg;
    }

    public int getCode(){return this.code;}
    public String getMsg(){return this.msg;}
}
