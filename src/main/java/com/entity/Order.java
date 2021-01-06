package com.entity;

public class Order {
    private String id;
    private String uuid;
    private String orderType = "";
    private String orderName = "";
    private String orderContent = "";
    private String orderTime = "";
    private String approver = "";
    private String imgUrl = "";
    private int orderStatus = 0;
    private String userName = "";
    private String userId = "";
    private String createTime="";


    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
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

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
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

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", uuid='" + uuid + '\'' +
                ", orderType='" + orderType + '\'' +
                ", orderName='" + orderName + '\'' +
                ", orderContent='" + orderContent + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", approver='" + approver + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", orderStatus=" + orderStatus +
                ", userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
