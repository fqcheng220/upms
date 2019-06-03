package com.fqcheng220.model;

public class UpmsRolePermission {
    private Integer id;

    private Integer roleid;

    private Integer permissionid;

    public UpmsRolePermission(Integer id, Integer roleid, Integer permissionid) {
        this.id = id;
        this.roleid = roleid;
        this.permissionid = permissionid;
    }

    public UpmsRolePermission() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }
}