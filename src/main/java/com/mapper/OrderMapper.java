package com.mapper;

import com.entity.Order;
import com.entity.Result;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface OrderMapper {

    @Insert("INSERT INTO `order`(uuid," +
            "orderType," +
            "orderName," +
            "orderContent," +
            "orderTime," +
            "approver," +
            "imgUrl," +
            "orderStatus," +
            "userName," +
            "userId,"+
            "createTime"+
            ") VALUES (REPLACE(UUID(),'-',''),#{orderType}, #{orderName}, #{orderContent}, #{orderTime}, #{approver}, #{imgUrl}, #{orderStatus}, #{userName}, #{userId},#{createTime} );")
    void saveData(Order order);
}
