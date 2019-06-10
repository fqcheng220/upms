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

        public Criteria andSpuidIsNull() {
            addCriterion("spuId is null");
            return (Criteria) this;
        }

        public Criteria andSpuidIsNotNull() {
            addCriterion("spuId is not null");
            return (Criteria) this;
        }

        public Criteria andSpuidEqualTo(Long value) {
            addCriterion("spuId =", value, "spuid");
            return (Criteria) this;
        }

        public Criteria andSpuidNotEqualTo(Long value) {
            addCriterion("spuId <>", value, "spuid");
            return (Criteria) this;
        }

        public Criteria andSpuidGreaterThan(Long value) {
            addCriterion("spuId >", value, "spuid");
            return (Criteria) this;
        }

        public Criteria andSpuidGreaterThanOrEqualTo(Long value) {
            addCriterion("spuId >=", value, "spuid");
            return (Criteria) this;
        }

        public Criteria andSpuidLessThan(Long value) {
            addCriterion("spuId <", value, "spuid");
            return (Criteria) this;
        }

        public Criteria andSpuidLessThanOrEqualTo(Long value) {
            addCriterion("spuId <=", value, "spuid");
            return (Criteria) this;
        }

        public Criteria andSpuidIn(List<Long> values) {
            addCriterion("spuId in", values, "spuid");
            return (Criteria) this;
        }

        public Criteria andSpuidNotIn(List<Long> values) {
            addCriterion("spuId not in", values, "spuid");
            return (Criteria) this;
        }

        public Criteria andSpuidBetween(Long value1, Long value2) {
            addCriterion("spuId between", value1, value2, "spuid");
            return (Criteria) this;
        }

        public Criteria andSpuidNotBetween(Long value1, Long value2) {
            addCriterion("spuId not between", value1, value2, "spuid");
            return (Criteria) this;
        }

        public Criteria andSpunumberIsNull() {
            addCriterion("spuNumber is null");
            return (Criteria) this;
        }

        public Criteria andSpunumberIsNotNull() {
            addCriterion("spuNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSpunumberEqualTo(Long value) {
            addCriterion("spuNumber =", value, "spunumber");
            return (Criteria) this;
        }

        public Criteria andSpunumberNotEqualTo(Long value) {
            addCriterion("spuNumber <>", value, "spunumber");
            return (Criteria) this;
        }

        public Criteria andSpunumberGreaterThan(Long value) {
            addCriterion("spuNumber >", value, "spunumber");
            return (Criteria) this;
        }

        public Criteria andSpunumberGreaterThanOrEqualTo(Long value) {
            addCriterion("spuNumber >=", value, "spunumber");
            return (Criteria) this;
        }

        public Criteria andSpunumberLessThan(Long value) {
            addCriterion("spuNumber <", value, "spunumber");
            return (Criteria) this;
        }

        public Criteria andSpunumberLessThanOrEqualTo(Long value) {
            addCriterion("spuNumber <=", value, "spunumber");
            return (Criteria) this;
        }

        public Criteria andSpunumberIn(List<Long> values) {
            addCriterion("spuNumber in", values, "spunumber");
            return (Criteria) this;
        }

        public Criteria andSpunumberNotIn(List<Long> values) {
            addCriterion("spuNumber not in", values, "spunumber");
            return (Criteria) this;
        }

        public Criteria andSpunumberBetween(Long value1, Long value2) {
            addCriterion("spuNumber between", value1, value2, "spunumber");
            return (Criteria) this;
        }

        public Criteria andSpunumberNotBetween(Long value1, Long value2) {
            addCriterion("spuNumber not between", value1, value2, "spunumber");
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

        public Criteria andShowinshelveIsNull() {
            addCriterion("showInShelve is null");
            return (Criteria) this;
        }

        public Criteria andShowinshelveIsNotNull() {
            addCriterion("showInShelve is not null");
            return (Criteria) this;
        }

        public Criteria andShowinshelveEqualTo(Byte value) {
            addCriterion("showInShelve =", value, "showinshelve");
            return (Criteria) this;
        }

        public Criteria andShowinshelveNotEqualTo(Byte value) {
            addCriterion("showInShelve <>", value, "showinshelve");
            return (Criteria) this;
        }

        public Criteria andShowinshelveGreaterThan(Byte value) {
            addCriterion("showInShelve >", value, "showinshelve");
            return (Criteria) this;
        }

        public Criteria andShowinshelveGreaterThanOrEqualTo(Byte value) {
            addCriterion("showInShelve >=", value, "showinshelve");
            return (Criteria) this;
        }

        public Criteria andShowinshelveLessThan(Byte value) {
            addCriterion("showInShelve <", value, "showinshelve");
            return (Criteria) this;
        }

        public Criteria andShowinshelveLessThanOrEqualTo(Byte value) {
            addCriterion("showInShelve <=", value, "showinshelve");
            return (Criteria) this;
        }

        public Criteria andShowinshelveIn(List<Byte> values) {
            addCriterion("showInShelve in", values, "showinshelve");
            return (Criteria) this;
        }

        public Criteria andShowinshelveNotIn(List<Byte> values) {
            addCriterion("showInShelve not in", values, "showinshelve");
            return (Criteria) this;
        }

        public Criteria andShowinshelveBetween(Byte value1, Byte value2) {
            addCriterion("showInShelve between", value1, value2, "showinshelve");
            return (Criteria) this;
        }

        public Criteria andShowinshelveNotBetween(Byte value1, Byte value2) {
            addCriterion("showInShelve not between", value1, value2, "showinshelve");
            return (Criteria) this;
        }

        public Criteria andShelvetimeIsNull() {
            addCriterion("shelveTime is null");
            return (Criteria) this;
        }

        public Criteria andShelvetimeIsNotNull() {
            addCriterion("shelveTime is not null");
            return (Criteria) this;
        }

        public Criteria andShelvetimeEqualTo(Date value) {
            addCriterion("shelveTime =", value, "shelvetime");
            return (Criteria) this;
        }

        public Criteria andShelvetimeNotEqualTo(Date value) {
            addCriterion("shelveTime <>", value, "shelvetime");
            return (Criteria) this;
        }

        public Criteria andShelvetimeGreaterThan(Date value) {
            addCriterion("shelveTime >", value, "shelvetime");
            return (Criteria) this;
        }

        public Criteria andShelvetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shelveTime >=", value, "shelvetime");
            return (Criteria) this;
        }

        public Criteria andShelvetimeLessThan(Date value) {
            addCriterion("shelveTime <", value, "shelvetime");
            return (Criteria) this;
        }

        public Criteria andShelvetimeLessThanOrEqualTo(Date value) {
            addCriterion("shelveTime <=", value, "shelvetime");
            return (Criteria) this;
        }

        public Criteria andShelvetimeIn(List<Date> values) {
            addCriterion("shelveTime in", values, "shelvetime");
            return (Criteria) this;
        }

        public Criteria andShelvetimeNotIn(List<Date> values) {
            addCriterion("shelveTime not in", values, "shelvetime");
            return (Criteria) this;
        }

        public Criteria andShelvetimeBetween(Date value1, Date value2) {
            addCriterion("shelveTime between", value1, value2, "shelvetime");
            return (Criteria) this;
        }

        public Criteria andShelvetimeNotBetween(Date value1, Date value2) {
            addCriterion("shelveTime not between", value1, value2, "shelvetime");
            return (Criteria) this;
        }

        public Criteria andShelvebyIsNull() {
            addCriterion("shelveBy is null");
            return (Criteria) this;
        }

        public Criteria andShelvebyIsNotNull() {
            addCriterion("shelveBy is not null");
            return (Criteria) this;
        }

        public Criteria andShelvebyEqualTo(String value) {
            addCriterion("shelveBy =", value, "shelveby");
            return (Criteria) this;
        }

        public Criteria andShelvebyNotEqualTo(String value) {
            addCriterion("shelveBy <>", value, "shelveby");
            return (Criteria) this;
        }

        public Criteria andShelvebyGreaterThan(String value) {
            addCriterion("shelveBy >", value, "shelveby");
            return (Criteria) this;
        }

        public Criteria andShelvebyGreaterThanOrEqualTo(String value) {
            addCriterion("shelveBy >=", value, "shelveby");
            return (Criteria) this;
        }

        public Criteria andShelvebyLessThan(String value) {
            addCriterion("shelveBy <", value, "shelveby");
            return (Criteria) this;
        }

        public Criteria andShelvebyLessThanOrEqualTo(String value) {
            addCriterion("shelveBy <=", value, "shelveby");
            return (Criteria) this;
        }

        public Criteria andShelvebyLike(String value) {
            addCriterion("shelveBy like", value, "shelveby");
            return (Criteria) this;
        }

        public Criteria andShelvebyNotLike(String value) {
            addCriterion("shelveBy not like", value, "shelveby");
            return (Criteria) this;
        }

        public Criteria andShelvebyIn(List<String> values) {
            addCriterion("shelveBy in", values, "shelveby");
            return (Criteria) this;
        }

        public Criteria andShelvebyNotIn(List<String> values) {
            addCriterion("shelveBy not in", values, "shelveby");
            return (Criteria) this;
        }

        public Criteria andShelvebyBetween(String value1, String value2) {
            addCriterion("shelveBy between", value1, value2, "shelveby");
            return (Criteria) this;
        }

        public Criteria andShelvebyNotBetween(String value1, String value2) {
            addCriterion("shelveBy not between", value1, value2, "shelveby");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNull() {
            addCriterion("updateBy is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNotNull() {
            addCriterion("updateBy is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyEqualTo(String value) {
            addCriterion("updateBy =", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotEqualTo(String value) {
            addCriterion("updateBy <>", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThan(String value) {
            addCriterion("updateBy >", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThanOrEqualTo(String value) {
            addCriterion("updateBy >=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThan(String value) {
            addCriterion("updateBy <", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThanOrEqualTo(String value) {
            addCriterion("updateBy <=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLike(String value) {
            addCriterion("updateBy like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotLike(String value) {
            addCriterion("updateBy not like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIn(List<String> values) {
            addCriterion("updateBy in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotIn(List<String> values) {
            addCriterion("updateBy not in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyBetween(String value1, String value2) {
            addCriterion("updateBy between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotBetween(String value1, String value2) {
            addCriterion("updateBy not between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andShowintopIsNull() {
            addCriterion("showInTop is null");
            return (Criteria) this;
        }

        public Criteria andShowintopIsNotNull() {
            addCriterion("showInTop is not null");
            return (Criteria) this;
        }

        public Criteria andShowintopEqualTo(Byte value) {
            addCriterion("showInTop =", value, "showintop");
            return (Criteria) this;
        }

        public Criteria andShowintopNotEqualTo(Byte value) {
            addCriterion("showInTop <>", value, "showintop");
            return (Criteria) this;
        }

        public Criteria andShowintopGreaterThan(Byte value) {
            addCriterion("showInTop >", value, "showintop");
            return (Criteria) this;
        }

        public Criteria andShowintopGreaterThanOrEqualTo(Byte value) {
            addCriterion("showInTop >=", value, "showintop");
            return (Criteria) this;
        }

        public Criteria andShowintopLessThan(Byte value) {
            addCriterion("showInTop <", value, "showintop");
            return (Criteria) this;
        }

        public Criteria andShowintopLessThanOrEqualTo(Byte value) {
            addCriterion("showInTop <=", value, "showintop");
            return (Criteria) this;
        }

        public Criteria andShowintopIn(List<Byte> values) {
            addCriterion("showInTop in", values, "showintop");
            return (Criteria) this;
        }

        public Criteria andShowintopNotIn(List<Byte> values) {
            addCriterion("showInTop not in", values, "showintop");
            return (Criteria) this;
        }

        public Criteria andShowintopBetween(Byte value1, Byte value2) {
            addCriterion("showInTop between", value1, value2, "showintop");
            return (Criteria) this;
        }

        public Criteria andShowintopNotBetween(Byte value1, Byte value2) {
            addCriterion("showInTop not between", value1, value2, "showintop");
            return (Criteria) this;
        }

        public Criteria andShowiinnavIsNull() {
            addCriterion("showIinNav is null");
            return (Criteria) this;
        }

        public Criteria andShowiinnavIsNotNull() {
            addCriterion("showIinNav is not null");
            return (Criteria) this;
        }

        public Criteria andShowiinnavEqualTo(Byte value) {
            addCriterion("showIinNav =", value, "showiinnav");
            return (Criteria) this;
        }

        public Criteria andShowiinnavNotEqualTo(Byte value) {
            addCriterion("showIinNav <>", value, "showiinnav");
            return (Criteria) this;
        }

        public Criteria andShowiinnavGreaterThan(Byte value) {
            addCriterion("showIinNav >", value, "showiinnav");
            return (Criteria) this;
        }

        public Criteria andShowiinnavGreaterThanOrEqualTo(Byte value) {
            addCriterion("showIinNav >=", value, "showiinnav");
            return (Criteria) this;
        }

        public Criteria andShowiinnavLessThan(Byte value) {
            addCriterion("showIinNav <", value, "showiinnav");
            return (Criteria) this;
        }

        public Criteria andShowiinnavLessThanOrEqualTo(Byte value) {
            addCriterion("showIinNav <=", value, "showiinnav");
            return (Criteria) this;
        }

        public Criteria andShowiinnavIn(List<Byte> values) {
            addCriterion("showIinNav in", values, "showiinnav");
            return (Criteria) this;
        }

        public Criteria andShowiinnavNotIn(List<Byte> values) {
            addCriterion("showIinNav not in", values, "showiinnav");
            return (Criteria) this;
        }

        public Criteria andShowiinnavBetween(Byte value1, Byte value2) {
            addCriterion("showIinNav between", value1, value2, "showiinnav");
            return (Criteria) this;
        }

        public Criteria andShowiinnavNotBetween(Byte value1, Byte value2) {
            addCriterion("showIinNav not between", value1, value2, "showiinnav");
            return (Criteria) this;
        }

        public Criteria andShowinhotIsNull() {
            addCriterion("showInHot is null");
            return (Criteria) this;
        }

        public Criteria andShowinhotIsNotNull() {
            addCriterion("showInHot is not null");
            return (Criteria) this;
        }

        public Criteria andShowinhotEqualTo(Byte value) {
            addCriterion("showInHot =", value, "showinhot");
            return (Criteria) this;
        }

        public Criteria andShowinhotNotEqualTo(Byte value) {
            addCriterion("showInHot <>", value, "showinhot");
            return (Criteria) this;
        }

        public Criteria andShowinhotGreaterThan(Byte value) {
            addCriterion("showInHot >", value, "showinhot");
            return (Criteria) this;
        }

        public Criteria andShowinhotGreaterThanOrEqualTo(Byte value) {
            addCriterion("showInHot >=", value, "showinhot");
            return (Criteria) this;
        }

        public Criteria andShowinhotLessThan(Byte value) {
            addCriterion("showInHot <", value, "showinhot");
            return (Criteria) this;
        }

        public Criteria andShowinhotLessThanOrEqualTo(Byte value) {
            addCriterion("showInHot <=", value, "showinhot");
            return (Criteria) this;
        }

        public Criteria andShowinhotIn(List<Byte> values) {
            addCriterion("showInHot in", values, "showinhot");
            return (Criteria) this;
        }

        public Criteria andShowinhotNotIn(List<Byte> values) {
            addCriterion("showInHot not in", values, "showinhot");
            return (Criteria) this;
        }

        public Criteria andShowinhotBetween(Byte value1, Byte value2) {
            addCriterion("showInHot between", value1, value2, "showinhot");
            return (Criteria) this;
        }

        public Criteria andShowinhotNotBetween(Byte value1, Byte value2) {
            addCriterion("showInHot not between", value1, value2, "showinhot");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("createBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("createBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("createBy =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("createBy <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("createBy >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("createBy >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("createBy <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("createBy <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("createBy like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("createBy not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("createBy in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("createBy not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("createBy between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("createBy not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andVideointroduceIsNull() {
            addCriterion("videoIntroduce is null");
            return (Criteria) this;
        }

        public Criteria andVideointroduceIsNotNull() {
            addCriterion("videoIntroduce is not null");
            return (Criteria) this;
        }

        public Criteria andVideointroduceEqualTo(String value) {
            addCriterion("videoIntroduce =", value, "videointroduce");
            return (Criteria) this;
        }

        public Criteria andVideointroduceNotEqualTo(String value) {
            addCriterion("videoIntroduce <>", value, "videointroduce");
            return (Criteria) this;
        }

        public Criteria andVideointroduceGreaterThan(String value) {
            addCriterion("videoIntroduce >", value, "videointroduce");
            return (Criteria) this;
        }

        public Criteria andVideointroduceGreaterThanOrEqualTo(String value) {
            addCriterion("videoIntroduce >=", value, "videointroduce");
            return (Criteria) this;
        }

        public Criteria andVideointroduceLessThan(String value) {
            addCriterion("videoIntroduce <", value, "videointroduce");
            return (Criteria) this;
        }

        public Criteria andVideointroduceLessThanOrEqualTo(String value) {
            addCriterion("videoIntroduce <=", value, "videointroduce");
            return (Criteria) this;
        }

        public Criteria andVideointroduceLike(String value) {
            addCriterion("videoIntroduce like", value, "videointroduce");
            return (Criteria) this;
        }

        public Criteria andVideointroduceNotLike(String value) {
            addCriterion("videoIntroduce not like", value, "videointroduce");
            return (Criteria) this;
        }

        public Criteria andVideointroduceIn(List<String> values) {
            addCriterion("videoIntroduce in", values, "videointroduce");
            return (Criteria) this;
        }

        public Criteria andVideointroduceNotIn(List<String> values) {
            addCriterion("videoIntroduce not in", values, "videointroduce");
            return (Criteria) this;
        }

        public Criteria andVideointroduceBetween(String value1, String value2) {
            addCriterion("videoIntroduce between", value1, value2, "videointroduce");
            return (Criteria) this;
        }

        public Criteria andVideointroduceNotBetween(String value1, String value2) {
            addCriterion("videoIntroduce not between", value1, value2, "videointroduce");
            return (Criteria) this;
        }

        public Criteria andSearchkeyIsNull() {
            addCriterion("searchKey is null");
            return (Criteria) this;
        }

        public Criteria andSearchkeyIsNotNull() {
            addCriterion("searchKey is not null");
            return (Criteria) this;
        }

        public Criteria andSearchkeyEqualTo(String value) {
            addCriterion("searchKey =", value, "searchkey");
            return (Criteria) this;
        }

        public Criteria andSearchkeyNotEqualTo(String value) {
            addCriterion("searchKey <>", value, "searchkey");
            return (Criteria) this;
        }

        public Criteria andSearchkeyGreaterThan(String value) {
            addCriterion("searchKey >", value, "searchkey");
            return (Criteria) this;
        }

        public Criteria andSearchkeyGreaterThanOrEqualTo(String value) {
            addCriterion("searchKey >=", value, "searchkey");
            return (Criteria) this;
        }

        public Criteria andSearchkeyLessThan(String value) {
            addCriterion("searchKey <", value, "searchkey");
            return (Criteria) this;
        }

        public Criteria andSearchkeyLessThanOrEqualTo(String value) {
            addCriterion("searchKey <=", value, "searchkey");
            return (Criteria) this;
        }

        public Criteria andSearchkeyLike(String value) {
            addCriterion("searchKey like", value, "searchkey");
            return (Criteria) this;
        }

        public Criteria andSearchkeyNotLike(String value) {
            addCriterion("searchKey not like", value, "searchkey");
            return (Criteria) this;
        }

        public Criteria andSearchkeyIn(List<String> values) {
            addCriterion("searchKey in", values, "searchkey");
            return (Criteria) this;
        }

        public Criteria andSearchkeyNotIn(List<String> values) {
            addCriterion("searchKey not in", values, "searchkey");
            return (Criteria) this;
        }

        public Criteria andSearchkeyBetween(String value1, String value2) {
            addCriterion("searchKey between", value1, value2, "searchkey");
            return (Criteria) this;
        }

        public Criteria andSearchkeyNotBetween(String value1, String value2) {
            addCriterion("searchKey not between", value1, value2, "searchkey");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryCategoryidIsNull() {
            addCriterion("tb_product_category_categoryId is null");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryCategoryidIsNotNull() {
            addCriterion("tb_product_category_categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryCategoryidEqualTo(Long value) {
            addCriterion("tb_product_category_categoryId =", value, "tbProductCategoryCategoryid");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryCategoryidNotEqualTo(Long value) {
            addCriterion("tb_product_category_categoryId <>", value, "tbProductCategoryCategoryid");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryCategoryidGreaterThan(Long value) {
            addCriterion("tb_product_category_categoryId >", value, "tbProductCategoryCategoryid");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryCategoryidGreaterThanOrEqualTo(Long value) {
            addCriterion("tb_product_category_categoryId >=", value, "tbProductCategoryCategoryid");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryCategoryidLessThan(Long value) {
            addCriterion("tb_product_category_categoryId <", value, "tbProductCategoryCategoryid");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryCategoryidLessThanOrEqualTo(Long value) {
            addCriterion("tb_product_category_categoryId <=", value, "tbProductCategoryCategoryid");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryCategoryidIn(List<Long> values) {
            addCriterion("tb_product_category_categoryId in", values, "tbProductCategoryCategoryid");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryCategoryidNotIn(List<Long> values) {
            addCriterion("tb_product_category_categoryId not in", values, "tbProductCategoryCategoryid");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryCategoryidBetween(Long value1, Long value2) {
            addCriterion("tb_product_category_categoryId between", value1, value2, "tbProductCategoryCategoryid");
            return (Criteria) this;
        }

        public Criteria andTbProductCategoryCategoryidNotBetween(Long value1, Long value2) {
            addCriterion("tb_product_category_categoryId not between", value1, value2, "tbProductCategoryCategoryid");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandBrandidIsNull() {
            addCriterion("tb_product_brand_brandId is null");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandBrandidIsNotNull() {
            addCriterion("tb_product_brand_brandId is not null");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandBrandidEqualTo(Integer value) {
            addCriterion("tb_product_brand_brandId =", value, "tbProductBrandBrandid");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandBrandidNotEqualTo(Integer value) {
            addCriterion("tb_product_brand_brandId <>", value, "tbProductBrandBrandid");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandBrandidGreaterThan(Integer value) {
            addCriterion("tb_product_brand_brandId >", value, "tbProductBrandBrandid");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandBrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tb_product_brand_brandId >=", value, "tbProductBrandBrandid");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandBrandidLessThan(Integer value) {
            addCriterion("tb_product_brand_brandId <", value, "tbProductBrandBrandid");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandBrandidLessThanOrEqualTo(Integer value) {
            addCriterion("tb_product_brand_brandId <=", value, "tbProductBrandBrandid");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandBrandidIn(List<Integer> values) {
            addCriterion("tb_product_brand_brandId in", values, "tbProductBrandBrandid");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandBrandidNotIn(List<Integer> values) {
            addCriterion("tb_product_brand_brandId not in", values, "tbProductBrandBrandid");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandBrandidBetween(Integer value1, Integer value2) {
            addCriterion("tb_product_brand_brandId between", value1, value2, "tbProductBrandBrandid");
            return (Criteria) this;
        }

        public Criteria andTbProductBrandBrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("tb_product_brand_brandId not between", value1, value2, "tbProductBrandBrandid");
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