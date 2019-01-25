package com.fqcheng220.dto;

import com.fqcheng220.model.UpmsUser;

public class UpmsUserDto {
    private Integer userid;

    private String username;

    private String pwd;

    private String realname;

    private String phone;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getmToken() {
        return mToken;
    }

    public void setmToken(String mToken) {
        this.mToken = mToken;
    }

    private String createtime;

    private String mToken;

    public UpmsUserDto clone(UpmsUser upmsUser){
        if(upmsUser != null){
            this.userid = upmsUser.getUserid();
            this.username = upmsUser.getUsername();
            this.pwd = upmsUser.getPwd();
            this.realname = upmsUser.getRealname();
            this.phone = upmsUser.getPhone();
        }
        return this;
    }
}
