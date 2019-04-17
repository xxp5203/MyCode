package com.xxp.data.base;

import java.io.Serializable;

public class RequestData<T> implements Serializable {

    private String reqId;
    private String txCode;
    private T content;

    public  RequestData(){
    }
    public RequestData(String txCode,T content){
        this.txCode=txCode;
        this.content=content;
    }
    public RequestData(T content){
        this.content=content;
    }

}
