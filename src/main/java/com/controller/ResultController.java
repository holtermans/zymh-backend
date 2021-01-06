package com.controller;

import com.entity.Player;
import com.entity.Result;
import com.service.PlayerService;
import com.service.ResultService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {

    @Autowired
    private ResultService resultService;

    @RequestMapping(value = "/getResult")
    @ResponseBody
    public Result getPlayerByName(@RequestParam(value = "userName") String player_name) {
        System.out.println(player_name);
        Result result = resultService.getResultByName(player_name);
        System.out.println(result);
        return result;
    }

    @RequestMapping(value = "/saveData")
    public Result saveData(@RequestParam(value = "userId") String userId, @RequestParam(value = "userName") String userName, @RequestParam(value = "startTime") String startTime, @RequestParam(value = "startTimeStamp") long startTimeStamp, @RequestParam(value = "statusCode") int statusCode) {
        System.out.println("保存开始数据");
        Result result = new Result();
        if (userId != null & userName != null & startTime != null & startTimeStamp != 0 & statusCode != 0) {
            result.setUserId(userId);
            result.setUserName(userName);
            result.setStartTime(startTime);
            result.setStartTimeStamp(startTimeStamp);
            result.setStatusCode(statusCode);
            resultService.saveData(result);
        }
        return result;
    }

    @RequestMapping(value = "/updateData")
    public Result updateData(@RequestParam(value = "userId") String userId, @RequestParam(value = "userName") String userName, @RequestParam(value = "endTime") String endTime, @RequestParam(value = "endTimeStamp") long endTimeStamp, @RequestParam(value = "sumTime") long sumTime, @RequestParam(value = "statusCode") int statusCode) {
        Result result = new Result();
        if (userId != null & userName != null & endTime != null & endTimeStamp != 0 & sumTime != 0 & statusCode != 0) {

            result.setUserId(userId);
            result.setUserName(userName);
            result.setEndTime(endTime);
            result.setEndTimeStamp(endTimeStamp);
            result.setSumTime(sumTime);
            result.setStatusCode(statusCode);
            resultService.updateData(result);
        }
        System.out.println("更新数据" + result);
        return result;
    }

    @RequestMapping(value = "/changeStatus")
    public Result changeStatus(@RequestParam(value = "userName") String userName, @RequestParam(value = "statusCode") int statusCode) {
        Result result = new Result();
        if (userName != null & statusCode != 0) {
            result.setUserName(userName);
            result.setStatusCode(statusCode);
            resultService.changeStatus(result);
        }
        return result;
    }

}
