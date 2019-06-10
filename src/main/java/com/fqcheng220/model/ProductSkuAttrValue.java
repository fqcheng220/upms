package com.fqcheng220.model;

public class ProductSkuAttrValue {
    private Integer id;

    private Integer tbProductAttrValueAttrvalueid;

    private Long tbProductSkuSkuid;

    public ProductSkuAttrValue(Integer id, Integer tbProductAttrValueAttrvalueid, Long tbProductSkuSkuid) {
        this.id = id;
        this.tbProductAttrValueAttrvalueid = tbProductAttrValueAttrvalueid;
        this.tbProductSkuSkuid = tbProductSkuSkuid;
    }

    public ProductSkuAttrValue() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTbProductAttrValueAttrvalueid() {
        return tbProductAttrValueAttrvalueid;
    }

    public void setTbProductAttrValueAttrvalueid(Integer tbProductAttrValueAttrvalueid) {
        this.tbProductAttrValueAttrvalueid = tbProductAttrValueAttrvalueid;
    }

    public Long getTbProductSkuSkuid() {
        return tbProductSkuSkuid;
    }

    public void setTbProductSkuSkuid(Long tbProductSkuSkuid) {
        this.tbProductSkuSkuid = tbProductSkuSkuid;
    }
}