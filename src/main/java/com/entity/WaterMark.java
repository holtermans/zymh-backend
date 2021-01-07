package com.entity;

public class WaterMark {
    private String userName;
    private String time;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "WaterMark{" +
                "userName='" + userName + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
