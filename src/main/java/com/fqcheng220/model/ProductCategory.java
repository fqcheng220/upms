package com.fqcheng220.model;

import java.util.Date;

public class ProductCategory {
    private Long id;

    private Long parentId;

    private String name;

    private Integer sort;

    private Byte status;

    private Byte type;

    private Byte showInNav;

    private Byte showInTop;

    private Byte showInHot;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    private String pageTitle;

    private String pageDescription;

    private String pageKeywords;

    private String remark;

    public ProductCategory(Long id, Long parentId, String name, Integer sort, Byte status, Byte type, Byte showInNav, Byte showInTop, Byte showInHot, Date createTime, String createBy, Date updateTime, String updateBy, String pageTitle, String pageDescription, String pageKeywords, String remark) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.sort = sort;
        this.status = status;
        this.type = type;
        this.showInNav = showInNav;
        this.showInTop = showInTop;
        this.showInHot = showInHot;
        this.createTime = createTime;
        this.createBy = createBy;
        this.updateTime = updateTime;
        this.updateBy = updateBy;
        this.pageTitle = pageTitle;
        this.pageDescription = pageDescription;
        this.pageKeywords = pageKeywords;
        this.remark = remark;
    }

    public ProductCategory() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getShowInNav() {
        return showInNav;
    }

    public void setShowInNav(Byte showInNav) {
        this.showInNav = showInNav;
    }

    public Byte getShowInTop() {
        return showInTop;
    }

    public void setShowInTop(Byte showInTop) {
        this.showInTop = showInTop;
    }

    public Byte getShowInHot() {
        return showInHot;
    }

    public void setShowInHot(Byte showInHot) {
        this.showInHot = showInHot;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle == null ? null : pageTitle.trim();
    }

    public String getPageDescription() {
        return pageDescription;
    }

    public void setPageDescription(String pageDescription) {
        this.pageDescription = pageDescription == null ? null : pageDescription.trim();
    }

    public String getPageKeywords() {
        return pageKeywords;
    }

    public void setPageKeywords(String pageKeywords) {
        this.pageKeywords = pageKeywords == null ? null : pageKeywords.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}