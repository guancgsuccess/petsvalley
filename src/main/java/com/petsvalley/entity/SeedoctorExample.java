package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeedoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SeedoctorExample() {
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

        public Criteria andDocIdIsNull() {
            addCriterion("doc_id is null");
            return (Criteria) this;
        }

        public Criteria andDocIdIsNotNull() {
            addCriterion("doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andDocIdEqualTo(Integer value) {
            addCriterion("doc_id =", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotEqualTo(Integer value) {
            addCriterion("doc_id <>", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdGreaterThan(Integer value) {
            addCriterion("doc_id >", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doc_id >=", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLessThan(Integer value) {
            addCriterion("doc_id <", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLessThanOrEqualTo(Integer value) {
            addCriterion("doc_id <=", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdIn(List<Integer> values) {
            addCriterion("doc_id in", values, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotIn(List<Integer> values) {
            addCriterion("doc_id not in", values, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdBetween(Integer value1, Integer value2) {
            addCriterion("doc_id between", value1, value2, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doc_id not between", value1, value2, "docId");
            return (Criteria) this;
        }

        public Criteria andDocPetIdIsNull() {
            addCriterion("doc_pet_id is null");
            return (Criteria) this;
        }

        public Criteria andDocPetIdIsNotNull() {
            addCriterion("doc_pet_id is not null");
            return (Criteria) this;
        }

        public Criteria andDocPetIdEqualTo(Integer value) {
            addCriterion("doc_pet_id =", value, "docPetId");
            return (Criteria) this;
        }

        public Criteria andDocPetIdNotEqualTo(Integer value) {
            addCriterion("doc_pet_id <>", value, "docPetId");
            return (Criteria) this;
        }

        public Criteria andDocPetIdGreaterThan(Integer value) {
            addCriterion("doc_pet_id >", value, "docPetId");
            return (Criteria) this;
        }

        public Criteria andDocPetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doc_pet_id >=", value, "docPetId");
            return (Criteria) this;
        }

        public Criteria andDocPetIdLessThan(Integer value) {
            addCriterion("doc_pet_id <", value, "docPetId");
            return (Criteria) this;
        }

        public Criteria andDocPetIdLessThanOrEqualTo(Integer value) {
            addCriterion("doc_pet_id <=", value, "docPetId");
            return (Criteria) this;
        }

        public Criteria andDocPetIdIn(List<Integer> values) {
            addCriterion("doc_pet_id in", values, "docPetId");
            return (Criteria) this;
        }

        public Criteria andDocPetIdNotIn(List<Integer> values) {
            addCriterion("doc_pet_id not in", values, "docPetId");
            return (Criteria) this;
        }

        public Criteria andDocPetIdBetween(Integer value1, Integer value2) {
            addCriterion("doc_pet_id between", value1, value2, "docPetId");
            return (Criteria) this;
        }

        public Criteria andDocPetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doc_pet_id not between", value1, value2, "docPetId");
            return (Criteria) this;
        }

        public Criteria andDocTimeIsNull() {
            addCriterion("doc_time is null");
            return (Criteria) this;
        }

        public Criteria andDocTimeIsNotNull() {
            addCriterion("doc_time is not null");
            return (Criteria) this;
        }

        public Criteria andDocTimeEqualTo(Date value) {
            addCriterion("doc_time =", value, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeNotEqualTo(Date value) {
            addCriterion("doc_time <>", value, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeGreaterThan(Date value) {
            addCriterion("doc_time >", value, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("doc_time >=", value, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeLessThan(Date value) {
            addCriterion("doc_time <", value, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeLessThanOrEqualTo(Date value) {
            addCriterion("doc_time <=", value, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeIn(List<Date> values) {
            addCriterion("doc_time in", values, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeNotIn(List<Date> values) {
            addCriterion("doc_time not in", values, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeBetween(Date value1, Date value2) {
            addCriterion("doc_time between", value1, value2, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocTimeNotBetween(Date value1, Date value2) {
            addCriterion("doc_time not between", value1, value2, "docTime");
            return (Criteria) this;
        }

        public Criteria andDocLocIsNull() {
            addCriterion("doc_loc is null");
            return (Criteria) this;
        }

        public Criteria andDocLocIsNotNull() {
            addCriterion("doc_loc is not null");
            return (Criteria) this;
        }

        public Criteria andDocLocEqualTo(String value) {
            addCriterion("doc_loc =", value, "docLoc");
            return (Criteria) this;
        }

        public Criteria andDocLocNotEqualTo(String value) {
            addCriterion("doc_loc <>", value, "docLoc");
            return (Criteria) this;
        }

        public Criteria andDocLocGreaterThan(String value) {
            addCriterion("doc_loc >", value, "docLoc");
            return (Criteria) this;
        }

        public Criteria andDocLocGreaterThanOrEqualTo(String value) {
            addCriterion("doc_loc >=", value, "docLoc");
            return (Criteria) this;
        }

        public Criteria andDocLocLessThan(String value) {
            addCriterion("doc_loc <", value, "docLoc");
            return (Criteria) this;
        }

        public Criteria andDocLocLessThanOrEqualTo(String value) {
            addCriterion("doc_loc <=", value, "docLoc");
            return (Criteria) this;
        }

        public Criteria andDocLocLike(String value) {
            addCriterion("doc_loc like", value, "docLoc");
            return (Criteria) this;
        }

        public Criteria andDocLocNotLike(String value) {
            addCriterion("doc_loc not like", value, "docLoc");
            return (Criteria) this;
        }

        public Criteria andDocLocIn(List<String> values) {
            addCriterion("doc_loc in", values, "docLoc");
            return (Criteria) this;
        }

        public Criteria andDocLocNotIn(List<String> values) {
            addCriterion("doc_loc not in", values, "docLoc");
            return (Criteria) this;
        }

        public Criteria andDocLocBetween(String value1, String value2) {
            addCriterion("doc_loc between", value1, value2, "docLoc");
            return (Criteria) this;
        }

        public Criteria andDocLocNotBetween(String value1, String value2) {
            addCriterion("doc_loc not between", value1, value2, "docLoc");
            return (Criteria) this;
        }

        public Criteria andDocDetalisIsNull() {
            addCriterion("doc_detalis is null");
            return (Criteria) this;
        }

        public Criteria andDocDetalisIsNotNull() {
            addCriterion("doc_detalis is not null");
            return (Criteria) this;
        }

        public Criteria andDocDetalisEqualTo(String value) {
            addCriterion("doc_detalis =", value, "docDetalis");
            return (Criteria) this;
        }

        public Criteria andDocDetalisNotEqualTo(String value) {
            addCriterion("doc_detalis <>", value, "docDetalis");
            return (Criteria) this;
        }

        public Criteria andDocDetalisGreaterThan(String value) {
            addCriterion("doc_detalis >", value, "docDetalis");
            return (Criteria) this;
        }

        public Criteria andDocDetalisGreaterThanOrEqualTo(String value) {
            addCriterion("doc_detalis >=", value, "docDetalis");
            return (Criteria) this;
        }

        public Criteria andDocDetalisLessThan(String value) {
            addCriterion("doc_detalis <", value, "docDetalis");
            return (Criteria) this;
        }

        public Criteria andDocDetalisLessThanOrEqualTo(String value) {
            addCriterion("doc_detalis <=", value, "docDetalis");
            return (Criteria) this;
        }

        public Criteria andDocDetalisLike(String value) {
            addCriterion("doc_detalis like", value, "docDetalis");
            return (Criteria) this;
        }

        public Criteria andDocDetalisNotLike(String value) {
            addCriterion("doc_detalis not like", value, "docDetalis");
            return (Criteria) this;
        }

        public Criteria andDocDetalisIn(List<String> values) {
            addCriterion("doc_detalis in", values, "docDetalis");
            return (Criteria) this;
        }

        public Criteria andDocDetalisNotIn(List<String> values) {
            addCriterion("doc_detalis not in", values, "docDetalis");
            return (Criteria) this;
        }

        public Criteria andDocDetalisBetween(String value1, String value2) {
            addCriterion("doc_detalis between", value1, value2, "docDetalis");
            return (Criteria) this;
        }

        public Criteria andDocDetalisNotBetween(String value1, String value2) {
            addCriterion("doc_detalis not between", value1, value2, "docDetalis");
            return (Criteria) this;
        }

        public Criteria andDocStateIsNull() {
            addCriterion("doc_state is null");
            return (Criteria) this;
        }

        public Criteria andDocStateIsNotNull() {
            addCriterion("doc_state is not null");
            return (Criteria) this;
        }

        public Criteria andDocStateEqualTo(Integer value) {
            addCriterion("doc_state =", value, "docState");
            return (Criteria) this;
        }

        public Criteria andDocStateNotEqualTo(Integer value) {
            addCriterion("doc_state <>", value, "docState");
            return (Criteria) this;
        }

        public Criteria andDocStateGreaterThan(Integer value) {
            addCriterion("doc_state >", value, "docState");
            return (Criteria) this;
        }

        public Criteria andDocStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("doc_state >=", value, "docState");
            return (Criteria) this;
        }

        public Criteria andDocStateLessThan(Integer value) {
            addCriterion("doc_state <", value, "docState");
            return (Criteria) this;
        }

        public Criteria andDocStateLessThanOrEqualTo(Integer value) {
            addCriterion("doc_state <=", value, "docState");
            return (Criteria) this;
        }

        public Criteria andDocStateIn(List<Integer> values) {
            addCriterion("doc_state in", values, "docState");
            return (Criteria) this;
        }

        public Criteria andDocStateNotIn(List<Integer> values) {
            addCriterion("doc_state not in", values, "docState");
            return (Criteria) this;
        }

        public Criteria andDocStateBetween(Integer value1, Integer value2) {
            addCriterion("doc_state between", value1, value2, "docState");
            return (Criteria) this;
        }

        public Criteria andDocStateNotBetween(Integer value1, Integer value2) {
            addCriterion("doc_state not between", value1, value2, "docState");
            return (Criteria) this;
        }

        public Criteria andDocSpareIsNull() {
            addCriterion("doc_spare is null");
            return (Criteria) this;
        }

        public Criteria andDocSpareIsNotNull() {
            addCriterion("doc_spare is not null");
            return (Criteria) this;
        }

        public Criteria andDocSpareEqualTo(String value) {
            addCriterion("doc_spare =", value, "docSpare");
            return (Criteria) this;
        }

        public Criteria andDocSpareNotEqualTo(String value) {
            addCriterion("doc_spare <>", value, "docSpare");
            return (Criteria) this;
        }

        public Criteria andDocSpareGreaterThan(String value) {
            addCriterion("doc_spare >", value, "docSpare");
            return (Criteria) this;
        }

        public Criteria andDocSpareGreaterThanOrEqualTo(String value) {
            addCriterion("doc_spare >=", value, "docSpare");
            return (Criteria) this;
        }

        public Criteria andDocSpareLessThan(String value) {
            addCriterion("doc_spare <", value, "docSpare");
            return (Criteria) this;
        }

        public Criteria andDocSpareLessThanOrEqualTo(String value) {
            addCriterion("doc_spare <=", value, "docSpare");
            return (Criteria) this;
        }

        public Criteria andDocSpareLike(String value) {
            addCriterion("doc_spare like", value, "docSpare");
            return (Criteria) this;
        }

        public Criteria andDocSpareNotLike(String value) {
            addCriterion("doc_spare not like", value, "docSpare");
            return (Criteria) this;
        }

        public Criteria andDocSpareIn(List<String> values) {
            addCriterion("doc_spare in", values, "docSpare");
            return (Criteria) this;
        }

        public Criteria andDocSpareNotIn(List<String> values) {
            addCriterion("doc_spare not in", values, "docSpare");
            return (Criteria) this;
        }

        public Criteria andDocSpareBetween(String value1, String value2) {
            addCriterion("doc_spare between", value1, value2, "docSpare");
            return (Criteria) this;
        }

        public Criteria andDocSpareNotBetween(String value1, String value2) {
            addCriterion("doc_spare not between", value1, value2, "docSpare");
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