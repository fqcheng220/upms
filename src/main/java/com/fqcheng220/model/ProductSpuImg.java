package com.fqcheng220.model;

public class ProductSpuImg {
    private Integer id;

    private String path;

    private Integer sort;

    private Byte statue;

    private Long tbProductSpuSpuid;

    public ProductSpuImg(Integer id, String path, Integer sort, Byte statue, Long tbProductSpuSpuid) {
        this.id = id;
        this.path = path;
        this.sort = sort;
        this.statue = statue;
        this.tbProductSpuSpuid = tbProductSpuSpuid;
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

    public Long getTbProductSpuSpuid() {
        return tbProductSpuSpuid;
    }

    public void setTbProductSpuSpuid(Long tbProductSpuSpuid) {
        this.tbProductSpuSpuid = tbProductSpuSpuid;
    }
}