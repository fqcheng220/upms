package com.fqcheng220.model;

import java.util.Date;

public class ProductSpu {
    private Long spuid;

    private Long spunumber;

    private String spuname;

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

    private String videointroduce;

    private String searchkey;

    private Long tbProductCategoryCategoryid;

    private Integer tbProductBrandBrandid;

    public ProductSpu(Long spuid, Long spunumber, String spuname, String introduce, Byte showinshelve, Date shelvetime, String shelveby, Date updatetime, String updateby, Byte showintop, Byte showiinnav, Byte showinhot, Date createtime, String createby, String videointroduce, String searchkey, Long tbProductCategoryCategoryid, Integer tbProductBrandBrandid) {
        this.spuid = spuid;
        this.spunumber = spunumber;
        this.spuname = spuname;
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
        this.videointroduce = videointroduce;
        this.searchkey = searchkey;
        this.tbProductCategoryCategoryid = tbProductCategoryCategoryid;
        this.tbProductBrandBrandid = tbProductBrandBrandid;
    }

    public ProductSpu() {
        super();
    }

    public Long getSpuid() {
        return spuid;
    }

    public void setSpuid(Long spuid) {
        this.spuid = spuid;
    }

    public Long getSpunumber() {
        return spunumber;
    }

    public void setSpunumber(Long spunumber) {
        this.spunumber = spunumber;
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

    public String getVideointroduce() {
        return videointroduce;
    }

    public void setVideointroduce(String videointroduce) {
        this.videointroduce = videointroduce == null ? null : videointroduce.trim();
    }

    public String getSearchkey() {
        return searchkey;
    }

    public void setSearchkey(String searchkey) {
        this.searchkey = searchkey == null ? null : searchkey.trim();
    }

    public Long getTbProductCategoryCategoryid() {
        return tbProductCategoryCategoryid;
    }

    public void setTbProductCategoryCategoryid(Long tbProductCategoryCategoryid) {
        this.tbProductCategoryCategoryid = tbProductCategoryCategoryid;
    }

    public Integer getTbProductBrandBrandid() {
        return tbProductBrandBrandid;
    }

    public void setTbProductBrandBrandid(Integer tbProductBrandBrandid) {
        this.tbProductBrandBrandid = tbProductBrandBrandid;
    }
}