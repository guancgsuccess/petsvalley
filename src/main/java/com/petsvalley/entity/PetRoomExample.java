package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.List;

public class PetRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PetRoomExample() {
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

        public Criteria andPetRoomIdIsNull() {
            addCriterion("pet_room_id is null");
            return (Criteria) this;
        }

        public Criteria andPetRoomIdIsNotNull() {
            addCriterion("pet_room_id is not null");
            return (Criteria) this;
        }

        public Criteria andPetRoomIdEqualTo(Integer value) {
            addCriterion("pet_room_id =", value, "petRoomId");
            return (Criteria) this;
        }

        public Criteria andPetRoomIdNotEqualTo(Integer value) {
            addCriterion("pet_room_id <>", value, "petRoomId");
            return (Criteria) this;
        }

        public Criteria andPetRoomIdGreaterThan(Integer value) {
            addCriterion("pet_room_id >", value, "petRoomId");
            return (Criteria) this;
        }

        public Criteria andPetRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_room_id >=", value, "petRoomId");
            return (Criteria) this;
        }

        public Criteria andPetRoomIdLessThan(Integer value) {
            addCriterion("pet_room_id <", value, "petRoomId");
            return (Criteria) this;
        }

        public Criteria andPetRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("pet_room_id <=", value, "petRoomId");
            return (Criteria) this;
        }

        public Criteria andPetRoomIdIn(List<Integer> values) {
            addCriterion("pet_room_id in", values, "petRoomId");
            return (Criteria) this;
        }

        public Criteria andPetRoomIdNotIn(List<Integer> values) {
            addCriterion("pet_room_id not in", values, "petRoomId");
            return (Criteria) this;
        }

        public Criteria andPetRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("pet_room_id between", value1, value2, "petRoomId");
            return (Criteria) this;
        }

        public Criteria andPetRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_room_id not between", value1, value2, "petRoomId");
            return (Criteria) this;
        }

        public Criteria andPetNameIsNull() {
            addCriterion("pet_name is null");
            return (Criteria) this;
        }

        public Criteria andPetNameIsNotNull() {
            addCriterion("pet_name is not null");
            return (Criteria) this;
        }

        public Criteria andPetNameEqualTo(String value) {
            addCriterion("pet_name =", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameNotEqualTo(String value) {
            addCriterion("pet_name <>", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameGreaterThan(String value) {
            addCriterion("pet_name >", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameGreaterThanOrEqualTo(String value) {
            addCriterion("pet_name >=", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameLessThan(String value) {
            addCriterion("pet_name <", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameLessThanOrEqualTo(String value) {
            addCriterion("pet_name <=", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameLike(String value) {
            addCriterion("pet_name like", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameNotLike(String value) {
            addCriterion("pet_name not like", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameIn(List<String> values) {
            addCriterion("pet_name in", values, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameNotIn(List<String> values) {
            addCriterion("pet_name not in", values, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameBetween(String value1, String value2) {
            addCriterion("pet_name between", value1, value2, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameNotBetween(String value1, String value2) {
            addCriterion("pet_name not between", value1, value2, "petName");
            return (Criteria) this;
        }

        public Criteria andPetPhoneIsNull() {
            addCriterion("pet_phone is null");
            return (Criteria) this;
        }

        public Criteria andPetPhoneIsNotNull() {
            addCriterion("pet_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPetPhoneEqualTo(String value) {
            addCriterion("pet_phone =", value, "petPhone");
            return (Criteria) this;
        }

        public Criteria andPetPhoneNotEqualTo(String value) {
            addCriterion("pet_phone <>", value, "petPhone");
            return (Criteria) this;
        }

        public Criteria andPetPhoneGreaterThan(String value) {
            addCriterion("pet_phone >", value, "petPhone");
            return (Criteria) this;
        }

        public Criteria andPetPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("pet_phone >=", value, "petPhone");
            return (Criteria) this;
        }

        public Criteria andPetPhoneLessThan(String value) {
            addCriterion("pet_phone <", value, "petPhone");
            return (Criteria) this;
        }

        public Criteria andPetPhoneLessThanOrEqualTo(String value) {
            addCriterion("pet_phone <=", value, "petPhone");
            return (Criteria) this;
        }

        public Criteria andPetPhoneLike(String value) {
            addCriterion("pet_phone like", value, "petPhone");
            return (Criteria) this;
        }

        public Criteria andPetPhoneNotLike(String value) {
            addCriterion("pet_phone not like", value, "petPhone");
            return (Criteria) this;
        }

        public Criteria andPetPhoneIn(List<String> values) {
            addCriterion("pet_phone in", values, "petPhone");
            return (Criteria) this;
        }

        public Criteria andPetPhoneNotIn(List<String> values) {
            addCriterion("pet_phone not in", values, "petPhone");
            return (Criteria) this;
        }

        public Criteria andPetPhoneBetween(String value1, String value2) {
            addCriterion("pet_phone between", value1, value2, "petPhone");
            return (Criteria) this;
        }

        public Criteria andPetPhoneNotBetween(String value1, String value2) {
            addCriterion("pet_phone not between", value1, value2, "petPhone");
            return (Criteria) this;
        }

        public Criteria andPetPlaceIsNull() {
            addCriterion("pet_place is null");
            return (Criteria) this;
        }

        public Criteria andPetPlaceIsNotNull() {
            addCriterion("pet_place is not null");
            return (Criteria) this;
        }

        public Criteria andPetPlaceEqualTo(String value) {
            addCriterion("pet_place =", value, "petPlace");
            return (Criteria) this;
        }

        public Criteria andPetPlaceNotEqualTo(String value) {
            addCriterion("pet_place <>", value, "petPlace");
            return (Criteria) this;
        }

        public Criteria andPetPlaceGreaterThan(String value) {
            addCriterion("pet_place >", value, "petPlace");
            return (Criteria) this;
        }

        public Criteria andPetPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("pet_place >=", value, "petPlace");
            return (Criteria) this;
        }

        public Criteria andPetPlaceLessThan(String value) {
            addCriterion("pet_place <", value, "petPlace");
            return (Criteria) this;
        }

        public Criteria andPetPlaceLessThanOrEqualTo(String value) {
            addCriterion("pet_place <=", value, "petPlace");
            return (Criteria) this;
        }

        public Criteria andPetPlaceLike(String value) {
            addCriterion("pet_place like", value, "petPlace");
            return (Criteria) this;
        }

        public Criteria andPetPlaceNotLike(String value) {
            addCriterion("pet_place not like", value, "petPlace");
            return (Criteria) this;
        }

        public Criteria andPetPlaceIn(List<String> values) {
            addCriterion("pet_place in", values, "petPlace");
            return (Criteria) this;
        }

        public Criteria andPetPlaceNotIn(List<String> values) {
            addCriterion("pet_place not in", values, "petPlace");
            return (Criteria) this;
        }

        public Criteria andPetPlaceBetween(String value1, String value2) {
            addCriterion("pet_place between", value1, value2, "petPlace");
            return (Criteria) this;
        }

        public Criteria andPetPlaceNotBetween(String value1, String value2) {
            addCriterion("pet_place not between", value1, value2, "petPlace");
            return (Criteria) this;
        }

        public Criteria andPetPhotoIsNull() {
            addCriterion("pet_photo is null");
            return (Criteria) this;
        }

        public Criteria andPetPhotoIsNotNull() {
            addCriterion("pet_photo is not null");
            return (Criteria) this;
        }

        public Criteria andPetPhotoEqualTo(String value) {
            addCriterion("pet_photo =", value, "petPhoto");
            return (Criteria) this;
        }

        public Criteria andPetPhotoNotEqualTo(String value) {
            addCriterion("pet_photo <>", value, "petPhoto");
            return (Criteria) this;
        }

        public Criteria andPetPhotoGreaterThan(String value) {
            addCriterion("pet_photo >", value, "petPhoto");
            return (Criteria) this;
        }

        public Criteria andPetPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("pet_photo >=", value, "petPhoto");
            return (Criteria) this;
        }

        public Criteria andPetPhotoLessThan(String value) {
            addCriterion("pet_photo <", value, "petPhoto");
            return (Criteria) this;
        }

        public Criteria andPetPhotoLessThanOrEqualTo(String value) {
            addCriterion("pet_photo <=", value, "petPhoto");
            return (Criteria) this;
        }

        public Criteria andPetPhotoLike(String value) {
            addCriterion("pet_photo like", value, "petPhoto");
            return (Criteria) this;
        }

        public Criteria andPetPhotoNotLike(String value) {
            addCriterion("pet_photo not like", value, "petPhoto");
            return (Criteria) this;
        }

        public Criteria andPetPhotoIn(List<String> values) {
            addCriterion("pet_photo in", values, "petPhoto");
            return (Criteria) this;
        }

        public Criteria andPetPhotoNotIn(List<String> values) {
            addCriterion("pet_photo not in", values, "petPhoto");
            return (Criteria) this;
        }

        public Criteria andPetPhotoBetween(String value1, String value2) {
            addCriterion("pet_photo between", value1, value2, "petPhoto");
            return (Criteria) this;
        }

        public Criteria andPetPhotoNotBetween(String value1, String value2) {
            addCriterion("pet_photo not between", value1, value2, "petPhoto");
            return (Criteria) this;
        }

        public Criteria andPetMessageIsNull() {
            addCriterion("pet_message is null");
            return (Criteria) this;
        }

        public Criteria andPetMessageIsNotNull() {
            addCriterion("pet_message is not null");
            return (Criteria) this;
        }

        public Criteria andPetMessageEqualTo(String value) {
            addCriterion("pet_message =", value, "petMessage");
            return (Criteria) this;
        }

        public Criteria andPetMessageNotEqualTo(String value) {
            addCriterion("pet_message <>", value, "petMessage");
            return (Criteria) this;
        }

        public Criteria andPetMessageGreaterThan(String value) {
            addCriterion("pet_message >", value, "petMessage");
            return (Criteria) this;
        }

        public Criteria andPetMessageGreaterThanOrEqualTo(String value) {
            addCriterion("pet_message >=", value, "petMessage");
            return (Criteria) this;
        }

        public Criteria andPetMessageLessThan(String value) {
            addCriterion("pet_message <", value, "petMessage");
            return (Criteria) this;
        }

        public Criteria andPetMessageLessThanOrEqualTo(String value) {
            addCriterion("pet_message <=", value, "petMessage");
            return (Criteria) this;
        }

        public Criteria andPetMessageLike(String value) {
            addCriterion("pet_message like", value, "petMessage");
            return (Criteria) this;
        }

        public Criteria andPetMessageNotLike(String value) {
            addCriterion("pet_message not like", value, "petMessage");
            return (Criteria) this;
        }

        public Criteria andPetMessageIn(List<String> values) {
            addCriterion("pet_message in", values, "petMessage");
            return (Criteria) this;
        }

        public Criteria andPetMessageNotIn(List<String> values) {
            addCriterion("pet_message not in", values, "petMessage");
            return (Criteria) this;
        }

        public Criteria andPetMessageBetween(String value1, String value2) {
            addCriterion("pet_message between", value1, value2, "petMessage");
            return (Criteria) this;
        }

        public Criteria andPetMessageNotBetween(String value1, String value2) {
            addCriterion("pet_message not between", value1, value2, "petMessage");
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

        public Criteria andPetRoomStateIsNull() {
            addCriterion("pet_room_state is null");
            return (Criteria) this;
        }

        public Criteria andPetRoomStateIsNotNull() {
            addCriterion("pet_room_state is not null");
            return (Criteria) this;
        }

        public Criteria andPetRoomStateEqualTo(Integer value) {
            addCriterion("pet_room_state =", value, "petRoomState");
            return (Criteria) this;
        }

        public Criteria andPetRoomStateNotEqualTo(Integer value) {
            addCriterion("pet_room_state <>", value, "petRoomState");
            return (Criteria) this;
        }

        public Criteria andPetRoomStateGreaterThan(Integer value) {
            addCriterion("pet_room_state >", value, "petRoomState");
            return (Criteria) this;
        }

        public Criteria andPetRoomStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_room_state >=", value, "petRoomState");
            return (Criteria) this;
        }

        public Criteria andPetRoomStateLessThan(Integer value) {
            addCriterion("pet_room_state <", value, "petRoomState");
            return (Criteria) this;
        }

        public Criteria andPetRoomStateLessThanOrEqualTo(Integer value) {
            addCriterion("pet_room_state <=", value, "petRoomState");
            return (Criteria) this;
        }

        public Criteria andPetRoomStateIn(List<Integer> values) {
            addCriterion("pet_room_state in", values, "petRoomState");
            return (Criteria) this;
        }

        public Criteria andPetRoomStateNotIn(List<Integer> values) {
            addCriterion("pet_room_state not in", values, "petRoomState");
            return (Criteria) this;
        }

        public Criteria andPetRoomStateBetween(Integer value1, Integer value2) {
            addCriterion("pet_room_state between", value1, value2, "petRoomState");
            return (Criteria) this;
        }

        public Criteria andPetRoomStateNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_room_state not between", value1, value2, "petRoomState");
            return (Criteria) this;
        }

        public Criteria andPetRoomSpareIsNull() {
            addCriterion("pet_room_spare is null");
            return (Criteria) this;
        }

        public Criteria andPetRoomSpareIsNotNull() {
            addCriterion("pet_room_spare is not null");
            return (Criteria) this;
        }

        public Criteria andPetRoomSpareEqualTo(String value) {
            addCriterion("pet_room_spare =", value, "petRoomSpare");
            return (Criteria) this;
        }

        public Criteria andPetRoomSpareNotEqualTo(String value) {
            addCriterion("pet_room_spare <>", value, "petRoomSpare");
            return (Criteria) this;
        }

        public Criteria andPetRoomSpareGreaterThan(String value) {
            addCriterion("pet_room_spare >", value, "petRoomSpare");
            return (Criteria) this;
        }

        public Criteria andPetRoomSpareGreaterThanOrEqualTo(String value) {
            addCriterion("pet_room_spare >=", value, "petRoomSpare");
            return (Criteria) this;
        }

        public Criteria andPetRoomSpareLessThan(String value) {
            addCriterion("pet_room_spare <", value, "petRoomSpare");
            return (Criteria) this;
        }

        public Criteria andPetRoomSpareLessThanOrEqualTo(String value) {
            addCriterion("pet_room_spare <=", value, "petRoomSpare");
            return (Criteria) this;
        }

        public Criteria andPetRoomSpareLike(String value) {
            addCriterion("pet_room_spare like", value, "petRoomSpare");
            return (Criteria) this;
        }

        public Criteria andPetRoomSpareNotLike(String value) {
            addCriterion("pet_room_spare not like", value, "petRoomSpare");
            return (Criteria) this;
        }

        public Criteria andPetRoomSpareIn(List<String> values) {
            addCriterion("pet_room_spare in", values, "petRoomSpare");
            return (Criteria) this;
        }

        public Criteria andPetRoomSpareNotIn(List<String> values) {
            addCriterion("pet_room_spare not in", values, "petRoomSpare");
            return (Criteria) this;
        }

        public Criteria andPetRoomSpareBetween(String value1, String value2) {
            addCriterion("pet_room_spare between", value1, value2, "petRoomSpare");
            return (Criteria) this;
        }

        public Criteria andPetRoomSpareNotBetween(String value1, String value2) {
            addCriterion("pet_room_spare not between", value1, value2, "petRoomSpare");
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