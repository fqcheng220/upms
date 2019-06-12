package com.fqcheng220.model;

import java.math.BigDecimal;
import java.util.Date;

public class ProductSku {
    private Long id;

    private Long number;

    private String name;

    private String introduce;

    private Byte showInShelve;

    private Date shelvetime;

    private String shelveBy;

    private Date updateTime;

    private String updateBy;

    private Byte showInTop;

    private Byte showInNav;

    private Byte showInHot;

    private Date createTime;

    private String createBy;

    private String picImage;

    private String searchKey;

    private BigDecimal price;

    private Integer stock;

    private Long tbProductSpuId;

    public ProductSku(Long id, Long number, String name, String introduce, Byte showInShelve, Date shelvetime, String shelveBy, Date updateTime, String updateBy, Byte showInTop, Byte showInNav, Byte showInHot, Date createTime, String createBy, String picImage, String searchKey, BigDecimal price, Integer stock, Long tbProductSpuId) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.introduce = introduce;
        this.showInShelve = showInShelve;
        this.shelvetime = shelvetime;
        this.shelveBy = shelveBy;
        this.updateTime = updateTime;
        this.updateBy = updateBy;
        this.showInTop = showInTop;
        this.showInNav = showInNav;
        this.showInHot = showInHot;
        this.createTime = createTime;
        this.createBy = createBy;
        this.picImage = picImage;
        this.searchKey = searchKey;
        this.price = price;
        this.stock = stock;
        this.tbProductSpuId = tbProductSpuId;
    }

    public ProductSku() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Date getShelvetime() {
        return shelvetime;
    }

    public void setShelvetime(Date shelvetime) {
        this.shelvetime = shelvetime;
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

    public String getPicImage() {
        return picImage;
    }

    public void setPicImage(String picImage) {
        this.picImage = picImage == null ? null : picImage.trim();
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey == null ? null : searchKey.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Long getTbProductSpuId() {
        return tbProductSpuId;
    }

    public void setTbProductSpuId(Long tbProductSpuId) {
        this.tbProductSpuId = tbProductSpuId;
    }
}