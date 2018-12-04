package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.List;

public class FosterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public FosterExample() {
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

        public Criteria andFosterIdIsNull() {
            addCriterion("foster_id is null");
            return (Criteria) this;
        }

        public Criteria andFosterIdIsNotNull() {
            addCriterion("foster_id is not null");
            return (Criteria) this;
        }

        public Criteria andFosterIdEqualTo(Integer value) {
            addCriterion("foster_id =", value, "fosterId");
            return (Criteria) this;
        }

        public Criteria andFosterIdNotEqualTo(Integer value) {
            addCriterion("foster_id <>", value, "fosterId");
            return (Criteria) this;
        }

        public Criteria andFosterIdGreaterThan(Integer value) {
            addCriterion("foster_id >", value, "fosterId");
            return (Criteria) this;
        }

        public Criteria andFosterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("foster_id >=", value, "fosterId");
            return (Criteria) this;
        }

        public Criteria andFosterIdLessThan(Integer value) {
            addCriterion("foster_id <", value, "fosterId");
            return (Criteria) this;
        }

        public Criteria andFosterIdLessThanOrEqualTo(Integer value) {
            addCriterion("foster_id <=", value, "fosterId");
            return (Criteria) this;
        }

        public Criteria andFosterIdIn(List<Integer> values) {
            addCriterion("foster_id in", values, "fosterId");
            return (Criteria) this;
        }

        public Criteria andFosterIdNotIn(List<Integer> values) {
            addCriterion("foster_id not in", values, "fosterId");
            return (Criteria) this;
        }

        public Criteria andFosterIdBetween(Integer value1, Integer value2) {
            addCriterion("foster_id between", value1, value2, "fosterId");
            return (Criteria) this;
        }

        public Criteria andFosterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("foster_id not between", value1, value2, "fosterId");
            return (Criteria) this;
        }

        public Criteria andFosterCustIdIsNull() {
            addCriterion("foster_cust_id is null");
            return (Criteria) this;
        }

        public Criteria andFosterCustIdIsNotNull() {
            addCriterion("foster_cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andFosterCustIdEqualTo(Integer value) {
            addCriterion("foster_cust_id =", value, "fosterCustId");
            return (Criteria) this;
        }

        public Criteria andFosterCustIdNotEqualTo(Integer value) {
            addCriterion("foster_cust_id <>", value, "fosterCustId");
            return (Criteria) this;
        }

        public Criteria andFosterCustIdGreaterThan(Integer value) {
            addCriterion("foster_cust_id >", value, "fosterCustId");
            return (Criteria) this;
        }

        public Criteria andFosterCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("foster_cust_id >=", value, "fosterCustId");
            return (Criteria) this;
        }

        public Criteria andFosterCustIdLessThan(Integer value) {
            addCriterion("foster_cust_id <", value, "fosterCustId");
            return (Criteria) this;
        }

        public Criteria andFosterCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("foster_cust_id <=", value, "fosterCustId");
            return (Criteria) this;
        }

        public Criteria andFosterCustIdIn(List<Integer> values) {
            addCriterion("foster_cust_id in", values, "fosterCustId");
            return (Criteria) this;
        }

        public Criteria andFosterCustIdNotIn(List<Integer> values) {
            addCriterion("foster_cust_id not in", values, "fosterCustId");
            return (Criteria) this;
        }

        public Criteria andFosterCustIdBetween(Integer value1, Integer value2) {
            addCriterion("foster_cust_id between", value1, value2, "fosterCustId");
            return (Criteria) this;
        }

        public Criteria andFosterCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("foster_cust_id not between", value1, value2, "fosterCustId");
            return (Criteria) this;
        }

        public Criteria andFosterPetIdIsNull() {
            addCriterion("foster_pet_id is null");
            return (Criteria) this;
        }

        public Criteria andFosterPetIdIsNotNull() {
            addCriterion("foster_pet_id is not null");
            return (Criteria) this;
        }

        public Criteria andFosterPetIdEqualTo(Integer value) {
            addCriterion("foster_pet_id =", value, "fosterPetId");
            return (Criteria) this;
        }

        public Criteria andFosterPetIdNotEqualTo(Integer value) {
            addCriterion("foster_pet_id <>", value, "fosterPetId");
            return (Criteria) this;
        }

        public Criteria andFosterPetIdGreaterThan(Integer value) {
            addCriterion("foster_pet_id >", value, "fosterPetId");
            return (Criteria) this;
        }

        public Criteria andFosterPetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("foster_pet_id >=", value, "fosterPetId");
            return (Criteria) this;
        }

        public Criteria andFosterPetIdLessThan(Integer value) {
            addCriterion("foster_pet_id <", value, "fosterPetId");
            return (Criteria) this;
        }

        public Criteria andFosterPetIdLessThanOrEqualTo(Integer value) {
            addCriterion("foster_pet_id <=", value, "fosterPetId");
            return (Criteria) this;
        }

        public Criteria andFosterPetIdIn(List<Integer> values) {
            addCriterion("foster_pet_id in", values, "fosterPetId");
            return (Criteria) this;
        }

        public Criteria andFosterPetIdNotIn(List<Integer> values) {
            addCriterion("foster_pet_id not in", values, "fosterPetId");
            return (Criteria) this;
        }

        public Criteria andFosterPetIdBetween(Integer value1, Integer value2) {
            addCriterion("foster_pet_id between", value1, value2, "fosterPetId");
            return (Criteria) this;
        }

        public Criteria andFosterPetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("foster_pet_id not between", value1, value2, "fosterPetId");
            return (Criteria) this;
        }

        public Criteria andFosterMessageIsNull() {
            addCriterion("foster_message is null");
            return (Criteria) this;
        }

        public Criteria andFosterMessageIsNotNull() {
            addCriterion("foster_message is not null");
            return (Criteria) this;
        }

        public Criteria andFosterMessageEqualTo(String value) {
            addCriterion("foster_message =", value, "fosterMessage");
            return (Criteria) this;
        }

        public Criteria andFosterMessageNotEqualTo(String value) {
            addCriterion("foster_message <>", value, "fosterMessage");
            return (Criteria) this;
        }

        public Criteria andFosterMessageGreaterThan(String value) {
            addCriterion("foster_message >", value, "fosterMessage");
            return (Criteria) this;
        }

        public Criteria andFosterMessageGreaterThanOrEqualTo(String value) {
            addCriterion("foster_message >=", value, "fosterMessage");
            return (Criteria) this;
        }

        public Criteria andFosterMessageLessThan(String value) {
            addCriterion("foster_message <", value, "fosterMessage");
            return (Criteria) this;
        }

        public Criteria andFosterMessageLessThanOrEqualTo(String value) {
            addCriterion("foster_message <=", value, "fosterMessage");
            return (Criteria) this;
        }

        public Criteria andFosterMessageLike(String value) {
            addCriterion("foster_message like", value, "fosterMessage");
            return (Criteria) this;
        }

        public Criteria andFosterMessageNotLike(String value) {
            addCriterion("foster_message not like", value, "fosterMessage");
            return (Criteria) this;
        }

        public Criteria andFosterMessageIn(List<String> values) {
            addCriterion("foster_message in", values, "fosterMessage");
            return (Criteria) this;
        }

        public Criteria andFosterMessageNotIn(List<String> values) {
            addCriterion("foster_message not in", values, "fosterMessage");
            return (Criteria) this;
        }

        public Criteria andFosterMessageBetween(String value1, String value2) {
            addCriterion("foster_message between", value1, value2, "fosterMessage");
            return (Criteria) this;
        }

        public Criteria andFosterMessageNotBetween(String value1, String value2) {
            addCriterion("foster_message not between", value1, value2, "fosterMessage");
            return (Criteria) this;
        }

        public Criteria andFosterReasonIsNull() {
            addCriterion("foster_reason is null");
            return (Criteria) this;
        }

        public Criteria andFosterReasonIsNotNull() {
            addCriterion("foster_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFosterReasonEqualTo(String value) {
            addCriterion("foster_reason =", value, "fosterReason");
            return (Criteria) this;
        }

        public Criteria andFosterReasonNotEqualTo(String value) {
            addCriterion("foster_reason <>", value, "fosterReason");
            return (Criteria) this;
        }

        public Criteria andFosterReasonGreaterThan(String value) {
            addCriterion("foster_reason >", value, "fosterReason");
            return (Criteria) this;
        }

        public Criteria andFosterReasonGreaterThanOrEqualTo(String value) {
            addCriterion("foster_reason >=", value, "fosterReason");
            return (Criteria) this;
        }

        public Criteria andFosterReasonLessThan(String value) {
            addCriterion("foster_reason <", value, "fosterReason");
            return (Criteria) this;
        }

        public Criteria andFosterReasonLessThanOrEqualTo(String value) {
            addCriterion("foster_reason <=", value, "fosterReason");
            return (Criteria) this;
        }

        public Criteria andFosterReasonLike(String value) {
            addCriterion("foster_reason like", value, "fosterReason");
            return (Criteria) this;
        }

        public Criteria andFosterReasonNotLike(String value) {
            addCriterion("foster_reason not like", value, "fosterReason");
            return (Criteria) this;
        }

        public Criteria andFosterReasonIn(List<String> values) {
            addCriterion("foster_reason in", values, "fosterReason");
            return (Criteria) this;
        }

        public Criteria andFosterReasonNotIn(List<String> values) {
            addCriterion("foster_reason not in", values, "fosterReason");
            return (Criteria) this;
        }

        public Criteria andFosterReasonBetween(String value1, String value2) {
            addCriterion("foster_reason between", value1, value2, "fosterReason");
            return (Criteria) this;
        }

        public Criteria andFosterReasonNotBetween(String value1, String value2) {
            addCriterion("foster_reason not between", value1, value2, "fosterReason");
            return (Criteria) this;
        }

        public Criteria andFosterPhotoIsNull() {
            addCriterion("foster_photo is null");
            return (Criteria) this;
        }

        public Criteria andFosterPhotoIsNotNull() {
            addCriterion("foster_photo is not null");
            return (Criteria) this;
        }

        public Criteria andFosterPhotoEqualTo(String value) {
            addCriterion("foster_photo =", value, "fosterPhoto");
            return (Criteria) this;
        }

        public Criteria andFosterPhotoNotEqualTo(String value) {
            addCriterion("foster_photo <>", value, "fosterPhoto");
            return (Criteria) this;
        }

        public Criteria andFosterPhotoGreaterThan(String value) {
            addCriterion("foster_photo >", value, "fosterPhoto");
            return (Criteria) this;
        }

        public Criteria andFosterPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("foster_photo >=", value, "fosterPhoto");
            return (Criteria) this;
        }

        public Criteria andFosterPhotoLessThan(String value) {
            addCriterion("foster_photo <", value, "fosterPhoto");
            return (Criteria) this;
        }

        public Criteria andFosterPhotoLessThanOrEqualTo(String value) {
            addCriterion("foster_photo <=", value, "fosterPhoto");
            return (Criteria) this;
        }

        public Criteria andFosterPhotoLike(String value) {
            addCriterion("foster_photo like", value, "fosterPhoto");
            return (Criteria) this;
        }

        public Criteria andFosterPhotoNotLike(String value) {
            addCriterion("foster_photo not like", value, "fosterPhoto");
            return (Criteria) this;
        }

        public Criteria andFosterPhotoIn(List<String> values) {
            addCriterion("foster_photo in", values, "fosterPhoto");
            return (Criteria) this;
        }

        public Criteria andFosterPhotoNotIn(List<String> values) {
            addCriterion("foster_photo not in", values, "fosterPhoto");
            return (Criteria) this;
        }

        public Criteria andFosterPhotoBetween(String value1, String value2) {
            addCriterion("foster_photo between", value1, value2, "fosterPhoto");
            return (Criteria) this;
        }

        public Criteria andFosterPhotoNotBetween(String value1, String value2) {
            addCriterion("foster_photo not between", value1, value2, "fosterPhoto");
            return (Criteria) this;
        }

        public Criteria andFosterStateIsNull() {
            addCriterion("foster_state is null");
            return (Criteria) this;
        }

        public Criteria andFosterStateIsNotNull() {
            addCriterion("foster_state is not null");
            return (Criteria) this;
        }

        public Criteria andFosterStateEqualTo(Integer value) {
            addCriterion("foster_state =", value, "fosterState");
            return (Criteria) this;
        }

        public Criteria andFosterStateNotEqualTo(Integer value) {
            addCriterion("foster_state <>", value, "fosterState");
            return (Criteria) this;
        }

        public Criteria andFosterStateGreaterThan(Integer value) {
            addCriterion("foster_state >", value, "fosterState");
            return (Criteria) this;
        }

        public Criteria andFosterStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("foster_state >=", value, "fosterState");
            return (Criteria) this;
        }

        public Criteria andFosterStateLessThan(Integer value) {
            addCriterion("foster_state <", value, "fosterState");
            return (Criteria) this;
        }

        public Criteria andFosterStateLessThanOrEqualTo(Integer value) {
            addCriterion("foster_state <=", value, "fosterState");
            return (Criteria) this;
        }

        public Criteria andFosterStateIn(List<Integer> values) {
            addCriterion("foster_state in", values, "fosterState");
            return (Criteria) this;
        }

        public Criteria andFosterStateNotIn(List<Integer> values) {
            addCriterion("foster_state not in", values, "fosterState");
            return (Criteria) this;
        }

        public Criteria andFosterStateBetween(Integer value1, Integer value2) {
            addCriterion("foster_state between", value1, value2, "fosterState");
            return (Criteria) this;
        }

        public Criteria andFosterStateNotBetween(Integer value1, Integer value2) {
            addCriterion("foster_state not between", value1, value2, "fosterState");
            return (Criteria) this;
        }

        public Criteria andFosterSpareIsNull() {
            addCriterion("foster_spare is null");
            return (Criteria) this;
        }

        public Criteria andFosterSpareIsNotNull() {
            addCriterion("foster_spare is not null");
            return (Criteria) this;
        }

        public Criteria andFosterSpareEqualTo(String value) {
            addCriterion("foster_spare =", value, "fosterSpare");
            return (Criteria) this;
        }

        public Criteria andFosterSpareNotEqualTo(String value) {
            addCriterion("foster_spare <>", value, "fosterSpare");
            return (Criteria) this;
        }

        public Criteria andFosterSpareGreaterThan(String value) {
            addCriterion("foster_spare >", value, "fosterSpare");
            return (Criteria) this;
        }

        public Criteria andFosterSpareGreaterThanOrEqualTo(String value) {
            addCriterion("foster_spare >=", value, "fosterSpare");
            return (Criteria) this;
        }

        public Criteria andFosterSpareLessThan(String value) {
            addCriterion("foster_spare <", value, "fosterSpare");
            return (Criteria) this;
        }

        public Criteria andFosterSpareLessThanOrEqualTo(String value) {
            addCriterion("foster_spare <=", value, "fosterSpare");
            return (Criteria) this;
        }

        public Criteria andFosterSpareLike(String value) {
            addCriterion("foster_spare like", value, "fosterSpare");
            return (Criteria) this;
        }

        public Criteria andFosterSpareNotLike(String value) {
            addCriterion("foster_spare not like", value, "fosterSpare");
            return (Criteria) this;
        }

        public Criteria andFosterSpareIn(List<String> values) {
            addCriterion("foster_spare in", values, "fosterSpare");
            return (Criteria) this;
        }

        public Criteria andFosterSpareNotIn(List<String> values) {
            addCriterion("foster_spare not in", values, "fosterSpare");
            return (Criteria) this;
        }

        public Criteria andFosterSpareBetween(String value1, String value2) {
            addCriterion("foster_spare between", value1, value2, "fosterSpare");
            return (Criteria) this;
        }

        public Criteria andFosterSpareNotBetween(String value1, String value2) {
            addCriterion("foster_spare not between", value1, value2, "fosterSpare");
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