package com.fqcheng220.model;

public class ProductSpec {
    private Integer id;

    private String name;

    private Long tbProductCategoryId;

    public ProductSpec(Integer id, String name, Long tbProductCategoryId) {
        this.id = id;
        this.name = name;
        this.tbProductCategoryId = tbProductCategoryId;
    }

    public ProductSpec() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getTbProductCategoryId() {
        return tbProductCategoryId;
    }

    public void setTbProductCategoryId(Long tbProductCategoryId) {
        this.tbProductCategoryId = tbProductCategoryId;
    }
}