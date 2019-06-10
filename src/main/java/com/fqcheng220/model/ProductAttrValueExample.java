package com.fqcheng220.model;

import java.util.ArrayList;
import java.util.List;

public class ProductAttrValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductAttrValueExample() {
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

        public Criteria andAttrvalueidIsNull() {
            addCriterion("attrValueId is null");
            return (Criteria) this;
        }

        public Criteria andAttrvalueidIsNotNull() {
            addCriterion("attrValueId is not null");
            return (Criteria) this;
        }

        public Criteria andAttrvalueidEqualTo(Integer value) {
            addCriterion("attrValueId =", value, "attrvalueid");
            return (Criteria) this;
        }

        public Criteria andAttrvalueidNotEqualTo(Integer value) {
            addCriterion("attrValueId <>", value, "attrvalueid");
            return (Criteria) this;
        }

        public Criteria andAttrvalueidGreaterThan(Integer value) {
            addCriterion("attrValueId >", value, "attrvalueid");
            return (Criteria) this;
        }

        public Criteria andAttrvalueidGreaterThanOrEqualTo(Integer value) {
            addCriterion("attrValueId >=", value, "attrvalueid");
            return (Criteria) this;
        }

        public Criteria andAttrvalueidLessThan(Integer value) {
            addCriterion("attrValueId <", value, "attrvalueid");
            return (Criteria) this;
        }

        public Criteria andAttrvalueidLessThanOrEqualTo(Integer value) {
            addCriterion("attrValueId <=", value, "attrvalueid");
            return (Criteria) this;
        }

        public Criteria andAttrvalueidIn(List<Integer> values) {
            addCriterion("attrValueId in", values, "attrvalueid");
            return (Criteria) this;
        }

        public Criteria andAttrvalueidNotIn(List<Integer> values) {
            addCriterion("attrValueId not in", values, "attrvalueid");
            return (Criteria) this;
        }

        public Criteria andAttrvalueidBetween(Integer value1, Integer value2) {
            addCriterion("attrValueId between", value1, value2, "attrvalueid");
            return (Criteria) this;
        }

        public Criteria andAttrvalueidNotBetween(Integer value1, Integer value2) {
            addCriterion("attrValueId not between", value1, value2, "attrvalueid");
            return (Criteria) this;
        }

        public Criteria andAttrvalueIsNull() {
            addCriterion("attrValue is null");
            return (Criteria) this;
        }

        public Criteria andAttrvalueIsNotNull() {
            addCriterion("attrValue is not null");
            return (Criteria) this;
        }

        public Criteria andAttrvalueEqualTo(String value) {
            addCriterion("attrValue =", value, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueNotEqualTo(String value) {
            addCriterion("attrValue <>", value, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueGreaterThan(String value) {
            addCriterion("attrValue >", value, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueGreaterThanOrEqualTo(String value) {
            addCriterion("attrValue >=", value, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueLessThan(String value) {
            addCriterion("attrValue <", value, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueLessThanOrEqualTo(String value) {
            addCriterion("attrValue <=", value, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueLike(String value) {
            addCriterion("attrValue like", value, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueNotLike(String value) {
            addCriterion("attrValue not like", value, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueIn(List<String> values) {
            addCriterion("attrValue in", values, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueNotIn(List<String> values) {
            addCriterion("attrValue not in", values, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueBetween(String value1, String value2) {
            addCriterion("attrValue between", value1, value2, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueNotBetween(String value1, String value2) {
            addCriterion("attrValue not between", value1, value2, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrAttridIsNull() {
            addCriterion("tb_product_attr_attrId is null");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrAttridIsNotNull() {
            addCriterion("tb_product_attr_attrId is not null");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrAttridEqualTo(Integer value) {
            addCriterion("tb_product_attr_attrId =", value, "tbProductAttrAttrid");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrAttridNotEqualTo(Integer value) {
            addCriterion("tb_product_attr_attrId <>", value, "tbProductAttrAttrid");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrAttridGreaterThan(Integer value) {
            addCriterion("tb_product_attr_attrId >", value, "tbProductAttrAttrid");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrAttridGreaterThanOrEqualTo(Integer value) {
            addCriterion("tb_product_attr_attrId >=", value, "tbProductAttrAttrid");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrAttridLessThan(Integer value) {
            addCriterion("tb_product_attr_attrId <", value, "tbProductAttrAttrid");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrAttridLessThanOrEqualTo(Integer value) {
            addCriterion("tb_product_attr_attrId <=", value, "tbProductAttrAttrid");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrAttridIn(List<Integer> values) {
            addCriterion("tb_product_attr_attrId in", values, "tbProductAttrAttrid");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrAttridNotIn(List<Integer> values) {
            addCriterion("tb_product_attr_attrId not in", values, "tbProductAttrAttrid");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrAttridBetween(Integer value1, Integer value2) {
            addCriterion("tb_product_attr_attrId between", value1, value2, "tbProductAttrAttrid");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrAttridNotBetween(Integer value1, Integer value2) {
            addCriterion("tb_product_attr_attrId not between", value1, value2, "tbProductAttrAttrid");
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