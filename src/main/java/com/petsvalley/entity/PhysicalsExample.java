package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhysicalsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PhysicalsExample() {
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

        public Criteria andPhyIdIsNull() {
            addCriterion("phy_id is null");
            return (Criteria) this;
        }

        public Criteria andPhyIdIsNotNull() {
            addCriterion("phy_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhyIdEqualTo(Integer value) {
            addCriterion("phy_id =", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdNotEqualTo(Integer value) {
            addCriterion("phy_id <>", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdGreaterThan(Integer value) {
            addCriterion("phy_id >", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("phy_id >=", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdLessThan(Integer value) {
            addCriterion("phy_id <", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdLessThanOrEqualTo(Integer value) {
            addCriterion("phy_id <=", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdIn(List<Integer> values) {
            addCriterion("phy_id in", values, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdNotIn(List<Integer> values) {
            addCriterion("phy_id not in", values, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdBetween(Integer value1, Integer value2) {
            addCriterion("phy_id between", value1, value2, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("phy_id not between", value1, value2, "phyId");
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

        public Criteria andPhyTimeIsNull() {
            addCriterion("phy_time is null");
            return (Criteria) this;
        }

        public Criteria andPhyTimeIsNotNull() {
            addCriterion("phy_time is not null");
            return (Criteria) this;
        }

        public Criteria andPhyTimeEqualTo(Date value) {
            addCriterion("phy_time =", value, "phyTime");
            return (Criteria) this;
        }

        public Criteria andPhyTimeNotEqualTo(Date value) {
            addCriterion("phy_time <>", value, "phyTime");
            return (Criteria) this;
        }

        public Criteria andPhyTimeGreaterThan(Date value) {
            addCriterion("phy_time >", value, "phyTime");
            return (Criteria) this;
        }

        public Criteria andPhyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("phy_time >=", value, "phyTime");
            return (Criteria) this;
        }

        public Criteria andPhyTimeLessThan(Date value) {
            addCriterion("phy_time <", value, "phyTime");
            return (Criteria) this;
        }

        public Criteria andPhyTimeLessThanOrEqualTo(Date value) {
            addCriterion("phy_time <=", value, "phyTime");
            return (Criteria) this;
        }

        public Criteria andPhyTimeIn(List<Date> values) {
            addCriterion("phy_time in", values, "phyTime");
            return (Criteria) this;
        }

        public Criteria andPhyTimeNotIn(List<Date> values) {
            addCriterion("phy_time not in", values, "phyTime");
            return (Criteria) this;
        }

        public Criteria andPhyTimeBetween(Date value1, Date value2) {
            addCriterion("phy_time between", value1, value2, "phyTime");
            return (Criteria) this;
        }

        public Criteria andPhyTimeNotBetween(Date value1, Date value2) {
            addCriterion("phy_time not between", value1, value2, "phyTime");
            return (Criteria) this;
        }

        public Criteria andPhyTypeIsNull() {
            addCriterion("phy_type is null");
            return (Criteria) this;
        }

        public Criteria andPhyTypeIsNotNull() {
            addCriterion("phy_type is not null");
            return (Criteria) this;
        }

        public Criteria andPhyTypeEqualTo(String value) {
            addCriterion("phy_type =", value, "phyType");
            return (Criteria) this;
        }

        public Criteria andPhyTypeNotEqualTo(String value) {
            addCriterion("phy_type <>", value, "phyType");
            return (Criteria) this;
        }

        public Criteria andPhyTypeGreaterThan(String value) {
            addCriterion("phy_type >", value, "phyType");
            return (Criteria) this;
        }

        public Criteria andPhyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("phy_type >=", value, "phyType");
            return (Criteria) this;
        }

        public Criteria andPhyTypeLessThan(String value) {
            addCriterion("phy_type <", value, "phyType");
            return (Criteria) this;
        }

        public Criteria andPhyTypeLessThanOrEqualTo(String value) {
            addCriterion("phy_type <=", value, "phyType");
            return (Criteria) this;
        }

        public Criteria andPhyTypeLike(String value) {
            addCriterion("phy_type like", value, "phyType");
            return (Criteria) this;
        }

        public Criteria andPhyTypeNotLike(String value) {
            addCriterion("phy_type not like", value, "phyType");
            return (Criteria) this;
        }

        public Criteria andPhyTypeIn(List<String> values) {
            addCriterion("phy_type in", values, "phyType");
            return (Criteria) this;
        }

        public Criteria andPhyTypeNotIn(List<String> values) {
            addCriterion("phy_type not in", values, "phyType");
            return (Criteria) this;
        }

        public Criteria andPhyTypeBetween(String value1, String value2) {
            addCriterion("phy_type between", value1, value2, "phyType");
            return (Criteria) this;
        }

        public Criteria andPhyTypeNotBetween(String value1, String value2) {
            addCriterion("phy_type not between", value1, value2, "phyType");
            return (Criteria) this;
        }

        public Criteria andPhyLocIsNull() {
            addCriterion("phy_loc is null");
            return (Criteria) this;
        }

        public Criteria andPhyLocIsNotNull() {
            addCriterion("phy_loc is not null");
            return (Criteria) this;
        }

        public Criteria andPhyLocEqualTo(String value) {
            addCriterion("phy_loc =", value, "phyLoc");
            return (Criteria) this;
        }

        public Criteria andPhyLocNotEqualTo(String value) {
            addCriterion("phy_loc <>", value, "phyLoc");
            return (Criteria) this;
        }

        public Criteria andPhyLocGreaterThan(String value) {
            addCriterion("phy_loc >", value, "phyLoc");
            return (Criteria) this;
        }

        public Criteria andPhyLocGreaterThanOrEqualTo(String value) {
            addCriterion("phy_loc >=", value, "phyLoc");
            return (Criteria) this;
        }

        public Criteria andPhyLocLessThan(String value) {
            addCriterion("phy_loc <", value, "phyLoc");
            return (Criteria) this;
        }

        public Criteria andPhyLocLessThanOrEqualTo(String value) {
            addCriterion("phy_loc <=", value, "phyLoc");
            return (Criteria) this;
        }

        public Criteria andPhyLocLike(String value) {
            addCriterion("phy_loc like", value, "phyLoc");
            return (Criteria) this;
        }

        public Criteria andPhyLocNotLike(String value) {
            addCriterion("phy_loc not like", value, "phyLoc");
            return (Criteria) this;
        }

        public Criteria andPhyLocIn(List<String> values) {
            addCriterion("phy_loc in", values, "phyLoc");
            return (Criteria) this;
        }

        public Criteria andPhyLocNotIn(List<String> values) {
            addCriterion("phy_loc not in", values, "phyLoc");
            return (Criteria) this;
        }

        public Criteria andPhyLocBetween(String value1, String value2) {
            addCriterion("phy_loc between", value1, value2, "phyLoc");
            return (Criteria) this;
        }

        public Criteria andPhyLocNotBetween(String value1, String value2) {
            addCriterion("phy_loc not between", value1, value2, "phyLoc");
            return (Criteria) this;
        }

        public Criteria andPhyMessageIsNull() {
            addCriterion("phy_message is null");
            return (Criteria) this;
        }

        public Criteria andPhyMessageIsNotNull() {
            addCriterion("phy_message is not null");
            return (Criteria) this;
        }

        public Criteria andPhyMessageEqualTo(String value) {
            addCriterion("phy_message =", value, "phyMessage");
            return (Criteria) this;
        }

        public Criteria andPhyMessageNotEqualTo(String value) {
            addCriterion("phy_message <>", value, "phyMessage");
            return (Criteria) this;
        }

        public Criteria andPhyMessageGreaterThan(String value) {
            addCriterion("phy_message >", value, "phyMessage");
            return (Criteria) this;
        }

        public Criteria andPhyMessageGreaterThanOrEqualTo(String value) {
            addCriterion("phy_message >=", value, "phyMessage");
            return (Criteria) this;
        }

        public Criteria andPhyMessageLessThan(String value) {
            addCriterion("phy_message <", value, "phyMessage");
            return (Criteria) this;
        }

        public Criteria andPhyMessageLessThanOrEqualTo(String value) {
            addCriterion("phy_message <=", value, "phyMessage");
            return (Criteria) this;
        }

        public Criteria andPhyMessageLike(String value) {
            addCriterion("phy_message like", value, "phyMessage");
            return (Criteria) this;
        }

        public Criteria andPhyMessageNotLike(String value) {
            addCriterion("phy_message not like", value, "phyMessage");
            return (Criteria) this;
        }

        public Criteria andPhyMessageIn(List<String> values) {
            addCriterion("phy_message in", values, "phyMessage");
            return (Criteria) this;
        }

        public Criteria andPhyMessageNotIn(List<String> values) {
            addCriterion("phy_message not in", values, "phyMessage");
            return (Criteria) this;
        }

        public Criteria andPhyMessageBetween(String value1, String value2) {
            addCriterion("phy_message between", value1, value2, "phyMessage");
            return (Criteria) this;
        }

        public Criteria andPhyMessageNotBetween(String value1, String value2) {
            addCriterion("phy_message not between", value1, value2, "phyMessage");
            return (Criteria) this;
        }

        public Criteria andPhyStateIsNull() {
            addCriterion("phy_state is null");
            return (Criteria) this;
        }

        public Criteria andPhyStateIsNotNull() {
            addCriterion("phy_state is not null");
            return (Criteria) this;
        }

        public Criteria andPhyStateEqualTo(Integer value) {
            addCriterion("phy_state =", value, "phyState");
            return (Criteria) this;
        }

        public Criteria andPhyStateNotEqualTo(Integer value) {
            addCriterion("phy_state <>", value, "phyState");
            return (Criteria) this;
        }

        public Criteria andPhyStateGreaterThan(Integer value) {
            addCriterion("phy_state >", value, "phyState");
            return (Criteria) this;
        }

        public Criteria andPhyStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("phy_state >=", value, "phyState");
            return (Criteria) this;
        }

        public Criteria andPhyStateLessThan(Integer value) {
            addCriterion("phy_state <", value, "phyState");
            return (Criteria) this;
        }

        public Criteria andPhyStateLessThanOrEqualTo(Integer value) {
            addCriterion("phy_state <=", value, "phyState");
            return (Criteria) this;
        }

        public Criteria andPhyStateIn(List<Integer> values) {
            addCriterion("phy_state in", values, "phyState");
            return (Criteria) this;
        }

        public Criteria andPhyStateNotIn(List<Integer> values) {
            addCriterion("phy_state not in", values, "phyState");
            return (Criteria) this;
        }

        public Criteria andPhyStateBetween(Integer value1, Integer value2) {
            addCriterion("phy_state between", value1, value2, "phyState");
            return (Criteria) this;
        }

        public Criteria andPhyStateNotBetween(Integer value1, Integer value2) {
            addCriterion("phy_state not between", value1, value2, "phyState");
            return (Criteria) this;
        }

        public Criteria andPhySpareIsNull() {
            addCriterion("phy_spare is null");
            return (Criteria) this;
        }

        public Criteria andPhySpareIsNotNull() {
            addCriterion("phy_spare is not null");
            return (Criteria) this;
        }

        public Criteria andPhySpareEqualTo(String value) {
            addCriterion("phy_spare =", value, "phySpare");
            return (Criteria) this;
        }

        public Criteria andPhySpareNotEqualTo(String value) {
            addCriterion("phy_spare <>", value, "phySpare");
            return (Criteria) this;
        }

        public Criteria andPhySpareGreaterThan(String value) {
            addCriterion("phy_spare >", value, "phySpare");
            return (Criteria) this;
        }

        public Criteria andPhySpareGreaterThanOrEqualTo(String value) {
            addCriterion("phy_spare >=", value, "phySpare");
            return (Criteria) this;
        }

        public Criteria andPhySpareLessThan(String value) {
            addCriterion("phy_spare <", value, "phySpare");
            return (Criteria) this;
        }

        public Criteria andPhySpareLessThanOrEqualTo(String value) {
            addCriterion("phy_spare <=", value, "phySpare");
            return (Criteria) this;
        }

        public Criteria andPhySpareLike(String value) {
            addCriterion("phy_spare like", value, "phySpare");
            return (Criteria) this;
        }

        public Criteria andPhySpareNotLike(String value) {
            addCriterion("phy_spare not like", value, "phySpare");
            return (Criteria) this;
        }

        public Criteria andPhySpareIn(List<String> values) {
            addCriterion("phy_spare in", values, "phySpare");
            return (Criteria) this;
        }

        public Criteria andPhySpareNotIn(List<String> values) {
            addCriterion("phy_spare not in", values, "phySpare");
            return (Criteria) this;
        }

        public Criteria andPhySpareBetween(String value1, String value2) {
            addCriterion("phy_spare between", value1, value2, "phySpare");
            return (Criteria) this;
        }

        public Criteria andPhySpareNotBetween(String value1, String value2) {
            addCriterion("phy_spare not between", value1, value2, "phySpare");
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