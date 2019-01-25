package com.fqcheng220.model;

public class UpmsUser {
    private Integer userid;

    private String username;

    private String pwd;

    private String realname;

    private String phone;

    private Long createtime;

    public UpmsUser(Integer userid, String username, String pwd, String realname, String phone, Long createtime) {
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

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }
}