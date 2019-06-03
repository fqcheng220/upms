package com.fqcheng220.model;

import java.util.Date;

public class UpmsRole {
    private Integer roleid;

    private String rolename;

    private Date createtime;

    private String description;

    public UpmsRole(Integer roleid, String rolename, Date createtime, String description) {
        this.roleid = roleid;
        this.rolename = rolename;
        this.createtime = createtime;
        this.description = description;
    }

    public UpmsRole() {
        super();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}