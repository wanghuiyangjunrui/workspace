package com.itgaohsu.bean;

/**
 * @author 曹小花
 * @Title: User
 * @Description: SpringCloudAlibaba课程
 * @date 2020/4/10 0010 14:06
 */
public class User {
    private int id;

    private String loginname="huihui  ";

    private String  password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginname='" + loginname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
