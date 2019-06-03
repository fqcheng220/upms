package com.fqcheng220.model;

import java.util.Date;

public class UpmsRole {
    private Integer roleid;

    private String name;

    private Date createtime;

    private String description;

    public UpmsRole(Integer roleid, String name, Date createtime, String description) {
        this.roleid = roleid;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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