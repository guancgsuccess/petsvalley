package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StrategyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public StrategyExample() {
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

        public Criteria andStraIdIsNull() {
            addCriterion("stra_id is null");
            return (Criteria) this;
        }

        public Criteria andStraIdIsNotNull() {
            addCriterion("stra_id is not null");
            return (Criteria) this;
        }

        public Criteria andStraIdEqualTo(Integer value) {
            addCriterion("stra_id =", value, "straId");
            return (Criteria) this;
        }

        public Criteria andStraIdNotEqualTo(Integer value) {
            addCriterion("stra_id <>", value, "straId");
            return (Criteria) this;
        }

        public Criteria andStraIdGreaterThan(Integer value) {
            addCriterion("stra_id >", value, "straId");
            return (Criteria) this;
        }

        public Criteria andStraIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stra_id >=", value, "straId");
            return (Criteria) this;
        }

        public Criteria andStraIdLessThan(Integer value) {
            addCriterion("stra_id <", value, "straId");
            return (Criteria) this;
        }

        public Criteria andStraIdLessThanOrEqualTo(Integer value) {
            addCriterion("stra_id <=", value, "straId");
            return (Criteria) this;
        }

        public Criteria andStraIdIn(List<Integer> values) {
            addCriterion("stra_id in", values, "straId");
            return (Criteria) this;
        }

        public Criteria andStraIdNotIn(List<Integer> values) {
            addCriterion("stra_id not in", values, "straId");
            return (Criteria) this;
        }

        public Criteria andStraIdBetween(Integer value1, Integer value2) {
            addCriterion("stra_id between", value1, value2, "straId");
            return (Criteria) this;
        }

        public Criteria andStraIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stra_id not between", value1, value2, "straId");
            return (Criteria) this;
        }

        public Criteria andStraTypeIsNull() {
            addCriterion("stra_type is null");
            return (Criteria) this;
        }

        public Criteria andStraTypeIsNotNull() {
            addCriterion("stra_type is not null");
            return (Criteria) this;
        }

        public Criteria andStraTypeEqualTo(String value) {
            addCriterion("stra_type =", value, "straType");
            return (Criteria) this;
        }

        public Criteria andStraTypeNotEqualTo(String value) {
            addCriterion("stra_type <>", value, "straType");
            return (Criteria) this;
        }

        public Criteria andStraTypeGreaterThan(String value) {
            addCriterion("stra_type >", value, "straType");
            return (Criteria) this;
        }

        public Criteria andStraTypeGreaterThanOrEqualTo(String value) {
            addCriterion("stra_type >=", value, "straType");
            return (Criteria) this;
        }

        public Criteria andStraTypeLessThan(String value) {
            addCriterion("stra_type <", value, "straType");
            return (Criteria) this;
        }

        public Criteria andStraTypeLessThanOrEqualTo(String value) {
            addCriterion("stra_type <=", value, "straType");
            return (Criteria) this;
        }

        public Criteria andStraTypeLike(String value) {
            addCriterion("stra_type like", value, "straType");
            return (Criteria) this;
        }

        public Criteria andStraTypeNotLike(String value) {
            addCriterion("stra_type not like", value, "straType");
            return (Criteria) this;
        }

        public Criteria andStraTypeIn(List<String> values) {
            addCriterion("stra_type in", values, "straType");
            return (Criteria) this;
        }

        public Criteria andStraTypeNotIn(List<String> values) {
            addCriterion("stra_type not in", values, "straType");
            return (Criteria) this;
        }

        public Criteria andStraTypeBetween(String value1, String value2) {
            addCriterion("stra_type between", value1, value2, "straType");
            return (Criteria) this;
        }

        public Criteria andStraTypeNotBetween(String value1, String value2) {
            addCriterion("stra_type not between", value1, value2, "straType");
            return (Criteria) this;
        }

        public Criteria andStraTitleIsNull() {
            addCriterion("stra_title is null");
            return (Criteria) this;
        }

        public Criteria andStraTitleIsNotNull() {
            addCriterion("stra_title is not null");
            return (Criteria) this;
        }

        public Criteria andStraTitleEqualTo(String value) {
            addCriterion("stra_title =", value, "straTitle");
            return (Criteria) this;
        }

        public Criteria andStraTitleNotEqualTo(String value) {
            addCriterion("stra_title <>", value, "straTitle");
            return (Criteria) this;
        }

        public Criteria andStraTitleGreaterThan(String value) {
            addCriterion("stra_title >", value, "straTitle");
            return (Criteria) this;
        }

        public Criteria andStraTitleGreaterThanOrEqualTo(String value) {
            addCriterion("stra_title >=", value, "straTitle");
            return (Criteria) this;
        }

        public Criteria andStraTitleLessThan(String value) {
            addCriterion("stra_title <", value, "straTitle");
            return (Criteria) this;
        }

        public Criteria andStraTitleLessThanOrEqualTo(String value) {
            addCriterion("stra_title <=", value, "straTitle");
            return (Criteria) this;
        }

        public Criteria andStraTitleLike(String value) {
            addCriterion("stra_title like", value, "straTitle");
            return (Criteria) this;
        }

        public Criteria andStraTitleNotLike(String value) {
            addCriterion("stra_title not like", value, "straTitle");
            return (Criteria) this;
        }

        public Criteria andStraTitleIn(List<String> values) {
            addCriterion("stra_title in", values, "straTitle");
            return (Criteria) this;
        }

        public Criteria andStraTitleNotIn(List<String> values) {
            addCriterion("stra_title not in", values, "straTitle");
            return (Criteria) this;
        }

        public Criteria andStraTitleBetween(String value1, String value2) {
            addCriterion("stra_title between", value1, value2, "straTitle");
            return (Criteria) this;
        }

        public Criteria andStraTitleNotBetween(String value1, String value2) {
            addCriterion("stra_title not between", value1, value2, "straTitle");
            return (Criteria) this;
        }

        public Criteria andStraMessageIsNull() {
            addCriterion("stra_message is null");
            return (Criteria) this;
        }

        public Criteria andStraMessageIsNotNull() {
            addCriterion("stra_message is not null");
            return (Criteria) this;
        }

        public Criteria andStraMessageEqualTo(String value) {
            addCriterion("stra_message =", value, "straMessage");
            return (Criteria) this;
        }

        public Criteria andStraMessageNotEqualTo(String value) {
            addCriterion("stra_message <>", value, "straMessage");
            return (Criteria) this;
        }

        public Criteria andStraMessageGreaterThan(String value) {
            addCriterion("stra_message >", value, "straMessage");
            return (Criteria) this;
        }

        public Criteria andStraMessageGreaterThanOrEqualTo(String value) {
            addCriterion("stra_message >=", value, "straMessage");
            return (Criteria) this;
        }

        public Criteria andStraMessageLessThan(String value) {
            addCriterion("stra_message <", value, "straMessage");
            return (Criteria) this;
        }

        public Criteria andStraMessageLessThanOrEqualTo(String value) {
            addCriterion("stra_message <=", value, "straMessage");
            return (Criteria) this;
        }

        public Criteria andStraMessageLike(String value) {
            addCriterion("stra_message like", value, "straMessage");
            return (Criteria) this;
        }

        public Criteria andStraMessageNotLike(String value) {
            addCriterion("stra_message not like", value, "straMessage");
            return (Criteria) this;
        }

        public Criteria andStraMessageIn(List<String> values) {
            addCriterion("stra_message in", values, "straMessage");
            return (Criteria) this;
        }

        public Criteria andStraMessageNotIn(List<String> values) {
            addCriterion("stra_message not in", values, "straMessage");
            return (Criteria) this;
        }

        public Criteria andStraMessageBetween(String value1, String value2) {
            addCriterion("stra_message between", value1, value2, "straMessage");
            return (Criteria) this;
        }

        public Criteria andStraMessageNotBetween(String value1, String value2) {
            addCriterion("stra_message not between", value1, value2, "straMessage");
            return (Criteria) this;
        }

        public Criteria andStraPhotoIsNull() {
            addCriterion("stra_photo is null");
            return (Criteria) this;
        }

        public Criteria andStraPhotoIsNotNull() {
            addCriterion("stra_photo is not null");
            return (Criteria) this;
        }

        public Criteria andStraPhotoEqualTo(String value) {
            addCriterion("stra_photo =", value, "straPhoto");
            return (Criteria) this;
        }

        public Criteria andStraPhotoNotEqualTo(String value) {
            addCriterion("stra_photo <>", value, "straPhoto");
            return (Criteria) this;
        }

        public Criteria andStraPhotoGreaterThan(String value) {
            addCriterion("stra_photo >", value, "straPhoto");
            return (Criteria) this;
        }

        public Criteria andStraPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("stra_photo >=", value, "straPhoto");
            return (Criteria) this;
        }

        public Criteria andStraPhotoLessThan(String value) {
            addCriterion("stra_photo <", value, "straPhoto");
            return (Criteria) this;
        }

        public Criteria andStraPhotoLessThanOrEqualTo(String value) {
            addCriterion("stra_photo <=", value, "straPhoto");
            return (Criteria) this;
        }

        public Criteria andStraPhotoLike(String value) {
            addCriterion("stra_photo like", value, "straPhoto");
            return (Criteria) this;
        }

        public Criteria andStraPhotoNotLike(String value) {
            addCriterion("stra_photo not like", value, "straPhoto");
            return (Criteria) this;
        }

        public Criteria andStraPhotoIn(List<String> values) {
            addCriterion("stra_photo in", values, "straPhoto");
            return (Criteria) this;
        }

        public Criteria andStraPhotoNotIn(List<String> values) {
            addCriterion("stra_photo not in", values, "straPhoto");
            return (Criteria) this;
        }

        public Criteria andStraPhotoBetween(String value1, String value2) {
            addCriterion("stra_photo between", value1, value2, "straPhoto");
            return (Criteria) this;
        }

        public Criteria andStraPhotoNotBetween(String value1, String value2) {
            addCriterion("stra_photo not between", value1, value2, "straPhoto");
            return (Criteria) this;
        }

        public Criteria andStraTimeIsNull() {
            addCriterion("stra_time is null");
            return (Criteria) this;
        }

        public Criteria andStraTimeIsNotNull() {
            addCriterion("stra_time is not null");
            return (Criteria) this;
        }

        public Criteria andStraTimeEqualTo(Date value) {
            addCriterion("stra_time =", value, "straTime");
            return (Criteria) this;
        }

        public Criteria andStraTimeNotEqualTo(Date value) {
            addCriterion("stra_time <>", value, "straTime");
            return (Criteria) this;
        }

        public Criteria andStraTimeGreaterThan(Date value) {
            addCriterion("stra_time >", value, "straTime");
            return (Criteria) this;
        }

        public Criteria andStraTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stra_time >=", value, "straTime");
            return (Criteria) this;
        }

        public Criteria andStraTimeLessThan(Date value) {
            addCriterion("stra_time <", value, "straTime");
            return (Criteria) this;
        }

        public Criteria andStraTimeLessThanOrEqualTo(Date value) {
            addCriterion("stra_time <=", value, "straTime");
            return (Criteria) this;
        }

        public Criteria andStraTimeIn(List<Date> values) {
            addCriterion("stra_time in", values, "straTime");
            return (Criteria) this;
        }

        public Criteria andStraTimeNotIn(List<Date> values) {
            addCriterion("stra_time not in", values, "straTime");
            return (Criteria) this;
        }

        public Criteria andStraTimeBetween(Date value1, Date value2) {
            addCriterion("stra_time between", value1, value2, "straTime");
            return (Criteria) this;
        }

        public Criteria andStraTimeNotBetween(Date value1, Date value2) {
            addCriterion("stra_time not between", value1, value2, "straTime");
            return (Criteria) this;
        }

        public Criteria andStraStateIsNull() {
            addCriterion("stra_state is null");
            return (Criteria) this;
        }

        public Criteria andStraStateIsNotNull() {
            addCriterion("stra_state is not null");
            return (Criteria) this;
        }

        public Criteria andStraStateEqualTo(Integer value) {
            addCriterion("stra_state =", value, "straState");
            return (Criteria) this;
        }

        public Criteria andStraStateNotEqualTo(Integer value) {
            addCriterion("stra_state <>", value, "straState");
            return (Criteria) this;
        }

        public Criteria andStraStateGreaterThan(Integer value) {
            addCriterion("stra_state >", value, "straState");
            return (Criteria) this;
        }

        public Criteria andStraStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("stra_state >=", value, "straState");
            return (Criteria) this;
        }

        public Criteria andStraStateLessThan(Integer value) {
            addCriterion("stra_state <", value, "straState");
            return (Criteria) this;
        }

        public Criteria andStraStateLessThanOrEqualTo(Integer value) {
            addCriterion("stra_state <=", value, "straState");
            return (Criteria) this;
        }

        public Criteria andStraStateIn(List<Integer> values) {
            addCriterion("stra_state in", values, "straState");
            return (Criteria) this;
        }

        public Criteria andStraStateNotIn(List<Integer> values) {
            addCriterion("stra_state not in", values, "straState");
            return (Criteria) this;
        }

        public Criteria andStraStateBetween(Integer value1, Integer value2) {
            addCriterion("stra_state between", value1, value2, "straState");
            return (Criteria) this;
        }

        public Criteria andStraStateNotBetween(Integer value1, Integer value2) {
            addCriterion("stra_state not between", value1, value2, "straState");
            return (Criteria) this;
        }

        public Criteria andStraSpareIsNull() {
            addCriterion("stra_spare is null");
            return (Criteria) this;
        }

        public Criteria andStraSpareIsNotNull() {
            addCriterion("stra_spare is not null");
            return (Criteria) this;
        }

        public Criteria andStraSpareEqualTo(String value) {
            addCriterion("stra_spare =", value, "straSpare");
            return (Criteria) this;
        }

        public Criteria andStraSpareNotEqualTo(String value) {
            addCriterion("stra_spare <>", value, "straSpare");
            return (Criteria) this;
        }

        public Criteria andStraSpareGreaterThan(String value) {
            addCriterion("stra_spare >", value, "straSpare");
            return (Criteria) this;
        }

        public Criteria andStraSpareGreaterThanOrEqualTo(String value) {
            addCriterion("stra_spare >=", value, "straSpare");
            return (Criteria) this;
        }

        public Criteria andStraSpareLessThan(String value) {
            addCriterion("stra_spare <", value, "straSpare");
            return (Criteria) this;
        }

        public Criteria andStraSpareLessThanOrEqualTo(String value) {
            addCriterion("stra_spare <=", value, "straSpare");
            return (Criteria) this;
        }

        public Criteria andStraSpareLike(String value) {
            addCriterion("stra_spare like", value, "straSpare");
            return (Criteria) this;
        }

        public Criteria andStraSpareNotLike(String value) {
            addCriterion("stra_spare not like", value, "straSpare");
            return (Criteria) this;
        }

        public Criteria andStraSpareIn(List<String> values) {
            addCriterion("stra_spare in", values, "straSpare");
            return (Criteria) this;
        }

        public Criteria andStraSpareNotIn(List<String> values) {
            addCriterion("stra_spare not in", values, "straSpare");
            return (Criteria) this;
        }

        public Criteria andStraSpareBetween(String value1, String value2) {
            addCriterion("stra_spare between", value1, value2, "straSpare");
            return (Criteria) this;
        }

        public Criteria andStraSpareNotBetween(String value1, String value2) {
            addCriterion("stra_spare not between", value1, value2, "straSpare");
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