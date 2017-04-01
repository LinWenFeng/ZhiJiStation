package com.team.domain.entity;

import javax.persistence.Entity;

/**
 * Created by LWF on 2017/3/26.
 */
@Entity
public class User extends BaseEntity{
    private String username;
    private String password;
    private String introduction;
    private String imgpath;
    private String job;
    private String  email;
    private String addUser;
    private String addTime;
    private String updateUser;
    private String pdateTime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddUser() {
        return addUser;
    }

    public void setAddUser(String addUser) {
        this.addUser = addUser;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getPdateTime() {
        return pdateTime;
    }

    public void setPdateTime(String pdateTime) {
        this.pdateTime = pdateTime;
    }
}
