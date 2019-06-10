package com.fqcheng220.model;

public class ProductSpecKey {
    private Integer id;

    private Long tbProductCategoryId;

    public ProductSpecKey(Integer id, Long tbProductCategoryId) {
        this.id = id;
        this.tbProductCategoryId = tbProductCategoryId;
    }

    public ProductSpecKey() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getTbProductCategoryId() {
        return tbProductCategoryId;
    }

    public void setTbProductCategoryId(Long tbProductCategoryId) {
        this.tbProductCategoryId = tbProductCategoryId;
    }
}