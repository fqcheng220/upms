package com.fqcheng220.model;

public class ProductSpecValueKey {
    private Integer id;

    private Integer tbProductSpecId;

    public ProductSpecValueKey(Integer id, Integer tbProductSpecId) {
        this.id = id;
        this.tbProductSpecId = tbProductSpecId;
    }

    public ProductSpecValueKey() {
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
}