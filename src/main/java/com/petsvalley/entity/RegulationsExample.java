package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.List;

public class RegulationsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public RegulationsExample() {
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

        public Criteria andRegIdIsNull() {
            addCriterion("reg_id is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("reg_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(Integer value) {
            addCriterion("reg_id =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(Integer value) {
            addCriterion("reg_id <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(Integer value) {
            addCriterion("reg_id >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_id >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(Integer value) {
            addCriterion("reg_id <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(Integer value) {
            addCriterion("reg_id <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<Integer> values) {
            addCriterion("reg_id in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<Integer> values) {
            addCriterion("reg_id not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(Integer value1, Integer value2) {
            addCriterion("reg_id between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_id not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegContentIsNull() {
            addCriterion("reg_content is null");
            return (Criteria) this;
        }

        public Criteria andRegContentIsNotNull() {
            addCriterion("reg_content is not null");
            return (Criteria) this;
        }

        public Criteria andRegContentEqualTo(String value) {
            addCriterion("reg_content =", value, "regContent");
            return (Criteria) this;
        }

        public Criteria andRegContentNotEqualTo(String value) {
            addCriterion("reg_content <>", value, "regContent");
            return (Criteria) this;
        }

        public Criteria andRegContentGreaterThan(String value) {
            addCriterion("reg_content >", value, "regContent");
            return (Criteria) this;
        }

        public Criteria andRegContentGreaterThanOrEqualTo(String value) {
            addCriterion("reg_content >=", value, "regContent");
            return (Criteria) this;
        }

        public Criteria andRegContentLessThan(String value) {
            addCriterion("reg_content <", value, "regContent");
            return (Criteria) this;
        }

        public Criteria andRegContentLessThanOrEqualTo(String value) {
            addCriterion("reg_content <=", value, "regContent");
            return (Criteria) this;
        }

        public Criteria andRegContentLike(String value) {
            addCriterion("reg_content like", value, "regContent");
            return (Criteria) this;
        }

        public Criteria andRegContentNotLike(String value) {
            addCriterion("reg_content not like", value, "regContent");
            return (Criteria) this;
        }

        public Criteria andRegContentIn(List<String> values) {
            addCriterion("reg_content in", values, "regContent");
            return (Criteria) this;
        }

        public Criteria andRegContentNotIn(List<String> values) {
            addCriterion("reg_content not in", values, "regContent");
            return (Criteria) this;
        }

        public Criteria andRegContentBetween(String value1, String value2) {
            addCriterion("reg_content between", value1, value2, "regContent");
            return (Criteria) this;
        }

        public Criteria andRegContentNotBetween(String value1, String value2) {
            addCriterion("reg_content not between", value1, value2, "regContent");
            return (Criteria) this;
        }

        public Criteria andRegTitleIsNull() {
            addCriterion("reg_title is null");
            return (Criteria) this;
        }

        public Criteria andRegTitleIsNotNull() {
            addCriterion("reg_title is not null");
            return (Criteria) this;
        }

        public Criteria andRegTitleEqualTo(String value) {
            addCriterion("reg_title =", value, "regTitle");
            return (Criteria) this;
        }

        public Criteria andRegTitleNotEqualTo(String value) {
            addCriterion("reg_title <>", value, "regTitle");
            return (Criteria) this;
        }

        public Criteria andRegTitleGreaterThan(String value) {
            addCriterion("reg_title >", value, "regTitle");
            return (Criteria) this;
        }

        public Criteria andRegTitleGreaterThanOrEqualTo(String value) {
            addCriterion("reg_title >=", value, "regTitle");
            return (Criteria) this;
        }

        public Criteria andRegTitleLessThan(String value) {
            addCriterion("reg_title <", value, "regTitle");
            return (Criteria) this;
        }

        public Criteria andRegTitleLessThanOrEqualTo(String value) {
            addCriterion("reg_title <=", value, "regTitle");
            return (Criteria) this;
        }

        public Criteria andRegTitleLike(String value) {
            addCriterion("reg_title like", value, "regTitle");
            return (Criteria) this;
        }

        public Criteria andRegTitleNotLike(String value) {
            addCriterion("reg_title not like", value, "regTitle");
            return (Criteria) this;
        }

        public Criteria andRegTitleIn(List<String> values) {
            addCriterion("reg_title in", values, "regTitle");
            return (Criteria) this;
        }

        public Criteria andRegTitleNotIn(List<String> values) {
            addCriterion("reg_title not in", values, "regTitle");
            return (Criteria) this;
        }

        public Criteria andRegTitleBetween(String value1, String value2) {
            addCriterion("reg_title between", value1, value2, "regTitle");
            return (Criteria) this;
        }

        public Criteria andRegTitleNotBetween(String value1, String value2) {
            addCriterion("reg_title not between", value1, value2, "regTitle");
            return (Criteria) this;
        }

        public Criteria andRegDepartmentIsNull() {
            addCriterion("reg_department is null");
            return (Criteria) this;
        }

        public Criteria andRegDepartmentIsNotNull() {
            addCriterion("reg_department is not null");
            return (Criteria) this;
        }

        public Criteria andRegDepartmentEqualTo(String value) {
            addCriterion("reg_department =", value, "regDepartment");
            return (Criteria) this;
        }

        public Criteria andRegDepartmentNotEqualTo(String value) {
            addCriterion("reg_department <>", value, "regDepartment");
            return (Criteria) this;
        }

        public Criteria andRegDepartmentGreaterThan(String value) {
            addCriterion("reg_department >", value, "regDepartment");
            return (Criteria) this;
        }

        public Criteria andRegDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("reg_department >=", value, "regDepartment");
            return (Criteria) this;
        }

        public Criteria andRegDepartmentLessThan(String value) {
            addCriterion("reg_department <", value, "regDepartment");
            return (Criteria) this;
        }

        public Criteria andRegDepartmentLessThanOrEqualTo(String value) {
            addCriterion("reg_department <=", value, "regDepartment");
            return (Criteria) this;
        }

        public Criteria andRegDepartmentLike(String value) {
            addCriterion("reg_department like", value, "regDepartment");
            return (Criteria) this;
        }

        public Criteria andRegDepartmentNotLike(String value) {
            addCriterion("reg_department not like", value, "regDepartment");
            return (Criteria) this;
        }

        public Criteria andRegDepartmentIn(List<String> values) {
            addCriterion("reg_department in", values, "regDepartment");
            return (Criteria) this;
        }

        public Criteria andRegDepartmentNotIn(List<String> values) {
            addCriterion("reg_department not in", values, "regDepartment");
            return (Criteria) this;
        }

        public Criteria andRegDepartmentBetween(String value1, String value2) {
            addCriterion("reg_department between", value1, value2, "regDepartment");
            return (Criteria) this;
        }

        public Criteria andRegDepartmentNotBetween(String value1, String value2) {
            addCriterion("reg_department not between", value1, value2, "regDepartment");
            return (Criteria) this;
        }

        public Criteria andPunContentIsNull() {
            addCriterion("pun_content is null");
            return (Criteria) this;
        }

        public Criteria andPunContentIsNotNull() {
            addCriterion("pun_content is not null");
            return (Criteria) this;
        }

        public Criteria andPunContentEqualTo(String value) {
            addCriterion("pun_content =", value, "punContent");
            return (Criteria) this;
        }

        public Criteria andPunContentNotEqualTo(String value) {
            addCriterion("pun_content <>", value, "punContent");
            return (Criteria) this;
        }

        public Criteria andPunContentGreaterThan(String value) {
            addCriterion("pun_content >", value, "punContent");
            return (Criteria) this;
        }

        public Criteria andPunContentGreaterThanOrEqualTo(String value) {
            addCriterion("pun_content >=", value, "punContent");
            return (Criteria) this;
        }

        public Criteria andPunContentLessThan(String value) {
            addCriterion("pun_content <", value, "punContent");
            return (Criteria) this;
        }

        public Criteria andPunContentLessThanOrEqualTo(String value) {
            addCriterion("pun_content <=", value, "punContent");
            return (Criteria) this;
        }

        public Criteria andPunContentLike(String value) {
            addCriterion("pun_content like", value, "punContent");
            return (Criteria) this;
        }

        public Criteria andPunContentNotLike(String value) {
            addCriterion("pun_content not like", value, "punContent");
            return (Criteria) this;
        }

        public Criteria andPunContentIn(List<String> values) {
            addCriterion("pun_content in", values, "punContent");
            return (Criteria) this;
        }

        public Criteria andPunContentNotIn(List<String> values) {
            addCriterion("pun_content not in", values, "punContent");
            return (Criteria) this;
        }

        public Criteria andPunContentBetween(String value1, String value2) {
            addCriterion("pun_content between", value1, value2, "punContent");
            return (Criteria) this;
        }

        public Criteria andPunContentNotBetween(String value1, String value2) {
            addCriterion("pun_content not between", value1, value2, "punContent");
            return (Criteria) this;
        }

        public Criteria andRegStateIsNull() {
            addCriterion("reg_state is null");
            return (Criteria) this;
        }

        public Criteria andRegStateIsNotNull() {
            addCriterion("reg_state is not null");
            return (Criteria) this;
        }

        public Criteria andRegStateEqualTo(Integer value) {
            addCriterion("reg_state =", value, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateNotEqualTo(Integer value) {
            addCriterion("reg_state <>", value, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateGreaterThan(Integer value) {
            addCriterion("reg_state >", value, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_state >=", value, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateLessThan(Integer value) {
            addCriterion("reg_state <", value, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateLessThanOrEqualTo(Integer value) {
            addCriterion("reg_state <=", value, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateIn(List<Integer> values) {
            addCriterion("reg_state in", values, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateNotIn(List<Integer> values) {
            addCriterion("reg_state not in", values, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateBetween(Integer value1, Integer value2) {
            addCriterion("reg_state between", value1, value2, "regState");
            return (Criteria) this;
        }

        public Criteria andRegStateNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_state not between", value1, value2, "regState");
            return (Criteria) this;
        }

        public Criteria andRegSpareIsNull() {
            addCriterion("reg_spare is null");
            return (Criteria) this;
        }

        public Criteria andRegSpareIsNotNull() {
            addCriterion("reg_spare is not null");
            return (Criteria) this;
        }

        public Criteria andRegSpareEqualTo(String value) {
            addCriterion("reg_spare =", value, "regSpare");
            return (Criteria) this;
        }

        public Criteria andRegSpareNotEqualTo(String value) {
            addCriterion("reg_spare <>", value, "regSpare");
            return (Criteria) this;
        }

        public Criteria andRegSpareGreaterThan(String value) {
            addCriterion("reg_spare >", value, "regSpare");
            return (Criteria) this;
        }

        public Criteria andRegSpareGreaterThanOrEqualTo(String value) {
            addCriterion("reg_spare >=", value, "regSpare");
            return (Criteria) this;
        }

        public Criteria andRegSpareLessThan(String value) {
            addCriterion("reg_spare <", value, "regSpare");
            return (Criteria) this;
        }

        public Criteria andRegSpareLessThanOrEqualTo(String value) {
            addCriterion("reg_spare <=", value, "regSpare");
            return (Criteria) this;
        }

        public Criteria andRegSpareLike(String value) {
            addCriterion("reg_spare like", value, "regSpare");
            return (Criteria) this;
        }

        public Criteria andRegSpareNotLike(String value) {
            addCriterion("reg_spare not like", value, "regSpare");
            return (Criteria) this;
        }

        public Criteria andRegSpareIn(List<String> values) {
            addCriterion("reg_spare in", values, "regSpare");
            return (Criteria) this;
        }

        public Criteria andRegSpareNotIn(List<String> values) {
            addCriterion("reg_spare not in", values, "regSpare");
            return (Criteria) this;
        }

        public Criteria andRegSpareBetween(String value1, String value2) {
            addCriterion("reg_spare between", value1, value2, "regSpare");
            return (Criteria) this;
        }

        public Criteria andRegSpareNotBetween(String value1, String value2) {
            addCriterion("reg_spare not between", value1, value2, "regSpare");
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