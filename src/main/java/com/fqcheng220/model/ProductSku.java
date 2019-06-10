package com.fqcheng220.model;

import java.math.BigDecimal;
import java.util.Date;

public class ProductSku {
    private Long skuid;

    private Long skunumber;

    private String skuname;

    private String introduce;

    private Byte showinshelve;

    private Date shelvetime;

    private String shelveby;

    private Date updatetime;

    private String updateby;

    private Byte showintop;

    private Byte showiinnav;

    private Byte showinhot;

    private Date createtime;

    private String createby;

    private String picimage;

    private String searchkey;

    private BigDecimal price;

    private Integer sotck;

    private Long tbProductSpuSpuid;

    public ProductSku(Long skuid, Long skunumber, String skuname, String introduce, Byte showinshelve, Date shelvetime, String shelveby, Date updatetime, String updateby, Byte showintop, Byte showiinnav, Byte showinhot, Date createtime, String createby, String picimage, String searchkey, BigDecimal price, Integer sotck, Long tbProductSpuSpuid) {
        this.skuid = skuid;
        this.skunumber = skunumber;
        this.skuname = skuname;
        this.introduce = introduce;
        this.showinshelve = showinshelve;
        this.shelvetime = shelvetime;
        this.shelveby = shelveby;
        this.updatetime = updatetime;
        this.updateby = updateby;
        this.showintop = showintop;
        this.showiinnav = showiinnav;
        this.showinhot = showinhot;
        this.createtime = createtime;
        this.createby = createby;
        this.picimage = picimage;
        this.searchkey = searchkey;
        this.price = price;
        this.sotck = sotck;
        this.tbProductSpuSpuid = tbProductSpuSpuid;
    }

    public ProductSku() {
        super();
    }

    public Long getSkuid() {
        return skuid;
    }

    public void setSkuid(Long skuid) {
        this.skuid = skuid;
    }

    public Long getSkunumber() {
        return skunumber;
    }

    public void setSkunumber(Long skunumber) {
        this.skunumber = skunumber;
    }

    public String getSkuname() {
        return skuname;
    }

    public void setSkuname(String skuname) {
        this.skuname = skuname == null ? null : skuname.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Byte getShowinshelve() {
        return showinshelve;
    }

    public void setShowinshelve(Byte showinshelve) {
        this.showinshelve = showinshelve;
    }

    public Date getShelvetime() {
        return shelvetime;
    }

    public void setShelvetime(Date shelvetime) {
        this.shelvetime = shelvetime;
    }

    public String getShelveby() {
        return shelveby;
    }

    public void setShelveby(String shelveby) {
        this.shelveby = shelveby == null ? null : shelveby.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public Byte getShowintop() {
        return showintop;
    }

    public void setShowintop(Byte showintop) {
        this.showintop = showintop;
    }

    public Byte getShowiinnav() {
        return showiinnav;
    }

    public void setShowiinnav(Byte showiinnav) {
        this.showiinnav = showiinnav;
    }

    public Byte getShowinhot() {
        return showinhot;
    }

    public void setShowinhot(Byte showinhot) {
        this.showinhot = showinhot;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public String getPicimage() {
        return picimage;
    }

    public void setPicimage(String picimage) {
        this.picimage = picimage == null ? null : picimage.trim();
    }

    public String getSearchkey() {
        return searchkey;
    }

    public void setSearchkey(String searchkey) {
        this.searchkey = searchkey == null ? null : searchkey.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSotck() {
        return sotck;
    }

    public void setSotck(Integer sotck) {
        this.sotck = sotck;
    }

    public Long getTbProductSpuSpuid() {
        return tbProductSpuSpuid;
    }

    public void setTbProductSpuSpuid(Long tbProductSpuSpuid) {
        this.tbProductSpuSpuid = tbProductSpuSpuid;
    }
}