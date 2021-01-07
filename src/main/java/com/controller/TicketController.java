package com.controller;

import com.entity.*;
import com.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;


    @RequestMapping(value = "/saveTicket")
    @ResponseBody
    public ApiInfo saveOrder(Ticket ticket){
        ApiInfo<?> apiInfo = ticketService.saveData(ticket);
        return apiInfo;
    }
    //按审批人查找工单
    @RequestMapping(value = "/queryOrderByApprover")
    @ResponseBody
    public Ticket queryOrderByApprover(DdUser ddUser){
        String userId = ddUser.getUserId();
        String userName = ddUser.getUserName();
        String is_sys = ddUser.getIs_sys();
        int orderStatus = 0;
        Ticket ticket = ticketService.queryOrderByApprover(userId,0);
        return ticket;
    }
}
