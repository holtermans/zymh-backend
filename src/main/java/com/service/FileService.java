package com.service;

import com.entity.ApiInfo;
import com.entity.WaterMark;
import com.util.ApiInfoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class FileService {
    @Autowired
    ApiInfoHelper apiInfoHelper;

    @Autowired
    ImageWaterMarkService imageWaterMarkService;
    public ApiInfo<?> uploadImage(MultipartFile file, WaterMark waterMark){
        if (file.isEmpty()) {
            System.out.println("文件为空");
            return apiInfoHelper.fail("文件为空");
        }

        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        String filePath = "D://upload-image//"; // 上传后的路径
        fileName = UUID.randomUUID() + suffixName; // 新文件名
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String filename = "/upload-image/" + fileName;
        imageWaterMarkService.watermarkAdd(dest,fileName,"upload-image/","D://upload-image//",waterMark);
        String WMFilename = "/upload-image/" +"watermark_" +  fileName;
        return apiInfoHelper.success("上传成功",WMFilename);
    }

}
