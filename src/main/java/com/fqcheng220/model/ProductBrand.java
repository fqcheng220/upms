package com.fqcheng220.model;

public class ProductBrand {
    private Integer brandid;

    private String brandname;

    private String branddescrption;

    public ProductBrand(Integer brandid, String brandname, String branddescrption) {
        this.brandid = brandid;
        this.brandname = brandname;
        this.branddescrption = branddescrption;
    }

    public ProductBrand() {
        super();
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public String getBranddescrption() {
        return branddescrption;
    }

    public void setBranddescrption(String branddescrption) {
        this.branddescrption = branddescrption == null ? null : branddescrption.trim();
    }
}