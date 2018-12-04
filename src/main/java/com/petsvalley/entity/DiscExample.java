package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.List;

public class DiscExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DiscExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andDiscIdIsNull() {
            addCriterion("disc_id is null");
            return (Criteria) this;
        }

        public Criteria andDiscIdIsNotNull() {
            addCriterion("disc_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiscIdEqualTo(Integer value) {
            addCriterion("disc_id =", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdNotEqualTo(Integer value) {
            addCriterion("disc_id <>", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdGreaterThan(Integer value) {
            addCriterion("disc_id >", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("disc_id >=", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdLessThan(Integer value) {
            addCriterion("disc_id <", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdLessThanOrEqualTo(Integer value) {
            addCriterion("disc_id <=", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdIn(List<Integer> values) {
            addCriterion("disc_id in", values, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdNotIn(List<Integer> values) {
            addCriterion("disc_id not in", values, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdBetween(Integer value1, Integer value2) {
            addCriterion("disc_id between", value1, value2, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdNotBetween(Integer value1, Integer value2) {
            addCriterion("disc_id not between", value1, value2, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscNameIsNull() {
            addCriterion("disc_name is null");
            return (Criteria) this;
        }

        public Criteria andDiscNameIsNotNull() {
            addCriterion("disc_name is not null");
            return (Criteria) this;
        }

        public Criteria andDiscNameEqualTo(String value) {
            addCriterion("disc_name =", value, "discName");
            return (Criteria) this;
        }

        public Criteria andDiscNameNotEqualTo(String value) {
            addCriterion("disc_name <>", value, "discName");
            return (Criteria) this;
        }

        public Criteria andDiscNameGreaterThan(String value) {
            addCriterion("disc_name >", value, "discName");
            return (Criteria) this;
        }

        public Criteria andDiscNameGreaterThanOrEqualTo(String value) {
            addCriterion("disc_name >=", value, "discName");
            return (Criteria) this;
        }

        public Criteria andDiscNameLessThan(String value) {
            addCriterion("disc_name <", value, "discName");
            return (Criteria) this;
        }

        public Criteria andDiscNameLessThanOrEqualTo(String value) {
            addCriterion("disc_name <=", value, "discName");
            return (Criteria) this;
        }

        public Criteria andDiscNameLike(String value) {
            addCriterion("disc_name like", value, "discName");
            return (Criteria) this;
        }

        public Criteria andDiscNameNotLike(String value) {
            addCriterion("disc_name not like", value, "discName");
            return (Criteria) this;
        }

        public Criteria andDiscNameIn(List<String> values) {
            addCriterion("disc_name in", values, "discName");
            return (Criteria) this;
        }

        public Criteria andDiscNameNotIn(List<String> values) {
            addCriterion("disc_name not in", values, "discName");
            return (Criteria) this;
        }

        public Criteria andDiscNameBetween(String value1, String value2) {
            addCriterion("disc_name between", value1, value2, "discName");
            return (Criteria) this;
        }

        public Criteria andDiscNameNotBetween(String value1, String value2) {
            addCriterion("disc_name not between", value1, value2, "discName");
            return (Criteria) this;
        }

        public Criteria andDiscStateIsNull() {
            addCriterion("disc_state is null");
            return (Criteria) this;
        }

        public Criteria andDiscStateIsNotNull() {
            addCriterion("disc_state is not null");
            return (Criteria) this;
        }

        public Criteria andDiscStateEqualTo(Integer value) {
            addCriterion("disc_state =", value, "discState");
            return (Criteria) this;
        }

        public Criteria andDiscStateNotEqualTo(Integer value) {
            addCriterion("disc_state <>", value, "discState");
            return (Criteria) this;
        }

        public Criteria andDiscStateGreaterThan(Integer value) {
            addCriterion("disc_state >", value, "discState");
            return (Criteria) this;
        }

        public Criteria andDiscStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("disc_state >=", value, "discState");
            return (Criteria) this;
        }

        public Criteria andDiscStateLessThan(Integer value) {
            addCriterion("disc_state <", value, "discState");
            return (Criteria) this;
        }

        public Criteria andDiscStateLessThanOrEqualTo(Integer value) {
            addCriterion("disc_state <=", value, "discState");
            return (Criteria) this;
        }

        public Criteria andDiscStateIn(List<Integer> values) {
            addCriterion("disc_state in", values, "discState");
            return (Criteria) this;
        }

        public Criteria andDiscStateNotIn(List<Integer> values) {
            addCriterion("disc_state not in", values, "discState");
            return (Criteria) this;
        }

        public Criteria andDiscStateBetween(Integer value1, Integer value2) {
            addCriterion("disc_state between", value1, value2, "discState");
            return (Criteria) this;
        }

        public Criteria andDiscStateNotBetween(Integer value1, Integer value2) {
            addCriterion("disc_state not between", value1, value2, "discState");
            return (Criteria) this;
        }

        public Criteria andDiscSpareIsNull() {
            addCriterion("disc_spare is null");
            return (Criteria) this;
        }

        public Criteria andDiscSpareIsNotNull() {
            addCriterion("disc_spare is not null");
            return (Criteria) this;
        }

        public Criteria andDiscSpareEqualTo(String value) {
            addCriterion("disc_spare =", value, "discSpare");
            return (Criteria) this;
        }

        public Criteria andDiscSpareNotEqualTo(String value) {
            addCriterion("disc_spare <>", value, "discSpare");
            return (Criteria) this;
        }

        public Criteria andDiscSpareGreaterThan(String value) {
            addCriterion("disc_spare >", value, "discSpare");
            return (Criteria) this;
        }

        public Criteria andDiscSpareGreaterThanOrEqualTo(String value) {
            addCriterion("disc_spare >=", value, "discSpare");
            return (Criteria) this;
        }

        public Criteria andDiscSpareLessThan(String value) {
            addCriterion("disc_spare <", value, "discSpare");
            return (Criteria) this;
        }

        public Criteria andDiscSpareLessThanOrEqualTo(String value) {
            addCriterion("disc_spare <=", value, "discSpare");
            return (Criteria) this;
        }

        public Criteria andDiscSpareLike(String value) {
            addCriterion("disc_spare like", value, "discSpare");
            return (Criteria) this;
        }

        public Criteria andDiscSpareNotLike(String value) {
            addCriterion("disc_spare not like", value, "discSpare");
            return (Criteria) this;
        }

        public Criteria andDiscSpareIn(List<String> values) {
            addCriterion("disc_spare in", values, "discSpare");
            return (Criteria) this;
        }

        public Criteria andDiscSpareNotIn(List<String> values) {
            addCriterion("disc_spare not in", values, "discSpare");
            return (Criteria) this;
        }

        public Criteria andDiscSpareBetween(String value1, String value2) {
            addCriterion("disc_spare between", value1, value2, "discSpare");
            return (Criteria) this;
        }

        public Criteria andDiscSpareNotBetween(String value1, String value2) {
            addCriterion("disc_spare not between", value1, value2, "discSpare");
            return (Criteria) this;
        }
    }

    /**
     */
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