package com.fqcheng220.model;

public class ProductSkuSpecValue {
    private Integer id;

    private Integer tbProductSpecId;

    private Integer tbProductSpecValueId;

    private Long tbProductSkuId;

    public ProductSkuSpecValue(Integer id, Integer tbProductSpecId, Integer tbProductSpecValueId, Long tbProductSkuId) {
        this.id = id;
        this.tbProductSpecId = tbProductSpecId;
        this.tbProductSpecValueId = tbProductSpecValueId;
        this.tbProductSkuId = tbProductSkuId;
    }

    public ProductSkuSpecValue() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTbProductSpecId() {
        return tbProductSpecId;
    }

    public void setTbProductSpecId(Integer tbProductSpecId) {
        this.tbProductSpecId = tbProductSpecId;
    }

    public Integer getTbProductSpecValueId() {
        return tbProductSpecValueId;
    }

    public void setTbProductSpecValueId(Integer tbProductSpecValueId) {
        this.tbProductSpecValueId = tbProductSpecValueId;
    }

    public Long getTbProductSkuId() {
        return tbProductSkuId;
    }

    public void setTbProductSkuId(Long tbProductSkuId) {
        this.tbProductSkuId = tbProductSkuId;
    }
}