package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CommentExample() {
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

        public Criteria andCommIdIsNull() {
            addCriterion("comm_id is null");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNotNull() {
            addCriterion("comm_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommIdEqualTo(Integer value) {
            addCriterion("comm_id =", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotEqualTo(Integer value) {
            addCriterion("comm_id <>", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThan(Integer value) {
            addCriterion("comm_id >", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comm_id >=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThan(Integer value) {
            addCriterion("comm_id <", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThanOrEqualTo(Integer value) {
            addCriterion("comm_id <=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdIn(List<Integer> values) {
            addCriterion("comm_id in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotIn(List<Integer> values) {
            addCriterion("comm_id not in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdBetween(Integer value1, Integer value2) {
            addCriterion("comm_id between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comm_id not between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(Integer value) {
            addCriterion("post_id =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(Integer value) {
            addCriterion("post_id <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(Integer value) {
            addCriterion("post_id >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_id >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(Integer value) {
            addCriterion("post_id <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_id <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<Integer> values) {
            addCriterion("post_id in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<Integer> values) {
            addCriterion("post_id not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(Integer value1, Integer value2) {
            addCriterion("post_id between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_id not between", value1, value2, "postId");
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

        public Criteria andCommContentIsNull() {
            addCriterion("comm_content is null");
            return (Criteria) this;
        }

        public Criteria andCommContentIsNotNull() {
            addCriterion("comm_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommContentEqualTo(String value) {
            addCriterion("comm_content =", value, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentNotEqualTo(String value) {
            addCriterion("comm_content <>", value, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentGreaterThan(String value) {
            addCriterion("comm_content >", value, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentGreaterThanOrEqualTo(String value) {
            addCriterion("comm_content >=", value, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentLessThan(String value) {
            addCriterion("comm_content <", value, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentLessThanOrEqualTo(String value) {
            addCriterion("comm_content <=", value, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentLike(String value) {
            addCriterion("comm_content like", value, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentNotLike(String value) {
            addCriterion("comm_content not like", value, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentIn(List<String> values) {
            addCriterion("comm_content in", values, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentNotIn(List<String> values) {
            addCriterion("comm_content not in", values, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentBetween(String value1, String value2) {
            addCriterion("comm_content between", value1, value2, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentNotBetween(String value1, String value2) {
            addCriterion("comm_content not between", value1, value2, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommTimeIsNull() {
            addCriterion("comm_time is null");
            return (Criteria) this;
        }

        public Criteria andCommTimeIsNotNull() {
            addCriterion("comm_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommTimeEqualTo(Date value) {
            addCriterion("comm_time =", value, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeNotEqualTo(Date value) {
            addCriterion("comm_time <>", value, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeGreaterThan(Date value) {
            addCriterion("comm_time >", value, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comm_time >=", value, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeLessThan(Date value) {
            addCriterion("comm_time <", value, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeLessThanOrEqualTo(Date value) {
            addCriterion("comm_time <=", value, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeIn(List<Date> values) {
            addCriterion("comm_time in", values, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeNotIn(List<Date> values) {
            addCriterion("comm_time not in", values, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeBetween(Date value1, Date value2) {
            addCriterion("comm_time between", value1, value2, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommTimeNotBetween(Date value1, Date value2) {
            addCriterion("comm_time not between", value1, value2, "commTime");
            return (Criteria) this;
        }

        public Criteria andCommStateIsNull() {
            addCriterion("comm_state is null");
            return (Criteria) this;
        }

        public Criteria andCommStateIsNotNull() {
            addCriterion("comm_state is not null");
            return (Criteria) this;
        }

        public Criteria andCommStateEqualTo(Integer value) {
            addCriterion("comm_state =", value, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateNotEqualTo(Integer value) {
            addCriterion("comm_state <>", value, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateGreaterThan(Integer value) {
            addCriterion("comm_state >", value, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("comm_state >=", value, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateLessThan(Integer value) {
            addCriterion("comm_state <", value, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateLessThanOrEqualTo(Integer value) {
            addCriterion("comm_state <=", value, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateIn(List<Integer> values) {
            addCriterion("comm_state in", values, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateNotIn(List<Integer> values) {
            addCriterion("comm_state not in", values, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateBetween(Integer value1, Integer value2) {
            addCriterion("comm_state between", value1, value2, "commState");
            return (Criteria) this;
        }

        public Criteria andCommStateNotBetween(Integer value1, Integer value2) {
            addCriterion("comm_state not between", value1, value2, "commState");
            return (Criteria) this;
        }

        public Criteria andCommSpareIsNull() {
            addCriterion("comm_spare is null");
            return (Criteria) this;
        }

        public Criteria andCommSpareIsNotNull() {
            addCriterion("comm_spare is not null");
            return (Criteria) this;
        }

        public Criteria andCommSpareEqualTo(String value) {
            addCriterion("comm_spare =", value, "commSpare");
            return (Criteria) this;
        }

        public Criteria andCommSpareNotEqualTo(String value) {
            addCriterion("comm_spare <>", value, "commSpare");
            return (Criteria) this;
        }

        public Criteria andCommSpareGreaterThan(String value) {
            addCriterion("comm_spare >", value, "commSpare");
            return (Criteria) this;
        }

        public Criteria andCommSpareGreaterThanOrEqualTo(String value) {
            addCriterion("comm_spare >=", value, "commSpare");
            return (Criteria) this;
        }

        public Criteria andCommSpareLessThan(String value) {
            addCriterion("comm_spare <", value, "commSpare");
            return (Criteria) this;
        }

        public Criteria andCommSpareLessThanOrEqualTo(String value) {
            addCriterion("comm_spare <=", value, "commSpare");
            return (Criteria) this;
        }

        public Criteria andCommSpareLike(String value) {
            addCriterion("comm_spare like", value, "commSpare");
            return (Criteria) this;
        }

        public Criteria andCommSpareNotLike(String value) {
            addCriterion("comm_spare not like", value, "commSpare");
            return (Criteria) this;
        }

        public Criteria andCommSpareIn(List<String> values) {
            addCriterion("comm_spare in", values, "commSpare");
            return (Criteria) this;
        }

        public Criteria andCommSpareNotIn(List<String> values) {
            addCriterion("comm_spare not in", values, "commSpare");
            return (Criteria) this;
        }

        public Criteria andCommSpareBetween(String value1, String value2) {
            addCriterion("comm_spare between", value1, value2, "commSpare");
            return (Criteria) this;
        }

        public Criteria andCommSpareNotBetween(String value1, String value2) {
            addCriterion("comm_spare not between", value1, value2, "commSpare");
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