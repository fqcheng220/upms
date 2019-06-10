package com.fqcheng220.model;

public class ProductSpuImgKey {
    private Integer id;

    private Long tbProductSpuId;

    public ProductSpuImgKey(Integer id, Long tbProductSpuId) {
        this.id = id;
        this.tbProductSpuId = tbProductSpuId;
    }

    public ProductSpuImgKey() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getTbProductSpuId() {
        return tbProductSpuId;
    }

    public void setTbProductSpuId(Long tbProductSpuId) {
        this.tbProductSpuId = tbProductSpuId;
    }
}