package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.List;

public class CommunityDynamicsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CommunityDynamicsExample() {
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

        public Criteria andCdIdIsNull() {
            addCriterion("cd_id is null");
            return (Criteria) this;
        }

        public Criteria andCdIdIsNotNull() {
            addCriterion("cd_id is not null");
            return (Criteria) this;
        }

        public Criteria andCdIdEqualTo(Integer value) {
            addCriterion("cd_id =", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdNotEqualTo(Integer value) {
            addCriterion("cd_id <>", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdGreaterThan(Integer value) {
            addCriterion("cd_id >", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_id >=", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdLessThan(Integer value) {
            addCriterion("cd_id <", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdLessThanOrEqualTo(Integer value) {
            addCriterion("cd_id <=", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdIn(List<Integer> values) {
            addCriterion("cd_id in", values, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdNotIn(List<Integer> values) {
            addCriterion("cd_id not in", values, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdBetween(Integer value1, Integer value2) {
            addCriterion("cd_id between", value1, value2, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_id not between", value1, value2, "cdId");
            return (Criteria) this;
        }

        public Criteria andPetIdIsNull() {
            addCriterion("pet_id is null");
            return (Criteria) this;
        }

        public Criteria andPetIdIsNotNull() {
            addCriterion("pet_id is not null");
            return (Criteria) this;
        }

        public Criteria andPetIdEqualTo(Integer value) {
            addCriterion("pet_id =", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdNotEqualTo(Integer value) {
            addCriterion("pet_id <>", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdGreaterThan(Integer value) {
            addCriterion("pet_id >", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_id >=", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdLessThan(Integer value) {
            addCriterion("pet_id <", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdLessThanOrEqualTo(Integer value) {
            addCriterion("pet_id <=", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdIn(List<Integer> values) {
            addCriterion("pet_id in", values, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdNotIn(List<Integer> values) {
            addCriterion("pet_id not in", values, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdBetween(Integer value1, Integer value2) {
            addCriterion("pet_id between", value1, value2, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_id not between", value1, value2, "petId");
            return (Criteria) this;
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

        public Criteria andVaccIdIsNull() {
            addCriterion("vacc_id is null");
            return (Criteria) this;
        }

        public Criteria andVaccIdIsNotNull() {
            addCriterion("vacc_id is not null");
            return (Criteria) this;
        }

        public Criteria andVaccIdEqualTo(Integer value) {
            addCriterion("vacc_id =", value, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdNotEqualTo(Integer value) {
            addCriterion("vacc_id <>", value, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdGreaterThan(Integer value) {
            addCriterion("vacc_id >", value, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vacc_id >=", value, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdLessThan(Integer value) {
            addCriterion("vacc_id <", value, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdLessThanOrEqualTo(Integer value) {
            addCriterion("vacc_id <=", value, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdIn(List<Integer> values) {
            addCriterion("vacc_id in", values, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdNotIn(List<Integer> values) {
            addCriterion("vacc_id not in", values, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdBetween(Integer value1, Integer value2) {
            addCriterion("vacc_id between", value1, value2, "vaccId");
            return (Criteria) this;
        }

        public Criteria andVaccIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vacc_id not between", value1, value2, "vaccId");
            return (Criteria) this;
        }

        public Criteria andCdDetatilIsNull() {
            addCriterion("cd_detatil is null");
            return (Criteria) this;
        }

        public Criteria andCdDetatilIsNotNull() {
            addCriterion("cd_detatil is not null");
            return (Criteria) this;
        }

        public Criteria andCdDetatilEqualTo(String value) {
            addCriterion("cd_detatil =", value, "cdDetatil");
            return (Criteria) this;
        }

        public Criteria andCdDetatilNotEqualTo(String value) {
            addCriterion("cd_detatil <>", value, "cdDetatil");
            return (Criteria) this;
        }

        public Criteria andCdDetatilGreaterThan(String value) {
            addCriterion("cd_detatil >", value, "cdDetatil");
            return (Criteria) this;
        }

        public Criteria andCdDetatilGreaterThanOrEqualTo(String value) {
            addCriterion("cd_detatil >=", value, "cdDetatil");
            return (Criteria) this;
        }

        public Criteria andCdDetatilLessThan(String value) {
            addCriterion("cd_detatil <", value, "cdDetatil");
            return (Criteria) this;
        }

        public Criteria andCdDetatilLessThanOrEqualTo(String value) {
            addCriterion("cd_detatil <=", value, "cdDetatil");
            return (Criteria) this;
        }

        public Criteria andCdDetatilLike(String value) {
            addCriterion("cd_detatil like", value, "cdDetatil");
            return (Criteria) this;
        }

        public Criteria andCdDetatilNotLike(String value) {
            addCriterion("cd_detatil not like", value, "cdDetatil");
            return (Criteria) this;
        }

        public Criteria andCdDetatilIn(List<String> values) {
            addCriterion("cd_detatil in", values, "cdDetatil");
            return (Criteria) this;
        }

        public Criteria andCdDetatilNotIn(List<String> values) {
            addCriterion("cd_detatil not in", values, "cdDetatil");
            return (Criteria) this;
        }

        public Criteria andCdDetatilBetween(String value1, String value2) {
            addCriterion("cd_detatil between", value1, value2, "cdDetatil");
            return (Criteria) this;
        }

        public Criteria andCdDetatilNotBetween(String value1, String value2) {
            addCriterion("cd_detatil not between", value1, value2, "cdDetatil");
            return (Criteria) this;
        }

        public Criteria andCdSpareIsNull() {
            addCriterion("cd_spare is null");
            return (Criteria) this;
        }

        public Criteria andCdSpareIsNotNull() {
            addCriterion("cd_spare is not null");
            return (Criteria) this;
        }

        public Criteria andCdSpareEqualTo(String value) {
            addCriterion("cd_spare =", value, "cdSpare");
            return (Criteria) this;
        }

        public Criteria andCdSpareNotEqualTo(String value) {
            addCriterion("cd_spare <>", value, "cdSpare");
            return (Criteria) this;
        }

        public Criteria andCdSpareGreaterThan(String value) {
            addCriterion("cd_spare >", value, "cdSpare");
            return (Criteria) this;
        }

        public Criteria andCdSpareGreaterThanOrEqualTo(String value) {
            addCriterion("cd_spare >=", value, "cdSpare");
            return (Criteria) this;
        }

        public Criteria andCdSpareLessThan(String value) {
            addCriterion("cd_spare <", value, "cdSpare");
            return (Criteria) this;
        }

        public Criteria andCdSpareLessThanOrEqualTo(String value) {
            addCriterion("cd_spare <=", value, "cdSpare");
            return (Criteria) this;
        }

        public Criteria andCdSpareLike(String value) {
            addCriterion("cd_spare like", value, "cdSpare");
            return (Criteria) this;
        }

        public Criteria andCdSpareNotLike(String value) {
            addCriterion("cd_spare not like", value, "cdSpare");
            return (Criteria) this;
        }

        public Criteria andCdSpareIn(List<String> values) {
            addCriterion("cd_spare in", values, "cdSpare");
            return (Criteria) this;
        }

        public Criteria andCdSpareNotIn(List<String> values) {
            addCriterion("cd_spare not in", values, "cdSpare");
            return (Criteria) this;
        }

        public Criteria andCdSpareBetween(String value1, String value2) {
            addCriterion("cd_spare between", value1, value2, "cdSpare");
            return (Criteria) this;
        }

        public Criteria andCdSpareNotBetween(String value1, String value2) {
            addCriterion("cd_spare not between", value1, value2, "cdSpare");
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