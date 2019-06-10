package com.fqcheng220.model;

public class ProductSkuSpecValueKey {
    private Integer id;

    private Integer tbProductSpecValueId;

    private Long tbProductSkuId;

    public ProductSkuSpecValueKey(Integer id, Integer tbProductSpecValueId, Long tbProductSkuId) {
        this.id = id;
        this.tbProductSpecValueId = tbProductSpecValueId;
        this.tbProductSkuId = tbProductSkuId;
    }

    public ProductSkuSpecValueKey() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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