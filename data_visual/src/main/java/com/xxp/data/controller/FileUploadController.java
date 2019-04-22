package com.xxp.data.controller;

import com.xxp.data.base.RequestData;
import com.xxp.data.base.ResponseCode;
import com.xxp.data.base.ResponseData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 文件上传接口
 */
@RequestMapping("/upload")
public class FileUploadController {

    @RequestMapping(value="/first",method = RequestMethod.GET)
    public ResponseData fileUpload(RequestData requestData){
            //输入sout，按enter键快速生成输出语句
            System.out.println("文件上传");
            ResponseData<MultipartFile> responseData=new ResponseData<MultipartFile>();
            MultipartFile file =(MultipartFile)requestData.getContent();
            if(file.isEmpty()){
                responseData.setMessage("请上传文件");
                return responseData;
            }
        try {
            //得到file，并将它存到指定位置
            //byte[] bytes=file.getBytes();
            //Path path= Paths.get(file.getOriginalFilename());
            //Files.write(path,bytes);
            String fileName=file.getOriginalFilename();
            String filePath="E:/upload";
            File file1=new File(filePath+fileName);
            file.transferTo(file1);
            responseData.setMessage(ResponseCode.OK.getMsg());
            return  responseData;
        } catch (IOException e) {
            responseData.setMessage(ResponseCode.ERROR.getMsg());
            e.printStackTrace();
            return  responseData;
        }
    }
}
