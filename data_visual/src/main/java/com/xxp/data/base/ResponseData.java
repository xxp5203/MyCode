package com.xxp.data.base;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class ResponseData<T> implements Serializable {

    private int code;
    private String message;
    private T content;

    public ResponseData(){
    }
    public ResponseData(ResponseCode responseCode,T content){
        this.code=responseCode.getCode();
        this.message=responseCode.getMsg();
        this.content=content;
    }
    public ResponseData(T content){
        this.code=ResponseCode.OK.getCode();
        this.message=ResponseCode.OK.getMsg();
        this.content=content;
    }
    public  ResponseData(ResponseCode responseCode){
        this.code=responseCode.getCode();
        this.message=responseCode.getMsg();
    }
    public ResponseData(int code,String message){
        this.code=code;
        this.message=message;
    }
    public ResponseData(ResponseCode responseCode,String message,T content){
        this.code=responseCode.getCode();
        this.message=message;
        this.content=content;
    }

}
