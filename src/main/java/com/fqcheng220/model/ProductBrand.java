package com.fqcheng220.model;

public class ProductBrand {
    private Integer id;

    private String name;

    private String descrption;

    public ProductBrand(Integer id, String name, String descrption) {
        this.id = id;
        this.name = name;
        this.descrption = descrption;
    }

    public ProductBrand() {
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

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption == null ? null : descrption.trim();
    }
}