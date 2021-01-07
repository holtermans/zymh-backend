package com.controller;

import com.entity.Ticket;
import com.service.ITestService;
import com.service.TicketService;
import com.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private ITestService testService;
    @PostMapping(value = "/ticket/selectAll")
    public List<Ticket> selectAll() {
        List<Ticket> managerList = testService.selectAll();
        return managerList;
    }
}
