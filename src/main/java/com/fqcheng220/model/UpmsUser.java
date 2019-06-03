package com.fqcheng220.model;

import java.util.Date;

public class UpmsUser {
    private Integer userid;

    private String username;

    private String pwd;

    private String realname;

    private String phone;

    private Date createtime;

    public UpmsUser(Integer userid, String username, String pwd, String realname, String phone, Date createtime) {
        this.userid = userid;
        this.username = username;
        this.pwd = pwd;
        this.realname = realname;
        this.phone = phone;
        this.createtime = createtime;
    }

    public UpmsUser() {
        super();
    }

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
        this.username = username == null ? null : username.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}