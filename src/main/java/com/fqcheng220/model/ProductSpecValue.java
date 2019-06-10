package com.fqcheng220.model;

public class ProductSpecValue {
    private Integer specvalueid;

    private String specvalue;

    private Integer tbProductSpecSpecid;

    public ProductSpecValue(Integer specvalueid, String specvalue, Integer tbProductSpecSpecid) {
        this.specvalueid = specvalueid;
        this.specvalue = specvalue;
        this.tbProductSpecSpecid = tbProductSpecSpecid;
    }

    public ProductSpecValue() {
        super();
    }

    public Integer getSpecvalueid() {
        return specvalueid;
    }

    public void setSpecvalueid(Integer specvalueid) {
        this.specvalueid = specvalueid;
    }

    public String getSpecvalue() {
        return specvalue;
    }

    public void setSpecvalue(String specvalue) {
        this.specvalue = specvalue == null ? null : specvalue.trim();
    }

    public Integer getTbProductSpecSpecid() {
        return tbProductSpecSpecid;
    }

    public void setTbProductSpecSpecid(Integer tbProductSpecSpecid) {
        this.tbProductSpecSpecid = tbProductSpecSpecid;
    }
}