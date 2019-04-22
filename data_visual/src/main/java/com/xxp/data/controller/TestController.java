package com.xxp.data.controller;

import com.xxp.data.base.ResponseData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value="/test")
public class TestController {

    @RequestMapping(value="db",method = RequestMethod.GET)
    public ResponseData testDb(){
        ResponseData responseData=new ResponseData();
        return  responseData;

    }
}
