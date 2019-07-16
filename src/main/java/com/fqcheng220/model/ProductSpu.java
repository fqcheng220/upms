package com.fqcheng220.model;

import java.util.Date;

public class ProductSpu {
    private Long id;

    private String number;

    private String spuname;

    private String introduce;

    private Byte showInShelve;

    private Date shelveTime;

    private String shelveBy;

    private Date updateTime;

    private String updateBy;

    private Byte showInTop;

    private Byte showInNav;

    private Byte showInHot;

    private Date createTime;

    private String createBy;

    private String videoIntroduce;

    private String searchKey;

    private Long tbProductCategoryId;

    private Integer tbProductBrandId;

    public ProductSpu(Long id, String number, String spuname, String introduce, Byte showInShelve, Date shelveTime, String shelveBy, Date updateTime, String updateBy, Byte showInTop, Byte showInNav, Byte showInHot, Date createTime, String createBy, String videoIntroduce, String searchKey, Long tbProductCategoryId, Integer tbProductBrandId) {
        this.id = id;
        this.number = number;
        this.spuname = spuname;
        this.introduce = introduce;
        this.showInShelve = showInShelve;
        this.shelveTime = shelveTime;
        this.shelveBy = shelveBy;
        this.updateTime = updateTime;
        this.updateBy = updateBy;
        this.showInTop = showInTop;
        this.showInNav = showInNav;
        this.showInHot = showInHot;
        this.createTime = createTime;
        this.createBy = createBy;
        this.videoIntroduce = videoIntroduce;
        this.searchKey = searchKey;
        this.tbProductCategoryId = tbProductCategoryId;
        this.tbProductBrandId = tbProductBrandId;
    }

    public ProductSpu() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getSpuname() {
        return spuname;
    }

    public void setSpuname(String spuname) {
        this.spuname = spuname == null ? null : spuname.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Byte getShowInShelve() {
        return showInShelve;
    }

    public void setShowInShelve(Byte showInShelve) {
        this.showInShelve = showInShelve;
    }

    public Date getShelveTime() {
        return shelveTime;
    }

    public void setShelveTime(Date shelveTime) {
        this.shelveTime = shelveTime;
    }

    public String getShelveBy() {
        return shelveBy;
    }

    public void setShelveBy(String shelveBy) {
        this.shelveBy = shelveBy == null ? null : shelveBy.trim();
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

    public Byte getShowInTop() {
        return showInTop;
    }

    public void setShowInTop(Byte showInTop) {
        this.showInTop = showInTop;
    }

    public Byte getShowInNav() {
        return showInNav;
    }

    public void setShowInNav(Byte showInNav) {
        this.showInNav = showInNav;
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

    public String getVideoIntroduce() {
        return videoIntroduce;
    }

    public void setVideoIntroduce(String videoIntroduce) {
        this.videoIntroduce = videoIntroduce == null ? null : videoIntroduce.trim();
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey == null ? null : searchKey.trim();
    }

    public Long getTbProductCategoryId() {
        return tbProductCategoryId;
    }

    public void setTbProductCategoryId(Long tbProductCategoryId) {
        this.tbProductCategoryId = tbProductCategoryId;
    }

    public Integer getTbProductBrandId() {
        return tbProductBrandId;
    }

    public void setTbProductBrandId(Integer tbProductBrandId) {
        this.tbProductBrandId = tbProductBrandId;
    }
}