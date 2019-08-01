package com.fqcheng220.dto;

public class ProductSkuSpecValueSelfDto {
    private Integer id;

    private Integer tbProductSpecId;

    private Integer tbProductSpecValueId;

    private Long tbProductSkuId;

    //新增连接查询需要返回的字段
    private Long tbProductCategoryId;
    private String tbProductCategoryName;
    private Long tbProductSpuId;
    private String tbProductSpuName;
    private String tbProductSkuName;
    private String tbProductSpecName;
    private String tbProductSpecValueName;

    public ProductSkuSpecValueSelfDto(Integer id, Integer tbProductSpecId, Integer tbProductSpecValueId, Long tbProductSkuId
    ,Long tbProductCategoryId,String tbProductCategoryName,Long tbProductSpuId,String tbProductSpuName,String tbProductSkuName,String tbProductSpecName,String tbProductSpecValueName) {
        this.id = id;
        this.tbProductSpecId = tbProductSpecId;
        this.tbProductSpecValueId = tbProductSpecValueId;
        this.tbProductSkuId = tbProductSkuId;

        this.tbProductCategoryId = tbProductCategoryId;
        this.tbProductCategoryName = tbProductCategoryName;
        this.tbProductSpuId = tbProductSpuId;
        this.tbProductSpuName = tbProductSpuName;
        this.tbProductSkuName = tbProductSkuName;
        this.tbProductSpecName = tbProductSpecName;
        this.tbProductSpecValueName = tbProductSpecValueName;
    }

    public ProductSkuSpecValueSelfDto() {
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

    public Integer getTbProductSpecValueId() {
        return tbProductSpecValueId;
    }

    public void setTbProductSpecValueId(Integer tbProductSpecValueId) {
        this.tbProductSpecValueId = tbProductSpecValueId;
    }

    public Long getTbProductSkuId() {
        return tbProductSkuId;
    }

    public void setTbProductSkuId(Long tbProductSkuId) {
        this.tbProductSkuId = tbProductSkuId;
    }

    public Long getTbProductCategoryId() {
        return tbProductCategoryId;
    }

    public void setTbProductCategoryId(Long tbProductCategoryId) {
        this.tbProductCategoryId = tbProductCategoryId;
    }

    public String getTbProductCategoryName() {
        return tbProductCategoryName;
    }

    public void setTbProductCategoryName(String tbProductCategoryName) {
        this.tbProductCategoryName = tbProductCategoryName;
    }

    public Long getTbProductSpuId() {
        return tbProductSpuId;
    }

    public void setTbProductSpuId(Long tbProductSpuId) {
        this.tbProductSpuId = tbProductSpuId;
    }

    public String getTbProductSpuName() {
        return tbProductSpuName;
    }

    public void setTbProductSpuName(String tbProductSpuName) {
        this.tbProductSpuName = tbProductSpuName;
    }

    public String getTbProductSkuName() {
        return tbProductSkuName;
    }

    public void setTbProductSkuName(String tbProductSkuName) {
        this.tbProductSkuName = tbProductSkuName;
    }

    public String getTbProductSpecName() {
        return tbProductSpecName;
    }

    public void setTbProductSpecName(String tbProductSpecName) {
        this.tbProductSpecName = tbProductSpecName;
    }

    public String getTbProductSpecValueName() {
        return tbProductSpecValueName;
    }

    public void setTbProductSpecValueName(String tbProductSpecValueName) {
        this.tbProductSpecValueName = tbProductSpecValueName;
    }

}