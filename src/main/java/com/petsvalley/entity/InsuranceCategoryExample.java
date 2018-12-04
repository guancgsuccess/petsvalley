package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.List;

public class InsuranceCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public InsuranceCategoryExample() {
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

        public Criteria andIcTypeNameIsNull() {
            addCriterion("ic_type_name is null");
            return (Criteria) this;
        }

        public Criteria andIcTypeNameIsNotNull() {
            addCriterion("ic_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andIcTypeNameEqualTo(String value) {
            addCriterion("ic_type_name =", value, "icTypeName");
            return (Criteria) this;
        }

        public Criteria andIcTypeNameNotEqualTo(String value) {
            addCriterion("ic_type_name <>", value, "icTypeName");
            return (Criteria) this;
        }

        public Criteria andIcTypeNameGreaterThan(String value) {
            addCriterion("ic_type_name >", value, "icTypeName");
            return (Criteria) this;
        }

        public Criteria andIcTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ic_type_name >=", value, "icTypeName");
            return (Criteria) this;
        }

        public Criteria andIcTypeNameLessThan(String value) {
            addCriterion("ic_type_name <", value, "icTypeName");
            return (Criteria) this;
        }

        public Criteria andIcTypeNameLessThanOrEqualTo(String value) {
            addCriterion("ic_type_name <=", value, "icTypeName");
            return (Criteria) this;
        }

        public Criteria andIcTypeNameLike(String value) {
            addCriterion("ic_type_name like", value, "icTypeName");
            return (Criteria) this;
        }

        public Criteria andIcTypeNameNotLike(String value) {
            addCriterion("ic_type_name not like", value, "icTypeName");
            return (Criteria) this;
        }

        public Criteria andIcTypeNameIn(List<String> values) {
            addCriterion("ic_type_name in", values, "icTypeName");
            return (Criteria) this;
        }

        public Criteria andIcTypeNameNotIn(List<String> values) {
            addCriterion("ic_type_name not in", values, "icTypeName");
            return (Criteria) this;
        }

        public Criteria andIcTypeNameBetween(String value1, String value2) {
            addCriterion("ic_type_name between", value1, value2, "icTypeName");
            return (Criteria) this;
        }

        public Criteria andIcTypeNameNotBetween(String value1, String value2) {
            addCriterion("ic_type_name not between", value1, value2, "icTypeName");
            return (Criteria) this;
        }

        public Criteria andIcContentIsNull() {
            addCriterion("ic_content is null");
            return (Criteria) this;
        }

        public Criteria andIcContentIsNotNull() {
            addCriterion("ic_content is not null");
            return (Criteria) this;
        }

        public Criteria andIcContentEqualTo(String value) {
            addCriterion("ic_content =", value, "icContent");
            return (Criteria) this;
        }

        public Criteria andIcContentNotEqualTo(String value) {
            addCriterion("ic_content <>", value, "icContent");
            return (Criteria) this;
        }

        public Criteria andIcContentGreaterThan(String value) {
            addCriterion("ic_content >", value, "icContent");
            return (Criteria) this;
        }

        public Criteria andIcContentGreaterThanOrEqualTo(String value) {
            addCriterion("ic_content >=", value, "icContent");
            return (Criteria) this;
        }

        public Criteria andIcContentLessThan(String value) {
            addCriterion("ic_content <", value, "icContent");
            return (Criteria) this;
        }

        public Criteria andIcContentLessThanOrEqualTo(String value) {
            addCriterion("ic_content <=", value, "icContent");
            return (Criteria) this;
        }

        public Criteria andIcContentLike(String value) {
            addCriterion("ic_content like", value, "icContent");
            return (Criteria) this;
        }

        public Criteria andIcContentNotLike(String value) {
            addCriterion("ic_content not like", value, "icContent");
            return (Criteria) this;
        }

        public Criteria andIcContentIn(List<String> values) {
            addCriterion("ic_content in", values, "icContent");
            return (Criteria) this;
        }

        public Criteria andIcContentNotIn(List<String> values) {
            addCriterion("ic_content not in", values, "icContent");
            return (Criteria) this;
        }

        public Criteria andIcContentBetween(String value1, String value2) {
            addCriterion("ic_content between", value1, value2, "icContent");
            return (Criteria) this;
        }

        public Criteria andIcContentNotBetween(String value1, String value2) {
            addCriterion("ic_content not between", value1, value2, "icContent");
            return (Criteria) this;
        }

        public Criteria andIcStateIsNull() {
            addCriterion("ic_state is null");
            return (Criteria) this;
        }

        public Criteria andIcStateIsNotNull() {
            addCriterion("ic_state is not null");
            return (Criteria) this;
        }

        public Criteria andIcStateEqualTo(Integer value) {
            addCriterion("ic_state =", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateNotEqualTo(Integer value) {
            addCriterion("ic_state <>", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateGreaterThan(Integer value) {
            addCriterion("ic_state >", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ic_state >=", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateLessThan(Integer value) {
            addCriterion("ic_state <", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateLessThanOrEqualTo(Integer value) {
            addCriterion("ic_state <=", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateIn(List<Integer> values) {
            addCriterion("ic_state in", values, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateNotIn(List<Integer> values) {
            addCriterion("ic_state not in", values, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateBetween(Integer value1, Integer value2) {
            addCriterion("ic_state between", value1, value2, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ic_state not between", value1, value2, "icState");
            return (Criteria) this;
        }

        public Criteria andIcMoneyIsNull() {
            addCriterion("ic_money is null");
            return (Criteria) this;
        }

        public Criteria andIcMoneyIsNotNull() {
            addCriterion("ic_money is not null");
            return (Criteria) this;
        }

        public Criteria andIcMoneyEqualTo(Double value) {
            addCriterion("ic_money =", value, "icMoney");
            return (Criteria) this;
        }

        public Criteria andIcMoneyNotEqualTo(Double value) {
            addCriterion("ic_money <>", value, "icMoney");
            return (Criteria) this;
        }

        public Criteria andIcMoneyGreaterThan(Double value) {
            addCriterion("ic_money >", value, "icMoney");
            return (Criteria) this;
        }

        public Criteria andIcMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ic_money >=", value, "icMoney");
            return (Criteria) this;
        }

        public Criteria andIcMoneyLessThan(Double value) {
            addCriterion("ic_money <", value, "icMoney");
            return (Criteria) this;
        }

        public Criteria andIcMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ic_money <=", value, "icMoney");
            return (Criteria) this;
        }

        public Criteria andIcMoneyIn(List<Double> values) {
            addCriterion("ic_money in", values, "icMoney");
            return (Criteria) this;
        }

        public Criteria andIcMoneyNotIn(List<Double> values) {
            addCriterion("ic_money not in", values, "icMoney");
            return (Criteria) this;
        }

        public Criteria andIcMoneyBetween(Double value1, Double value2) {
            addCriterion("ic_money between", value1, value2, "icMoney");
            return (Criteria) this;
        }

        public Criteria andIcMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ic_money not between", value1, value2, "icMoney");
            return (Criteria) this;
        }

        public Criteria andIcSpareIsNull() {
            addCriterion("ic_spare is null");
            return (Criteria) this;
        }

        public Criteria andIcSpareIsNotNull() {
            addCriterion("ic_spare is not null");
            return (Criteria) this;
        }

        public Criteria andIcSpareEqualTo(String value) {
            addCriterion("ic_spare =", value, "icSpare");
            return (Criteria) this;
        }

        public Criteria andIcSpareNotEqualTo(String value) {
            addCriterion("ic_spare <>", value, "icSpare");
            return (Criteria) this;
        }

        public Criteria andIcSpareGreaterThan(String value) {
            addCriterion("ic_spare >", value, "icSpare");
            return (Criteria) this;
        }

        public Criteria andIcSpareGreaterThanOrEqualTo(String value) {
            addCriterion("ic_spare >=", value, "icSpare");
            return (Criteria) this;
        }

        public Criteria andIcSpareLessThan(String value) {
            addCriterion("ic_spare <", value, "icSpare");
            return (Criteria) this;
        }

        public Criteria andIcSpareLessThanOrEqualTo(String value) {
            addCriterion("ic_spare <=", value, "icSpare");
            return (Criteria) this;
        }

        public Criteria andIcSpareLike(String value) {
            addCriterion("ic_spare like", value, "icSpare");
            return (Criteria) this;
        }

        public Criteria andIcSpareNotLike(String value) {
            addCriterion("ic_spare not like", value, "icSpare");
            return (Criteria) this;
        }

        public Criteria andIcSpareIn(List<String> values) {
            addCriterion("ic_spare in", values, "icSpare");
            return (Criteria) this;
        }

        public Criteria andIcSpareNotIn(List<String> values) {
            addCriterion("ic_spare not in", values, "icSpare");
            return (Criteria) this;
        }

        public Criteria andIcSpareBetween(String value1, String value2) {
            addCriterion("ic_spare between", value1, value2, "icSpare");
            return (Criteria) this;
        }

        public Criteria andIcSpareNotBetween(String value1, String value2) {
            addCriterion("ic_spare not between", value1, value2, "icSpare");
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