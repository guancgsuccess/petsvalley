package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClaimExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ClaimExample() {
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

        public Criteria andClaimIdIsNull() {
            addCriterion("claim_id is null");
            return (Criteria) this;
        }

        public Criteria andClaimIdIsNotNull() {
            addCriterion("claim_id is not null");
            return (Criteria) this;
        }

        public Criteria andClaimIdEqualTo(Integer value) {
            addCriterion("claim_id =", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdNotEqualTo(Integer value) {
            addCriterion("claim_id <>", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdGreaterThan(Integer value) {
            addCriterion("claim_id >", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("claim_id >=", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdLessThan(Integer value) {
            addCriterion("claim_id <", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdLessThanOrEqualTo(Integer value) {
            addCriterion("claim_id <=", value, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdIn(List<Integer> values) {
            addCriterion("claim_id in", values, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdNotIn(List<Integer> values) {
            addCriterion("claim_id not in", values, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdBetween(Integer value1, Integer value2) {
            addCriterion("claim_id between", value1, value2, "claimId");
            return (Criteria) this;
        }

        public Criteria andClaimIdNotBetween(Integer value1, Integer value2) {
            addCriterion("claim_id not between", value1, value2, "claimId");
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

        public Criteria andClaimTimeIsNull() {
            addCriterion("claim_time is null");
            return (Criteria) this;
        }

        public Criteria andClaimTimeIsNotNull() {
            addCriterion("claim_time is not null");
            return (Criteria) this;
        }

        public Criteria andClaimTimeEqualTo(Date value) {
            addCriterion("claim_time =", value, "claimTime");
            return (Criteria) this;
        }

        public Criteria andClaimTimeNotEqualTo(Date value) {
            addCriterion("claim_time <>", value, "claimTime");
            return (Criteria) this;
        }

        public Criteria andClaimTimeGreaterThan(Date value) {
            addCriterion("claim_time >", value, "claimTime");
            return (Criteria) this;
        }

        public Criteria andClaimTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("claim_time >=", value, "claimTime");
            return (Criteria) this;
        }

        public Criteria andClaimTimeLessThan(Date value) {
            addCriterion("claim_time <", value, "claimTime");
            return (Criteria) this;
        }

        public Criteria andClaimTimeLessThanOrEqualTo(Date value) {
            addCriterion("claim_time <=", value, "claimTime");
            return (Criteria) this;
        }

        public Criteria andClaimTimeIn(List<Date> values) {
            addCriterion("claim_time in", values, "claimTime");
            return (Criteria) this;
        }

        public Criteria andClaimTimeNotIn(List<Date> values) {
            addCriterion("claim_time not in", values, "claimTime");
            return (Criteria) this;
        }

        public Criteria andClaimTimeBetween(Date value1, Date value2) {
            addCriterion("claim_time between", value1, value2, "claimTime");
            return (Criteria) this;
        }

        public Criteria andClaimTimeNotBetween(Date value1, Date value2) {
            addCriterion("claim_time not between", value1, value2, "claimTime");
            return (Criteria) this;
        }

        public Criteria andClaimPlaceIsNull() {
            addCriterion("claim_place is null");
            return (Criteria) this;
        }

        public Criteria andClaimPlaceIsNotNull() {
            addCriterion("claim_place is not null");
            return (Criteria) this;
        }

        public Criteria andClaimPlaceEqualTo(String value) {
            addCriterion("claim_place =", value, "claimPlace");
            return (Criteria) this;
        }

        public Criteria andClaimPlaceNotEqualTo(String value) {
            addCriterion("claim_place <>", value, "claimPlace");
            return (Criteria) this;
        }

        public Criteria andClaimPlaceGreaterThan(String value) {
            addCriterion("claim_place >", value, "claimPlace");
            return (Criteria) this;
        }

        public Criteria andClaimPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("claim_place >=", value, "claimPlace");
            return (Criteria) this;
        }

        public Criteria andClaimPlaceLessThan(String value) {
            addCriterion("claim_place <", value, "claimPlace");
            return (Criteria) this;
        }

        public Criteria andClaimPlaceLessThanOrEqualTo(String value) {
            addCriterion("claim_place <=", value, "claimPlace");
            return (Criteria) this;
        }

        public Criteria andClaimPlaceLike(String value) {
            addCriterion("claim_place like", value, "claimPlace");
            return (Criteria) this;
        }

        public Criteria andClaimPlaceNotLike(String value) {
            addCriterion("claim_place not like", value, "claimPlace");
            return (Criteria) this;
        }

        public Criteria andClaimPlaceIn(List<String> values) {
            addCriterion("claim_place in", values, "claimPlace");
            return (Criteria) this;
        }

        public Criteria andClaimPlaceNotIn(List<String> values) {
            addCriterion("claim_place not in", values, "claimPlace");
            return (Criteria) this;
        }

        public Criteria andClaimPlaceBetween(String value1, String value2) {
            addCriterion("claim_place between", value1, value2, "claimPlace");
            return (Criteria) this;
        }

        public Criteria andClaimPlaceNotBetween(String value1, String value2) {
            addCriterion("claim_place not between", value1, value2, "claimPlace");
            return (Criteria) this;
        }

        public Criteria andClaimMessageIsNull() {
            addCriterion("claim_message is null");
            return (Criteria) this;
        }

        public Criteria andClaimMessageIsNotNull() {
            addCriterion("claim_message is not null");
            return (Criteria) this;
        }

        public Criteria andClaimMessageEqualTo(String value) {
            addCriterion("claim_message =", value, "claimMessage");
            return (Criteria) this;
        }

        public Criteria andClaimMessageNotEqualTo(String value) {
            addCriterion("claim_message <>", value, "claimMessage");
            return (Criteria) this;
        }

        public Criteria andClaimMessageGreaterThan(String value) {
            addCriterion("claim_message >", value, "claimMessage");
            return (Criteria) this;
        }

        public Criteria andClaimMessageGreaterThanOrEqualTo(String value) {
            addCriterion("claim_message >=", value, "claimMessage");
            return (Criteria) this;
        }

        public Criteria andClaimMessageLessThan(String value) {
            addCriterion("claim_message <", value, "claimMessage");
            return (Criteria) this;
        }

        public Criteria andClaimMessageLessThanOrEqualTo(String value) {
            addCriterion("claim_message <=", value, "claimMessage");
            return (Criteria) this;
        }

        public Criteria andClaimMessageLike(String value) {
            addCriterion("claim_message like", value, "claimMessage");
            return (Criteria) this;
        }

        public Criteria andClaimMessageNotLike(String value) {
            addCriterion("claim_message not like", value, "claimMessage");
            return (Criteria) this;
        }

        public Criteria andClaimMessageIn(List<String> values) {
            addCriterion("claim_message in", values, "claimMessage");
            return (Criteria) this;
        }

        public Criteria andClaimMessageNotIn(List<String> values) {
            addCriterion("claim_message not in", values, "claimMessage");
            return (Criteria) this;
        }

        public Criteria andClaimMessageBetween(String value1, String value2) {
            addCriterion("claim_message between", value1, value2, "claimMessage");
            return (Criteria) this;
        }

        public Criteria andClaimMessageNotBetween(String value1, String value2) {
            addCriterion("claim_message not between", value1, value2, "claimMessage");
            return (Criteria) this;
        }

        public Criteria andClaimPhotoIsNull() {
            addCriterion("claim_photo is null");
            return (Criteria) this;
        }

        public Criteria andClaimPhotoIsNotNull() {
            addCriterion("claim_photo is not null");
            return (Criteria) this;
        }

        public Criteria andClaimPhotoEqualTo(String value) {
            addCriterion("claim_photo =", value, "claimPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimPhotoNotEqualTo(String value) {
            addCriterion("claim_photo <>", value, "claimPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimPhotoGreaterThan(String value) {
            addCriterion("claim_photo >", value, "claimPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("claim_photo >=", value, "claimPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimPhotoLessThan(String value) {
            addCriterion("claim_photo <", value, "claimPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimPhotoLessThanOrEqualTo(String value) {
            addCriterion("claim_photo <=", value, "claimPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimPhotoLike(String value) {
            addCriterion("claim_photo like", value, "claimPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimPhotoNotLike(String value) {
            addCriterion("claim_photo not like", value, "claimPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimPhotoIn(List<String> values) {
            addCriterion("claim_photo in", values, "claimPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimPhotoNotIn(List<String> values) {
            addCriterion("claim_photo not in", values, "claimPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimPhotoBetween(String value1, String value2) {
            addCriterion("claim_photo between", value1, value2, "claimPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimPhotoNotBetween(String value1, String value2) {
            addCriterion("claim_photo not between", value1, value2, "claimPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimPhoneIsNull() {
            addCriterion("claim_phone is null");
            return (Criteria) this;
        }

        public Criteria andClaimPhoneIsNotNull() {
            addCriterion("claim_phone is not null");
            return (Criteria) this;
        }

        public Criteria andClaimPhoneEqualTo(String value) {
            addCriterion("claim_phone =", value, "claimPhone");
            return (Criteria) this;
        }

        public Criteria andClaimPhoneNotEqualTo(String value) {
            addCriterion("claim_phone <>", value, "claimPhone");
            return (Criteria) this;
        }

        public Criteria andClaimPhoneGreaterThan(String value) {
            addCriterion("claim_phone >", value, "claimPhone");
            return (Criteria) this;
        }

        public Criteria andClaimPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("claim_phone >=", value, "claimPhone");
            return (Criteria) this;
        }

        public Criteria andClaimPhoneLessThan(String value) {
            addCriterion("claim_phone <", value, "claimPhone");
            return (Criteria) this;
        }

        public Criteria andClaimPhoneLessThanOrEqualTo(String value) {
            addCriterion("claim_phone <=", value, "claimPhone");
            return (Criteria) this;
        }

        public Criteria andClaimPhoneLike(String value) {
            addCriterion("claim_phone like", value, "claimPhone");
            return (Criteria) this;
        }

        public Criteria andClaimPhoneNotLike(String value) {
            addCriterion("claim_phone not like", value, "claimPhone");
            return (Criteria) this;
        }

        public Criteria andClaimPhoneIn(List<String> values) {
            addCriterion("claim_phone in", values, "claimPhone");
            return (Criteria) this;
        }

        public Criteria andClaimPhoneNotIn(List<String> values) {
            addCriterion("claim_phone not in", values, "claimPhone");
            return (Criteria) this;
        }

        public Criteria andClaimPhoneBetween(String value1, String value2) {
            addCriterion("claim_phone between", value1, value2, "claimPhone");
            return (Criteria) this;
        }

        public Criteria andClaimPhoneNotBetween(String value1, String value2) {
            addCriterion("claim_phone not between", value1, value2, "claimPhone");
            return (Criteria) this;
        }

        public Criteria andClaimStateIsNull() {
            addCriterion("claim_state is null");
            return (Criteria) this;
        }

        public Criteria andClaimStateIsNotNull() {
            addCriterion("claim_state is not null");
            return (Criteria) this;
        }

        public Criteria andClaimStateEqualTo(Integer value) {
            addCriterion("claim_state =", value, "claimState");
            return (Criteria) this;
        }

        public Criteria andClaimStateNotEqualTo(Integer value) {
            addCriterion("claim_state <>", value, "claimState");
            return (Criteria) this;
        }

        public Criteria andClaimStateGreaterThan(Integer value) {
            addCriterion("claim_state >", value, "claimState");
            return (Criteria) this;
        }

        public Criteria andClaimStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("claim_state >=", value, "claimState");
            return (Criteria) this;
        }

        public Criteria andClaimStateLessThan(Integer value) {
            addCriterion("claim_state <", value, "claimState");
            return (Criteria) this;
        }

        public Criteria andClaimStateLessThanOrEqualTo(Integer value) {
            addCriterion("claim_state <=", value, "claimState");
            return (Criteria) this;
        }

        public Criteria andClaimStateIn(List<Integer> values) {
            addCriterion("claim_state in", values, "claimState");
            return (Criteria) this;
        }

        public Criteria andClaimStateNotIn(List<Integer> values) {
            addCriterion("claim_state not in", values, "claimState");
            return (Criteria) this;
        }

        public Criteria andClaimStateBetween(Integer value1, Integer value2) {
            addCriterion("claim_state between", value1, value2, "claimState");
            return (Criteria) this;
        }

        public Criteria andClaimStateNotBetween(Integer value1, Integer value2) {
            addCriterion("claim_state not between", value1, value2, "claimState");
            return (Criteria) this;
        }

        public Criteria andClaimSpareIsNull() {
            addCriterion("claim_spare is null");
            return (Criteria) this;
        }

        public Criteria andClaimSpareIsNotNull() {
            addCriterion("claim_spare is not null");
            return (Criteria) this;
        }

        public Criteria andClaimSpareEqualTo(String value) {
            addCriterion("claim_spare =", value, "claimSpare");
            return (Criteria) this;
        }

        public Criteria andClaimSpareNotEqualTo(String value) {
            addCriterion("claim_spare <>", value, "claimSpare");
            return (Criteria) this;
        }

        public Criteria andClaimSpareGreaterThan(String value) {
            addCriterion("claim_spare >", value, "claimSpare");
            return (Criteria) this;
        }

        public Criteria andClaimSpareGreaterThanOrEqualTo(String value) {
            addCriterion("claim_spare >=", value, "claimSpare");
            return (Criteria) this;
        }

        public Criteria andClaimSpareLessThan(String value) {
            addCriterion("claim_spare <", value, "claimSpare");
            return (Criteria) this;
        }

        public Criteria andClaimSpareLessThanOrEqualTo(String value) {
            addCriterion("claim_spare <=", value, "claimSpare");
            return (Criteria) this;
        }

        public Criteria andClaimSpareLike(String value) {
            addCriterion("claim_spare like", value, "claimSpare");
            return (Criteria) this;
        }

        public Criteria andClaimSpareNotLike(String value) {
            addCriterion("claim_spare not like", value, "claimSpare");
            return (Criteria) this;
        }

        public Criteria andClaimSpareIn(List<String> values) {
            addCriterion("claim_spare in", values, "claimSpare");
            return (Criteria) this;
        }

        public Criteria andClaimSpareNotIn(List<String> values) {
            addCriterion("claim_spare not in", values, "claimSpare");
            return (Criteria) this;
        }

        public Criteria andClaimSpareBetween(String value1, String value2) {
            addCriterion("claim_spare between", value1, value2, "claimSpare");
            return (Criteria) this;
        }

        public Criteria andClaimSpareNotBetween(String value1, String value2) {
            addCriterion("claim_spare not between", value1, value2, "claimSpare");
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