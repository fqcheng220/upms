package com.fqcheng220.model;

import java.util.ArrayList;
import java.util.List;

public class ProductSpecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductSpecExample() {
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

        public Criteria andSpecidIsNull() {
            addCriterion("specId is null");
            return (Criteria) this;
        }

        public Criteria andSpecidIsNotNull() {
            addCriterion("specId is not null");
            return (Criteria) this;
        }

        public Criteria andSpecidEqualTo(Integer value) {
            addCriterion("specId =", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidNotEqualTo(Integer value) {
            addCriterion("specId <>", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidGreaterThan(Integer value) {
            addCriterion("specId >", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidGreaterThanOrEqualTo(Integer value) {
            addCriterion("specId >=", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidLessThan(Integer value) {
            addCriterion("specId <", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidLessThanOrEqualTo(Integer value) {
            addCriterion("specId <=", value, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidIn(List<Integer> values) {
            addCriterion("specId in", values, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidNotIn(List<Integer> values) {
            addCriterion("specId not in", values, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidBetween(Integer value1, Integer value2) {
            addCriterion("specId between", value1, value2, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecidNotBetween(Integer value1, Integer value2) {
            addCriterion("specId not between", value1, value2, "specid");
            return (Criteria) this;
        }

        public Criteria andSpecnameIsNull() {
            addCriterion("specName is null");
            return (Criteria) this;
        }

        public Criteria andSpecnameIsNotNull() {
            addCriterion("specName is not null");
            return (Criteria) this;
        }

        public Criteria andSpecnameEqualTo(String value) {
            addCriterion("specName =", value, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameNotEqualTo(String value) {
            addCriterion("specName <>", value, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameGreaterThan(String value) {
            addCriterion("specName >", value, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameGreaterThanOrEqualTo(String value) {
            addCriterion("specName >=", value, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameLessThan(String value) {
            addCriterion("specName <", value, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameLessThanOrEqualTo(String value) {
            addCriterion("specName <=", value, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameLike(String value) {
            addCriterion("specName like", value, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameNotLike(String value) {
            addCriterion("specName not like", value, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameIn(List<String> values) {
            addCriterion("specName in", values, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameNotIn(List<String> values) {
            addCriterion("specName not in", values, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameBetween(String value1, String value2) {
            addCriterion("specName between", value1, value2, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameNotBetween(String value1, String value2) {
            addCriterion("specName not between", value1, value2, "specname");
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