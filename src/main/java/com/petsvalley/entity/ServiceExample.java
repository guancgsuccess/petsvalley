package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ServiceExample() {
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

        public Criteria andServiceTitleIsNull() {
            addCriterion("service_title is null");
            return (Criteria) this;
        }

        public Criteria andServiceTitleIsNotNull() {
            addCriterion("service_title is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTitleEqualTo(String value) {
            addCriterion("service_title =", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleNotEqualTo(String value) {
            addCriterion("service_title <>", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleGreaterThan(String value) {
            addCriterion("service_title >", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("service_title >=", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleLessThan(String value) {
            addCriterion("service_title <", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleLessThanOrEqualTo(String value) {
            addCriterion("service_title <=", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleLike(String value) {
            addCriterion("service_title like", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleNotLike(String value) {
            addCriterion("service_title not like", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleIn(List<String> values) {
            addCriterion("service_title in", values, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleNotIn(List<String> values) {
            addCriterion("service_title not in", values, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleBetween(String value1, String value2) {
            addCriterion("service_title between", value1, value2, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleNotBetween(String value1, String value2) {
            addCriterion("service_title not between", value1, value2, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceContentIsNull() {
            addCriterion("service_content is null");
            return (Criteria) this;
        }

        public Criteria andServiceContentIsNotNull() {
            addCriterion("service_content is not null");
            return (Criteria) this;
        }

        public Criteria andServiceContentEqualTo(String value) {
            addCriterion("service_content =", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentNotEqualTo(String value) {
            addCriterion("service_content <>", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentGreaterThan(String value) {
            addCriterion("service_content >", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentGreaterThanOrEqualTo(String value) {
            addCriterion("service_content >=", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentLessThan(String value) {
            addCriterion("service_content <", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentLessThanOrEqualTo(String value) {
            addCriterion("service_content <=", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentLike(String value) {
            addCriterion("service_content like", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentNotLike(String value) {
            addCriterion("service_content not like", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentIn(List<String> values) {
            addCriterion("service_content in", values, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentNotIn(List<String> values) {
            addCriterion("service_content not in", values, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentBetween(String value1, String value2) {
            addCriterion("service_content between", value1, value2, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentNotBetween(String value1, String value2) {
            addCriterion("service_content not between", value1, value2, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceRewardIsNull() {
            addCriterion("service_reward is null");
            return (Criteria) this;
        }

        public Criteria andServiceRewardIsNotNull() {
            addCriterion("service_reward is not null");
            return (Criteria) this;
        }

        public Criteria andServiceRewardEqualTo(Integer value) {
            addCriterion("service_reward =", value, "serviceReward");
            return (Criteria) this;
        }

        public Criteria andServiceRewardNotEqualTo(Integer value) {
            addCriterion("service_reward <>", value, "serviceReward");
            return (Criteria) this;
        }

        public Criteria andServiceRewardGreaterThan(Integer value) {
            addCriterion("service_reward >", value, "serviceReward");
            return (Criteria) this;
        }

        public Criteria andServiceRewardGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_reward >=", value, "serviceReward");
            return (Criteria) this;
        }

        public Criteria andServiceRewardLessThan(Integer value) {
            addCriterion("service_reward <", value, "serviceReward");
            return (Criteria) this;
        }

        public Criteria andServiceRewardLessThanOrEqualTo(Integer value) {
            addCriterion("service_reward <=", value, "serviceReward");
            return (Criteria) this;
        }

        public Criteria andServiceRewardIn(List<Integer> values) {
            addCriterion("service_reward in", values, "serviceReward");
            return (Criteria) this;
        }

        public Criteria andServiceRewardNotIn(List<Integer> values) {
            addCriterion("service_reward not in", values, "serviceReward");
            return (Criteria) this;
        }

        public Criteria andServiceRewardBetween(Integer value1, Integer value2) {
            addCriterion("service_reward between", value1, value2, "serviceReward");
            return (Criteria) this;
        }

        public Criteria andServiceRewardNotBetween(Integer value1, Integer value2) {
            addCriterion("service_reward not between", value1, value2, "serviceReward");
            return (Criteria) this;
        }

        public Criteria andServiceNoIsNull() {
            addCriterion("service_no is null");
            return (Criteria) this;
        }

        public Criteria andServiceNoIsNotNull() {
            addCriterion("service_no is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNoEqualTo(Integer value) {
            addCriterion("service_no =", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoNotEqualTo(Integer value) {
            addCriterion("service_no <>", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoGreaterThan(Integer value) {
            addCriterion("service_no >", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_no >=", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoLessThan(Integer value) {
            addCriterion("service_no <", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoLessThanOrEqualTo(Integer value) {
            addCriterion("service_no <=", value, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoIn(List<Integer> values) {
            addCriterion("service_no in", values, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoNotIn(List<Integer> values) {
            addCriterion("service_no not in", values, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoBetween(Integer value1, Integer value2) {
            addCriterion("service_no between", value1, value2, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceNoNotBetween(Integer value1, Integer value2) {
            addCriterion("service_no not between", value1, value2, "serviceNo");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIsNull() {
            addCriterion("service_time is null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIsNotNull() {
            addCriterion("service_time is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEqualTo(Date value) {
            addCriterion("service_time =", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotEqualTo(Date value) {
            addCriterion("service_time <>", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThan(Date value) {
            addCriterion("service_time >", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("service_time >=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThan(Date value) {
            addCriterion("service_time <", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThanOrEqualTo(Date value) {
            addCriterion("service_time <=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIn(List<Date> values) {
            addCriterion("service_time in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotIn(List<Date> values) {
            addCriterion("service_time not in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBetween(Date value1, Date value2) {
            addCriterion("service_time between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotBetween(Date value1, Date value2) {
            addCriterion("service_time not between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceStateIsNull() {
            addCriterion("service_state is null");
            return (Criteria) this;
        }

        public Criteria andServiceStateIsNotNull() {
            addCriterion("service_state is not null");
            return (Criteria) this;
        }

        public Criteria andServiceStateEqualTo(Integer value) {
            addCriterion("service_state =", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotEqualTo(Integer value) {
            addCriterion("service_state <>", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateGreaterThan(Integer value) {
            addCriterion("service_state >", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_state >=", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateLessThan(Integer value) {
            addCriterion("service_state <", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateLessThanOrEqualTo(Integer value) {
            addCriterion("service_state <=", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateIn(List<Integer> values) {
            addCriterion("service_state in", values, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotIn(List<Integer> values) {
            addCriterion("service_state not in", values, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateBetween(Integer value1, Integer value2) {
            addCriterion("service_state between", value1, value2, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotBetween(Integer value1, Integer value2) {
            addCriterion("service_state not between", value1, value2, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceSpareIsNull() {
            addCriterion("service_spare is null");
            return (Criteria) this;
        }

        public Criteria andServiceSpareIsNotNull() {
            addCriterion("service_spare is not null");
            return (Criteria) this;
        }

        public Criteria andServiceSpareEqualTo(String value) {
            addCriterion("service_spare =", value, "serviceSpare");
            return (Criteria) this;
        }

        public Criteria andServiceSpareNotEqualTo(String value) {
            addCriterion("service_spare <>", value, "serviceSpare");
            return (Criteria) this;
        }

        public Criteria andServiceSpareGreaterThan(String value) {
            addCriterion("service_spare >", value, "serviceSpare");
            return (Criteria) this;
        }

        public Criteria andServiceSpareGreaterThanOrEqualTo(String value) {
            addCriterion("service_spare >=", value, "serviceSpare");
            return (Criteria) this;
        }

        public Criteria andServiceSpareLessThan(String value) {
            addCriterion("service_spare <", value, "serviceSpare");
            return (Criteria) this;
        }

        public Criteria andServiceSpareLessThanOrEqualTo(String value) {
            addCriterion("service_spare <=", value, "serviceSpare");
            return (Criteria) this;
        }

        public Criteria andServiceSpareLike(String value) {
            addCriterion("service_spare like", value, "serviceSpare");
            return (Criteria) this;
        }

        public Criteria andServiceSpareNotLike(String value) {
            addCriterion("service_spare not like", value, "serviceSpare");
            return (Criteria) this;
        }

        public Criteria andServiceSpareIn(List<String> values) {
            addCriterion("service_spare in", values, "serviceSpare");
            return (Criteria) this;
        }

        public Criteria andServiceSpareNotIn(List<String> values) {
            addCriterion("service_spare not in", values, "serviceSpare");
            return (Criteria) this;
        }

        public Criteria andServiceSpareBetween(String value1, String value2) {
            addCriterion("service_spare between", value1, value2, "serviceSpare");
            return (Criteria) this;
        }

        public Criteria andServiceSpareNotBetween(String value1, String value2) {
            addCriterion("service_spare not between", value1, value2, "serviceSpare");
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