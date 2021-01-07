package com.service.impl;

import com.entity.Ticket;
import com.mapper.ITestMapper;
import com.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestServiceImpl  implements ITestService {
    @Autowired
    private ITestMapper testMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Ticket ticket) {
        return 0;
    }

    @Override
    public Ticket selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<Ticket> selectAll() {

        return testMapper.selectAll();

    }

    @Override
    public int updateByPrimaryKey(Ticket ticket) {
        return 0;
    }
}
