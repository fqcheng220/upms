package com.fqcheng220.model;

public class ProductAttr {
    private Integer attrid;

    private String attrname;

    private Long tbProductCategoryCategoryid;

    public ProductAttr(Integer attrid, String attrname, Long tbProductCategoryCategoryid) {
        this.attrid = attrid;
        this.attrname = attrname;
        this.tbProductCategoryCategoryid = tbProductCategoryCategoryid;
    }

    public ProductAttr() {
        super();
    }

    public Integer getAttrid() {
        return attrid;
    }

    public void setAttrid(Integer attrid) {
        this.attrid = attrid;
    }

    public String getAttrname() {
        return attrname;
    }

    public void setAttrname(String attrname) {
        this.attrname = attrname == null ? null : attrname.trim();
    }

    public Long getTbProductCategoryCategoryid() {
        return tbProductCategoryCategoryid;
    }

    public void setTbProductCategoryCategoryid(Long tbProductCategoryCategoryid) {
        this.tbProductCategoryCategoryid = tbProductCategoryCategoryid;
    }
}