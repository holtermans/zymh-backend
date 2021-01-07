package com.service;

import com.entity.Ticket;

import java.util.List;

public interface ITestService {

    int deleteByPrimaryKey(Integer id);

    int insert(Ticket ticket);

    Ticket selectByPrimaryKey(Integer id);

    List<Ticket> selectAll();

    int updateByPrimaryKey(Ticket ticket);
}
