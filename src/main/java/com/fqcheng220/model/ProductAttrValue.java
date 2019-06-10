package com.fqcheng220.model;

public class ProductAttrValue {
    private Integer attrvalueid;

    private String attrvalue;

    private Integer tbProductAttrAttrid;

    public ProductAttrValue(Integer attrvalueid, String attrvalue, Integer tbProductAttrAttrid) {
        this.attrvalueid = attrvalueid;
        this.attrvalue = attrvalue;
        this.tbProductAttrAttrid = tbProductAttrAttrid;
    }

    public ProductAttrValue() {
        super();
    }

    public Integer getAttrvalueid() {
        return attrvalueid;
    }

    public void setAttrvalueid(Integer attrvalueid) {
        this.attrvalueid = attrvalueid;
    }

    public String getAttrvalue() {
        return attrvalue;
    }

    public void setAttrvalue(String attrvalue) {
        this.attrvalue = attrvalue == null ? null : attrvalue.trim();
    }

    public Integer getTbProductAttrAttrid() {
        return tbProductAttrAttrid;
    }

    public void setTbProductAttrAttrid(Integer tbProductAttrAttrid) {
        this.tbProductAttrAttrid = tbProductAttrAttrid;
    }
}