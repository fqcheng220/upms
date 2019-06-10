package com.fqcheng220.model;

public class ProductSkuKey {
    private Long id;

    private Long tbProductSpuId;

    public ProductSkuKey(Long id, Long tbProductSpuId) {
        this.id = id;
        this.tbProductSpuId = tbProductSpuId;
    }

    public ProductSkuKey() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTbProductSpuId() {
        return tbProductSpuId;
    }

    public void setTbProductSpuId(Long tbProductSpuId) {
        this.tbProductSpuId = tbProductSpuId;
    }
}