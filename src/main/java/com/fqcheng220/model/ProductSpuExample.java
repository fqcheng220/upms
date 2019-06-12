package com.fqcheng220.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductSpuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductSpuExample() {
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

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Long value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Long value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Long value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Long value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Long value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Long> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Long> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Long value1, Long value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Long value1, Long value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andSpunameIsNull() {
            addCriterion("spuName is null");
            return (Criteria) this;
        }

        public Criteria andSpunameIsNotNull() {
            addCriterion("spuName is not null");
            return (Criteria) this;
        }

        public Criteria andSpunameEqualTo(String value) {
            addCriterion("spuName =", value, "spuname");
            return (Criteria) this;
        }

        public Criteria andSpunameNotEqualTo(String value) {
            addCriterion("spuName <>", value, "spuname");
            return (Criteria) this;
        }

        public Criteria andSpunameGreaterThan(String value) {
            addCriterion("spuName >", value, "spuname");
            return (Criteria) this;
        }

        public Criteria andSpunameGreaterThanOrEqualTo(String value) {
            addCriterion("spuName >=", value, "spuname");
            return (Criteria) this;
        }

        public Criteria andSpunameLessThan(String value) {
            addCriterion("spuName <", value, "spuname");
            return (Criteria) this;
        }

        public Criteria andSpunameLessThanOrEqualTo(String value) {
            addCriterion("spuName <=", value, "spuname");
            return (Criteria) this;
        }

        public Criteria andSpunameLike(String value) {
            addCriterion("spuName like", value, "spuname");
            return (Criteria) this;
        }

        public Criteria andSpunameNotLike(String value) {
            addCriterion("spuName not like", value, "spuname");
            return (Criteria) this;
        }

        public Criteria andSpunameIn(List<String> values) {
            addCriterion("spuName in", values, "spuname");
            return (Criteria) this;
        }

        public Criteria andSpunameNotIn(List<String> values) {
            addCriterion("spuName not in", values, "spuname");
            return (Criteria) this;
        }

        public Criteria andSpunameBetween(String value1, String value2) {
            addCriterion("spuName between", value1, value2, "spuname");
            return (Criteria) this;
        }

        public Criteria andSpunameNotBetween(String value1, String value2) {
            addCriterion("spuName not between", value1, value2, "spuname");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andShowInShelveIsNull() {
            addCriterion("show_in_shelve is null");
            return (Criteria) this;
        }

        public Criteria andShowInShelveIsNotNull() {
            addCriterion("show_in_shelve is not null");
            return (Criteria) this;
        }

        public Criteria andShowInShelveEqualTo(Byte value) {
            addCriterion("show_in_shelve =", value, "showInShelve");
            return (Criteria) this;
        }

        public Criteria andShowInShelveNotEqualTo(Byte value) {
            addCriterion("show_in_shelve <>", value, "showInShelve");
            return (Criteria) this;
        }

        public Criteria andShowInShelveGreaterThan(Byte value) {
            addCriterion("show_in_shelve >", value, "showInShelve");
            return (Criteria) this;
        }

        public Criteria andShowInShelveGreaterThanOrEqualTo(Byte value) {
            addCriterion("show_in_shelve >=", value, "showInShelve");
            return (Criteria) this;
        }

        public Criteria andShowInShelveLessThan(Byte value) {
            addCriterion("show_in_shelve <", value, "showInShelve");
            return (Criteria) this;
        }

        public Criteria andShowInShelveLessThanOrEqualTo(Byte value) {
            addCriterion("show_in_shelve <=", value, "showInShelve");
            return (Criteria) this;
        }

        public Criteria andShowInShelveIn(List<Byte> values) {
            addCriterion("show_in_shelve in", values, "showInShelve");
            return (Criteria) this;
        }

        public Criteria andShowInShelveNotIn(List<Byte> values) {
            addCriterion("show_in_shelve not in", values, "showInShelve");
            return (Criteria) this;
        }

        public Criteria andShowInShelveBetween(Byte value1, Byte value2) {
            addCriterion("show_in_shelve between", value1, value2, "showInShelve");
            return (Criteria) this;
        }

        public Criteria andShowInShelveNotBetween(Byte value1, Byte value2) {
            addCriterion("show_in_shelve not between", value1, value2, "showInShelve");
            return (Criteria) this;
        }

        public Criteria andShelveTimeIsNull() {
            addCriterion("shelve_time is null");
            return (Criteria) this;
        }

        public Criteria andShelveTimeIsNotNull() {
            addCriterion("shelve_time is not null");
            return (Criteria) this;
        }

        public Criteria andShelveTimeEqualTo(Date value) {
            addCriterion("shelve_time =", value, "shelveTime");
            return (Criteria) this;
        }

        public Criteria andShelveTimeNotEqualTo(Date value) {
            addCriterion("shelve_time <>", value, "shelveTime");
            return (Criteria) this;
        }

        public Criteria andShelveTimeGreaterThan(Date value) {
            addCriterion("shelve_time >", value, "shelveTime");
            return (Criteria) this;
        }

        public Criteria andShelveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shelve_time >=", value, "shelveTime");
            return (Criteria) this;
        }

        public Criteria andShelveTimeLessThan(Date value) {
            addCriterion("shelve_time <", value, "shelveTime");
            return (Criteria) this;
        }

        public Criteria andShelveTimeLessThanOrEqualTo(Date value) {
            addCriterion("shelve_time <=", value, "shelveTime");
            return (Criteria) this;
        }

        public Criteria andShelveTimeIn(List<Date> values) {
            addCriterion("shelve_time in", values, "shelveTime");
            return (Criteria) this;
        }

        public Criteria andShelveTimeNotIn(List<Date> values) {
            addCriterion("shelve_time not in", values, "shelveTime");
            return (Criteria) this;
        }

        public Criteria andShelveTimeBetween(Date value1, Date value2) {
            addCriterion("shelve_time between", value1, value2, "shelveTime");
            return (Criteria) this;
        }

        public Criteria andShelveTimeNotBetween(Date value1, Date value2) {
            addCriterion("shelve_time not between", value1, value2, "shelveTime");
            return (Criteria) this;
        }

        public Criteria andShelveByIsNull() {
            addCriterion("shelve_by is null");
            return (Criteria) this;
        }

        public Criteria andShelveByIsNotNull() {
            addCriterion("shelve_by is not null");
            return (Criteria) this;
        }

        public Criteria andShelveByEqualTo(String value) {
            addCriterion("shelve_by =", value, "shelveBy");
            return (Criteria) this;
        }

        public Criteria andShelveByNotEqualTo(String value) {
            addCriterion("shelve_by <>", value, "shelveBy");
            return (Criteria) this;
        }

        public Criteria andShelveByGreaterThan(String value) {
            addCriterion("shelve_by >", value, "shelveBy");
            return (Criteria) this;
        }

        public Criteria andShelveByGreaterThanOrEqualTo(String value) {
            addCriterion("shelve_by >=", value, "shelveBy");
            return (Criteria) this;
        }

        public Criteria andShelveByLessThan(String value) {
            addCriterion("shelve_by <", value, "shelveBy");
            return (Criteria) this;
        }

        public Criteria andShelveByLessThanOrEqualTo(String value) {
            addCriterion("shelve_by <=", value, "shelveBy");
            return (Criteria) this;
        }

        public Criteria andShelveByLike(String value) {
            addCriterion("shelve_by like", value, "shelveBy");
            return (Criteria) this;
        }

        public Criteria andShelveByNotLike(String value) {
            addCriterion("shelve_by not like", value, "shelveBy");
            return (Criteria) this;
        }

        public Criteria andShelveByIn(List<String> values) {
            addCriterion("shelve_by in", values, "shelveBy");
            return (Criteria) this;
        }

        public Criteria andShelveByNotIn(List<String> values) {
            addCriterion("shelve_by not in", values, "shelveBy");
            return (Criteria) this;
        }

        public Criteria andShelveByBetween(String value1, String value2) {
            addCriterion("shelve_by between", value1, value2, "shelveBy");
            return (Criteria) this;
        }

        public Criteria andShelveByNotBetween(String value1, String value2) {
            addCriterion("shelve_by not between", value1, value2, "shelveBy");
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

        public Criteria andVideoIntroduceIsNull() {
            addCriterion("video_introduce is null");
            return (Criteria) this;
        }

        public Criteria andVideoIntroduceIsNotNull() {
            addCriterion("video_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIntroduceEqualTo(String value) {
            addCriterion("video_introduce =", value, "videoIntroduce");
            return (Criteria) this;
        }

        public Criteria andVideoIntroduceNotEqualTo(String value) {
            addCriterion("video_introduce <>", value, "videoIntroduce");
            return (Criteria) this;
        }

        public Criteria andVideoIntroduceGreaterThan(String value) {
            addCriterion("video_introduce >", value, "videoIntroduce");
            return (Criteria) this;
        }

        public Criteria andVideoIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("video_introduce >=", value, "videoIntroduce");
            return (Criteria) this;
        }

        public Criteria andVideoIntroduceLessThan(String value) {
            addCriterion("video_introduce <", value, "videoIntroduce");
            return (Criteria) this;
        }

        public Criteria andVideoIntroduceLessThanOrEqualTo(String value) {
            addCriterion("video_introduce <=", value, "videoIntroduce");
            return (Criteria) this;
        }

        public Criteria andVideoIntroduceLike(String value) {
            addCriterion("video_introduce like", value, "videoIntroduce");
            return (Criteria) this;
        }

        public Criteria andVideoIntroduceNotLike(String value) {
            addCriterion("video_introduce not like", value, "videoIntroduce");
            return (Criteria) this;
        }

        public Criteria andVideoIntroduceIn(List<String> values) {
            addCriterion("video_introduce in", values, "videoIntroduce");
            return (Criteria) this;
        }

        public Criteria andVideoIntroduceNotIn(List<String> values) {
            addCriterion("video_introduce not in", values, "videoIntroduce");
            return (Criteria) this;
        }

        public Criteria andVideoIntroduceBetween(String value1, String value2) {
            addCriterion("video_introduce between", value1, value2, "videoIntroduce");
            return (Criteria) this;
        }

        public Criteria andVideoIntroduceNotBetween(String value1, String value2) {
            addCriterion("video_introduce not between", value1, value2, "videoIntroduce");
            return (Criteria) this;
        }

        public Criteria andSearchKeyIsNull() {
            addCriterion("search_key is null");
            return (Criteria) this;
        }

        public Criteria andSearchKeyIsNotNull() {
            addCriterion("search_key is not null");
            return (Criteria) this;
        }

        public Criteria andSearchKeyEqualTo(String value) {
            addCriterion("search_key =", value, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyNotEqualTo(String value) {
            addCriterion("search_key <>", value, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyGreaterThan(String value) {
            addCriterion("search_key >", value, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyGreaterThanOrEqualTo(String value) {
            addCriterion("search_key >=", value, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyLessThan(String value) {
            addCriterion("search_key <", value, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyLessThanOrEqualTo(String value) {
            addCriterion("search_key <=", value, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyLike(String value) {
            addCriterion("search_key like", value, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyNotLike(String value) {
            addCriterion("search_key not like", value, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyIn(List<String> values) {
            addCriterion("search_key in", values, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyNotIn(List<String> values) {
            addCriterion("search_key not in", values, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyBetween(String value1, String value2) {
            addCriterion("search_key between", value1, value2, "searchKey");
            return (Criteria) this;
        }

        public Criteria andSearchKeyNotBetween(String value1, String value2) {
            addCriterion("search_key not between", value1, value2, "searchKey");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryIdIsNull() {
            addCriterion("tb_product_category_id is null");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryIdIsNotNull() {
            addCriterion("tb_product_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryIdEqualTo(Long value) {
            addCriterion("tb_product_category_id =", value, "tbProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryIdNotEqualTo(Long value) {
            addCriterion("tb_product_category_id <>", value, "tbProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryIdGreaterThan(Long value) {
            addCriterion("tb_product_category_id >", value, "tbProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tb_product_category_id >=", value, "tbProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryIdLessThan(Long value) {
            addCriterion("tb_product_category_id <", value, "tbProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("tb_product_category_id <=", value, "tbProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryIdIn(List<Long> values) {
            addCriterion("tb_product_category_id in", values, "tbProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryIdNotIn(List<Long> values) {
            addCriterion("tb_product_category_id not in", values, "tbProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryIdBetween(Long value1, Long value2) {
            addCriterion("tb_product_category_id between", value1, value2, "tbProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("tb_product_category_id not between", value1, value2, "tbProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandIdIsNull() {
            addCriterion("tb_product_brand_id is null");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandIdIsNotNull() {
            addCriterion("tb_product_brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandIdEqualTo(Integer value) {
            addCriterion("tb_product_brand_id =", value, "tbProductBrandId");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandIdNotEqualTo(Integer value) {
            addCriterion("tb_product_brand_id <>", value, "tbProductBrandId");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandIdGreaterThan(Integer value) {
            addCriterion("tb_product_brand_id >", value, "tbProductBrandId");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tb_product_brand_id >=", value, "tbProductBrandId");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandIdLessThan(Integer value) {
            addCriterion("tb_product_brand_id <", value, "tbProductBrandId");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("tb_product_brand_id <=", value, "tbProductBrandId");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandIdIn(List<Integer> values) {
            addCriterion("tb_product_brand_id in", values, "tbProductBrandId");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandIdNotIn(List<Integer> values) {
            addCriterion("tb_product_brand_id not in", values, "tbProductBrandId");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("tb_product_brand_id between", value1, value2, "tbProductBrandId");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tb_product_brand_id not between", value1, value2, "tbProductBrandId");
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