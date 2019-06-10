package com.fqcheng220.model;

public class ProductSpec {
    private Integer specid;

    private String specname;

    private Long tbProductCategoryCategoryid;

    public ProductSpec(Integer specid, String specname, Long tbProductCategoryCategoryid) {
        this.specid = specid;
        this.specname = specname;
        this.tbProductCategoryCategoryid = tbProductCategoryCategoryid;
    }

    public ProductSpec() {
        super();
    }

    public Integer getSpecid() {
        return specid;
    }

    public void setSpecid(Integer specid) {
        this.specid = specid;
    }

    public String getSpecname() {
        return specname;
    }

    public void setSpecname(String specname) {
        this.specname = specname == null ? null : specname.trim();
    }

    public Long getTbProductCategoryCategoryid() {
        return tbProductCategoryCategoryid;
    }

    public void setTbProductCategoryCategoryid(Long tbProductCategoryCategoryid) {
        this.tbProductCategoryCategoryid = tbProductCategoryCategoryid;
    }
}