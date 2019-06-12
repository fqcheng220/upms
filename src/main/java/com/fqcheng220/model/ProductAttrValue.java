package com.fqcheng220.model;

public class ProductAttrValue {
    private Integer id;

    private String value;

    private Integer tbProductAttrId;

    public ProductAttrValue(Integer id, String value, Integer tbProductAttrId) {
        this.id = id;
        this.value = value;
        this.tbProductAttrId = tbProductAttrId;
    }

    public ProductAttrValue() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Integer getTbProductAttrId() {
        return tbProductAttrId;
    }

    public void setTbProductAttrId(Integer tbProductAttrId) {
        this.tbProductAttrId = tbProductAttrId;
    }
}