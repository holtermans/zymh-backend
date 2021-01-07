package com.entity;

public class DdUser {
    private String id;
    private String userName;
    private String userId;
    private String is_sys;//是否为管理员

    @Override
    public String toString() {
        return "DdUser{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", is_sys='" + is_sys + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getIs_sys() {
        return is_sys;
    }

    public void setIs_sys(String is_sys) {
        this.is_sys = is_sys;
    }
}
