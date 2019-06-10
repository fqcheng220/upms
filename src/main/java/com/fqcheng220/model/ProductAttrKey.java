package com.fqcheng220.model;

public class ProductAttrKey {
    private Integer id;

    private Long tbProductCategoryId;

    public ProductAttrKey(Integer id, Long tbProductCategoryId) {
        this.id = id;
        this.tbProductCategoryId = tbProductCategoryId;
    }

    public ProductAttrKey() {
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