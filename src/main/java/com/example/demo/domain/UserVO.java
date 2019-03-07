package com.example.demo.domain;

import javax.persistence.Entity;

/**
 * Created by ccq on 2019/2/21.
 */
@Entity
public class UserVO {

    private Long id;
    private String userName;
    private String passWord;
    private String nickName;

    public UserVO(){}
    public UserVO(String userName, String passWord) {
        this.passWord = passWord;
        this.userName = userName;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
