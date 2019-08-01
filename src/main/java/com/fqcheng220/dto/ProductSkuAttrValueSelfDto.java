package com.fqcheng220.dto;

public class ProductSkuAttrValueSelfDto {
    private Integer id;

    private Integer tbProductAttrId;

    private Integer tbProductAttrValueId;

    private Long tbProductSkuId;

    //新增连接查询需要返回的字段
    private Long tbProductCategoryId;
    private String tbProductCategoryName;
    private Long tbProductSpuId;
    private String tbProductSpuName;
    private String tbProductSkuName;
    private String tbProductAttrName;
    private String tbProductAttrValueName;

    public ProductSkuAttrValueSelfDto(Integer id, Integer tbProductAttrId, Integer tbProductAttrValueId, Long tbProductSkuId
    ,Long tbProductCategoryId,String tbProductCategoryName,Long tbProductSpuId,String tbProductSpuName,String tbProductSkuName
            ,String tbProductAttrName,String tbProductAttrValueName) {
        this.id = id;
        this.tbProductAttrId = tbProductAttrId;
        this.tbProductAttrValueId = tbProductAttrValueId;
        this.tbProductSkuId = tbProductSkuId;

        this.tbProductCategoryId=tbProductCategoryId;
        this.tbProductCategoryName=tbProductCategoryName;
        this.tbProductSpuId=tbProductSpuId;
        this.tbProductSpuName=tbProductSpuName;
        this.tbProductSkuName=tbProductSkuName;
        this.tbProductAttrName=tbProductAttrName;
        this.tbProductAttrValueName=tbProductAttrValueName;
    }

    public ProductSkuAttrValueSelfDto() {
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

    public Integer getTbProductAttrValueId() {
        return tbProductAttrValueId;
    }

    public void setTbProductAttrValueId(Integer tbProductAttrValueId) {
        this.tbProductAttrValueId = tbProductAttrValueId;
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

    public String getTbProductAttrName() {
        return tbProductAttrName;
    }

    public void setTbProductAttrName(String tbProductAttrName) {
        this.tbProductAttrName = tbProductAttrName;
    }

    public String getTbProductAttrValueName() {
        return tbProductAttrValueName;
    }

    public void setTbProductAttrValueName(String tbProductAttrValueName) {
        this.tbProductAttrValueName = tbProductAttrValueName;
    }
}
