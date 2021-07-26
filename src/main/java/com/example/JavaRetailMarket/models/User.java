package com.example.JavaRetailMarket.models;

import java.time.LocalDate;
import java.util.Date;

public class User {
    private String name;
    private String phone;
    private String email;
    private Date birthday;
    private int userType;

    public User() {
    }

    public User(String name, String phone, String email, Date birthday, int userType) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                ", userType=" + userType +
                '}';
    }
}
