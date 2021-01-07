package com.controller;

import com.entity.ApiInfo;
import com.entity.WaterMark;
import com.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class FileController {

    @Autowired
    FileService fileService;
    @GetMapping(value = "/file")
    public String file() {
        return "file";
    }


    @PostMapping(value = "/fileUpload")
    public ApiInfo<?> fileUpload(@RequestParam(value = "file") MultipartFile file, Model model, HttpServletRequest request) {
        WaterMark waterMark = new WaterMark();
        waterMark.setUserName(request.getParameter("userName"));
        waterMark.setTime(request.getParameter("time"));

        return fileService.uploadImage(file,waterMark);

    }
}
