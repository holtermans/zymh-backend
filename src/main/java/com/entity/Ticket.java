package com.entity;

public class Ticket {
    private String id;
    private String uuid;
    private String ticketType = "";
    private String ticketName = "";
    private String ticketContent = "";
    private String ticketTime = "";
    private String approver = "";
    private String imgUrl = "";
    private int ticketStatus = 0;
    private String userName = "";
    private String userId = "";
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
                ", orderStatus=" + ticketStatus +
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

    public int getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(int ticketStatus) {
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
