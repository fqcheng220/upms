package com.fqcheng220.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductCategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andShowInNavIsNull() {
            addCriterion("show_in_nav is null");
            return (Criteria) this;
        }

        public Criteria andShowInNavIsNotNull() {
            addCriterion("show_in_nav is not null");
            return (Criteria) this;
        }

        public Criteria andShowInNavEqualTo(Byte value) {
            addCriterion("show_in_nav =", value, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavNotEqualTo(Byte value) {
            addCriterion("show_in_nav <>", value, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavGreaterThan(Byte value) {
            addCriterion("show_in_nav >", value, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavGreaterThanOrEqualTo(Byte value) {
            addCriterion("show_in_nav >=", value, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavLessThan(Byte value) {
            addCriterion("show_in_nav <", value, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavLessThanOrEqualTo(Byte value) {
            addCriterion("show_in_nav <=", value, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavIn(List<Byte> values) {
            addCriterion("show_in_nav in", values, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavNotIn(List<Byte> values) {
            addCriterion("show_in_nav not in", values, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavBetween(Byte value1, Byte value2) {
            addCriterion("show_in_nav between", value1, value2, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInNavNotBetween(Byte value1, Byte value2) {
            addCriterion("show_in_nav not between", value1, value2, "showInNav");
            return (Criteria) this;
        }

        public Criteria andShowInTopIsNull() {
            addCriterion("show_in_top is null");
            return (Criteria) this;
        }

        public Criteria andShowInTopIsNotNull() {
            addCriterion("show_in_top is not null");
            return (Criteria) this;
        }

        public Criteria andShowInTopEqualTo(Byte value) {
            addCriterion("show_in_top =", value, "showInTop");
            return (Criteria) this;
        }

        public Criteria andShowInTopNotEqualTo(Byte value) {
            addCriterion("show_in_top <>", value, "showInTop");
            return (Criteria) this;
        }

        public Criteria andShowInTopGreaterThan(Byte value) {
            addCriterion("show_in_top >", value, "showInTop");
            return (Criteria) this;
        }

        public Criteria andShowInTopGreaterThanOrEqualTo(Byte value) {
            addCriterion("show_in_top >=", value, "showInTop");
            return (Criteria) this;
        }

        public Criteria andShowInTopLessThan(Byte value) {
            addCriterion("show_in_top <", value, "showInTop");
            return (Criteria) this;
        }

        public Criteria andShowInTopLessThanOrEqualTo(Byte value) {
            addCriterion("show_in_top <=", value, "showInTop");
            return (Criteria) this;
        }

        public Criteria andShowInTopIn(List<Byte> values) {
            addCriterion("show_in_top in", values, "showInTop");
            return (Criteria) this;
        }

        public Criteria andShowInTopNotIn(List<Byte> values) {
            addCriterion("show_in_top not in", values, "showInTop");
            return (Criteria) this;
        }

        public Criteria andShowInTopBetween(Byte value1, Byte value2) {
            addCriterion("show_in_top between", value1, value2, "showInTop");
            return (Criteria) this;
        }

        public Criteria andShowInTopNotBetween(Byte value1, Byte value2) {
            addCriterion("show_in_top not between", value1, value2, "showInTop");
            return (Criteria) this;
        }

        public Criteria andShowInHotIsNull() {
            addCriterion("show_in_hot is null");
            return (Criteria) this;
        }

        public Criteria andShowInHotIsNotNull() {
            addCriterion("show_in_hot is not null");
            return (Criteria) this;
        }

        public Criteria andShowInHotEqualTo(Byte value) {
            addCriterion("show_in_hot =", value, "showInHot");
            return (Criteria) this;
        }

        public Criteria andShowInHotNotEqualTo(Byte value) {
            addCriterion("show_in_hot <>", value, "showInHot");
            return (Criteria) this;
        }

        public Criteria andShowInHotGreaterThan(Byte value) {
            addCriterion("show_in_hot >", value, "showInHot");
            return (Criteria) this;
        }

        public Criteria andShowInHotGreaterThanOrEqualTo(Byte value) {
            addCriterion("show_in_hot >=", value, "showInHot");
            return (Criteria) this;
        }

        public Criteria andShowInHotLessThan(Byte value) {
            addCriterion("show_in_hot <", value, "showInHot");
            return (Criteria) this;
        }

        public Criteria andShowInHotLessThanOrEqualTo(Byte value) {
            addCriterion("show_in_hot <=", value, "showInHot");
            return (Criteria) this;
        }

        public Criteria andShowInHotIn(List<Byte> values) {
            addCriterion("show_in_hot in", values, "showInHot");
            return (Criteria) this;
        }

        public Criteria andShowInHotNotIn(List<Byte> values) {
            addCriterion("show_in_hot not in", values, "showInHot");
            return (Criteria) this;
        }

        public Criteria andShowInHotBetween(Byte value1, Byte value2) {
            addCriterion("show_in_hot between", value1, value2, "showInHot");
            return (Criteria) this;
        }

        public Criteria andShowInHotNotBetween(Byte value1, Byte value2) {
            addCriterion("show_in_hot not between", value1, value2, "showInHot");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andPageTitleIsNull() {
            addCriterion("page_title is null");
            return (Criteria) this;
        }

        public Criteria andPageTitleIsNotNull() {
            addCriterion("page_title is not null");
            return (Criteria) this;
        }

        public Criteria andPageTitleEqualTo(String value) {
            addCriterion("page_title =", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleNotEqualTo(String value) {
            addCriterion("page_title <>", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleGreaterThan(String value) {
            addCriterion("page_title >", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleGreaterThanOrEqualTo(String value) {
            addCriterion("page_title >=", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleLessThan(String value) {
            addCriterion("page_title <", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleLessThanOrEqualTo(String value) {
            addCriterion("page_title <=", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleLike(String value) {
            addCriterion("page_title like", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleNotLike(String value) {
            addCriterion("page_title not like", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleIn(List<String> values) {
            addCriterion("page_title in", values, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleNotIn(List<String> values) {
            addCriterion("page_title not in", values, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleBetween(String value1, String value2) {
            addCriterion("page_title between", value1, value2, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleNotBetween(String value1, String value2) {
            addCriterion("page_title not between", value1, value2, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionIsNull() {
            addCriterion("page_description is null");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionIsNotNull() {
            addCriterion("page_description is not null");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionEqualTo(String value) {
            addCriterion("page_description =", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionNotEqualTo(String value) {
            addCriterion("page_description <>", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionGreaterThan(String value) {
            addCriterion("page_description >", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("page_description >=", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionLessThan(String value) {
            addCriterion("page_description <", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionLessThanOrEqualTo(String value) {
            addCriterion("page_description <=", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionLike(String value) {
            addCriterion("page_description like", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionNotLike(String value) {
            addCriterion("page_description not like", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionIn(List<String> values) {
            addCriterion("page_description in", values, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionNotIn(List<String> values) {
            addCriterion("page_description not in", values, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionBetween(String value1, String value2) {
            addCriterion("page_description between", value1, value2, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionNotBetween(String value1, String value2) {
            addCriterion("page_description not between", value1, value2, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsIsNull() {
            addCriterion("Page_keywords is null");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsIsNotNull() {
            addCriterion("Page_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsEqualTo(String value) {
            addCriterion("Page_keywords =", value, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsNotEqualTo(String value) {
            addCriterion("Page_keywords <>", value, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsGreaterThan(String value) {
            addCriterion("Page_keywords >", value, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("Page_keywords >=", value, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsLessThan(String value) {
            addCriterion("Page_keywords <", value, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsLessThanOrEqualTo(String value) {
            addCriterion("Page_keywords <=", value, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsLike(String value) {
            addCriterion("Page_keywords like", value, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsNotLike(String value) {
            addCriterion("Page_keywords not like", value, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsIn(List<String> values) {
            addCriterion("Page_keywords in", values, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsNotIn(List<String> values) {
            addCriterion("Page_keywords not in", values, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsBetween(String value1, String value2) {
            addCriterion("Page_keywords between", value1, value2, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsNotBetween(String value1, String value2) {
            addCriterion("Page_keywords not between", value1, value2, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNull() {
            addCriterion("icon_url is null");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNotNull() {
            addCriterion("icon_url is not null");
            return (Criteria) this;
        }

        public Criteria andIconUrlEqualTo(String value) {
            addCriterion("icon_url =", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotEqualTo(String value) {
            addCriterion("icon_url <>", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThan(String value) {
            addCriterion("icon_url >", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("icon_url >=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThan(String value) {
            addCriterion("icon_url <", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThanOrEqualTo(String value) {
            addCriterion("icon_url <=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLike(String value) {
            addCriterion("icon_url like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotLike(String value) {
            addCriterion("icon_url not like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlIn(List<String> values) {
            addCriterion("icon_url in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotIn(List<String> values) {
            addCriterion("icon_url not in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlBetween(String value1, String value2) {
            addCriterion("icon_url between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotBetween(String value1, String value2) {
            addCriterion("icon_url not between", value1, value2, "iconUrl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}