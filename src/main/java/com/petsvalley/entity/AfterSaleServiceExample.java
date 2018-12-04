package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.List;

public class AfterSaleServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AfterSaleServiceExample() {
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

        public Criteria andAssIdIsNull() {
            addCriterion("ass_id is null");
            return (Criteria) this;
        }

        public Criteria andAssIdIsNotNull() {
            addCriterion("ass_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssIdEqualTo(Integer value) {
            addCriterion("ass_id =", value, "assId");
            return (Criteria) this;
        }

        public Criteria andAssIdNotEqualTo(Integer value) {
            addCriterion("ass_id <>", value, "assId");
            return (Criteria) this;
        }

        public Criteria andAssIdGreaterThan(Integer value) {
            addCriterion("ass_id >", value, "assId");
            return (Criteria) this;
        }

        public Criteria andAssIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ass_id >=", value, "assId");
            return (Criteria) this;
        }

        public Criteria andAssIdLessThan(Integer value) {
            addCriterion("ass_id <", value, "assId");
            return (Criteria) this;
        }

        public Criteria andAssIdLessThanOrEqualTo(Integer value) {
            addCriterion("ass_id <=", value, "assId");
            return (Criteria) this;
        }

        public Criteria andAssIdIn(List<Integer> values) {
            addCriterion("ass_id in", values, "assId");
            return (Criteria) this;
        }

        public Criteria andAssIdNotIn(List<Integer> values) {
            addCriterion("ass_id not in", values, "assId");
            return (Criteria) this;
        }

        public Criteria andAssIdBetween(Integer value1, Integer value2) {
            addCriterion("ass_id between", value1, value2, "assId");
            return (Criteria) this;
        }

        public Criteria andAssIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ass_id not between", value1, value2, "assId");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Integer value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Integer value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Integer value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Integer value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Integer> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Integer> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andAssDetailsIsNull() {
            addCriterion("ass_details is null");
            return (Criteria) this;
        }

        public Criteria andAssDetailsIsNotNull() {
            addCriterion("ass_details is not null");
            return (Criteria) this;
        }

        public Criteria andAssDetailsEqualTo(String value) {
            addCriterion("ass_details =", value, "assDetails");
            return (Criteria) this;
        }

        public Criteria andAssDetailsNotEqualTo(String value) {
            addCriterion("ass_details <>", value, "assDetails");
            return (Criteria) this;
        }

        public Criteria andAssDetailsGreaterThan(String value) {
            addCriterion("ass_details >", value, "assDetails");
            return (Criteria) this;
        }

        public Criteria andAssDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("ass_details >=", value, "assDetails");
            return (Criteria) this;
        }

        public Criteria andAssDetailsLessThan(String value) {
            addCriterion("ass_details <", value, "assDetails");
            return (Criteria) this;
        }

        public Criteria andAssDetailsLessThanOrEqualTo(String value) {
            addCriterion("ass_details <=", value, "assDetails");
            return (Criteria) this;
        }

        public Criteria andAssDetailsLike(String value) {
            addCriterion("ass_details like", value, "assDetails");
            return (Criteria) this;
        }

        public Criteria andAssDetailsNotLike(String value) {
            addCriterion("ass_details not like", value, "assDetails");
            return (Criteria) this;
        }

        public Criteria andAssDetailsIn(List<String> values) {
            addCriterion("ass_details in", values, "assDetails");
            return (Criteria) this;
        }

        public Criteria andAssDetailsNotIn(List<String> values) {
            addCriterion("ass_details not in", values, "assDetails");
            return (Criteria) this;
        }

        public Criteria andAssDetailsBetween(String value1, String value2) {
            addCriterion("ass_details between", value1, value2, "assDetails");
            return (Criteria) this;
        }

        public Criteria andAssDetailsNotBetween(String value1, String value2) {
            addCriterion("ass_details not between", value1, value2, "assDetails");
            return (Criteria) this;
        }

        public Criteria andAssStateIsNull() {
            addCriterion("ass_state is null");
            return (Criteria) this;
        }

        public Criteria andAssStateIsNotNull() {
            addCriterion("ass_state is not null");
            return (Criteria) this;
        }

        public Criteria andAssStateEqualTo(Integer value) {
            addCriterion("ass_state =", value, "assState");
            return (Criteria) this;
        }

        public Criteria andAssStateNotEqualTo(Integer value) {
            addCriterion("ass_state <>", value, "assState");
            return (Criteria) this;
        }

        public Criteria andAssStateGreaterThan(Integer value) {
            addCriterion("ass_state >", value, "assState");
            return (Criteria) this;
        }

        public Criteria andAssStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ass_state >=", value, "assState");
            return (Criteria) this;
        }

        public Criteria andAssStateLessThan(Integer value) {
            addCriterion("ass_state <", value, "assState");
            return (Criteria) this;
        }

        public Criteria andAssStateLessThanOrEqualTo(Integer value) {
            addCriterion("ass_state <=", value, "assState");
            return (Criteria) this;
        }

        public Criteria andAssStateIn(List<Integer> values) {
            addCriterion("ass_state in", values, "assState");
            return (Criteria) this;
        }

        public Criteria andAssStateNotIn(List<Integer> values) {
            addCriterion("ass_state not in", values, "assState");
            return (Criteria) this;
        }

        public Criteria andAssStateBetween(Integer value1, Integer value2) {
            addCriterion("ass_state between", value1, value2, "assState");
            return (Criteria) this;
        }

        public Criteria andAssStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ass_state not between", value1, value2, "assState");
            return (Criteria) this;
        }

        public Criteria andAssEvaluateIsNull() {
            addCriterion("ass_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andAssEvaluateIsNotNull() {
            addCriterion("ass_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andAssEvaluateEqualTo(String value) {
            addCriterion("ass_evaluate =", value, "assEvaluate");
            return (Criteria) this;
        }

        public Criteria andAssEvaluateNotEqualTo(String value) {
            addCriterion("ass_evaluate <>", value, "assEvaluate");
            return (Criteria) this;
        }

        public Criteria andAssEvaluateGreaterThan(String value) {
            addCriterion("ass_evaluate >", value, "assEvaluate");
            return (Criteria) this;
        }

        public Criteria andAssEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("ass_evaluate >=", value, "assEvaluate");
            return (Criteria) this;
        }

        public Criteria andAssEvaluateLessThan(String value) {
            addCriterion("ass_evaluate <", value, "assEvaluate");
            return (Criteria) this;
        }

        public Criteria andAssEvaluateLessThanOrEqualTo(String value) {
            addCriterion("ass_evaluate <=", value, "assEvaluate");
            return (Criteria) this;
        }

        public Criteria andAssEvaluateLike(String value) {
            addCriterion("ass_evaluate like", value, "assEvaluate");
            return (Criteria) this;
        }

        public Criteria andAssEvaluateNotLike(String value) {
            addCriterion("ass_evaluate not like", value, "assEvaluate");
            return (Criteria) this;
        }

        public Criteria andAssEvaluateIn(List<String> values) {
            addCriterion("ass_evaluate in", values, "assEvaluate");
            return (Criteria) this;
        }

        public Criteria andAssEvaluateNotIn(List<String> values) {
            addCriterion("ass_evaluate not in", values, "assEvaluate");
            return (Criteria) this;
        }

        public Criteria andAssEvaluateBetween(String value1, String value2) {
            addCriterion("ass_evaluate between", value1, value2, "assEvaluate");
            return (Criteria) this;
        }

        public Criteria andAssEvaluateNotBetween(String value1, String value2) {
            addCriterion("ass_evaluate not between", value1, value2, "assEvaluate");
            return (Criteria) this;
        }

        public Criteria andAssSpareIsNull() {
            addCriterion("ass_spare is null");
            return (Criteria) this;
        }

        public Criteria andAssSpareIsNotNull() {
            addCriterion("ass_spare is not null");
            return (Criteria) this;
        }

        public Criteria andAssSpareEqualTo(String value) {
            addCriterion("ass_spare =", value, "assSpare");
            return (Criteria) this;
        }

        public Criteria andAssSpareNotEqualTo(String value) {
            addCriterion("ass_spare <>", value, "assSpare");
            return (Criteria) this;
        }

        public Criteria andAssSpareGreaterThan(String value) {
            addCriterion("ass_spare >", value, "assSpare");
            return (Criteria) this;
        }

        public Criteria andAssSpareGreaterThanOrEqualTo(String value) {
            addCriterion("ass_spare >=", value, "assSpare");
            return (Criteria) this;
        }

        public Criteria andAssSpareLessThan(String value) {
            addCriterion("ass_spare <", value, "assSpare");
            return (Criteria) this;
        }

        public Criteria andAssSpareLessThanOrEqualTo(String value) {
            addCriterion("ass_spare <=", value, "assSpare");
            return (Criteria) this;
        }

        public Criteria andAssSpareLike(String value) {
            addCriterion("ass_spare like", value, "assSpare");
            return (Criteria) this;
        }

        public Criteria andAssSpareNotLike(String value) {
            addCriterion("ass_spare not like", value, "assSpare");
            return (Criteria) this;
        }

        public Criteria andAssSpareIn(List<String> values) {
            addCriterion("ass_spare in", values, "assSpare");
            return (Criteria) this;
        }

        public Criteria andAssSpareNotIn(List<String> values) {
            addCriterion("ass_spare not in", values, "assSpare");
            return (Criteria) this;
        }

        public Criteria andAssSpareBetween(String value1, String value2) {
            addCriterion("ass_spare between", value1, value2, "assSpare");
            return (Criteria) this;
        }

        public Criteria andAssSpareNotBetween(String value1, String value2) {
            addCriterion("ass_spare not between", value1, value2, "assSpare");
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