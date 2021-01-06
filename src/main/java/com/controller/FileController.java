package com.controller;

import com.entity.ApiInfo;
import com.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
       return fileService.uploadImage(file);
    }
}
