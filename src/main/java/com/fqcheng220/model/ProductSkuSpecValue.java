package com.fqcheng220.model;

public class ProductSkuSpecValue {
    private Integer id;

    private Integer tbProductSpecValueSpecvalueid;

    private Long tbProductSkuSkuid;

    public ProductSkuSpecValue(Integer id, Integer tbProductSpecValueSpecvalueid, Long tbProductSkuSkuid) {
        this.id = id;
        this.tbProductSpecValueSpecvalueid = tbProductSpecValueSpecvalueid;
        this.tbProductSkuSkuid = tbProductSkuSkuid;
    }

    public ProductSkuSpecValue() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTbProductSpecValueSpecvalueid() {
        return tbProductSpecValueSpecvalueid;
    }

    public void setTbProductSpecValueSpecvalueid(Integer tbProductSpecValueSpecvalueid) {
        this.tbProductSpecValueSpecvalueid = tbProductSpecValueSpecvalueid;
    }

    public Long getTbProductSkuSkuid() {
        return tbProductSkuSkuid;
    }

    public void setTbProductSkuSkuid(Long tbProductSkuSkuid) {
        this.tbProductSkuSkuid = tbProductSkuSkuid;
    }
}