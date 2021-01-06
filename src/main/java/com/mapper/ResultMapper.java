package com.mapper;

import com.entity.Player;
import com.entity.Result;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ResultMapper {
    @Select("select * from result where userName=#{player_name}")
    Result getResultByName(String player_name);

    @Insert("INSERT INTO result(matchId,userId,userName,startTimeStamp,startTime,endTimeStamp,endTime,sumTime,statusCode) VALUES (1,#{userId},#{userName},#{startTimeStamp},#{startTime},null,null,null,#{statusCode})")
    void saveData(Result result);

    void changeData(Result result);
    @Update("UPDATE result SET endTimeStamp=#{endTimeStamp},endTime=#{endTime},sumTime=#{sumTime},statusCode=#{statusCode} where userName=#{userName}")
    void updateData(Result result);
    @Update("UPDATE result SET statusCode=#{statusCode} where userName=#{userName}")
    void changeStatus(Result result);
}
