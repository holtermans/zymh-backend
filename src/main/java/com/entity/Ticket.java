package com.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.Serializable;

@Repository
@Table(name = "Ticket")//mybatis通用接口mapper依赖JPA实体类采用JPA
public class Ticket  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "uuid")
    private String uuid;
    @Column(name = "ticketType")
    private String ticketType = "";
    @Column(name = "ticketName")
    private String ticketName = "";
    @Column(name = "ticketContent")
    private String ticketContent = "";
    @Column(name = "ticketTime")
    private String ticketTime = "";
    @Column(name = "approver")
    private String approver = "";
    @Column(name = "imgUrl")
    private String imgUrl = "";
    @Column(name = "ticketStatus")
    private Integer ticketStatus = 0;
    @Column(name = "userName")
    private String userName = "";
    @Column(name = "userId")
    private String userId = "";
    @Column(name = "createTime")
    private String createTime="";

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", uuid='" + uuid + '\'' +
                ", ticketType='" + ticketType + '\'' +
                ", ticketName='" + ticketName + '\'' +
                ", ticketContent='" + ticketContent + '\'' +
                ", ticketTime='" + ticketTime + '\'' +
                ", approver='" + approver + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", ticketStatus=" + ticketStatus +
                ", userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getTicketContent() {
        return ticketContent;
    }

    public void setTicketContent(String ticketContent) {
        this.ticketContent = ticketContent;
    }

    public String getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(String ticketTime) {
        this.ticketTime = ticketTime;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(Integer ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
