package com.fqcheng220.model;

public class ProductAttrValueKey {
    private Integer id;

    private Integer tbProductAttrId;

    public ProductAttrValueKey(Integer id, Integer tbProductAttrId) {
        this.id = id;
        this.tbProductAttrId = tbProductAttrId;
    }

    public ProductAttrValueKey() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTbProductAttrId() {
        return tbProductAttrId;
    }

    public void setTbProductAttrId(Integer tbProductAttrId) {
        this.tbProductAttrId = tbProductAttrId;
    }
}