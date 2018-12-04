package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.List;

public class MacthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public MacthExample() {
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

        public Criteria andMacIdIsNull() {
            addCriterion("mac_id is null");
            return (Criteria) this;
        }

        public Criteria andMacIdIsNotNull() {
            addCriterion("mac_id is not null");
            return (Criteria) this;
        }

        public Criteria andMacIdEqualTo(Integer value) {
            addCriterion("mac_id =", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdNotEqualTo(Integer value) {
            addCriterion("mac_id <>", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdGreaterThan(Integer value) {
            addCriterion("mac_id >", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mac_id >=", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdLessThan(Integer value) {
            addCriterion("mac_id <", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdLessThanOrEqualTo(Integer value) {
            addCriterion("mac_id <=", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdIn(List<Integer> values) {
            addCriterion("mac_id in", values, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdNotIn(List<Integer> values) {
            addCriterion("mac_id not in", values, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdBetween(Integer value1, Integer value2) {
            addCriterion("mac_id between", value1, value2, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mac_id not between", value1, value2, "macId");
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

        public Criteria andCouplePetIdIsNull() {
            addCriterion("couple_pet_id is null");
            return (Criteria) this;
        }

        public Criteria andCouplePetIdIsNotNull() {
            addCriterion("couple_pet_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouplePetIdEqualTo(Integer value) {
            addCriterion("couple_pet_id =", value, "couplePetId");
            return (Criteria) this;
        }

        public Criteria andCouplePetIdNotEqualTo(Integer value) {
            addCriterion("couple_pet_id <>", value, "couplePetId");
            return (Criteria) this;
        }

        public Criteria andCouplePetIdGreaterThan(Integer value) {
            addCriterion("couple_pet_id >", value, "couplePetId");
            return (Criteria) this;
        }

        public Criteria andCouplePetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("couple_pet_id >=", value, "couplePetId");
            return (Criteria) this;
        }

        public Criteria andCouplePetIdLessThan(Integer value) {
            addCriterion("couple_pet_id <", value, "couplePetId");
            return (Criteria) this;
        }

        public Criteria andCouplePetIdLessThanOrEqualTo(Integer value) {
            addCriterion("couple_pet_id <=", value, "couplePetId");
            return (Criteria) this;
        }

        public Criteria andCouplePetIdIn(List<Integer> values) {
            addCriterion("couple_pet_id in", values, "couplePetId");
            return (Criteria) this;
        }

        public Criteria andCouplePetIdNotIn(List<Integer> values) {
            addCriterion("couple_pet_id not in", values, "couplePetId");
            return (Criteria) this;
        }

        public Criteria andCouplePetIdBetween(Integer value1, Integer value2) {
            addCriterion("couple_pet_id between", value1, value2, "couplePetId");
            return (Criteria) this;
        }

        public Criteria andCouplePetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("couple_pet_id not between", value1, value2, "couplePetId");
            return (Criteria) this;
        }

        public Criteria andPartnerPetIdIsNull() {
            addCriterion("partner_pet_id is null");
            return (Criteria) this;
        }

        public Criteria andPartnerPetIdIsNotNull() {
            addCriterion("partner_pet_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerPetIdEqualTo(Integer value) {
            addCriterion("partner_pet_id =", value, "partnerPetId");
            return (Criteria) this;
        }

        public Criteria andPartnerPetIdNotEqualTo(Integer value) {
            addCriterion("partner_pet_id <>", value, "partnerPetId");
            return (Criteria) this;
        }

        public Criteria andPartnerPetIdGreaterThan(Integer value) {
            addCriterion("partner_pet_id >", value, "partnerPetId");
            return (Criteria) this;
        }

        public Criteria andPartnerPetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("partner_pet_id >=", value, "partnerPetId");
            return (Criteria) this;
        }

        public Criteria andPartnerPetIdLessThan(Integer value) {
            addCriterion("partner_pet_id <", value, "partnerPetId");
            return (Criteria) this;
        }

        public Criteria andPartnerPetIdLessThanOrEqualTo(Integer value) {
            addCriterion("partner_pet_id <=", value, "partnerPetId");
            return (Criteria) this;
        }

        public Criteria andPartnerPetIdIn(List<Integer> values) {
            addCriterion("partner_pet_id in", values, "partnerPetId");
            return (Criteria) this;
        }

        public Criteria andPartnerPetIdNotIn(List<Integer> values) {
            addCriterion("partner_pet_id not in", values, "partnerPetId");
            return (Criteria) this;
        }

        public Criteria andPartnerPetIdBetween(Integer value1, Integer value2) {
            addCriterion("partner_pet_id between", value1, value2, "partnerPetId");
            return (Criteria) this;
        }

        public Criteria andPartnerPetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("partner_pet_id not between", value1, value2, "partnerPetId");
            return (Criteria) this;
        }

        public Criteria andCoupleCustIdIsNull() {
            addCriterion("couple_cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCoupleCustIdIsNotNull() {
            addCriterion("couple_cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoupleCustIdEqualTo(Integer value) {
            addCriterion("couple_cust_id =", value, "coupleCustId");
            return (Criteria) this;
        }

        public Criteria andCoupleCustIdNotEqualTo(Integer value) {
            addCriterion("couple_cust_id <>", value, "coupleCustId");
            return (Criteria) this;
        }

        public Criteria andCoupleCustIdGreaterThan(Integer value) {
            addCriterion("couple_cust_id >", value, "coupleCustId");
            return (Criteria) this;
        }

        public Criteria andCoupleCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("couple_cust_id >=", value, "coupleCustId");
            return (Criteria) this;
        }

        public Criteria andCoupleCustIdLessThan(Integer value) {
            addCriterion("couple_cust_id <", value, "coupleCustId");
            return (Criteria) this;
        }

        public Criteria andCoupleCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("couple_cust_id <=", value, "coupleCustId");
            return (Criteria) this;
        }

        public Criteria andCoupleCustIdIn(List<Integer> values) {
            addCriterion("couple_cust_id in", values, "coupleCustId");
            return (Criteria) this;
        }

        public Criteria andCoupleCustIdNotIn(List<Integer> values) {
            addCriterion("couple_cust_id not in", values, "coupleCustId");
            return (Criteria) this;
        }

        public Criteria andCoupleCustIdBetween(Integer value1, Integer value2) {
            addCriterion("couple_cust_id between", value1, value2, "coupleCustId");
            return (Criteria) this;
        }

        public Criteria andCoupleCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("couple_cust_id not between", value1, value2, "coupleCustId");
            return (Criteria) this;
        }

        public Criteria andPartnerCustIdIsNull() {
            addCriterion("partner_cust_id is null");
            return (Criteria) this;
        }

        public Criteria andPartnerCustIdIsNotNull() {
            addCriterion("partner_cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerCustIdEqualTo(Integer value) {
            addCriterion("partner_cust_id =", value, "partnerCustId");
            return (Criteria) this;
        }

        public Criteria andPartnerCustIdNotEqualTo(Integer value) {
            addCriterion("partner_cust_id <>", value, "partnerCustId");
            return (Criteria) this;
        }

        public Criteria andPartnerCustIdGreaterThan(Integer value) {
            addCriterion("partner_cust_id >", value, "partnerCustId");
            return (Criteria) this;
        }

        public Criteria andPartnerCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("partner_cust_id >=", value, "partnerCustId");
            return (Criteria) this;
        }

        public Criteria andPartnerCustIdLessThan(Integer value) {
            addCriterion("partner_cust_id <", value, "partnerCustId");
            return (Criteria) this;
        }

        public Criteria andPartnerCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("partner_cust_id <=", value, "partnerCustId");
            return (Criteria) this;
        }

        public Criteria andPartnerCustIdIn(List<Integer> values) {
            addCriterion("partner_cust_id in", values, "partnerCustId");
            return (Criteria) this;
        }

        public Criteria andPartnerCustIdNotIn(List<Integer> values) {
            addCriterion("partner_cust_id not in", values, "partnerCustId");
            return (Criteria) this;
        }

        public Criteria andPartnerCustIdBetween(Integer value1, Integer value2) {
            addCriterion("partner_cust_id between", value1, value2, "partnerCustId");
            return (Criteria) this;
        }

        public Criteria andPartnerCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("partner_cust_id not between", value1, value2, "partnerCustId");
            return (Criteria) this;
        }

        public Criteria andCoupleMacStateIsNull() {
            addCriterion("couple_mac_state is null");
            return (Criteria) this;
        }

        public Criteria andCoupleMacStateIsNotNull() {
            addCriterion("couple_mac_state is not null");
            return (Criteria) this;
        }

        public Criteria andCoupleMacStateEqualTo(Integer value) {
            addCriterion("couple_mac_state =", value, "coupleMacState");
            return (Criteria) this;
        }

        public Criteria andCoupleMacStateNotEqualTo(Integer value) {
            addCriterion("couple_mac_state <>", value, "coupleMacState");
            return (Criteria) this;
        }

        public Criteria andCoupleMacStateGreaterThan(Integer value) {
            addCriterion("couple_mac_state >", value, "coupleMacState");
            return (Criteria) this;
        }

        public Criteria andCoupleMacStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("couple_mac_state >=", value, "coupleMacState");
            return (Criteria) this;
        }

        public Criteria andCoupleMacStateLessThan(Integer value) {
            addCriterion("couple_mac_state <", value, "coupleMacState");
            return (Criteria) this;
        }

        public Criteria andCoupleMacStateLessThanOrEqualTo(Integer value) {
            addCriterion("couple_mac_state <=", value, "coupleMacState");
            return (Criteria) this;
        }

        public Criteria andCoupleMacStateIn(List<Integer> values) {
            addCriterion("couple_mac_state in", values, "coupleMacState");
            return (Criteria) this;
        }

        public Criteria andCoupleMacStateNotIn(List<Integer> values) {
            addCriterion("couple_mac_state not in", values, "coupleMacState");
            return (Criteria) this;
        }

        public Criteria andCoupleMacStateBetween(Integer value1, Integer value2) {
            addCriterion("couple_mac_state between", value1, value2, "coupleMacState");
            return (Criteria) this;
        }

        public Criteria andCoupleMacStateNotBetween(Integer value1, Integer value2) {
            addCriterion("couple_mac_state not between", value1, value2, "coupleMacState");
            return (Criteria) this;
        }

        public Criteria andPartnerMacStateIsNull() {
            addCriterion("partner_mac_state is null");
            return (Criteria) this;
        }

        public Criteria andPartnerMacStateIsNotNull() {
            addCriterion("partner_mac_state is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerMacStateEqualTo(Integer value) {
            addCriterion("partner_mac_state =", value, "partnerMacState");
            return (Criteria) this;
        }

        public Criteria andPartnerMacStateNotEqualTo(Integer value) {
            addCriterion("partner_mac_state <>", value, "partnerMacState");
            return (Criteria) this;
        }

        public Criteria andPartnerMacStateGreaterThan(Integer value) {
            addCriterion("partner_mac_state >", value, "partnerMacState");
            return (Criteria) this;
        }

        public Criteria andPartnerMacStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("partner_mac_state >=", value, "partnerMacState");
            return (Criteria) this;
        }

        public Criteria andPartnerMacStateLessThan(Integer value) {
            addCriterion("partner_mac_state <", value, "partnerMacState");
            return (Criteria) this;
        }

        public Criteria andPartnerMacStateLessThanOrEqualTo(Integer value) {
            addCriterion("partner_mac_state <=", value, "partnerMacState");
            return (Criteria) this;
        }

        public Criteria andPartnerMacStateIn(List<Integer> values) {
            addCriterion("partner_mac_state in", values, "partnerMacState");
            return (Criteria) this;
        }

        public Criteria andPartnerMacStateNotIn(List<Integer> values) {
            addCriterion("partner_mac_state not in", values, "partnerMacState");
            return (Criteria) this;
        }

        public Criteria andPartnerMacStateBetween(Integer value1, Integer value2) {
            addCriterion("partner_mac_state between", value1, value2, "partnerMacState");
            return (Criteria) this;
        }

        public Criteria andPartnerMacStateNotBetween(Integer value1, Integer value2) {
            addCriterion("partner_mac_state not between", value1, value2, "partnerMacState");
            return (Criteria) this;
        }

        public Criteria andMacthSpareIsNull() {
            addCriterion("macth_spare is null");
            return (Criteria) this;
        }

        public Criteria andMacthSpareIsNotNull() {
            addCriterion("macth_spare is not null");
            return (Criteria) this;
        }

        public Criteria andMacthSpareEqualTo(String value) {
            addCriterion("macth_spare =", value, "macthSpare");
            return (Criteria) this;
        }

        public Criteria andMacthSpareNotEqualTo(String value) {
            addCriterion("macth_spare <>", value, "macthSpare");
            return (Criteria) this;
        }

        public Criteria andMacthSpareGreaterThan(String value) {
            addCriterion("macth_spare >", value, "macthSpare");
            return (Criteria) this;
        }

        public Criteria andMacthSpareGreaterThanOrEqualTo(String value) {
            addCriterion("macth_spare >=", value, "macthSpare");
            return (Criteria) this;
        }

        public Criteria andMacthSpareLessThan(String value) {
            addCriterion("macth_spare <", value, "macthSpare");
            return (Criteria) this;
        }

        public Criteria andMacthSpareLessThanOrEqualTo(String value) {
            addCriterion("macth_spare <=", value, "macthSpare");
            return (Criteria) this;
        }

        public Criteria andMacthSpareLike(String value) {
            addCriterion("macth_spare like", value, "macthSpare");
            return (Criteria) this;
        }

        public Criteria andMacthSpareNotLike(String value) {
            addCriterion("macth_spare not like", value, "macthSpare");
            return (Criteria) this;
        }

        public Criteria andMacthSpareIn(List<String> values) {
            addCriterion("macth_spare in", values, "macthSpare");
            return (Criteria) this;
        }

        public Criteria andMacthSpareNotIn(List<String> values) {
            addCriterion("macth_spare not in", values, "macthSpare");
            return (Criteria) this;
        }

        public Criteria andMacthSpareBetween(String value1, String value2) {
            addCriterion("macth_spare between", value1, value2, "macthSpare");
            return (Criteria) this;
        }

        public Criteria andMacthSpareNotBetween(String value1, String value2) {
            addCriterion("macth_spare not between", value1, value2, "macthSpare");
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