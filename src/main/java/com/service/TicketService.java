package com.service;

import com.entity.ApiInfo;
import com.entity.Ticket;
import com.mapper.TicketMapper;
import com.util.ApiInfoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    @Autowired
    TicketMapper ticketMapper;

    @Autowired
    ApiInfoHelper apiInfoHelper;
    public ApiInfo<?> saveData(Ticket ticket){
        ApiInfo<?> apiInfo = null;
        try {
            ticketMapper.saveData(ticket);
            apiInfo = apiInfoHelper.success("插入成功");
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            return  apiInfo;
        }
    }


    public Ticket queryOrderByApprover(String userId, int orderStatus) {
        Ticket ticket = ticketMapper.queryOrderByApprover(userId,orderStatus);
        return ticket;
    }
}
