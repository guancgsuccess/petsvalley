package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InsuranceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public InsuranceExample() {
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

        public Criteria andInsIdIsNull() {
            addCriterion("ins_id is null");
            return (Criteria) this;
        }

        public Criteria andInsIdIsNotNull() {
            addCriterion("ins_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsIdEqualTo(Integer value) {
            addCriterion("ins_id =", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdNotEqualTo(Integer value) {
            addCriterion("ins_id <>", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdGreaterThan(Integer value) {
            addCriterion("ins_id >", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ins_id >=", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdLessThan(Integer value) {
            addCriterion("ins_id <", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ins_id <=", value, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdIn(List<Integer> values) {
            addCriterion("ins_id in", values, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdNotIn(List<Integer> values) {
            addCriterion("ins_id not in", values, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdBetween(Integer value1, Integer value2) {
            addCriterion("ins_id between", value1, value2, "insId");
            return (Criteria) this;
        }

        public Criteria andInsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ins_id not between", value1, value2, "insId");
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

        public Criteria andIcIdIsNull() {
            addCriterion("ic_id is null");
            return (Criteria) this;
        }

        public Criteria andIcIdIsNotNull() {
            addCriterion("ic_id is not null");
            return (Criteria) this;
        }

        public Criteria andIcIdEqualTo(Integer value) {
            addCriterion("ic_id =", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdNotEqualTo(Integer value) {
            addCriterion("ic_id <>", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdGreaterThan(Integer value) {
            addCriterion("ic_id >", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ic_id >=", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdLessThan(Integer value) {
            addCriterion("ic_id <", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdLessThanOrEqualTo(Integer value) {
            addCriterion("ic_id <=", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdIn(List<Integer> values) {
            addCriterion("ic_id in", values, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdNotIn(List<Integer> values) {
            addCriterion("ic_id not in", values, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdBetween(Integer value1, Integer value2) {
            addCriterion("ic_id between", value1, value2, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ic_id not between", value1, value2, "icId");
            return (Criteria) this;
        }

        public Criteria andInsTimeIsNull() {
            addCriterion("ins_time is null");
            return (Criteria) this;
        }

        public Criteria andInsTimeIsNotNull() {
            addCriterion("ins_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsTimeEqualTo(Date value) {
            addCriterion("ins_time =", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeNotEqualTo(Date value) {
            addCriterion("ins_time <>", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeGreaterThan(Date value) {
            addCriterion("ins_time >", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ins_time >=", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeLessThan(Date value) {
            addCriterion("ins_time <", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeLessThanOrEqualTo(Date value) {
            addCriterion("ins_time <=", value, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeIn(List<Date> values) {
            addCriterion("ins_time in", values, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeNotIn(List<Date> values) {
            addCriterion("ins_time not in", values, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeBetween(Date value1, Date value2) {
            addCriterion("ins_time between", value1, value2, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsTimeNotBetween(Date value1, Date value2) {
            addCriterion("ins_time not between", value1, value2, "insTime");
            return (Criteria) this;
        }

        public Criteria andInsMoneyIsNull() {
            addCriterion("ins_money is null");
            return (Criteria) this;
        }

        public Criteria andInsMoneyIsNotNull() {
            addCriterion("ins_money is not null");
            return (Criteria) this;
        }

        public Criteria andInsMoneyEqualTo(Double value) {
            addCriterion("ins_money =", value, "insMoney");
            return (Criteria) this;
        }

        public Criteria andInsMoneyNotEqualTo(Double value) {
            addCriterion("ins_money <>", value, "insMoney");
            return (Criteria) this;
        }

        public Criteria andInsMoneyGreaterThan(Double value) {
            addCriterion("ins_money >", value, "insMoney");
            return (Criteria) this;
        }

        public Criteria andInsMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ins_money >=", value, "insMoney");
            return (Criteria) this;
        }

        public Criteria andInsMoneyLessThan(Double value) {
            addCriterion("ins_money <", value, "insMoney");
            return (Criteria) this;
        }

        public Criteria andInsMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ins_money <=", value, "insMoney");
            return (Criteria) this;
        }

        public Criteria andInsMoneyIn(List<Double> values) {
            addCriterion("ins_money in", values, "insMoney");
            return (Criteria) this;
        }

        public Criteria andInsMoneyNotIn(List<Double> values) {
            addCriterion("ins_money not in", values, "insMoney");
            return (Criteria) this;
        }

        public Criteria andInsMoneyBetween(Double value1, Double value2) {
            addCriterion("ins_money between", value1, value2, "insMoney");
            return (Criteria) this;
        }

        public Criteria andInsMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ins_money not between", value1, value2, "insMoney");
            return (Criteria) this;
        }

        public Criteria andInsComNameIsNull() {
            addCriterion("ins_com_name is null");
            return (Criteria) this;
        }

        public Criteria andInsComNameIsNotNull() {
            addCriterion("ins_com_name is not null");
            return (Criteria) this;
        }

        public Criteria andInsComNameEqualTo(String value) {
            addCriterion("ins_com_name =", value, "insComName");
            return (Criteria) this;
        }

        public Criteria andInsComNameNotEqualTo(String value) {
            addCriterion("ins_com_name <>", value, "insComName");
            return (Criteria) this;
        }

        public Criteria andInsComNameGreaterThan(String value) {
            addCriterion("ins_com_name >", value, "insComName");
            return (Criteria) this;
        }

        public Criteria andInsComNameGreaterThanOrEqualTo(String value) {
            addCriterion("ins_com_name >=", value, "insComName");
            return (Criteria) this;
        }

        public Criteria andInsComNameLessThan(String value) {
            addCriterion("ins_com_name <", value, "insComName");
            return (Criteria) this;
        }

        public Criteria andInsComNameLessThanOrEqualTo(String value) {
            addCriterion("ins_com_name <=", value, "insComName");
            return (Criteria) this;
        }

        public Criteria andInsComNameLike(String value) {
            addCriterion("ins_com_name like", value, "insComName");
            return (Criteria) this;
        }

        public Criteria andInsComNameNotLike(String value) {
            addCriterion("ins_com_name not like", value, "insComName");
            return (Criteria) this;
        }

        public Criteria andInsComNameIn(List<String> values) {
            addCriterion("ins_com_name in", values, "insComName");
            return (Criteria) this;
        }

        public Criteria andInsComNameNotIn(List<String> values) {
            addCriterion("ins_com_name not in", values, "insComName");
            return (Criteria) this;
        }

        public Criteria andInsComNameBetween(String value1, String value2) {
            addCriterion("ins_com_name between", value1, value2, "insComName");
            return (Criteria) this;
        }

        public Criteria andInsComNameNotBetween(String value1, String value2) {
            addCriterion("ins_com_name not between", value1, value2, "insComName");
            return (Criteria) this;
        }

        public Criteria andInsStateIsNull() {
            addCriterion("ins_state is null");
            return (Criteria) this;
        }

        public Criteria andInsStateIsNotNull() {
            addCriterion("ins_state is not null");
            return (Criteria) this;
        }

        public Criteria andInsStateEqualTo(Integer value) {
            addCriterion("ins_state =", value, "insState");
            return (Criteria) this;
        }

        public Criteria andInsStateNotEqualTo(Integer value) {
            addCriterion("ins_state <>", value, "insState");
            return (Criteria) this;
        }

        public Criteria andInsStateGreaterThan(Integer value) {
            addCriterion("ins_state >", value, "insState");
            return (Criteria) this;
        }

        public Criteria andInsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ins_state >=", value, "insState");
            return (Criteria) this;
        }

        public Criteria andInsStateLessThan(Integer value) {
            addCriterion("ins_state <", value, "insState");
            return (Criteria) this;
        }

        public Criteria andInsStateLessThanOrEqualTo(Integer value) {
            addCriterion("ins_state <=", value, "insState");
            return (Criteria) this;
        }

        public Criteria andInsStateIn(List<Integer> values) {
            addCriterion("ins_state in", values, "insState");
            return (Criteria) this;
        }

        public Criteria andInsStateNotIn(List<Integer> values) {
            addCriterion("ins_state not in", values, "insState");
            return (Criteria) this;
        }

        public Criteria andInsStateBetween(Integer value1, Integer value2) {
            addCriterion("ins_state between", value1, value2, "insState");
            return (Criteria) this;
        }

        public Criteria andInsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ins_state not between", value1, value2, "insState");
            return (Criteria) this;
        }

        public Criteria andInsEndTimeIsNull() {
            addCriterion("ins_end_time is null");
            return (Criteria) this;
        }

        public Criteria andInsEndTimeIsNotNull() {
            addCriterion("ins_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsEndTimeEqualTo(Date value) {
            addCriterion("ins_end_time =", value, "insEndTime");
            return (Criteria) this;
        }

        public Criteria andInsEndTimeNotEqualTo(Date value) {
            addCriterion("ins_end_time <>", value, "insEndTime");
            return (Criteria) this;
        }

        public Criteria andInsEndTimeGreaterThan(Date value) {
            addCriterion("ins_end_time >", value, "insEndTime");
            return (Criteria) this;
        }

        public Criteria andInsEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ins_end_time >=", value, "insEndTime");
            return (Criteria) this;
        }

        public Criteria andInsEndTimeLessThan(Date value) {
            addCriterion("ins_end_time <", value, "insEndTime");
            return (Criteria) this;
        }

        public Criteria andInsEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("ins_end_time <=", value, "insEndTime");
            return (Criteria) this;
        }

        public Criteria andInsEndTimeIn(List<Date> values) {
            addCriterion("ins_end_time in", values, "insEndTime");
            return (Criteria) this;
        }

        public Criteria andInsEndTimeNotIn(List<Date> values) {
            addCriterion("ins_end_time not in", values, "insEndTime");
            return (Criteria) this;
        }

        public Criteria andInsEndTimeBetween(Date value1, Date value2) {
            addCriterion("ins_end_time between", value1, value2, "insEndTime");
            return (Criteria) this;
        }

        public Criteria andInsEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("ins_end_time not between", value1, value2, "insEndTime");
            return (Criteria) this;
        }

        public Criteria andInsSpareIsNull() {
            addCriterion("ins_spare is null");
            return (Criteria) this;
        }

        public Criteria andInsSpareIsNotNull() {
            addCriterion("ins_spare is not null");
            return (Criteria) this;
        }

        public Criteria andInsSpareEqualTo(String value) {
            addCriterion("ins_spare =", value, "insSpare");
            return (Criteria) this;
        }

        public Criteria andInsSpareNotEqualTo(String value) {
            addCriterion("ins_spare <>", value, "insSpare");
            return (Criteria) this;
        }

        public Criteria andInsSpareGreaterThan(String value) {
            addCriterion("ins_spare >", value, "insSpare");
            return (Criteria) this;
        }

        public Criteria andInsSpareGreaterThanOrEqualTo(String value) {
            addCriterion("ins_spare >=", value, "insSpare");
            return (Criteria) this;
        }

        public Criteria andInsSpareLessThan(String value) {
            addCriterion("ins_spare <", value, "insSpare");
            return (Criteria) this;
        }

        public Criteria andInsSpareLessThanOrEqualTo(String value) {
            addCriterion("ins_spare <=", value, "insSpare");
            return (Criteria) this;
        }

        public Criteria andInsSpareLike(String value) {
            addCriterion("ins_spare like", value, "insSpare");
            return (Criteria) this;
        }

        public Criteria andInsSpareNotLike(String value) {
            addCriterion("ins_spare not like", value, "insSpare");
            return (Criteria) this;
        }

        public Criteria andInsSpareIn(List<String> values) {
            addCriterion("ins_spare in", values, "insSpare");
            return (Criteria) this;
        }

        public Criteria andInsSpareNotIn(List<String> values) {
            addCriterion("ins_spare not in", values, "insSpare");
            return (Criteria) this;
        }

        public Criteria andInsSpareBetween(String value1, String value2) {
            addCriterion("ins_spare between", value1, value2, "insSpare");
            return (Criteria) this;
        }

        public Criteria andInsSpareNotBetween(String value1, String value2) {
            addCriterion("ins_spare not between", value1, value2, "insSpare");
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