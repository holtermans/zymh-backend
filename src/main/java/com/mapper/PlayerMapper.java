package com.mapper;

import com.entity.Player;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PlayerMapper {
    @Select("select * from v_player where name=#{player_name}")
    Player getPlayerByName(String player_name);
}
