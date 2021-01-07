package com.mapper;

import com.entity.Ticket;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface TicketMapper {

    @Insert("INSERT INTO `ticket`(uuid," +
            "ticketType," +
            "ticketName," +
            "ticketContent," +
            "ticketTime," +
            "approver," +
            "imgUrl," +
            "ticketStatus," +
            "userName," +
            "userId,"+
            "createTime"+
            ") VALUES (REPLACE(UUID(),'-',''),#{ticketType}, #{ticketName}, #{ticketContent}, #{ticketTime}, #{approver}, #{imgUrl}, #{ticketStatus}, #{userName}, #{userId},#{createTime} );")
    void saveData(Ticket ticket);

    @Select("select  from result where userName=#{player_name}")
    Ticket queryOrderByApprover(String userId, int orderStatus);
}
