package com.util;

import com.entity.ApiInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class ApiInfoHelper {

    public ApiInfo<?> success(String message){
        ApiInfo<Object> apiInfo = new ApiInfo<>();
        apiInfo.setMessage(message);
        apiInfo.setSuccess(true);
        return apiInfo;
    }
    public ApiInfo<?> success(String message, List data ){
        ApiInfo<Object> apiInfo = new ApiInfo<>();
        apiInfo.setMessage(message);
        apiInfo.setSuccess(true);
        apiInfo.setData(data);
        return apiInfo;
    }

    public ApiInfo<?> success(String message, String data ){
        ApiInfo<Object> apiInfo = new ApiInfo<>();
        apiInfo.setMessage(message);
        apiInfo.setSuccess(true);
        apiInfo.setData(data);
        return apiInfo;
    }
    public ApiInfo<?> fail(String message){
        ApiInfo<Object> apiInfo = new ApiInfo<>();
        apiInfo.setMessage(message);
        apiInfo.setSuccess(false);
        return apiInfo;
    }
}
