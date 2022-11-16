package com.jk.controller;

import com.jk.utils.UploadUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * TODO
 *
 * @Description
 * @Author 杨帅
 * @Date 2022/11/16 17:09
 **/

@RestController
public class UploadController {


    /**
     * 返回图片上传后存储的地址
     *
     * @param multipartFile
     * @return
     */
    @PostMapping("upload/image")
    public String uploadImage(@RequestParam(value = "file") MultipartFile multipartFile) {
        if (multipartFile.isEmpty()) {
            return "文件有误！";
        }
        return UploadUtils.uploadImage(multipartFile);
    }


}