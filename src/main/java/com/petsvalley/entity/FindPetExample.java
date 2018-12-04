package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FindPetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public FindPetExample() {
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

        public Criteria andFpIdIsNull() {
            addCriterion("fp_id is null");
            return (Criteria) this;
        }

        public Criteria andFpIdIsNotNull() {
            addCriterion("fp_id is not null");
            return (Criteria) this;
        }

        public Criteria andFpIdEqualTo(Integer value) {
            addCriterion("fp_id =", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdNotEqualTo(Integer value) {
            addCriterion("fp_id <>", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdGreaterThan(Integer value) {
            addCriterion("fp_id >", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fp_id >=", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdLessThan(Integer value) {
            addCriterion("fp_id <", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdLessThanOrEqualTo(Integer value) {
            addCriterion("fp_id <=", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdIn(List<Integer> values) {
            addCriterion("fp_id in", values, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdNotIn(List<Integer> values) {
            addCriterion("fp_id not in", values, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdBetween(Integer value1, Integer value2) {
            addCriterion("fp_id between", value1, value2, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fp_id not between", value1, value2, "fpId");
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

        public Criteria andLostTimeIsNull() {
            addCriterion("lost_time is null");
            return (Criteria) this;
        }

        public Criteria andLostTimeIsNotNull() {
            addCriterion("lost_time is not null");
            return (Criteria) this;
        }

        public Criteria andLostTimeEqualTo(Date value) {
            addCriterion("lost_time =", value, "lostTime");
            return (Criteria) this;
        }

        public Criteria andLostTimeNotEqualTo(Date value) {
            addCriterion("lost_time <>", value, "lostTime");
            return (Criteria) this;
        }

        public Criteria andLostTimeGreaterThan(Date value) {
            addCriterion("lost_time >", value, "lostTime");
            return (Criteria) this;
        }

        public Criteria andLostTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lost_time >=", value, "lostTime");
            return (Criteria) this;
        }

        public Criteria andLostTimeLessThan(Date value) {
            addCriterion("lost_time <", value, "lostTime");
            return (Criteria) this;
        }

        public Criteria andLostTimeLessThanOrEqualTo(Date value) {
            addCriterion("lost_time <=", value, "lostTime");
            return (Criteria) this;
        }

        public Criteria andLostTimeIn(List<Date> values) {
            addCriterion("lost_time in", values, "lostTime");
            return (Criteria) this;
        }

        public Criteria andLostTimeNotIn(List<Date> values) {
            addCriterion("lost_time not in", values, "lostTime");
            return (Criteria) this;
        }

        public Criteria andLostTimeBetween(Date value1, Date value2) {
            addCriterion("lost_time between", value1, value2, "lostTime");
            return (Criteria) this;
        }

        public Criteria andLostTimeNotBetween(Date value1, Date value2) {
            addCriterion("lost_time not between", value1, value2, "lostTime");
            return (Criteria) this;
        }

        public Criteria andLostMessageIsNull() {
            addCriterion("lost_message is null");
            return (Criteria) this;
        }

        public Criteria andLostMessageIsNotNull() {
            addCriterion("lost_message is not null");
            return (Criteria) this;
        }

        public Criteria andLostMessageEqualTo(String value) {
            addCriterion("lost_message =", value, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageNotEqualTo(String value) {
            addCriterion("lost_message <>", value, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageGreaterThan(String value) {
            addCriterion("lost_message >", value, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageGreaterThanOrEqualTo(String value) {
            addCriterion("lost_message >=", value, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageLessThan(String value) {
            addCriterion("lost_message <", value, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageLessThanOrEqualTo(String value) {
            addCriterion("lost_message <=", value, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageLike(String value) {
            addCriterion("lost_message like", value, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageNotLike(String value) {
            addCriterion("lost_message not like", value, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageIn(List<String> values) {
            addCriterion("lost_message in", values, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageNotIn(List<String> values) {
            addCriterion("lost_message not in", values, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageBetween(String value1, String value2) {
            addCriterion("lost_message between", value1, value2, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageNotBetween(String value1, String value2) {
            addCriterion("lost_message not between", value1, value2, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostPlaceIsNull() {
            addCriterion("lost_place is null");
            return (Criteria) this;
        }

        public Criteria andLostPlaceIsNotNull() {
            addCriterion("lost_place is not null");
            return (Criteria) this;
        }

        public Criteria andLostPlaceEqualTo(String value) {
            addCriterion("lost_place =", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceNotEqualTo(String value) {
            addCriterion("lost_place <>", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceGreaterThan(String value) {
            addCriterion("lost_place >", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("lost_place >=", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceLessThan(String value) {
            addCriterion("lost_place <", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceLessThanOrEqualTo(String value) {
            addCriterion("lost_place <=", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceLike(String value) {
            addCriterion("lost_place like", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceNotLike(String value) {
            addCriterion("lost_place not like", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceIn(List<String> values) {
            addCriterion("lost_place in", values, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceNotIn(List<String> values) {
            addCriterion("lost_place not in", values, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceBetween(String value1, String value2) {
            addCriterion("lost_place between", value1, value2, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceNotBetween(String value1, String value2) {
            addCriterion("lost_place not between", value1, value2, "lostPlace");
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

        public Criteria andFpRewardIsNull() {
            addCriterion("fp_reward is null");
            return (Criteria) this;
        }

        public Criteria andFpRewardIsNotNull() {
            addCriterion("fp_reward is not null");
            return (Criteria) this;
        }

        public Criteria andFpRewardEqualTo(Integer value) {
            addCriterion("fp_reward =", value, "fpReward");
            return (Criteria) this;
        }

        public Criteria andFpRewardNotEqualTo(Integer value) {
            addCriterion("fp_reward <>", value, "fpReward");
            return (Criteria) this;
        }

        public Criteria andFpRewardGreaterThan(Integer value) {
            addCriterion("fp_reward >", value, "fpReward");
            return (Criteria) this;
        }

        public Criteria andFpRewardGreaterThanOrEqualTo(Integer value) {
            addCriterion("fp_reward >=", value, "fpReward");
            return (Criteria) this;
        }

        public Criteria andFpRewardLessThan(Integer value) {
            addCriterion("fp_reward <", value, "fpReward");
            return (Criteria) this;
        }

        public Criteria andFpRewardLessThanOrEqualTo(Integer value) {
            addCriterion("fp_reward <=", value, "fpReward");
            return (Criteria) this;
        }

        public Criteria andFpRewardIn(List<Integer> values) {
            addCriterion("fp_reward in", values, "fpReward");
            return (Criteria) this;
        }

        public Criteria andFpRewardNotIn(List<Integer> values) {
            addCriterion("fp_reward not in", values, "fpReward");
            return (Criteria) this;
        }

        public Criteria andFpRewardBetween(Integer value1, Integer value2) {
            addCriterion("fp_reward between", value1, value2, "fpReward");
            return (Criteria) this;
        }

        public Criteria andFpRewardNotBetween(Integer value1, Integer value2) {
            addCriterion("fp_reward not between", value1, value2, "fpReward");
            return (Criteria) this;
        }

        public Criteria andFpPhoneIsNull() {
            addCriterion("fp_phone is null");
            return (Criteria) this;
        }

        public Criteria andFpPhoneIsNotNull() {
            addCriterion("fp_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFpPhoneEqualTo(String value) {
            addCriterion("fp_phone =", value, "fpPhone");
            return (Criteria) this;
        }

        public Criteria andFpPhoneNotEqualTo(String value) {
            addCriterion("fp_phone <>", value, "fpPhone");
            return (Criteria) this;
        }

        public Criteria andFpPhoneGreaterThan(String value) {
            addCriterion("fp_phone >", value, "fpPhone");
            return (Criteria) this;
        }

        public Criteria andFpPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("fp_phone >=", value, "fpPhone");
            return (Criteria) this;
        }

        public Criteria andFpPhoneLessThan(String value) {
            addCriterion("fp_phone <", value, "fpPhone");
            return (Criteria) this;
        }

        public Criteria andFpPhoneLessThanOrEqualTo(String value) {
            addCriterion("fp_phone <=", value, "fpPhone");
            return (Criteria) this;
        }

        public Criteria andFpPhoneLike(String value) {
            addCriterion("fp_phone like", value, "fpPhone");
            return (Criteria) this;
        }

        public Criteria andFpPhoneNotLike(String value) {
            addCriterion("fp_phone not like", value, "fpPhone");
            return (Criteria) this;
        }

        public Criteria andFpPhoneIn(List<String> values) {
            addCriterion("fp_phone in", values, "fpPhone");
            return (Criteria) this;
        }

        public Criteria andFpPhoneNotIn(List<String> values) {
            addCriterion("fp_phone not in", values, "fpPhone");
            return (Criteria) this;
        }

        public Criteria andFpPhoneBetween(String value1, String value2) {
            addCriterion("fp_phone between", value1, value2, "fpPhone");
            return (Criteria) this;
        }

        public Criteria andFpPhoneNotBetween(String value1, String value2) {
            addCriterion("fp_phone not between", value1, value2, "fpPhone");
            return (Criteria) this;
        }

        public Criteria andFpStateIsNull() {
            addCriterion("fp_state is null");
            return (Criteria) this;
        }

        public Criteria andFpStateIsNotNull() {
            addCriterion("fp_state is not null");
            return (Criteria) this;
        }

        public Criteria andFpStateEqualTo(Integer value) {
            addCriterion("fp_state =", value, "fpState");
            return (Criteria) this;
        }

        public Criteria andFpStateNotEqualTo(Integer value) {
            addCriterion("fp_state <>", value, "fpState");
            return (Criteria) this;
        }

        public Criteria andFpStateGreaterThan(Integer value) {
            addCriterion("fp_state >", value, "fpState");
            return (Criteria) this;
        }

        public Criteria andFpStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("fp_state >=", value, "fpState");
            return (Criteria) this;
        }

        public Criteria andFpStateLessThan(Integer value) {
            addCriterion("fp_state <", value, "fpState");
            return (Criteria) this;
        }

        public Criteria andFpStateLessThanOrEqualTo(Integer value) {
            addCriterion("fp_state <=", value, "fpState");
            return (Criteria) this;
        }

        public Criteria andFpStateIn(List<Integer> values) {
            addCriterion("fp_state in", values, "fpState");
            return (Criteria) this;
        }

        public Criteria andFpStateNotIn(List<Integer> values) {
            addCriterion("fp_state not in", values, "fpState");
            return (Criteria) this;
        }

        public Criteria andFpStateBetween(Integer value1, Integer value2) {
            addCriterion("fp_state between", value1, value2, "fpState");
            return (Criteria) this;
        }

        public Criteria andFpStateNotBetween(Integer value1, Integer value2) {
            addCriterion("fp_state not between", value1, value2, "fpState");
            return (Criteria) this;
        }

        public Criteria andFdSpareIsNull() {
            addCriterion("fd_spare is null");
            return (Criteria) this;
        }

        public Criteria andFdSpareIsNotNull() {
            addCriterion("fd_spare is not null");
            return (Criteria) this;
        }

        public Criteria andFdSpareEqualTo(String value) {
            addCriterion("fd_spare =", value, "fdSpare");
            return (Criteria) this;
        }

        public Criteria andFdSpareNotEqualTo(String value) {
            addCriterion("fd_spare <>", value, "fdSpare");
            return (Criteria) this;
        }

        public Criteria andFdSpareGreaterThan(String value) {
            addCriterion("fd_spare >", value, "fdSpare");
            return (Criteria) this;
        }

        public Criteria andFdSpareGreaterThanOrEqualTo(String value) {
            addCriterion("fd_spare >=", value, "fdSpare");
            return (Criteria) this;
        }

        public Criteria andFdSpareLessThan(String value) {
            addCriterion("fd_spare <", value, "fdSpare");
            return (Criteria) this;
        }

        public Criteria andFdSpareLessThanOrEqualTo(String value) {
            addCriterion("fd_spare <=", value, "fdSpare");
            return (Criteria) this;
        }

        public Criteria andFdSpareLike(String value) {
            addCriterion("fd_spare like", value, "fdSpare");
            return (Criteria) this;
        }

        public Criteria andFdSpareNotLike(String value) {
            addCriterion("fd_spare not like", value, "fdSpare");
            return (Criteria) this;
        }

        public Criteria andFdSpareIn(List<String> values) {
            addCriterion("fd_spare in", values, "fdSpare");
            return (Criteria) this;
        }

        public Criteria andFdSpareNotIn(List<String> values) {
            addCriterion("fd_spare not in", values, "fdSpare");
            return (Criteria) this;
        }

        public Criteria andFdSpareBetween(String value1, String value2) {
            addCriterion("fd_spare between", value1, value2, "fdSpare");
            return (Criteria) this;
        }

        public Criteria andFdSpareNotBetween(String value1, String value2) {
            addCriterion("fd_spare not between", value1, value2, "fdSpare");
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