package com.controller;

import com.entity.Player;
import com.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private PlayerService playerService;
    @RequestMapping(value = "/getPlayer")
    @ResponseBody
    public Player getPlayerByName(@RequestParam(value = "userName") String player_name){
        System.out.println(player_name);
        Player playerByName = playerService.getPlayerByName(player_name);
        System.out.println(playerByName);
        return playerByName;
    }
}
