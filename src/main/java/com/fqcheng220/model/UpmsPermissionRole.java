package com.fqcheng220.model;

public class UpmsPermissionRole {
    private Integer id;

    private Integer permissionid;

    private Integer roleid;

    public UpmsPermissionRole(Integer id, Integer permissionid, Integer roleid) {
        this.id = id;
        this.permissionid = permissionid;
        this.roleid = roleid;
    }

    public UpmsPermissionRole() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}