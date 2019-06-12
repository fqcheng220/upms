package com.fqcheng220.model;

public class ProductSpecValue {
    private Integer id;

    private String value;

    private Integer tbProductSpecId;

    public ProductSpecValue(Integer id, String value, Integer tbProductSpecId) {
        this.id = id;
        this.value = value;
        this.tbProductSpecId = tbProductSpecId;
    }

    public ProductSpecValue() {
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

    public Integer getTbProductSpecId() {
        return tbProductSpecId;
    }

    public void setTbProductSpecId(Integer tbProductSpecId) {
        this.tbProductSpecId = tbProductSpecId;
    }
}