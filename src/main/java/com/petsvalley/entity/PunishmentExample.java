package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PunishmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PunishmentExample() {
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

        public Criteria andIrregularitiesTimeIsNull() {
            addCriterion("irregularities_time is null");
            return (Criteria) this;
        }

        public Criteria andIrregularitiesTimeIsNotNull() {
            addCriterion("irregularities_time is not null");
            return (Criteria) this;
        }

        public Criteria andIrregularitiesTimeEqualTo(Date value) {
            addCriterion("irregularities_time =", value, "irregularitiesTime");
            return (Criteria) this;
        }

        public Criteria andIrregularitiesTimeNotEqualTo(Date value) {
            addCriterion("irregularities_time <>", value, "irregularitiesTime");
            return (Criteria) this;
        }

        public Criteria andIrregularitiesTimeGreaterThan(Date value) {
            addCriterion("irregularities_time >", value, "irregularitiesTime");
            return (Criteria) this;
        }

        public Criteria andIrregularitiesTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("irregularities_time >=", value, "irregularitiesTime");
            return (Criteria) this;
        }

        public Criteria andIrregularitiesTimeLessThan(Date value) {
            addCriterion("irregularities_time <", value, "irregularitiesTime");
            return (Criteria) this;
        }

        public Criteria andIrregularitiesTimeLessThanOrEqualTo(Date value) {
            addCriterion("irregularities_time <=", value, "irregularitiesTime");
            return (Criteria) this;
        }

        public Criteria andIrregularitiesTimeIn(List<Date> values) {
            addCriterion("irregularities_time in", values, "irregularitiesTime");
            return (Criteria) this;
        }

        public Criteria andIrregularitiesTimeNotIn(List<Date> values) {
            addCriterion("irregularities_time not in", values, "irregularitiesTime");
            return (Criteria) this;
        }

        public Criteria andIrregularitiesTimeBetween(Date value1, Date value2) {
            addCriterion("irregularities_time between", value1, value2, "irregularitiesTime");
            return (Criteria) this;
        }

        public Criteria andIrregularitiesTimeNotBetween(Date value1, Date value2) {
            addCriterion("irregularities_time not between", value1, value2, "irregularitiesTime");
            return (Criteria) this;
        }

        public Criteria andPunTimeIsNull() {
            addCriterion("pun_time is null");
            return (Criteria) this;
        }

        public Criteria andPunTimeIsNotNull() {
            addCriterion("pun_time is not null");
            return (Criteria) this;
        }

        public Criteria andPunTimeEqualTo(Date value) {
            addCriterion("pun_time =", value, "punTime");
            return (Criteria) this;
        }

        public Criteria andPunTimeNotEqualTo(Date value) {
            addCriterion("pun_time <>", value, "punTime");
            return (Criteria) this;
        }

        public Criteria andPunTimeGreaterThan(Date value) {
            addCriterion("pun_time >", value, "punTime");
            return (Criteria) this;
        }

        public Criteria andPunTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pun_time >=", value, "punTime");
            return (Criteria) this;
        }

        public Criteria andPunTimeLessThan(Date value) {
            addCriterion("pun_time <", value, "punTime");
            return (Criteria) this;
        }

        public Criteria andPunTimeLessThanOrEqualTo(Date value) {
            addCriterion("pun_time <=", value, "punTime");
            return (Criteria) this;
        }

        public Criteria andPunTimeIn(List<Date> values) {
            addCriterion("pun_time in", values, "punTime");
            return (Criteria) this;
        }

        public Criteria andPunTimeNotIn(List<Date> values) {
            addCriterion("pun_time not in", values, "punTime");
            return (Criteria) this;
        }

        public Criteria andPunTimeBetween(Date value1, Date value2) {
            addCriterion("pun_time between", value1, value2, "punTime");
            return (Criteria) this;
        }

        public Criteria andPunTimeNotBetween(Date value1, Date value2) {
            addCriterion("pun_time not between", value1, value2, "punTime");
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

        public Criteria andPunResultIsNull() {
            addCriterion("pun_result is null");
            return (Criteria) this;
        }

        public Criteria andPunResultIsNotNull() {
            addCriterion("pun_result is not null");
            return (Criteria) this;
        }

        public Criteria andPunResultEqualTo(String value) {
            addCriterion("pun_result =", value, "punResult");
            return (Criteria) this;
        }

        public Criteria andPunResultNotEqualTo(String value) {
            addCriterion("pun_result <>", value, "punResult");
            return (Criteria) this;
        }

        public Criteria andPunResultGreaterThan(String value) {
            addCriterion("pun_result >", value, "punResult");
            return (Criteria) this;
        }

        public Criteria andPunResultGreaterThanOrEqualTo(String value) {
            addCriterion("pun_result >=", value, "punResult");
            return (Criteria) this;
        }

        public Criteria andPunResultLessThan(String value) {
            addCriterion("pun_result <", value, "punResult");
            return (Criteria) this;
        }

        public Criteria andPunResultLessThanOrEqualTo(String value) {
            addCriterion("pun_result <=", value, "punResult");
            return (Criteria) this;
        }

        public Criteria andPunResultLike(String value) {
            addCriterion("pun_result like", value, "punResult");
            return (Criteria) this;
        }

        public Criteria andPunResultNotLike(String value) {
            addCriterion("pun_result not like", value, "punResult");
            return (Criteria) this;
        }

        public Criteria andPunResultIn(List<String> values) {
            addCriterion("pun_result in", values, "punResult");
            return (Criteria) this;
        }

        public Criteria andPunResultNotIn(List<String> values) {
            addCriterion("pun_result not in", values, "punResult");
            return (Criteria) this;
        }

        public Criteria andPunResultBetween(String value1, String value2) {
            addCriterion("pun_result between", value1, value2, "punResult");
            return (Criteria) this;
        }

        public Criteria andPunResultNotBetween(String value1, String value2) {
            addCriterion("pun_result not between", value1, value2, "punResult");
            return (Criteria) this;
        }

        public Criteria andPunStateIsNull() {
            addCriterion("pun_state is null");
            return (Criteria) this;
        }

        public Criteria andPunStateIsNotNull() {
            addCriterion("pun_state is not null");
            return (Criteria) this;
        }

        public Criteria andPunStateEqualTo(Integer value) {
            addCriterion("pun_state =", value, "punState");
            return (Criteria) this;
        }

        public Criteria andPunStateNotEqualTo(Integer value) {
            addCriterion("pun_state <>", value, "punState");
            return (Criteria) this;
        }

        public Criteria andPunStateGreaterThan(Integer value) {
            addCriterion("pun_state >", value, "punState");
            return (Criteria) this;
        }

        public Criteria andPunStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pun_state >=", value, "punState");
            return (Criteria) this;
        }

        public Criteria andPunStateLessThan(Integer value) {
            addCriterion("pun_state <", value, "punState");
            return (Criteria) this;
        }

        public Criteria andPunStateLessThanOrEqualTo(Integer value) {
            addCriterion("pun_state <=", value, "punState");
            return (Criteria) this;
        }

        public Criteria andPunStateIn(List<Integer> values) {
            addCriterion("pun_state in", values, "punState");
            return (Criteria) this;
        }

        public Criteria andPunStateNotIn(List<Integer> values) {
            addCriterion("pun_state not in", values, "punState");
            return (Criteria) this;
        }

        public Criteria andPunStateBetween(Integer value1, Integer value2) {
            addCriterion("pun_state between", value1, value2, "punState");
            return (Criteria) this;
        }

        public Criteria andPunStateNotBetween(Integer value1, Integer value2) {
            addCriterion("pun_state not between", value1, value2, "punState");
            return (Criteria) this;
        }

        public Criteria andPunSpareIsNull() {
            addCriterion("pun_spare is null");
            return (Criteria) this;
        }

        public Criteria andPunSpareIsNotNull() {
            addCriterion("pun_spare is not null");
            return (Criteria) this;
        }

        public Criteria andPunSpareEqualTo(String value) {
            addCriterion("pun_spare =", value, "punSpare");
            return (Criteria) this;
        }

        public Criteria andPunSpareNotEqualTo(String value) {
            addCriterion("pun_spare <>", value, "punSpare");
            return (Criteria) this;
        }

        public Criteria andPunSpareGreaterThan(String value) {
            addCriterion("pun_spare >", value, "punSpare");
            return (Criteria) this;
        }

        public Criteria andPunSpareGreaterThanOrEqualTo(String value) {
            addCriterion("pun_spare >=", value, "punSpare");
            return (Criteria) this;
        }

        public Criteria andPunSpareLessThan(String value) {
            addCriterion("pun_spare <", value, "punSpare");
            return (Criteria) this;
        }

        public Criteria andPunSpareLessThanOrEqualTo(String value) {
            addCriterion("pun_spare <=", value, "punSpare");
            return (Criteria) this;
        }

        public Criteria andPunSpareLike(String value) {
            addCriterion("pun_spare like", value, "punSpare");
            return (Criteria) this;
        }

        public Criteria andPunSpareNotLike(String value) {
            addCriterion("pun_spare not like", value, "punSpare");
            return (Criteria) this;
        }

        public Criteria andPunSpareIn(List<String> values) {
            addCriterion("pun_spare in", values, "punSpare");
            return (Criteria) this;
        }

        public Criteria andPunSpareNotIn(List<String> values) {
            addCriterion("pun_spare not in", values, "punSpare");
            return (Criteria) this;
        }

        public Criteria andPunSpareBetween(String value1, String value2) {
            addCriterion("pun_spare between", value1, value2, "punSpare");
            return (Criteria) this;
        }

        public Criteria andPunSpareNotBetween(String value1, String value2) {
            addCriterion("pun_spare not between", value1, value2, "punSpare");
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