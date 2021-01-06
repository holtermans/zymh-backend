package com.service;

import com.entity.Player;
import com.entity.Result;
import com.mapper.PlayerMapper;
import com.mapper.ResultMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService {
    @Autowired
    ResultMapper resultMapper;

    public Result getResultByName(String player_name){
        return resultMapper.getResultByName(player_name);
    };

    public void saveData(Result result){
         resultMapper.saveData(result);
    };

    public void updateData(Result result){
        resultMapper.updateData(result);
    }

    public void changeStatus(Result result){
        resultMapper.changeStatus(result);
    }
}
