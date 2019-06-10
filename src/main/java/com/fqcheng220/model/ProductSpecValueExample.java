package com.fqcheng220.model;

import java.util.ArrayList;
import java.util.List;

public class ProductSpecValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductSpecValueExample() {
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

        public Criteria andSpecvalueidIsNull() {
            addCriterion("specValueId is null");
            return (Criteria) this;
        }

        public Criteria andSpecvalueidIsNotNull() {
            addCriterion("specValueId is not null");
            return (Criteria) this;
        }

        public Criteria andSpecvalueidEqualTo(Integer value) {
            addCriterion("specValueId =", value, "specvalueid");
            return (Criteria) this;
        }

        public Criteria andSpecvalueidNotEqualTo(Integer value) {
            addCriterion("specValueId <>", value, "specvalueid");
            return (Criteria) this;
        }

        public Criteria andSpecvalueidGreaterThan(Integer value) {
            addCriterion("specValueId >", value, "specvalueid");
            return (Criteria) this;
        }

        public Criteria andSpecvalueidGreaterThanOrEqualTo(Integer value) {
            addCriterion("specValueId >=", value, "specvalueid");
            return (Criteria) this;
        }

        public Criteria andSpecvalueidLessThan(Integer value) {
            addCriterion("specValueId <", value, "specvalueid");
            return (Criteria) this;
        }

        public Criteria andSpecvalueidLessThanOrEqualTo(Integer value) {
            addCriterion("specValueId <=", value, "specvalueid");
            return (Criteria) this;
        }

        public Criteria andSpecvalueidIn(List<Integer> values) {
            addCriterion("specValueId in", values, "specvalueid");
            return (Criteria) this;
        }

        public Criteria andSpecvalueidNotIn(List<Integer> values) {
            addCriterion("specValueId not in", values, "specvalueid");
            return (Criteria) this;
        }

        public Criteria andSpecvalueidBetween(Integer value1, Integer value2) {
            addCriterion("specValueId between", value1, value2, "specvalueid");
            return (Criteria) this;
        }

        public Criteria andSpecvalueidNotBetween(Integer value1, Integer value2) {
            addCriterion("specValueId not between", value1, value2, "specvalueid");
            return (Criteria) this;
        }

        public Criteria andSpecvalueIsNull() {
            addCriterion("specValue is null");
            return (Criteria) this;
        }

        public Criteria andSpecvalueIsNotNull() {
            addCriterion("specValue is not null");
            return (Criteria) this;
        }

        public Criteria andSpecvalueEqualTo(String value) {
            addCriterion("specValue =", value, "specvalue");
            return (Criteria) this;
        }

        public Criteria andSpecvalueNotEqualTo(String value) {
            addCriterion("specValue <>", value, "specvalue");
            return (Criteria) this;
        }

        public Criteria andSpecvalueGreaterThan(String value) {
            addCriterion("specValue >", value, "specvalue");
            return (Criteria) this;
        }

        public Criteria andSpecvalueGreaterThanOrEqualTo(String value) {
            addCriterion("specValue >=", value, "specvalue");
            return (Criteria) this;
        }

        public Criteria andSpecvalueLessThan(String value) {
            addCriterion("specValue <", value, "specvalue");
            return (Criteria) this;
        }

        public Criteria andSpecvalueLessThanOrEqualTo(String value) {
            addCriterion("specValue <=", value, "specvalue");
            return (Criteria) this;
        }

        public Criteria andSpecvalueLike(String value) {
            addCriterion("specValue like", value, "specvalue");
            return (Criteria) this;
        }

        public Criteria andSpecvalueNotLike(String value) {
            addCriterion("specValue not like", value, "specvalue");
            return (Criteria) this;
        }

        public Criteria andSpecvalueIn(List<String> values) {
            addCriterion("specValue in", values, "specvalue");
            return (Criteria) this;
        }

        public Criteria andSpecvalueNotIn(List<String> values) {
            addCriterion("specValue not in", values, "specvalue");
            return (Criteria) this;
        }

        public Criteria andSpecvalueBetween(String value1, String value2) {
            addCriterion("specValue between", value1, value2, "specvalue");
            return (Criteria) this;
        }

        public Criteria andSpecvalueNotBetween(String value1, String value2) {
            addCriterion("specValue not between", value1, value2, "specvalue");
            return (Criteria) this;
        }

        public Criteria andTbProductSpecSpecidIsNull() {
            addCriterion("tb_product_spec_specId is null");
            return (Criteria) this;
        }

        public Criteria andTbProductSpecSpecidIsNotNull() {
            addCriterion("tb_product_spec_specId is not null");
            return (Criteria) this;
        }

        public Criteria andTbProductSpecSpecidEqualTo(Integer value) {
            addCriterion("tb_product_spec_specId =", value, "tbProductSpecSpecid");
            return (Criteria) this;
        }

        public Criteria andTbProductSpecSpecidNotEqualTo(Integer value) {
            addCriterion("tb_product_spec_specId <>", value, "tbProductSpecSpecid");
            return (Criteria) this;
        }

        public Criteria andTbProductSpecSpecidGreaterThan(Integer value) {
            addCriterion("tb_product_spec_specId >", value, "tbProductSpecSpecid");
            return (Criteria) this;
        }

        public Criteria andTbProductSpecSpecidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tb_product_spec_specId >=", value, "tbProductSpecSpecid");
            return (Criteria) this;
        }

        public Criteria andTbProductSpecSpecidLessThan(Integer value) {
            addCriterion("tb_product_spec_specId <", value, "tbProductSpecSpecid");
            return (Criteria) this;
        }

        public Criteria andTbProductSpecSpecidLessThanOrEqualTo(Integer value) {
            addCriterion("tb_product_spec_specId <=", value, "tbProductSpecSpecid");
            return (Criteria) this;
        }

        public Criteria andTbProductSpecSpecidIn(List<Integer> values) {
            addCriterion("tb_product_spec_specId in", values, "tbProductSpecSpecid");
            return (Criteria) this;
        }

        public Criteria andTbProductSpecSpecidNotIn(List<Integer> values) {
            addCriterion("tb_product_spec_specId not in", values, "tbProductSpecSpecid");
            return (Criteria) this;
        }

        public Criteria andTbProductSpecSpecidBetween(Integer value1, Integer value2) {
            addCriterion("tb_product_spec_specId between", value1, value2, "tbProductSpecSpecid");
            return (Criteria) this;
        }

        public Criteria andTbProductSpecSpecidNotBetween(Integer value1, Integer value2) {
            addCriterion("tb_product_spec_specId not between", value1, value2, "tbProductSpecSpecid");
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