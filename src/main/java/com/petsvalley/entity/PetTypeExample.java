package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.List;

public class PetTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PetTypeExample() {
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeStateIsNull() {
            addCriterion("type_state is null");
            return (Criteria) this;
        }

        public Criteria andTypeStateIsNotNull() {
            addCriterion("type_state is not null");
            return (Criteria) this;
        }

        public Criteria andTypeStateEqualTo(Integer value) {
            addCriterion("type_state =", value, "typeState");
            return (Criteria) this;
        }

        public Criteria andTypeStateNotEqualTo(Integer value) {
            addCriterion("type_state <>", value, "typeState");
            return (Criteria) this;
        }

        public Criteria andTypeStateGreaterThan(Integer value) {
            addCriterion("type_state >", value, "typeState");
            return (Criteria) this;
        }

        public Criteria andTypeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_state >=", value, "typeState");
            return (Criteria) this;
        }

        public Criteria andTypeStateLessThan(Integer value) {
            addCriterion("type_state <", value, "typeState");
            return (Criteria) this;
        }

        public Criteria andTypeStateLessThanOrEqualTo(Integer value) {
            addCriterion("type_state <=", value, "typeState");
            return (Criteria) this;
        }

        public Criteria andTypeStateIn(List<Integer> values) {
            addCriterion("type_state in", values, "typeState");
            return (Criteria) this;
        }

        public Criteria andTypeStateNotIn(List<Integer> values) {
            addCriterion("type_state not in", values, "typeState");
            return (Criteria) this;
        }

        public Criteria andTypeStateBetween(Integer value1, Integer value2) {
            addCriterion("type_state between", value1, value2, "typeState");
            return (Criteria) this;
        }

        public Criteria andTypeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("type_state not between", value1, value2, "typeState");
            return (Criteria) this;
        }

        public Criteria andDiscIdIsNull() {
            addCriterion("disc_id is null");
            return (Criteria) this;
        }

        public Criteria andDiscIdIsNotNull() {
            addCriterion("disc_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiscIdEqualTo(Integer value) {
            addCriterion("disc_id =", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdNotEqualTo(Integer value) {
            addCriterion("disc_id <>", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdGreaterThan(Integer value) {
            addCriterion("disc_id >", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("disc_id >=", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdLessThan(Integer value) {
            addCriterion("disc_id <", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdLessThanOrEqualTo(Integer value) {
            addCriterion("disc_id <=", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdIn(List<Integer> values) {
            addCriterion("disc_id in", values, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdNotIn(List<Integer> values) {
            addCriterion("disc_id not in", values, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdBetween(Integer value1, Integer value2) {
            addCriterion("disc_id between", value1, value2, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdNotBetween(Integer value1, Integer value2) {
            addCriterion("disc_id not between", value1, value2, "discId");
            return (Criteria) this;
        }

        public Criteria andTypeSpareIsNull() {
            addCriterion("type_spare is null");
            return (Criteria) this;
        }

        public Criteria andTypeSpareIsNotNull() {
            addCriterion("type_spare is not null");
            return (Criteria) this;
        }

        public Criteria andTypeSpareEqualTo(String value) {
            addCriterion("type_spare =", value, "typeSpare");
            return (Criteria) this;
        }

        public Criteria andTypeSpareNotEqualTo(String value) {
            addCriterion("type_spare <>", value, "typeSpare");
            return (Criteria) this;
        }

        public Criteria andTypeSpareGreaterThan(String value) {
            addCriterion("type_spare >", value, "typeSpare");
            return (Criteria) this;
        }

        public Criteria andTypeSpareGreaterThanOrEqualTo(String value) {
            addCriterion("type_spare >=", value, "typeSpare");
            return (Criteria) this;
        }

        public Criteria andTypeSpareLessThan(String value) {
            addCriterion("type_spare <", value, "typeSpare");
            return (Criteria) this;
        }

        public Criteria andTypeSpareLessThanOrEqualTo(String value) {
            addCriterion("type_spare <=", value, "typeSpare");
            return (Criteria) this;
        }

        public Criteria andTypeSpareLike(String value) {
            addCriterion("type_spare like", value, "typeSpare");
            return (Criteria) this;
        }

        public Criteria andTypeSpareNotLike(String value) {
            addCriterion("type_spare not like", value, "typeSpare");
            return (Criteria) this;
        }

        public Criteria andTypeSpareIn(List<String> values) {
            addCriterion("type_spare in", values, "typeSpare");
            return (Criteria) this;
        }

        public Criteria andTypeSpareNotIn(List<String> values) {
            addCriterion("type_spare not in", values, "typeSpare");
            return (Criteria) this;
        }

        public Criteria andTypeSpareBetween(String value1, String value2) {
            addCriterion("type_spare between", value1, value2, "typeSpare");
            return (Criteria) this;
        }

        public Criteria andTypeSpareNotBetween(String value1, String value2) {
            addCriterion("type_spare not between", value1, value2, "typeSpare");
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