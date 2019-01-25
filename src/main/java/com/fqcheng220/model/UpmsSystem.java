package com.fqcheng220.model;

public class UpmsSystem {
    private Integer systemid;

    private String name;

    private String description;

    private Byte status;

    private Long createtime;

    public UpmsSystem(Integer systemid, String name, String description, Byte status, Long createtime) {
        this.systemid = systemid;
        this.name = name;
        this.description = description;
        this.status = status;
        this.createtime = createtime;
    }

    public UpmsSystem() {
        super();
    }

    public Integer getSystemid() {
        return systemid;
    }

    public void setSystemid(Integer systemid) {
        this.systemid = systemid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }
}