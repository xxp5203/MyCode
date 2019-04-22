package com.xxp.data.base;

import lombok.Data;
import java.io.Serializable;

@Data
public class RequestData<T> implements Serializable {

    //private String reqId;
    private String fileType;
    private T content;

    public  RequestData(){
    }
    public RequestData(String txCode,T content){
        this.fileType =txCode;
        this.content=content;
    }
    public RequestData(T content){
        this.content=content;
    }

}
