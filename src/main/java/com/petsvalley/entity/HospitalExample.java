package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.List;

public class HospitalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HospitalExample() {
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

        public Criteria andHosIdIsNull() {
            addCriterion("hos_id is null");
            return (Criteria) this;
        }

        public Criteria andHosIdIsNotNull() {
            addCriterion("hos_id is not null");
            return (Criteria) this;
        }

        public Criteria andHosIdEqualTo(Integer value) {
            addCriterion("hos_id =", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdNotEqualTo(Integer value) {
            addCriterion("hos_id <>", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdGreaterThan(Integer value) {
            addCriterion("hos_id >", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hos_id >=", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdLessThan(Integer value) {
            addCriterion("hos_id <", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdLessThanOrEqualTo(Integer value) {
            addCriterion("hos_id <=", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdIn(List<Integer> values) {
            addCriterion("hos_id in", values, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdNotIn(List<Integer> values) {
            addCriterion("hos_id not in", values, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdBetween(Integer value1, Integer value2) {
            addCriterion("hos_id between", value1, value2, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hos_id not between", value1, value2, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosNameIsNull() {
            addCriterion("hos_name is null");
            return (Criteria) this;
        }

        public Criteria andHosNameIsNotNull() {
            addCriterion("hos_name is not null");
            return (Criteria) this;
        }

        public Criteria andHosNameEqualTo(String value) {
            addCriterion("hos_name =", value, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameNotEqualTo(String value) {
            addCriterion("hos_name <>", value, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameGreaterThan(String value) {
            addCriterion("hos_name >", value, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameGreaterThanOrEqualTo(String value) {
            addCriterion("hos_name >=", value, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameLessThan(String value) {
            addCriterion("hos_name <", value, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameLessThanOrEqualTo(String value) {
            addCriterion("hos_name <=", value, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameLike(String value) {
            addCriterion("hos_name like", value, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameNotLike(String value) {
            addCriterion("hos_name not like", value, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameIn(List<String> values) {
            addCriterion("hos_name in", values, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameNotIn(List<String> values) {
            addCriterion("hos_name not in", values, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameBetween(String value1, String value2) {
            addCriterion("hos_name between", value1, value2, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameNotBetween(String value1, String value2) {
            addCriterion("hos_name not between", value1, value2, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosTeleIsNull() {
            addCriterion("hos_tele is null");
            return (Criteria) this;
        }

        public Criteria andHosTeleIsNotNull() {
            addCriterion("hos_tele is not null");
            return (Criteria) this;
        }

        public Criteria andHosTeleEqualTo(String value) {
            addCriterion("hos_tele =", value, "hosTele");
            return (Criteria) this;
        }

        public Criteria andHosTeleNotEqualTo(String value) {
            addCriterion("hos_tele <>", value, "hosTele");
            return (Criteria) this;
        }

        public Criteria andHosTeleGreaterThan(String value) {
            addCriterion("hos_tele >", value, "hosTele");
            return (Criteria) this;
        }

        public Criteria andHosTeleGreaterThanOrEqualTo(String value) {
            addCriterion("hos_tele >=", value, "hosTele");
            return (Criteria) this;
        }

        public Criteria andHosTeleLessThan(String value) {
            addCriterion("hos_tele <", value, "hosTele");
            return (Criteria) this;
        }

        public Criteria andHosTeleLessThanOrEqualTo(String value) {
            addCriterion("hos_tele <=", value, "hosTele");
            return (Criteria) this;
        }

        public Criteria andHosTeleLike(String value) {
            addCriterion("hos_tele like", value, "hosTele");
            return (Criteria) this;
        }

        public Criteria andHosTeleNotLike(String value) {
            addCriterion("hos_tele not like", value, "hosTele");
            return (Criteria) this;
        }

        public Criteria andHosTeleIn(List<String> values) {
            addCriterion("hos_tele in", values, "hosTele");
            return (Criteria) this;
        }

        public Criteria andHosTeleNotIn(List<String> values) {
            addCriterion("hos_tele not in", values, "hosTele");
            return (Criteria) this;
        }

        public Criteria andHosTeleBetween(String value1, String value2) {
            addCriterion("hos_tele between", value1, value2, "hosTele");
            return (Criteria) this;
        }

        public Criteria andHosTeleNotBetween(String value1, String value2) {
            addCriterion("hos_tele not between", value1, value2, "hosTele");
            return (Criteria) this;
        }

        public Criteria andHosPlaceIsNull() {
            addCriterion("hos_place is null");
            return (Criteria) this;
        }

        public Criteria andHosPlaceIsNotNull() {
            addCriterion("hos_place is not null");
            return (Criteria) this;
        }

        public Criteria andHosPlaceEqualTo(String value) {
            addCriterion("hos_place =", value, "hosPlace");
            return (Criteria) this;
        }

        public Criteria andHosPlaceNotEqualTo(String value) {
            addCriterion("hos_place <>", value, "hosPlace");
            return (Criteria) this;
        }

        public Criteria andHosPlaceGreaterThan(String value) {
            addCriterion("hos_place >", value, "hosPlace");
            return (Criteria) this;
        }

        public Criteria andHosPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("hos_place >=", value, "hosPlace");
            return (Criteria) this;
        }

        public Criteria andHosPlaceLessThan(String value) {
            addCriterion("hos_place <", value, "hosPlace");
            return (Criteria) this;
        }

        public Criteria andHosPlaceLessThanOrEqualTo(String value) {
            addCriterion("hos_place <=", value, "hosPlace");
            return (Criteria) this;
        }

        public Criteria andHosPlaceLike(String value) {
            addCriterion("hos_place like", value, "hosPlace");
            return (Criteria) this;
        }

        public Criteria andHosPlaceNotLike(String value) {
            addCriterion("hos_place not like", value, "hosPlace");
            return (Criteria) this;
        }

        public Criteria andHosPlaceIn(List<String> values) {
            addCriterion("hos_place in", values, "hosPlace");
            return (Criteria) this;
        }

        public Criteria andHosPlaceNotIn(List<String> values) {
            addCriterion("hos_place not in", values, "hosPlace");
            return (Criteria) this;
        }

        public Criteria andHosPlaceBetween(String value1, String value2) {
            addCriterion("hos_place between", value1, value2, "hosPlace");
            return (Criteria) this;
        }

        public Criteria andHosPlaceNotBetween(String value1, String value2) {
            addCriterion("hos_place not between", value1, value2, "hosPlace");
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

        public Criteria andHosPhotoIsNull() {
            addCriterion("hos_photo is null");
            return (Criteria) this;
        }

        public Criteria andHosPhotoIsNotNull() {
            addCriterion("hos_photo is not null");
            return (Criteria) this;
        }

        public Criteria andHosPhotoEqualTo(String value) {
            addCriterion("hos_photo =", value, "hosPhoto");
            return (Criteria) this;
        }

        public Criteria andHosPhotoNotEqualTo(String value) {
            addCriterion("hos_photo <>", value, "hosPhoto");
            return (Criteria) this;
        }

        public Criteria andHosPhotoGreaterThan(String value) {
            addCriterion("hos_photo >", value, "hosPhoto");
            return (Criteria) this;
        }

        public Criteria andHosPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("hos_photo >=", value, "hosPhoto");
            return (Criteria) this;
        }

        public Criteria andHosPhotoLessThan(String value) {
            addCriterion("hos_photo <", value, "hosPhoto");
            return (Criteria) this;
        }

        public Criteria andHosPhotoLessThanOrEqualTo(String value) {
            addCriterion("hos_photo <=", value, "hosPhoto");
            return (Criteria) this;
        }

        public Criteria andHosPhotoLike(String value) {
            addCriterion("hos_photo like", value, "hosPhoto");
            return (Criteria) this;
        }

        public Criteria andHosPhotoNotLike(String value) {
            addCriterion("hos_photo not like", value, "hosPhoto");
            return (Criteria) this;
        }

        public Criteria andHosPhotoIn(List<String> values) {
            addCriterion("hos_photo in", values, "hosPhoto");
            return (Criteria) this;
        }

        public Criteria andHosPhotoNotIn(List<String> values) {
            addCriterion("hos_photo not in", values, "hosPhoto");
            return (Criteria) this;
        }

        public Criteria andHosPhotoBetween(String value1, String value2) {
            addCriterion("hos_photo between", value1, value2, "hosPhoto");
            return (Criteria) this;
        }

        public Criteria andHosPhotoNotBetween(String value1, String value2) {
            addCriterion("hos_photo not between", value1, value2, "hosPhoto");
            return (Criteria) this;
        }

        public Criteria andHosMessageIsNull() {
            addCriterion("hos_message is null");
            return (Criteria) this;
        }

        public Criteria andHosMessageIsNotNull() {
            addCriterion("hos_message is not null");
            return (Criteria) this;
        }

        public Criteria andHosMessageEqualTo(String value) {
            addCriterion("hos_message =", value, "hosMessage");
            return (Criteria) this;
        }

        public Criteria andHosMessageNotEqualTo(String value) {
            addCriterion("hos_message <>", value, "hosMessage");
            return (Criteria) this;
        }

        public Criteria andHosMessageGreaterThan(String value) {
            addCriterion("hos_message >", value, "hosMessage");
            return (Criteria) this;
        }

        public Criteria andHosMessageGreaterThanOrEqualTo(String value) {
            addCriterion("hos_message >=", value, "hosMessage");
            return (Criteria) this;
        }

        public Criteria andHosMessageLessThan(String value) {
            addCriterion("hos_message <", value, "hosMessage");
            return (Criteria) this;
        }

        public Criteria andHosMessageLessThanOrEqualTo(String value) {
            addCriterion("hos_message <=", value, "hosMessage");
            return (Criteria) this;
        }

        public Criteria andHosMessageLike(String value) {
            addCriterion("hos_message like", value, "hosMessage");
            return (Criteria) this;
        }

        public Criteria andHosMessageNotLike(String value) {
            addCriterion("hos_message not like", value, "hosMessage");
            return (Criteria) this;
        }

        public Criteria andHosMessageIn(List<String> values) {
            addCriterion("hos_message in", values, "hosMessage");
            return (Criteria) this;
        }

        public Criteria andHosMessageNotIn(List<String> values) {
            addCriterion("hos_message not in", values, "hosMessage");
            return (Criteria) this;
        }

        public Criteria andHosMessageBetween(String value1, String value2) {
            addCriterion("hos_message between", value1, value2, "hosMessage");
            return (Criteria) this;
        }

        public Criteria andHosMessageNotBetween(String value1, String value2) {
            addCriterion("hos_message not between", value1, value2, "hosMessage");
            return (Criteria) this;
        }

        public Criteria andHosStateIsNull() {
            addCriterion("hos_state is null");
            return (Criteria) this;
        }

        public Criteria andHosStateIsNotNull() {
            addCriterion("hos_state is not null");
            return (Criteria) this;
        }

        public Criteria andHosStateEqualTo(Integer value) {
            addCriterion("hos_state =", value, "hosState");
            return (Criteria) this;
        }

        public Criteria andHosStateNotEqualTo(Integer value) {
            addCriterion("hos_state <>", value, "hosState");
            return (Criteria) this;
        }

        public Criteria andHosStateGreaterThan(Integer value) {
            addCriterion("hos_state >", value, "hosState");
            return (Criteria) this;
        }

        public Criteria andHosStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("hos_state >=", value, "hosState");
            return (Criteria) this;
        }

        public Criteria andHosStateLessThan(Integer value) {
            addCriterion("hos_state <", value, "hosState");
            return (Criteria) this;
        }

        public Criteria andHosStateLessThanOrEqualTo(Integer value) {
            addCriterion("hos_state <=", value, "hosState");
            return (Criteria) this;
        }

        public Criteria andHosStateIn(List<Integer> values) {
            addCriterion("hos_state in", values, "hosState");
            return (Criteria) this;
        }

        public Criteria andHosStateNotIn(List<Integer> values) {
            addCriterion("hos_state not in", values, "hosState");
            return (Criteria) this;
        }

        public Criteria andHosStateBetween(Integer value1, Integer value2) {
            addCriterion("hos_state between", value1, value2, "hosState");
            return (Criteria) this;
        }

        public Criteria andHosStateNotBetween(Integer value1, Integer value2) {
            addCriterion("hos_state not between", value1, value2, "hosState");
            return (Criteria) this;
        }

        public Criteria andHosSpareIsNull() {
            addCriterion("hos_spare is null");
            return (Criteria) this;
        }

        public Criteria andHosSpareIsNotNull() {
            addCriterion("hos_spare is not null");
            return (Criteria) this;
        }

        public Criteria andHosSpareEqualTo(String value) {
            addCriterion("hos_spare =", value, "hosSpare");
            return (Criteria) this;
        }

        public Criteria andHosSpareNotEqualTo(String value) {
            addCriterion("hos_spare <>", value, "hosSpare");
            return (Criteria) this;
        }

        public Criteria andHosSpareGreaterThan(String value) {
            addCriterion("hos_spare >", value, "hosSpare");
            return (Criteria) this;
        }

        public Criteria andHosSpareGreaterThanOrEqualTo(String value) {
            addCriterion("hos_spare >=", value, "hosSpare");
            return (Criteria) this;
        }

        public Criteria andHosSpareLessThan(String value) {
            addCriterion("hos_spare <", value, "hosSpare");
            return (Criteria) this;
        }

        public Criteria andHosSpareLessThanOrEqualTo(String value) {
            addCriterion("hos_spare <=", value, "hosSpare");
            return (Criteria) this;
        }

        public Criteria andHosSpareLike(String value) {
            addCriterion("hos_spare like", value, "hosSpare");
            return (Criteria) this;
        }

        public Criteria andHosSpareNotLike(String value) {
            addCriterion("hos_spare not like", value, "hosSpare");
            return (Criteria) this;
        }

        public Criteria andHosSpareIn(List<String> values) {
            addCriterion("hos_spare in", values, "hosSpare");
            return (Criteria) this;
        }

        public Criteria andHosSpareNotIn(List<String> values) {
            addCriterion("hos_spare not in", values, "hosSpare");
            return (Criteria) this;
        }

        public Criteria andHosSpareBetween(String value1, String value2) {
            addCriterion("hos_spare between", value1, value2, "hosSpare");
            return (Criteria) this;
        }

        public Criteria andHosSpareNotBetween(String value1, String value2) {
            addCriterion("hos_spare not between", value1, value2, "hosSpare");
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