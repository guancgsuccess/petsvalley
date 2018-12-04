package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ApplyExample() {
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

        public Criteria andApplyIdIsNull() {
            addCriterion("apply_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(Integer value) {
            addCriterion("apply_id =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(Integer value) {
            addCriterion("apply_id <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(Integer value) {
            addCriterion("apply_id >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_id >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(Integer value) {
            addCriterion("apply_id <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("apply_id <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<Integer> values) {
            addCriterion("apply_id in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<Integer> values) {
            addCriterion("apply_id not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("apply_id between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_id not between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(Integer value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(Integer value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(Integer value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(Integer value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<Integer> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<Integer> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(Integer value1, Integer value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
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

        public Criteria andApplyCustIdIsNull() {
            addCriterion("apply_cust_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyCustIdIsNotNull() {
            addCriterion("apply_cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCustIdEqualTo(Integer value) {
            addCriterion("apply_cust_id =", value, "applyCustId");
            return (Criteria) this;
        }

        public Criteria andApplyCustIdNotEqualTo(Integer value) {
            addCriterion("apply_cust_id <>", value, "applyCustId");
            return (Criteria) this;
        }

        public Criteria andApplyCustIdGreaterThan(Integer value) {
            addCriterion("apply_cust_id >", value, "applyCustId");
            return (Criteria) this;
        }

        public Criteria andApplyCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_cust_id >=", value, "applyCustId");
            return (Criteria) this;
        }

        public Criteria andApplyCustIdLessThan(Integer value) {
            addCriterion("apply_cust_id <", value, "applyCustId");
            return (Criteria) this;
        }

        public Criteria andApplyCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("apply_cust_id <=", value, "applyCustId");
            return (Criteria) this;
        }

        public Criteria andApplyCustIdIn(List<Integer> values) {
            addCriterion("apply_cust_id in", values, "applyCustId");
            return (Criteria) this;
        }

        public Criteria andApplyCustIdNotIn(List<Integer> values) {
            addCriterion("apply_cust_id not in", values, "applyCustId");
            return (Criteria) this;
        }

        public Criteria andApplyCustIdBetween(Integer value1, Integer value2) {
            addCriterion("apply_cust_id between", value1, value2, "applyCustId");
            return (Criteria) this;
        }

        public Criteria andApplyCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_cust_id not between", value1, value2, "applyCustId");
            return (Criteria) this;
        }

        public Criteria andApplyStateIsNull() {
            addCriterion("apply_state is null");
            return (Criteria) this;
        }

        public Criteria andApplyStateIsNotNull() {
            addCriterion("apply_state is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStateEqualTo(Integer value) {
            addCriterion("apply_state =", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotEqualTo(Integer value) {
            addCriterion("apply_state <>", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateGreaterThan(Integer value) {
            addCriterion("apply_state >", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_state >=", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateLessThan(Integer value) {
            addCriterion("apply_state <", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateLessThanOrEqualTo(Integer value) {
            addCriterion("apply_state <=", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateIn(List<Integer> values) {
            addCriterion("apply_state in", values, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotIn(List<Integer> values) {
            addCriterion("apply_state not in", values, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateBetween(Integer value1, Integer value2) {
            addCriterion("apply_state between", value1, value2, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_state not between", value1, value2, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyClassifyIsNull() {
            addCriterion("apply_classify is null");
            return (Criteria) this;
        }

        public Criteria andApplyClassifyIsNotNull() {
            addCriterion("apply_classify is not null");
            return (Criteria) this;
        }

        public Criteria andApplyClassifyEqualTo(String value) {
            addCriterion("apply_classify =", value, "applyClassify");
            return (Criteria) this;
        }

        public Criteria andApplyClassifyNotEqualTo(String value) {
            addCriterion("apply_classify <>", value, "applyClassify");
            return (Criteria) this;
        }

        public Criteria andApplyClassifyGreaterThan(String value) {
            addCriterion("apply_classify >", value, "applyClassify");
            return (Criteria) this;
        }

        public Criteria andApplyClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("apply_classify >=", value, "applyClassify");
            return (Criteria) this;
        }

        public Criteria andApplyClassifyLessThan(String value) {
            addCriterion("apply_classify <", value, "applyClassify");
            return (Criteria) this;
        }

        public Criteria andApplyClassifyLessThanOrEqualTo(String value) {
            addCriterion("apply_classify <=", value, "applyClassify");
            return (Criteria) this;
        }

        public Criteria andApplyClassifyLike(String value) {
            addCriterion("apply_classify like", value, "applyClassify");
            return (Criteria) this;
        }

        public Criteria andApplyClassifyNotLike(String value) {
            addCriterion("apply_classify not like", value, "applyClassify");
            return (Criteria) this;
        }

        public Criteria andApplyClassifyIn(List<String> values) {
            addCriterion("apply_classify in", values, "applyClassify");
            return (Criteria) this;
        }

        public Criteria andApplyClassifyNotIn(List<String> values) {
            addCriterion("apply_classify not in", values, "applyClassify");
            return (Criteria) this;
        }

        public Criteria andApplyClassifyBetween(String value1, String value2) {
            addCriterion("apply_classify between", value1, value2, "applyClassify");
            return (Criteria) this;
        }

        public Criteria andApplyClassifyNotBetween(String value1, String value2) {
            addCriterion("apply_classify not between", value1, value2, "applyClassify");
            return (Criteria) this;
        }

        public Criteria andApplyScheduleIsNull() {
            addCriterion("apply_schedule is null");
            return (Criteria) this;
        }

        public Criteria andApplyScheduleIsNotNull() {
            addCriterion("apply_schedule is not null");
            return (Criteria) this;
        }

        public Criteria andApplyScheduleEqualTo(String value) {
            addCriterion("apply_schedule =", value, "applySchedule");
            return (Criteria) this;
        }

        public Criteria andApplyScheduleNotEqualTo(String value) {
            addCriterion("apply_schedule <>", value, "applySchedule");
            return (Criteria) this;
        }

        public Criteria andApplyScheduleGreaterThan(String value) {
            addCriterion("apply_schedule >", value, "applySchedule");
            return (Criteria) this;
        }

        public Criteria andApplyScheduleGreaterThanOrEqualTo(String value) {
            addCriterion("apply_schedule >=", value, "applySchedule");
            return (Criteria) this;
        }

        public Criteria andApplyScheduleLessThan(String value) {
            addCriterion("apply_schedule <", value, "applySchedule");
            return (Criteria) this;
        }

        public Criteria andApplyScheduleLessThanOrEqualTo(String value) {
            addCriterion("apply_schedule <=", value, "applySchedule");
            return (Criteria) this;
        }

        public Criteria andApplyScheduleLike(String value) {
            addCriterion("apply_schedule like", value, "applySchedule");
            return (Criteria) this;
        }

        public Criteria andApplyScheduleNotLike(String value) {
            addCriterion("apply_schedule not like", value, "applySchedule");
            return (Criteria) this;
        }

        public Criteria andApplyScheduleIn(List<String> values) {
            addCriterion("apply_schedule in", values, "applySchedule");
            return (Criteria) this;
        }

        public Criteria andApplyScheduleNotIn(List<String> values) {
            addCriterion("apply_schedule not in", values, "applySchedule");
            return (Criteria) this;
        }

        public Criteria andApplyScheduleBetween(String value1, String value2) {
            addCriterion("apply_schedule between", value1, value2, "applySchedule");
            return (Criteria) this;
        }

        public Criteria andApplyScheduleNotBetween(String value1, String value2) {
            addCriterion("apply_schedule not between", value1, value2, "applySchedule");
            return (Criteria) this;
        }

        public Criteria andApplySpareIsNull() {
            addCriterion("apply_spare is null");
            return (Criteria) this;
        }

        public Criteria andApplySpareIsNotNull() {
            addCriterion("apply_spare is not null");
            return (Criteria) this;
        }

        public Criteria andApplySpareEqualTo(String value) {
            addCriterion("apply_spare =", value, "applySpare");
            return (Criteria) this;
        }

        public Criteria andApplySpareNotEqualTo(String value) {
            addCriterion("apply_spare <>", value, "applySpare");
            return (Criteria) this;
        }

        public Criteria andApplySpareGreaterThan(String value) {
            addCriterion("apply_spare >", value, "applySpare");
            return (Criteria) this;
        }

        public Criteria andApplySpareGreaterThanOrEqualTo(String value) {
            addCriterion("apply_spare >=", value, "applySpare");
            return (Criteria) this;
        }

        public Criteria andApplySpareLessThan(String value) {
            addCriterion("apply_spare <", value, "applySpare");
            return (Criteria) this;
        }

        public Criteria andApplySpareLessThanOrEqualTo(String value) {
            addCriterion("apply_spare <=", value, "applySpare");
            return (Criteria) this;
        }

        public Criteria andApplySpareLike(String value) {
            addCriterion("apply_spare like", value, "applySpare");
            return (Criteria) this;
        }

        public Criteria andApplySpareNotLike(String value) {
            addCriterion("apply_spare not like", value, "applySpare");
            return (Criteria) this;
        }

        public Criteria andApplySpareIn(List<String> values) {
            addCriterion("apply_spare in", values, "applySpare");
            return (Criteria) this;
        }

        public Criteria andApplySpareNotIn(List<String> values) {
            addCriterion("apply_spare not in", values, "applySpare");
            return (Criteria) this;
        }

        public Criteria andApplySpareBetween(String value1, String value2) {
            addCriterion("apply_spare between", value1, value2, "applySpare");
            return (Criteria) this;
        }

        public Criteria andApplySpareNotBetween(String value1, String value2) {
            addCriterion("apply_spare not between", value1, value2, "applySpare");
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