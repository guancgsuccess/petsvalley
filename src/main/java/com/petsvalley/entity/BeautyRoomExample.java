package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.List;

public class BeautyRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public BeautyRoomExample() {
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

        public Criteria andBeautyIdIsNull() {
            addCriterion("beauty_id is null");
            return (Criteria) this;
        }

        public Criteria andBeautyIdIsNotNull() {
            addCriterion("beauty_id is not null");
            return (Criteria) this;
        }

        public Criteria andBeautyIdEqualTo(Integer value) {
            addCriterion("beauty_id =", value, "beautyId");
            return (Criteria) this;
        }

        public Criteria andBeautyIdNotEqualTo(Integer value) {
            addCriterion("beauty_id <>", value, "beautyId");
            return (Criteria) this;
        }

        public Criteria andBeautyIdGreaterThan(Integer value) {
            addCriterion("beauty_id >", value, "beautyId");
            return (Criteria) this;
        }

        public Criteria andBeautyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("beauty_id >=", value, "beautyId");
            return (Criteria) this;
        }

        public Criteria andBeautyIdLessThan(Integer value) {
            addCriterion("beauty_id <", value, "beautyId");
            return (Criteria) this;
        }

        public Criteria andBeautyIdLessThanOrEqualTo(Integer value) {
            addCriterion("beauty_id <=", value, "beautyId");
            return (Criteria) this;
        }

        public Criteria andBeautyIdIn(List<Integer> values) {
            addCriterion("beauty_id in", values, "beautyId");
            return (Criteria) this;
        }

        public Criteria andBeautyIdNotIn(List<Integer> values) {
            addCriterion("beauty_id not in", values, "beautyId");
            return (Criteria) this;
        }

        public Criteria andBeautyIdBetween(Integer value1, Integer value2) {
            addCriterion("beauty_id between", value1, value2, "beautyId");
            return (Criteria) this;
        }

        public Criteria andBeautyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("beauty_id not between", value1, value2, "beautyId");
            return (Criteria) this;
        }

        public Criteria andBeautyNameIsNull() {
            addCriterion("beauty_name is null");
            return (Criteria) this;
        }

        public Criteria andBeautyNameIsNotNull() {
            addCriterion("beauty_name is not null");
            return (Criteria) this;
        }

        public Criteria andBeautyNameEqualTo(String value) {
            addCriterion("beauty_name =", value, "beautyName");
            return (Criteria) this;
        }

        public Criteria andBeautyNameNotEqualTo(String value) {
            addCriterion("beauty_name <>", value, "beautyName");
            return (Criteria) this;
        }

        public Criteria andBeautyNameGreaterThan(String value) {
            addCriterion("beauty_name >", value, "beautyName");
            return (Criteria) this;
        }

        public Criteria andBeautyNameGreaterThanOrEqualTo(String value) {
            addCriterion("beauty_name >=", value, "beautyName");
            return (Criteria) this;
        }

        public Criteria andBeautyNameLessThan(String value) {
            addCriterion("beauty_name <", value, "beautyName");
            return (Criteria) this;
        }

        public Criteria andBeautyNameLessThanOrEqualTo(String value) {
            addCriterion("beauty_name <=", value, "beautyName");
            return (Criteria) this;
        }

        public Criteria andBeautyNameLike(String value) {
            addCriterion("beauty_name like", value, "beautyName");
            return (Criteria) this;
        }

        public Criteria andBeautyNameNotLike(String value) {
            addCriterion("beauty_name not like", value, "beautyName");
            return (Criteria) this;
        }

        public Criteria andBeautyNameIn(List<String> values) {
            addCriterion("beauty_name in", values, "beautyName");
            return (Criteria) this;
        }

        public Criteria andBeautyNameNotIn(List<String> values) {
            addCriterion("beauty_name not in", values, "beautyName");
            return (Criteria) this;
        }

        public Criteria andBeautyNameBetween(String value1, String value2) {
            addCriterion("beauty_name between", value1, value2, "beautyName");
            return (Criteria) this;
        }

        public Criteria andBeautyNameNotBetween(String value1, String value2) {
            addCriterion("beauty_name not between", value1, value2, "beautyName");
            return (Criteria) this;
        }

        public Criteria andBeautyPhoneIsNull() {
            addCriterion("beauty_phone is null");
            return (Criteria) this;
        }

        public Criteria andBeautyPhoneIsNotNull() {
            addCriterion("beauty_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBeautyPhoneEqualTo(String value) {
            addCriterion("beauty_phone =", value, "beautyPhone");
            return (Criteria) this;
        }

        public Criteria andBeautyPhoneNotEqualTo(String value) {
            addCriterion("beauty_phone <>", value, "beautyPhone");
            return (Criteria) this;
        }

        public Criteria andBeautyPhoneGreaterThan(String value) {
            addCriterion("beauty_phone >", value, "beautyPhone");
            return (Criteria) this;
        }

        public Criteria andBeautyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("beauty_phone >=", value, "beautyPhone");
            return (Criteria) this;
        }

        public Criteria andBeautyPhoneLessThan(String value) {
            addCriterion("beauty_phone <", value, "beautyPhone");
            return (Criteria) this;
        }

        public Criteria andBeautyPhoneLessThanOrEqualTo(String value) {
            addCriterion("beauty_phone <=", value, "beautyPhone");
            return (Criteria) this;
        }

        public Criteria andBeautyPhoneLike(String value) {
            addCriterion("beauty_phone like", value, "beautyPhone");
            return (Criteria) this;
        }

        public Criteria andBeautyPhoneNotLike(String value) {
            addCriterion("beauty_phone not like", value, "beautyPhone");
            return (Criteria) this;
        }

        public Criteria andBeautyPhoneIn(List<String> values) {
            addCriterion("beauty_phone in", values, "beautyPhone");
            return (Criteria) this;
        }

        public Criteria andBeautyPhoneNotIn(List<String> values) {
            addCriterion("beauty_phone not in", values, "beautyPhone");
            return (Criteria) this;
        }

        public Criteria andBeautyPhoneBetween(String value1, String value2) {
            addCriterion("beauty_phone between", value1, value2, "beautyPhone");
            return (Criteria) this;
        }

        public Criteria andBeautyPhoneNotBetween(String value1, String value2) {
            addCriterion("beauty_phone not between", value1, value2, "beautyPhone");
            return (Criteria) this;
        }

        public Criteria andBeautyPlaceIsNull() {
            addCriterion("beauty_place is null");
            return (Criteria) this;
        }

        public Criteria andBeautyPlaceIsNotNull() {
            addCriterion("beauty_place is not null");
            return (Criteria) this;
        }

        public Criteria andBeautyPlaceEqualTo(String value) {
            addCriterion("beauty_place =", value, "beautyPlace");
            return (Criteria) this;
        }

        public Criteria andBeautyPlaceNotEqualTo(String value) {
            addCriterion("beauty_place <>", value, "beautyPlace");
            return (Criteria) this;
        }

        public Criteria andBeautyPlaceGreaterThan(String value) {
            addCriterion("beauty_place >", value, "beautyPlace");
            return (Criteria) this;
        }

        public Criteria andBeautyPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("beauty_place >=", value, "beautyPlace");
            return (Criteria) this;
        }

        public Criteria andBeautyPlaceLessThan(String value) {
            addCriterion("beauty_place <", value, "beautyPlace");
            return (Criteria) this;
        }

        public Criteria andBeautyPlaceLessThanOrEqualTo(String value) {
            addCriterion("beauty_place <=", value, "beautyPlace");
            return (Criteria) this;
        }

        public Criteria andBeautyPlaceLike(String value) {
            addCriterion("beauty_place like", value, "beautyPlace");
            return (Criteria) this;
        }

        public Criteria andBeautyPlaceNotLike(String value) {
            addCriterion("beauty_place not like", value, "beautyPlace");
            return (Criteria) this;
        }

        public Criteria andBeautyPlaceIn(List<String> values) {
            addCriterion("beauty_place in", values, "beautyPlace");
            return (Criteria) this;
        }

        public Criteria andBeautyPlaceNotIn(List<String> values) {
            addCriterion("beauty_place not in", values, "beautyPlace");
            return (Criteria) this;
        }

        public Criteria andBeautyPlaceBetween(String value1, String value2) {
            addCriterion("beauty_place between", value1, value2, "beautyPlace");
            return (Criteria) this;
        }

        public Criteria andBeautyPlaceNotBetween(String value1, String value2) {
            addCriterion("beauty_place not between", value1, value2, "beautyPlace");
            return (Criteria) this;
        }

        public Criteria andBeautyPhotoIsNull() {
            addCriterion("beauty_photo is null");
            return (Criteria) this;
        }

        public Criteria andBeautyPhotoIsNotNull() {
            addCriterion("beauty_photo is not null");
            return (Criteria) this;
        }

        public Criteria andBeautyPhotoEqualTo(String value) {
            addCriterion("beauty_photo =", value, "beautyPhoto");
            return (Criteria) this;
        }

        public Criteria andBeautyPhotoNotEqualTo(String value) {
            addCriterion("beauty_photo <>", value, "beautyPhoto");
            return (Criteria) this;
        }

        public Criteria andBeautyPhotoGreaterThan(String value) {
            addCriterion("beauty_photo >", value, "beautyPhoto");
            return (Criteria) this;
        }

        public Criteria andBeautyPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("beauty_photo >=", value, "beautyPhoto");
            return (Criteria) this;
        }

        public Criteria andBeautyPhotoLessThan(String value) {
            addCriterion("beauty_photo <", value, "beautyPhoto");
            return (Criteria) this;
        }

        public Criteria andBeautyPhotoLessThanOrEqualTo(String value) {
            addCriterion("beauty_photo <=", value, "beautyPhoto");
            return (Criteria) this;
        }

        public Criteria andBeautyPhotoLike(String value) {
            addCriterion("beauty_photo like", value, "beautyPhoto");
            return (Criteria) this;
        }

        public Criteria andBeautyPhotoNotLike(String value) {
            addCriterion("beauty_photo not like", value, "beautyPhoto");
            return (Criteria) this;
        }

        public Criteria andBeautyPhotoIn(List<String> values) {
            addCriterion("beauty_photo in", values, "beautyPhoto");
            return (Criteria) this;
        }

        public Criteria andBeautyPhotoNotIn(List<String> values) {
            addCriterion("beauty_photo not in", values, "beautyPhoto");
            return (Criteria) this;
        }

        public Criteria andBeautyPhotoBetween(String value1, String value2) {
            addCriterion("beauty_photo between", value1, value2, "beautyPhoto");
            return (Criteria) this;
        }

        public Criteria andBeautyPhotoNotBetween(String value1, String value2) {
            addCriterion("beauty_photo not between", value1, value2, "beautyPhoto");
            return (Criteria) this;
        }

        public Criteria andBeautyMessageIsNull() {
            addCriterion("beauty_message is null");
            return (Criteria) this;
        }

        public Criteria andBeautyMessageIsNotNull() {
            addCriterion("beauty_message is not null");
            return (Criteria) this;
        }

        public Criteria andBeautyMessageEqualTo(String value) {
            addCriterion("beauty_message =", value, "beautyMessage");
            return (Criteria) this;
        }

        public Criteria andBeautyMessageNotEqualTo(String value) {
            addCriterion("beauty_message <>", value, "beautyMessage");
            return (Criteria) this;
        }

        public Criteria andBeautyMessageGreaterThan(String value) {
            addCriterion("beauty_message >", value, "beautyMessage");
            return (Criteria) this;
        }

        public Criteria andBeautyMessageGreaterThanOrEqualTo(String value) {
            addCriterion("beauty_message >=", value, "beautyMessage");
            return (Criteria) this;
        }

        public Criteria andBeautyMessageLessThan(String value) {
            addCriterion("beauty_message <", value, "beautyMessage");
            return (Criteria) this;
        }

        public Criteria andBeautyMessageLessThanOrEqualTo(String value) {
            addCriterion("beauty_message <=", value, "beautyMessage");
            return (Criteria) this;
        }

        public Criteria andBeautyMessageLike(String value) {
            addCriterion("beauty_message like", value, "beautyMessage");
            return (Criteria) this;
        }

        public Criteria andBeautyMessageNotLike(String value) {
            addCriterion("beauty_message not like", value, "beautyMessage");
            return (Criteria) this;
        }

        public Criteria andBeautyMessageIn(List<String> values) {
            addCriterion("beauty_message in", values, "beautyMessage");
            return (Criteria) this;
        }

        public Criteria andBeautyMessageNotIn(List<String> values) {
            addCriterion("beauty_message not in", values, "beautyMessage");
            return (Criteria) this;
        }

        public Criteria andBeautyMessageBetween(String value1, String value2) {
            addCriterion("beauty_message between", value1, value2, "beautyMessage");
            return (Criteria) this;
        }

        public Criteria andBeautyMessageNotBetween(String value1, String value2) {
            addCriterion("beauty_message not between", value1, value2, "beautyMessage");
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

        public Criteria andBeautyStateIsNull() {
            addCriterion("beauty_state is null");
            return (Criteria) this;
        }

        public Criteria andBeautyStateIsNotNull() {
            addCriterion("beauty_state is not null");
            return (Criteria) this;
        }

        public Criteria andBeautyStateEqualTo(Integer value) {
            addCriterion("beauty_state =", value, "beautyState");
            return (Criteria) this;
        }

        public Criteria andBeautyStateNotEqualTo(Integer value) {
            addCriterion("beauty_state <>", value, "beautyState");
            return (Criteria) this;
        }

        public Criteria andBeautyStateGreaterThan(Integer value) {
            addCriterion("beauty_state >", value, "beautyState");
            return (Criteria) this;
        }

        public Criteria andBeautyStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("beauty_state >=", value, "beautyState");
            return (Criteria) this;
        }

        public Criteria andBeautyStateLessThan(Integer value) {
            addCriterion("beauty_state <", value, "beautyState");
            return (Criteria) this;
        }

        public Criteria andBeautyStateLessThanOrEqualTo(Integer value) {
            addCriterion("beauty_state <=", value, "beautyState");
            return (Criteria) this;
        }

        public Criteria andBeautyStateIn(List<Integer> values) {
            addCriterion("beauty_state in", values, "beautyState");
            return (Criteria) this;
        }

        public Criteria andBeautyStateNotIn(List<Integer> values) {
            addCriterion("beauty_state not in", values, "beautyState");
            return (Criteria) this;
        }

        public Criteria andBeautyStateBetween(Integer value1, Integer value2) {
            addCriterion("beauty_state between", value1, value2, "beautyState");
            return (Criteria) this;
        }

        public Criteria andBeautyStateNotBetween(Integer value1, Integer value2) {
            addCriterion("beauty_state not between", value1, value2, "beautyState");
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