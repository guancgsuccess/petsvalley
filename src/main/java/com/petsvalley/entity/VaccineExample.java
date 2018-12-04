package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VaccineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public VaccineExample() {
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

        public Criteria andVaccIdIsNull() {
            addCriterion("vacc_id is null");
            return (Criteria) this;
        }

        public Criteria andVaccIdIsNotNull() {
            addCriterion("vacc_id is not null");
            return (Criteria) this;
        }

        public Criteria andVaccIdEqualTo(Integer value) {
            addCriterion("vacc_id =", value, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdNotEqualTo(Integer value) {
            addCriterion("vacc_id <>", value, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdGreaterThan(Integer value) {
            addCriterion("vacc_id >", value, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vacc_id >=", value, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdLessThan(Integer value) {
            addCriterion("vacc_id <", value, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdLessThanOrEqualTo(Integer value) {
            addCriterion("vacc_id <=", value, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdIn(List<Integer> values) {
            addCriterion("vacc_id in", values, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdNotIn(List<Integer> values) {
            addCriterion("vacc_id not in", values, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdBetween(Integer value1, Integer value2) {
            addCriterion("vacc_id between", value1, value2, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vacc_id not between", value1, value2, "vaccId");
            return (Criteria) this;
        }

        public Criteria andPetIdIsNull() {
            addCriterion("pet_id is null");
            return (Criteria) this;
        }

        public Criteria andPetIdIsNotNull() {
            addCriterion("pet_id is not null");
            return (Criteria) this;
        }

        public Criteria andPetIdEqualTo(Integer value) {
            addCriterion("pet_id =", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdNotEqualTo(Integer value) {
            addCriterion("pet_id <>", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdGreaterThan(Integer value) {
            addCriterion("pet_id >", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_id >=", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdLessThan(Integer value) {
            addCriterion("pet_id <", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdLessThanOrEqualTo(Integer value) {
            addCriterion("pet_id <=", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdIn(List<Integer> values) {
            addCriterion("pet_id in", values, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdNotIn(List<Integer> values) {
            addCriterion("pet_id not in", values, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdBetween(Integer value1, Integer value2) {
            addCriterion("pet_id between", value1, value2, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_id not between", value1, value2, "petId");
            return (Criteria) this;
        }

        public Criteria andVaccTypeIsNull() {
            addCriterion("vacc_type is null");
            return (Criteria) this;
        }

        public Criteria andVaccTypeIsNotNull() {
            addCriterion("vacc_type is not null");
            return (Criteria) this;
        }

        public Criteria andVaccTypeEqualTo(String value) {
            addCriterion("vacc_type =", value, "vaccType");
            return (Criteria) this;
        }

        public Criteria andVaccTypeNotEqualTo(String value) {
            addCriterion("vacc_type <>", value, "vaccType");
            return (Criteria) this;
        }

        public Criteria andVaccTypeGreaterThan(String value) {
            addCriterion("vacc_type >", value, "vaccType");
            return (Criteria) this;
        }

        public Criteria andVaccTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vacc_type >=", value, "vaccType");
            return (Criteria) this;
        }

        public Criteria andVaccTypeLessThan(String value) {
            addCriterion("vacc_type <", value, "vaccType");
            return (Criteria) this;
        }

        public Criteria andVaccTypeLessThanOrEqualTo(String value) {
            addCriterion("vacc_type <=", value, "vaccType");
            return (Criteria) this;
        }

        public Criteria andVaccTypeLike(String value) {
            addCriterion("vacc_type like", value, "vaccType");
            return (Criteria) this;
        }

        public Criteria andVaccTypeNotLike(String value) {
            addCriterion("vacc_type not like", value, "vaccType");
            return (Criteria) this;
        }

        public Criteria andVaccTypeIn(List<String> values) {
            addCriterion("vacc_type in", values, "vaccType");
            return (Criteria) this;
        }

        public Criteria andVaccTypeNotIn(List<String> values) {
            addCriterion("vacc_type not in", values, "vaccType");
            return (Criteria) this;
        }

        public Criteria andVaccTypeBetween(String value1, String value2) {
            addCriterion("vacc_type between", value1, value2, "vaccType");
            return (Criteria) this;
        }

        public Criteria andVaccTypeNotBetween(String value1, String value2) {
            addCriterion("vacc_type not between", value1, value2, "vaccType");
            return (Criteria) this;
        }

        public Criteria andVaccTimeIsNull() {
            addCriterion("vacc_time is null");
            return (Criteria) this;
        }

        public Criteria andVaccTimeIsNotNull() {
            addCriterion("vacc_time is not null");
            return (Criteria) this;
        }

        public Criteria andVaccTimeEqualTo(Date value) {
            addCriterion("vacc_time =", value, "vaccTime");
            return (Criteria) this;
        }

        public Criteria andVaccTimeNotEqualTo(Date value) {
            addCriterion("vacc_time <>", value, "vaccTime");
            return (Criteria) this;
        }

        public Criteria andVaccTimeGreaterThan(Date value) {
            addCriterion("vacc_time >", value, "vaccTime");
            return (Criteria) this;
        }

        public Criteria andVaccTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vacc_time >=", value, "vaccTime");
            return (Criteria) this;
        }

        public Criteria andVaccTimeLessThan(Date value) {
            addCriterion("vacc_time <", value, "vaccTime");
            return (Criteria) this;
        }

        public Criteria andVaccTimeLessThanOrEqualTo(Date value) {
            addCriterion("vacc_time <=", value, "vaccTime");
            return (Criteria) this;
        }

        public Criteria andVaccTimeIn(List<Date> values) {
            addCriterion("vacc_time in", values, "vaccTime");
            return (Criteria) this;
        }

        public Criteria andVaccTimeNotIn(List<Date> values) {
            addCriterion("vacc_time not in", values, "vaccTime");
            return (Criteria) this;
        }

        public Criteria andVaccTimeBetween(Date value1, Date value2) {
            addCriterion("vacc_time between", value1, value2, "vaccTime");
            return (Criteria) this;
        }

        public Criteria andVaccTimeNotBetween(Date value1, Date value2) {
            addCriterion("vacc_time not between", value1, value2, "vaccTime");
            return (Criteria) this;
        }

        public Criteria andVaccMessageIsNull() {
            addCriterion("vacc_message is null");
            return (Criteria) this;
        }

        public Criteria andVaccMessageIsNotNull() {
            addCriterion("vacc_message is not null");
            return (Criteria) this;
        }

        public Criteria andVaccMessageEqualTo(String value) {
            addCriterion("vacc_message =", value, "vaccMessage");
            return (Criteria) this;
        }

        public Criteria andVaccMessageNotEqualTo(String value) {
            addCriterion("vacc_message <>", value, "vaccMessage");
            return (Criteria) this;
        }

        public Criteria andVaccMessageGreaterThan(String value) {
            addCriterion("vacc_message >", value, "vaccMessage");
            return (Criteria) this;
        }

        public Criteria andVaccMessageGreaterThanOrEqualTo(String value) {
            addCriterion("vacc_message >=", value, "vaccMessage");
            return (Criteria) this;
        }

        public Criteria andVaccMessageLessThan(String value) {
            addCriterion("vacc_message <", value, "vaccMessage");
            return (Criteria) this;
        }

        public Criteria andVaccMessageLessThanOrEqualTo(String value) {
            addCriterion("vacc_message <=", value, "vaccMessage");
            return (Criteria) this;
        }

        public Criteria andVaccMessageLike(String value) {
            addCriterion("vacc_message like", value, "vaccMessage");
            return (Criteria) this;
        }

        public Criteria andVaccMessageNotLike(String value) {
            addCriterion("vacc_message not like", value, "vaccMessage");
            return (Criteria) this;
        }

        public Criteria andVaccMessageIn(List<String> values) {
            addCriterion("vacc_message in", values, "vaccMessage");
            return (Criteria) this;
        }

        public Criteria andVaccMessageNotIn(List<String> values) {
            addCriterion("vacc_message not in", values, "vaccMessage");
            return (Criteria) this;
        }

        public Criteria andVaccMessageBetween(String value1, String value2) {
            addCriterion("vacc_message between", value1, value2, "vaccMessage");
            return (Criteria) this;
        }

        public Criteria andVaccMessageNotBetween(String value1, String value2) {
            addCriterion("vacc_message not between", value1, value2, "vaccMessage");
            return (Criteria) this;
        }

        public Criteria andVaccStateIsNull() {
            addCriterion("vacc_state is null");
            return (Criteria) this;
        }

        public Criteria andVaccStateIsNotNull() {
            addCriterion("vacc_state is not null");
            return (Criteria) this;
        }

        public Criteria andVaccStateEqualTo(Integer value) {
            addCriterion("vacc_state =", value, "vaccState");
            return (Criteria) this;
        }

        public Criteria andVaccStateNotEqualTo(Integer value) {
            addCriterion("vacc_state <>", value, "vaccState");
            return (Criteria) this;
        }

        public Criteria andVaccStateGreaterThan(Integer value) {
            addCriterion("vacc_state >", value, "vaccState");
            return (Criteria) this;
        }

        public Criteria andVaccStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("vacc_state >=", value, "vaccState");
            return (Criteria) this;
        }

        public Criteria andVaccStateLessThan(Integer value) {
            addCriterion("vacc_state <", value, "vaccState");
            return (Criteria) this;
        }

        public Criteria andVaccStateLessThanOrEqualTo(Integer value) {
            addCriterion("vacc_state <=", value, "vaccState");
            return (Criteria) this;
        }

        public Criteria andVaccStateIn(List<Integer> values) {
            addCriterion("vacc_state in", values, "vaccState");
            return (Criteria) this;
        }

        public Criteria andVaccStateNotIn(List<Integer> values) {
            addCriterion("vacc_state not in", values, "vaccState");
            return (Criteria) this;
        }

        public Criteria andVaccStateBetween(Integer value1, Integer value2) {
            addCriterion("vacc_state between", value1, value2, "vaccState");
            return (Criteria) this;
        }

        public Criteria andVaccStateNotBetween(Integer value1, Integer value2) {
            addCriterion("vacc_state not between", value1, value2, "vaccState");
            return (Criteria) this;
        }

        public Criteria andVaccSpareIsNull() {
            addCriterion("vacc_spare is null");
            return (Criteria) this;
        }

        public Criteria andVaccSpareIsNotNull() {
            addCriterion("vacc_spare is not null");
            return (Criteria) this;
        }

        public Criteria andVaccSpareEqualTo(String value) {
            addCriterion("vacc_spare =", value, "vaccSpare");
            return (Criteria) this;
        }

        public Criteria andVaccSpareNotEqualTo(String value) {
            addCriterion("vacc_spare <>", value, "vaccSpare");
            return (Criteria) this;
        }

        public Criteria andVaccSpareGreaterThan(String value) {
            addCriterion("vacc_spare >", value, "vaccSpare");
            return (Criteria) this;
        }

        public Criteria andVaccSpareGreaterThanOrEqualTo(String value) {
            addCriterion("vacc_spare >=", value, "vaccSpare");
            return (Criteria) this;
        }

        public Criteria andVaccSpareLessThan(String value) {
            addCriterion("vacc_spare <", value, "vaccSpare");
            return (Criteria) this;
        }

        public Criteria andVaccSpareLessThanOrEqualTo(String value) {
            addCriterion("vacc_spare <=", value, "vaccSpare");
            return (Criteria) this;
        }

        public Criteria andVaccSpareLike(String value) {
            addCriterion("vacc_spare like", value, "vaccSpare");
            return (Criteria) this;
        }

        public Criteria andVaccSpareNotLike(String value) {
            addCriterion("vacc_spare not like", value, "vaccSpare");
            return (Criteria) this;
        }

        public Criteria andVaccSpareIn(List<String> values) {
            addCriterion("vacc_spare in", values, "vaccSpare");
            return (Criteria) this;
        }

        public Criteria andVaccSpareNotIn(List<String> values) {
            addCriterion("vacc_spare not in", values, "vaccSpare");
            return (Criteria) this;
        }

        public Criteria andVaccSpareBetween(String value1, String value2) {
            addCriterion("vacc_spare between", value1, value2, "vaccSpare");
            return (Criteria) this;
        }

        public Criteria andVaccSpareNotBetween(String value1, String value2) {
            addCriterion("vacc_spare not between", value1, value2, "vaccSpare");
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