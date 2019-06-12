package com.fqcheng220.model;

public class ProductSpuImg {
    private Integer id;

    private String path;

    private Integer sort;

    private Byte statue;

    private Long tbProductSpuId;

    public ProductSpuImg(Integer id, String path, Integer sort, Byte statue, Long tbProductSpuId) {
        this.id = id;
        this.path = path;
        this.sort = sort;
        this.statue = statue;
        this.tbProductSpuId = tbProductSpuId;
    }

    public ProductSpuImg() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Byte getStatue() {
        return statue;
    }

    public void setStatue(Byte statue) {
        this.statue = statue;
    }

    public Long getTbProductSpuId() {
        return tbProductSpuId;
    }

    public void setTbProductSpuId(Long tbProductSpuId) {
        this.tbProductSpuId = tbProductSpuId;
    }
}