package com.fqcheng220.model;

public class UpmsRole {
    private Integer roleid;

    private String name;

    private String createtime;

    private String description;

    public UpmsRole(Integer roleid, String name, String createtime, String description) {
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

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}