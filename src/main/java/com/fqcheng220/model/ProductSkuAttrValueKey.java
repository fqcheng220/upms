package com.fqcheng220.model;

public class ProductSkuAttrValueKey {
    private Integer id;

    private Integer tbProductAttrValueId;

    private Long tbProductSkuId;

    public ProductSkuAttrValueKey(Integer id, Integer tbProductAttrValueId, Long tbProductSkuId) {
        this.id = id;
        this.tbProductAttrValueId = tbProductAttrValueId;
        this.tbProductSkuId = tbProductSkuId;
    }

    public ProductSkuAttrValueKey() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTbProductAttrValueId() {
        return tbProductAttrValueId;
    }

    public void setTbProductAttrValueId(Integer tbProductAttrValueId) {
        this.tbProductAttrValueId = tbProductAttrValueId;
    }

    public Long getTbProductSkuId() {
        return tbProductSkuId;
    }

    public void setTbProductSkuId(Long tbProductSkuId) {
        this.tbProductSkuId = tbProductSkuId;
    }
}