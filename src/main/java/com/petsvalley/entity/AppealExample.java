package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppealExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AppealExample() {
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

        public Criteria andAplIdIsNull() {
            addCriterion("apl_id is null");
            return (Criteria) this;
        }

        public Criteria andAplIdIsNotNull() {
            addCriterion("apl_id is not null");
            return (Criteria) this;
        }

        public Criteria andAplIdEqualTo(Integer value) {
            addCriterion("apl_id =", value, "aplId");
            return (Criteria) this;
        }

        public Criteria andAplIdNotEqualTo(Integer value) {
            addCriterion("apl_id <>", value, "aplId");
            return (Criteria) this;
        }

        public Criteria andAplIdGreaterThan(Integer value) {
            addCriterion("apl_id >", value, "aplId");
            return (Criteria) this;
        }

        public Criteria andAplIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apl_id >=", value, "aplId");
            return (Criteria) this;
        }

        public Criteria andAplIdLessThan(Integer value) {
            addCriterion("apl_id <", value, "aplId");
            return (Criteria) this;
        }

        public Criteria andAplIdLessThanOrEqualTo(Integer value) {
            addCriterion("apl_id <=", value, "aplId");
            return (Criteria) this;
        }

        public Criteria andAplIdIn(List<Integer> values) {
            addCriterion("apl_id in", values, "aplId");
            return (Criteria) this;
        }

        public Criteria andAplIdNotIn(List<Integer> values) {
            addCriterion("apl_id not in", values, "aplId");
            return (Criteria) this;
        }

        public Criteria andAplIdBetween(Integer value1, Integer value2) {
            addCriterion("apl_id between", value1, value2, "aplId");
            return (Criteria) this;
        }

        public Criteria andAplIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apl_id not between", value1, value2, "aplId");
            return (Criteria) this;
        }

        public Criteria andAplTimeIsNull() {
            addCriterion("apl_time is null");
            return (Criteria) this;
        }

        public Criteria andAplTimeIsNotNull() {
            addCriterion("apl_time is not null");
            return (Criteria) this;
        }

        public Criteria andAplTimeEqualTo(Date value) {
            addCriterion("apl_time =", value, "aplTime");
            return (Criteria) this;
        }

        public Criteria andAplTimeNotEqualTo(Date value) {
            addCriterion("apl_time <>", value, "aplTime");
            return (Criteria) this;
        }

        public Criteria andAplTimeGreaterThan(Date value) {
            addCriterion("apl_time >", value, "aplTime");
            return (Criteria) this;
        }

        public Criteria andAplTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apl_time >=", value, "aplTime");
            return (Criteria) this;
        }

        public Criteria andAplTimeLessThan(Date value) {
            addCriterion("apl_time <", value, "aplTime");
            return (Criteria) this;
        }

        public Criteria andAplTimeLessThanOrEqualTo(Date value) {
            addCriterion("apl_time <=", value, "aplTime");
            return (Criteria) this;
        }

        public Criteria andAplTimeIn(List<Date> values) {
            addCriterion("apl_time in", values, "aplTime");
            return (Criteria) this;
        }

        public Criteria andAplTimeNotIn(List<Date> values) {
            addCriterion("apl_time not in", values, "aplTime");
            return (Criteria) this;
        }

        public Criteria andAplTimeBetween(Date value1, Date value2) {
            addCriterion("apl_time between", value1, value2, "aplTime");
            return (Criteria) this;
        }

        public Criteria andAplTimeNotBetween(Date value1, Date value2) {
            addCriterion("apl_time not between", value1, value2, "aplTime");
            return (Criteria) this;
        }

        public Criteria andPunIdIsNull() {
            addCriterion("pun_id is null");
            return (Criteria) this;
        }

        public Criteria andPunIdIsNotNull() {
            addCriterion("pun_id is not null");
            return (Criteria) this;
        }

        public Criteria andPunIdEqualTo(Integer value) {
            addCriterion("pun_id =", value, "punId");
            return (Criteria) this;
        }

        public Criteria andPunIdNotEqualTo(Integer value) {
            addCriterion("pun_id <>", value, "punId");
            return (Criteria) this;
        }

        public Criteria andPunIdGreaterThan(Integer value) {
            addCriterion("pun_id >", value, "punId");
            return (Criteria) this;
        }

        public Criteria andPunIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pun_id >=", value, "punId");
            return (Criteria) this;
        }

        public Criteria andPunIdLessThan(Integer value) {
            addCriterion("pun_id <", value, "punId");
            return (Criteria) this;
        }

        public Criteria andPunIdLessThanOrEqualTo(Integer value) {
            addCriterion("pun_id <=", value, "punId");
            return (Criteria) this;
        }

        public Criteria andPunIdIn(List<Integer> values) {
            addCriterion("pun_id in", values, "punId");
            return (Criteria) this;
        }

        public Criteria andPunIdNotIn(List<Integer> values) {
            addCriterion("pun_id not in", values, "punId");
            return (Criteria) this;
        }

        public Criteria andPunIdBetween(Integer value1, Integer value2) {
            addCriterion("pun_id between", value1, value2, "punId");
            return (Criteria) this;
        }

        public Criteria andPunIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pun_id not between", value1, value2, "punId");
            return (Criteria) this;
        }

        public Criteria andAplResultIsNull() {
            addCriterion("apl_result is null");
            return (Criteria) this;
        }

        public Criteria andAplResultIsNotNull() {
            addCriterion("apl_result is not null");
            return (Criteria) this;
        }

        public Criteria andAplResultEqualTo(String value) {
            addCriterion("apl_result =", value, "aplResult");
            return (Criteria) this;
        }

        public Criteria andAplResultNotEqualTo(String value) {
            addCriterion("apl_result <>", value, "aplResult");
            return (Criteria) this;
        }

        public Criteria andAplResultGreaterThan(String value) {
            addCriterion("apl_result >", value, "aplResult");
            return (Criteria) this;
        }

        public Criteria andAplResultGreaterThanOrEqualTo(String value) {
            addCriterion("apl_result >=", value, "aplResult");
            return (Criteria) this;
        }

        public Criteria andAplResultLessThan(String value) {
            addCriterion("apl_result <", value, "aplResult");
            return (Criteria) this;
        }

        public Criteria andAplResultLessThanOrEqualTo(String value) {
            addCriterion("apl_result <=", value, "aplResult");
            return (Criteria) this;
        }

        public Criteria andAplResultLike(String value) {
            addCriterion("apl_result like", value, "aplResult");
            return (Criteria) this;
        }

        public Criteria andAplResultNotLike(String value) {
            addCriterion("apl_result not like", value, "aplResult");
            return (Criteria) this;
        }

        public Criteria andAplResultIn(List<String> values) {
            addCriterion("apl_result in", values, "aplResult");
            return (Criteria) this;
        }

        public Criteria andAplResultNotIn(List<String> values) {
            addCriterion("apl_result not in", values, "aplResult");
            return (Criteria) this;
        }

        public Criteria andAplResultBetween(String value1, String value2) {
            addCriterion("apl_result between", value1, value2, "aplResult");
            return (Criteria) this;
        }

        public Criteria andAplResultNotBetween(String value1, String value2) {
            addCriterion("apl_result not between", value1, value2, "aplResult");
            return (Criteria) this;
        }

        public Criteria andResultTimeIsNull() {
            addCriterion("result_time is null");
            return (Criteria) this;
        }

        public Criteria andResultTimeIsNotNull() {
            addCriterion("result_time is not null");
            return (Criteria) this;
        }

        public Criteria andResultTimeEqualTo(Date value) {
            addCriterion("result_time =", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeNotEqualTo(Date value) {
            addCriterion("result_time <>", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeGreaterThan(Date value) {
            addCriterion("result_time >", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("result_time >=", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeLessThan(Date value) {
            addCriterion("result_time <", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeLessThanOrEqualTo(Date value) {
            addCriterion("result_time <=", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeIn(List<Date> values) {
            addCriterion("result_time in", values, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeNotIn(List<Date> values) {
            addCriterion("result_time not in", values, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeBetween(Date value1, Date value2) {
            addCriterion("result_time between", value1, value2, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeNotBetween(Date value1, Date value2) {
            addCriterion("result_time not between", value1, value2, "resultTime");
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

        public Criteria andAplStateIsNull() {
            addCriterion("apl_state is null");
            return (Criteria) this;
        }

        public Criteria andAplStateIsNotNull() {
            addCriterion("apl_state is not null");
            return (Criteria) this;
        }

        public Criteria andAplStateEqualTo(Integer value) {
            addCriterion("apl_state =", value, "aplState");
            return (Criteria) this;
        }

        public Criteria andAplStateNotEqualTo(Integer value) {
            addCriterion("apl_state <>", value, "aplState");
            return (Criteria) this;
        }

        public Criteria andAplStateGreaterThan(Integer value) {
            addCriterion("apl_state >", value, "aplState");
            return (Criteria) this;
        }

        public Criteria andAplStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("apl_state >=", value, "aplState");
            return (Criteria) this;
        }

        public Criteria andAplStateLessThan(Integer value) {
            addCriterion("apl_state <", value, "aplState");
            return (Criteria) this;
        }

        public Criteria andAplStateLessThanOrEqualTo(Integer value) {
            addCriterion("apl_state <=", value, "aplState");
            return (Criteria) this;
        }

        public Criteria andAplStateIn(List<Integer> values) {
            addCriterion("apl_state in", values, "aplState");
            return (Criteria) this;
        }

        public Criteria andAplStateNotIn(List<Integer> values) {
            addCriterion("apl_state not in", values, "aplState");
            return (Criteria) this;
        }

        public Criteria andAplStateBetween(Integer value1, Integer value2) {
            addCriterion("apl_state between", value1, value2, "aplState");
            return (Criteria) this;
        }

        public Criteria andAplStateNotBetween(Integer value1, Integer value2) {
            addCriterion("apl_state not between", value1, value2, "aplState");
            return (Criteria) this;
        }

        public Criteria andAppealSpareIsNull() {
            addCriterion("appeal_spare is null");
            return (Criteria) this;
        }

        public Criteria andAppealSpareIsNotNull() {
            addCriterion("appeal_spare is not null");
            return (Criteria) this;
        }

        public Criteria andAppealSpareEqualTo(String value) {
            addCriterion("appeal_spare =", value, "appealSpare");
            return (Criteria) this;
        }

        public Criteria andAppealSpareNotEqualTo(String value) {
            addCriterion("appeal_spare <>", value, "appealSpare");
            return (Criteria) this;
        }

        public Criteria andAppealSpareGreaterThan(String value) {
            addCriterion("appeal_spare >", value, "appealSpare");
            return (Criteria) this;
        }

        public Criteria andAppealSpareGreaterThanOrEqualTo(String value) {
            addCriterion("appeal_spare >=", value, "appealSpare");
            return (Criteria) this;
        }

        public Criteria andAppealSpareLessThan(String value) {
            addCriterion("appeal_spare <", value, "appealSpare");
            return (Criteria) this;
        }

        public Criteria andAppealSpareLessThanOrEqualTo(String value) {
            addCriterion("appeal_spare <=", value, "appealSpare");
            return (Criteria) this;
        }

        public Criteria andAppealSpareLike(String value) {
            addCriterion("appeal_spare like", value, "appealSpare");
            return (Criteria) this;
        }

        public Criteria andAppealSpareNotLike(String value) {
            addCriterion("appeal_spare not like", value, "appealSpare");
            return (Criteria) this;
        }

        public Criteria andAppealSpareIn(List<String> values) {
            addCriterion("appeal_spare in", values, "appealSpare");
            return (Criteria) this;
        }

        public Criteria andAppealSpareNotIn(List<String> values) {
            addCriterion("appeal_spare not in", values, "appealSpare");
            return (Criteria) this;
        }

        public Criteria andAppealSpareBetween(String value1, String value2) {
            addCriterion("appeal_spare between", value1, value2, "appealSpare");
            return (Criteria) this;
        }

        public Criteria andAppealSpareNotBetween(String value1, String value2) {
            addCriterion("appeal_spare not between", value1, value2, "appealSpare");
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