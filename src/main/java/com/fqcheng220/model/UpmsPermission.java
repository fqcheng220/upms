package com.fqcheng220.model;

import java.util.Date;

public class UpmsPermission {
    private Integer permissionid;

    private String permissionvalue;

    private String name;

    private Date createtime;

    private Byte type;

    private Byte status;

    private Integer upmsSystemSystemid;

    public UpmsPermission(Integer permissionid, String permissionvalue, String name, Date createtime, Byte type, Byte status, Integer upmsSystemSystemid) {
        this.permissionid = permissionid;
        this.permissionvalue = permissionvalue;
        this.name = name;
        this.createtime = createtime;
        this.type = type;
        this.status = status;
        this.upmsSystemSystemid = upmsSystemSystemid;
    }

    public UpmsPermission() {
        super();
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public String getPermissionvalue() {
        return permissionvalue;
    }

    public void setPermissionvalue(String permissionvalue) {
        this.permissionvalue = permissionvalue == null ? null : permissionvalue.trim();
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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getUpmsSystemSystemid() {
        return upmsSystemSystemid;
    }

    public void setUpmsSystemSystemid(Integer upmsSystemSystemid) {
        this.upmsSystemSystemid = upmsSystemSystemid;
    }
}