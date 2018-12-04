package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.List;

public class PetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PetExample() {
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

        public Criteria andPetMateStateIsNull() {
            addCriterion("pet_mate_state is null");
            return (Criteria) this;
        }

        public Criteria andPetMateStateIsNotNull() {
            addCriterion("pet_mate_state is not null");
            return (Criteria) this;
        }

        public Criteria andPetMateStateEqualTo(Integer value) {
            addCriterion("pet_mate_state =", value, "petMateState");
            return (Criteria) this;
        }

        public Criteria andPetMateStateNotEqualTo(Integer value) {
            addCriterion("pet_mate_state <>", value, "petMateState");
            return (Criteria) this;
        }

        public Criteria andPetMateStateGreaterThan(Integer value) {
            addCriterion("pet_mate_state >", value, "petMateState");
            return (Criteria) this;
        }

        public Criteria andPetMateStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_mate_state >=", value, "petMateState");
            return (Criteria) this;
        }

        public Criteria andPetMateStateLessThan(Integer value) {
            addCriterion("pet_mate_state <", value, "petMateState");
            return (Criteria) this;
        }

        public Criteria andPetMateStateLessThanOrEqualTo(Integer value) {
            addCriterion("pet_mate_state <=", value, "petMateState");
            return (Criteria) this;
        }

        public Criteria andPetMateStateIn(List<Integer> values) {
            addCriterion("pet_mate_state in", values, "petMateState");
            return (Criteria) this;
        }

        public Criteria andPetMateStateNotIn(List<Integer> values) {
            addCriterion("pet_mate_state not in", values, "petMateState");
            return (Criteria) this;
        }

        public Criteria andPetMateStateBetween(Integer value1, Integer value2) {
            addCriterion("pet_mate_state between", value1, value2, "petMateState");
            return (Criteria) this;
        }

        public Criteria andPetMateStateNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_mate_state not between", value1, value2, "petMateState");
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

        public Criteria andPetGenderIsNull() {
            addCriterion("pet_gender is null");
            return (Criteria) this;
        }

        public Criteria andPetGenderIsNotNull() {
            addCriterion("pet_gender is not null");
            return (Criteria) this;
        }

        public Criteria andPetGenderEqualTo(Integer value) {
            addCriterion("pet_gender =", value, "petGender");
            return (Criteria) this;
        }

        public Criteria andPetGenderNotEqualTo(Integer value) {
            addCriterion("pet_gender <>", value, "petGender");
            return (Criteria) this;
        }

        public Criteria andPetGenderGreaterThan(Integer value) {
            addCriterion("pet_gender >", value, "petGender");
            return (Criteria) this;
        }

        public Criteria andPetGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_gender >=", value, "petGender");
            return (Criteria) this;
        }

        public Criteria andPetGenderLessThan(Integer value) {
            addCriterion("pet_gender <", value, "petGender");
            return (Criteria) this;
        }

        public Criteria andPetGenderLessThanOrEqualTo(Integer value) {
            addCriterion("pet_gender <=", value, "petGender");
            return (Criteria) this;
        }

        public Criteria andPetGenderIn(List<Integer> values) {
            addCriterion("pet_gender in", values, "petGender");
            return (Criteria) this;
        }

        public Criteria andPetGenderNotIn(List<Integer> values) {
            addCriterion("pet_gender not in", values, "petGender");
            return (Criteria) this;
        }

        public Criteria andPetGenderBetween(Integer value1, Integer value2) {
            addCriterion("pet_gender between", value1, value2, "petGender");
            return (Criteria) this;
        }

        public Criteria andPetGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_gender not between", value1, value2, "petGender");
            return (Criteria) this;
        }

        public Criteria andPetAgeIsNull() {
            addCriterion("pet_age is null");
            return (Criteria) this;
        }

        public Criteria andPetAgeIsNotNull() {
            addCriterion("pet_age is not null");
            return (Criteria) this;
        }

        public Criteria andPetAgeEqualTo(Integer value) {
            addCriterion("pet_age =", value, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeNotEqualTo(Integer value) {
            addCriterion("pet_age <>", value, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeGreaterThan(Integer value) {
            addCriterion("pet_age >", value, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_age >=", value, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeLessThan(Integer value) {
            addCriterion("pet_age <", value, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeLessThanOrEqualTo(Integer value) {
            addCriterion("pet_age <=", value, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeIn(List<Integer> values) {
            addCriterion("pet_age in", values, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeNotIn(List<Integer> values) {
            addCriterion("pet_age not in", values, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeBetween(Integer value1, Integer value2) {
            addCriterion("pet_age between", value1, value2, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_age not between", value1, value2, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetTypeIdIsNull() {
            addCriterion("pet_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPetTypeIdIsNotNull() {
            addCriterion("pet_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPetTypeIdEqualTo(Integer value) {
            addCriterion("pet_type_id =", value, "petTypeId");
            return (Criteria) this;
        }

        public Criteria andPetTypeIdNotEqualTo(Integer value) {
            addCriterion("pet_type_id <>", value, "petTypeId");
            return (Criteria) this;
        }

        public Criteria andPetTypeIdGreaterThan(Integer value) {
            addCriterion("pet_type_id >", value, "petTypeId");
            return (Criteria) this;
        }

        public Criteria andPetTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_type_id >=", value, "petTypeId");
            return (Criteria) this;
        }

        public Criteria andPetTypeIdLessThan(Integer value) {
            addCriterion("pet_type_id <", value, "petTypeId");
            return (Criteria) this;
        }

        public Criteria andPetTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("pet_type_id <=", value, "petTypeId");
            return (Criteria) this;
        }

        public Criteria andPetTypeIdIn(List<Integer> values) {
            addCriterion("pet_type_id in", values, "petTypeId");
            return (Criteria) this;
        }

        public Criteria andPetTypeIdNotIn(List<Integer> values) {
            addCriterion("pet_type_id not in", values, "petTypeId");
            return (Criteria) this;
        }

        public Criteria andPetTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("pet_type_id between", value1, value2, "petTypeId");
            return (Criteria) this;
        }

        public Criteria andPetTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_type_id not between", value1, value2, "petTypeId");
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

        public Criteria andPetWeightIsNull() {
            addCriterion("pet_weight is null");
            return (Criteria) this;
        }

        public Criteria andPetWeightIsNotNull() {
            addCriterion("pet_weight is not null");
            return (Criteria) this;
        }

        public Criteria andPetWeightEqualTo(Double value) {
            addCriterion("pet_weight =", value, "petWeight");
            return (Criteria) this;
        }

        public Criteria andPetWeightNotEqualTo(Double value) {
            addCriterion("pet_weight <>", value, "petWeight");
            return (Criteria) this;
        }

        public Criteria andPetWeightGreaterThan(Double value) {
            addCriterion("pet_weight >", value, "petWeight");
            return (Criteria) this;
        }

        public Criteria andPetWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("pet_weight >=", value, "petWeight");
            return (Criteria) this;
        }

        public Criteria andPetWeightLessThan(Double value) {
            addCriterion("pet_weight <", value, "petWeight");
            return (Criteria) this;
        }

        public Criteria andPetWeightLessThanOrEqualTo(Double value) {
            addCriterion("pet_weight <=", value, "petWeight");
            return (Criteria) this;
        }

        public Criteria andPetWeightIn(List<Double> values) {
            addCriterion("pet_weight in", values, "petWeight");
            return (Criteria) this;
        }

        public Criteria andPetWeightNotIn(List<Double> values) {
            addCriterion("pet_weight not in", values, "petWeight");
            return (Criteria) this;
        }

        public Criteria andPetWeightBetween(Double value1, Double value2) {
            addCriterion("pet_weight between", value1, value2, "petWeight");
            return (Criteria) this;
        }

        public Criteria andPetWeightNotBetween(Double value1, Double value2) {
            addCriterion("pet_weight not between", value1, value2, "petWeight");
            return (Criteria) this;
        }

        public Criteria andPetStateIsNull() {
            addCriterion("pet_state is null");
            return (Criteria) this;
        }

        public Criteria andPetStateIsNotNull() {
            addCriterion("pet_state is not null");
            return (Criteria) this;
        }

        public Criteria andPetStateEqualTo(Integer value) {
            addCriterion("pet_state =", value, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateNotEqualTo(Integer value) {
            addCriterion("pet_state <>", value, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateGreaterThan(Integer value) {
            addCriterion("pet_state >", value, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_state >=", value, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateLessThan(Integer value) {
            addCriterion("pet_state <", value, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateLessThanOrEqualTo(Integer value) {
            addCriterion("pet_state <=", value, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateIn(List<Integer> values) {
            addCriterion("pet_state in", values, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateNotIn(List<Integer> values) {
            addCriterion("pet_state not in", values, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateBetween(Integer value1, Integer value2) {
            addCriterion("pet_state between", value1, value2, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_state not between", value1, value2, "petState");
            return (Criteria) this;
        }

        public Criteria andPetSpareIsNull() {
            addCriterion("pet_spare is null");
            return (Criteria) this;
        }

        public Criteria andPetSpareIsNotNull() {
            addCriterion("pet_spare is not null");
            return (Criteria) this;
        }

        public Criteria andPetSpareEqualTo(String value) {
            addCriterion("pet_spare =", value, "petSpare");
            return (Criteria) this;
        }

        public Criteria andPetSpareNotEqualTo(String value) {
            addCriterion("pet_spare <>", value, "petSpare");
            return (Criteria) this;
        }

        public Criteria andPetSpareGreaterThan(String value) {
            addCriterion("pet_spare >", value, "petSpare");
            return (Criteria) this;
        }

        public Criteria andPetSpareGreaterThanOrEqualTo(String value) {
            addCriterion("pet_spare >=", value, "petSpare");
            return (Criteria) this;
        }

        public Criteria andPetSpareLessThan(String value) {
            addCriterion("pet_spare <", value, "petSpare");
            return (Criteria) this;
        }

        public Criteria andPetSpareLessThanOrEqualTo(String value) {
            addCriterion("pet_spare <=", value, "petSpare");
            return (Criteria) this;
        }

        public Criteria andPetSpareLike(String value) {
            addCriterion("pet_spare like", value, "petSpare");
            return (Criteria) this;
        }

        public Criteria andPetSpareNotLike(String value) {
            addCriterion("pet_spare not like", value, "petSpare");
            return (Criteria) this;
        }

        public Criteria andPetSpareIn(List<String> values) {
            addCriterion("pet_spare in", values, "petSpare");
            return (Criteria) this;
        }

        public Criteria andPetSpareNotIn(List<String> values) {
            addCriterion("pet_spare not in", values, "petSpare");
            return (Criteria) this;
        }

        public Criteria andPetSpareBetween(String value1, String value2) {
            addCriterion("pet_spare between", value1, value2, "petSpare");
            return (Criteria) this;
        }

        public Criteria andPetSpareNotBetween(String value1, String value2) {
            addCriterion("pet_spare not between", value1, value2, "petSpare");
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