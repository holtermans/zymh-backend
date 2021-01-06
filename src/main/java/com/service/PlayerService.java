package com.service;

import com.entity.Player;
import com.mapper.PlayerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    PlayerMapper playerMapper;
    public Player getPlayerByName(String player_name){
        return playerMapper.getPlayerByName(player_name);
    };
}
