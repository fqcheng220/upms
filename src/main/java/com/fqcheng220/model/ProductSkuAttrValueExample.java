package com.fqcheng220.model;

import java.util.ArrayList;
import java.util.List;

public class ProductSkuAttrValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductSkuAttrValueExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrIdIsNull() {
            addCriterion("tb_product_attr_id is null");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrIdIsNotNull() {
            addCriterion("tb_product_attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrIdEqualTo(Integer value) {
            addCriterion("tb_product_attr_id =", value, "tbProductAttrId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrIdNotEqualTo(Integer value) {
            addCriterion("tb_product_attr_id <>", value, "tbProductAttrId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrIdGreaterThan(Integer value) {
            addCriterion("tb_product_attr_id >", value, "tbProductAttrId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tb_product_attr_id >=", value, "tbProductAttrId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrIdLessThan(Integer value) {
            addCriterion("tb_product_attr_id <", value, "tbProductAttrId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrIdLessThanOrEqualTo(Integer value) {
            addCriterion("tb_product_attr_id <=", value, "tbProductAttrId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrIdIn(List<Integer> values) {
            addCriterion("tb_product_attr_id in", values, "tbProductAttrId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrIdNotIn(List<Integer> values) {
            addCriterion("tb_product_attr_id not in", values, "tbProductAttrId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrIdBetween(Integer value1, Integer value2) {
            addCriterion("tb_product_attr_id between", value1, value2, "tbProductAttrId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tb_product_attr_id not between", value1, value2, "tbProductAttrId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrValueIdIsNull() {
            addCriterion("tb_product_attr_value_id is null");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrValueIdIsNotNull() {
            addCriterion("tb_product_attr_value_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrValueIdEqualTo(Integer value) {
            addCriterion("tb_product_attr_value_id =", value, "tbProductAttrValueId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrValueIdNotEqualTo(Integer value) {
            addCriterion("tb_product_attr_value_id <>", value, "tbProductAttrValueId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrValueIdGreaterThan(Integer value) {
            addCriterion("tb_product_attr_value_id >", value, "tbProductAttrValueId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrValueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tb_product_attr_value_id >=", value, "tbProductAttrValueId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrValueIdLessThan(Integer value) {
            addCriterion("tb_product_attr_value_id <", value, "tbProductAttrValueId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrValueIdLessThanOrEqualTo(Integer value) {
            addCriterion("tb_product_attr_value_id <=", value, "tbProductAttrValueId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrValueIdIn(List<Integer> values) {
            addCriterion("tb_product_attr_value_id in", values, "tbProductAttrValueId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrValueIdNotIn(List<Integer> values) {
            addCriterion("tb_product_attr_value_id not in", values, "tbProductAttrValueId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrValueIdBetween(Integer value1, Integer value2) {
            addCriterion("tb_product_attr_value_id between", value1, value2, "tbProductAttrValueId");
            return (Criteria) this;
        }

        public Criteria andTbProductAttrValueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tb_product_attr_value_id not between", value1, value2, "tbProductAttrValueId");
            return (Criteria) this;
        }

        public Criteria andTbProductSkuIdIsNull() {
            addCriterion("tb_product_sku_id is null");
            return (Criteria) this;
        }

        public Criteria andTbProductSkuIdIsNotNull() {
            addCriterion("tb_product_sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbProductSkuIdEqualTo(Long value) {
            addCriterion("tb_product_sku_id =", value, "tbProductSkuId");
            return (Criteria) this;
        }

        public Criteria andTbProductSkuIdNotEqualTo(Long value) {
            addCriterion("tb_product_sku_id <>", value, "tbProductSkuId");
            return (Criteria) this;
        }

        public Criteria andTbProductSkuIdGreaterThan(Long value) {
            addCriterion("tb_product_sku_id >", value, "tbProductSkuId");
            return (Criteria) this;
        }

        public Criteria andTbProductSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tb_product_sku_id >=", value, "tbProductSkuId");
            return (Criteria) this;
        }

        public Criteria andTbProductSkuIdLessThan(Long value) {
            addCriterion("tb_product_sku_id <", value, "tbProductSkuId");
            return (Criteria) this;
        }

        public Criteria andTbProductSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("tb_product_sku_id <=", value, "tbProductSkuId");
            return (Criteria) this;
        }

        public Criteria andTbProductSkuIdIn(List<Long> values) {
            addCriterion("tb_product_sku_id in", values, "tbProductSkuId");
            return (Criteria) this;
        }

        public Criteria andTbProductSkuIdNotIn(List<Long> values) {
            addCriterion("tb_product_sku_id not in", values, "tbProductSkuId");
            return (Criteria) this;
        }

        public Criteria andTbProductSkuIdBetween(Long value1, Long value2) {
            addCriterion("tb_product_sku_id between", value1, value2, "tbProductSkuId");
            return (Criteria) this;
        }

        public Criteria andTbProductSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("tb_product_sku_id not between", value1, value2, "tbProductSkuId");
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