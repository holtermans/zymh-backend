package com.controller;

import com.entity.ApiInfo;
import com.entity.Order;
import com.entity.Player;
import com.service.OrderService;
import com.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

        @RequestMapping(value = "/saveOrder")
    @ResponseBody
    public ApiInfo saveOrder(Order order){
        System.out.println(order.getOrderType());
        System.out.println(order.getOrderContent());
        ApiInfo<?> apiInfo = orderService.saveData(order);
        return apiInfo;
    }
}
