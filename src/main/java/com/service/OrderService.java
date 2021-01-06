package com.service;

import com.entity.ApiInfo;
import com.entity.Order;
import com.mapper.OrderMapper;
import com.util.ApiInfoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Autowired
    ApiInfoHelper apiInfoHelper;
    public ApiInfo<?> saveData(Order order){
        ApiInfo<?> apiInfo = null;
        try {
            orderMapper.saveData(order);
            apiInfo = apiInfoHelper.success("插入成功");
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            return  apiInfo;
        }
    }
}
