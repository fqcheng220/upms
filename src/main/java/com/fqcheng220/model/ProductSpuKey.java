package com.fqcheng220.model;

public class ProductSpuKey {
    private Long id;

    private Long tbProductCategoryId;

    private Integer tbProductBrandId;

    public ProductSpuKey(Long id, Long tbProductCategoryId, Integer tbProductBrandId) {
        this.id = id;
        this.tbProductCategoryId = tbProductCategoryId;
        this.tbProductBrandId = tbProductBrandId;
    }

    public ProductSpuKey() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTbProductCategoryId() {
        return tbProductCategoryId;
    }

    public void setTbProductCategoryId(Long tbProductCategoryId) {
        this.tbProductCategoryId = tbProductCategoryId;
    }

    public Integer getTbProductBrandId() {
        return tbProductBrandId;
    }

    public void setTbProductBrandId(Integer tbProductBrandId) {
        this.tbProductBrandId = tbProductBrandId;
    }
}