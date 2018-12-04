package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PostExample() {
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

        public Criteria andPostTitleIsNull() {
            addCriterion("post_title is null");
            return (Criteria) this;
        }

        public Criteria andPostTitleIsNotNull() {
            addCriterion("post_title is not null");
            return (Criteria) this;
        }

        public Criteria andPostTitleEqualTo(String value) {
            addCriterion("post_title =", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotEqualTo(String value) {
            addCriterion("post_title <>", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThan(String value) {
            addCriterion("post_title >", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThanOrEqualTo(String value) {
            addCriterion("post_title >=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThan(String value) {
            addCriterion("post_title <", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThanOrEqualTo(String value) {
            addCriterion("post_title <=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLike(String value) {
            addCriterion("post_title like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotLike(String value) {
            addCriterion("post_title not like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleIn(List<String> values) {
            addCriterion("post_title in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotIn(List<String> values) {
            addCriterion("post_title not in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleBetween(String value1, String value2) {
            addCriterion("post_title between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotBetween(String value1, String value2) {
            addCriterion("post_title not between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostContentIsNull() {
            addCriterion("post_content is null");
            return (Criteria) this;
        }

        public Criteria andPostContentIsNotNull() {
            addCriterion("post_content is not null");
            return (Criteria) this;
        }

        public Criteria andPostContentEqualTo(String value) {
            addCriterion("post_content =", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentNotEqualTo(String value) {
            addCriterion("post_content <>", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentGreaterThan(String value) {
            addCriterion("post_content >", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentGreaterThanOrEqualTo(String value) {
            addCriterion("post_content >=", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentLessThan(String value) {
            addCriterion("post_content <", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentLessThanOrEqualTo(String value) {
            addCriterion("post_content <=", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentLike(String value) {
            addCriterion("post_content like", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentNotLike(String value) {
            addCriterion("post_content not like", value, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentIn(List<String> values) {
            addCriterion("post_content in", values, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentNotIn(List<String> values) {
            addCriterion("post_content not in", values, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentBetween(String value1, String value2) {
            addCriterion("post_content between", value1, value2, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostContentNotBetween(String value1, String value2) {
            addCriterion("post_content not between", value1, value2, "postContent");
            return (Criteria) this;
        }

        public Criteria andPostTimeIsNull() {
            addCriterion("post_time is null");
            return (Criteria) this;
        }

        public Criteria andPostTimeIsNotNull() {
            addCriterion("post_time is not null");
            return (Criteria) this;
        }

        public Criteria andPostTimeEqualTo(Date value) {
            addCriterion("post_time =", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeNotEqualTo(Date value) {
            addCriterion("post_time <>", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeGreaterThan(Date value) {
            addCriterion("post_time >", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("post_time >=", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeLessThan(Date value) {
            addCriterion("post_time <", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeLessThanOrEqualTo(Date value) {
            addCriterion("post_time <=", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeIn(List<Date> values) {
            addCriterion("post_time in", values, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeNotIn(List<Date> values) {
            addCriterion("post_time not in", values, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeBetween(Date value1, Date value2) {
            addCriterion("post_time between", value1, value2, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeNotBetween(Date value1, Date value2) {
            addCriterion("post_time not between", value1, value2, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostCountIsNull() {
            addCriterion("post_count is null");
            return (Criteria) this;
        }

        public Criteria andPostCountIsNotNull() {
            addCriterion("post_count is not null");
            return (Criteria) this;
        }

        public Criteria andPostCountEqualTo(Integer value) {
            addCriterion("post_count =", value, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountNotEqualTo(Integer value) {
            addCriterion("post_count <>", value, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountGreaterThan(Integer value) {
            addCriterion("post_count >", value, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_count >=", value, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountLessThan(Integer value) {
            addCriterion("post_count <", value, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountLessThanOrEqualTo(Integer value) {
            addCriterion("post_count <=", value, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountIn(List<Integer> values) {
            addCriterion("post_count in", values, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountNotIn(List<Integer> values) {
            addCriterion("post_count not in", values, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountBetween(Integer value1, Integer value2) {
            addCriterion("post_count between", value1, value2, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostCountNotBetween(Integer value1, Integer value2) {
            addCriterion("post_count not between", value1, value2, "postCount");
            return (Criteria) this;
        }

        public Criteria andPostPhotoIsNull() {
            addCriterion("post_photo is null");
            return (Criteria) this;
        }

        public Criteria andPostPhotoIsNotNull() {
            addCriterion("post_photo is not null");
            return (Criteria) this;
        }

        public Criteria andPostPhotoEqualTo(String value) {
            addCriterion("post_photo =", value, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoNotEqualTo(String value) {
            addCriterion("post_photo <>", value, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoGreaterThan(String value) {
            addCriterion("post_photo >", value, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("post_photo >=", value, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoLessThan(String value) {
            addCriterion("post_photo <", value, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoLessThanOrEqualTo(String value) {
            addCriterion("post_photo <=", value, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoLike(String value) {
            addCriterion("post_photo like", value, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoNotLike(String value) {
            addCriterion("post_photo not like", value, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoIn(List<String> values) {
            addCriterion("post_photo in", values, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoNotIn(List<String> values) {
            addCriterion("post_photo not in", values, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoBetween(String value1, String value2) {
            addCriterion("post_photo between", value1, value2, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostPhotoNotBetween(String value1, String value2) {
            addCriterion("post_photo not between", value1, value2, "postPhoto");
            return (Criteria) this;
        }

        public Criteria andPostStateIsNull() {
            addCriterion("post_state is null");
            return (Criteria) this;
        }

        public Criteria andPostStateIsNotNull() {
            addCriterion("post_state is not null");
            return (Criteria) this;
        }

        public Criteria andPostStateEqualTo(Integer value) {
            addCriterion("post_state =", value, "postState");
            return (Criteria) this;
        }

        public Criteria andPostStateNotEqualTo(Integer value) {
            addCriterion("post_state <>", value, "postState");
            return (Criteria) this;
        }

        public Criteria andPostStateGreaterThan(Integer value) {
            addCriterion("post_state >", value, "postState");
            return (Criteria) this;
        }

        public Criteria andPostStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_state >=", value, "postState");
            return (Criteria) this;
        }

        public Criteria andPostStateLessThan(Integer value) {
            addCriterion("post_state <", value, "postState");
            return (Criteria) this;
        }

        public Criteria andPostStateLessThanOrEqualTo(Integer value) {
            addCriterion("post_state <=", value, "postState");
            return (Criteria) this;
        }

        public Criteria andPostStateIn(List<Integer> values) {
            addCriterion("post_state in", values, "postState");
            return (Criteria) this;
        }

        public Criteria andPostStateNotIn(List<Integer> values) {
            addCriterion("post_state not in", values, "postState");
            return (Criteria) this;
        }

        public Criteria andPostStateBetween(Integer value1, Integer value2) {
            addCriterion("post_state between", value1, value2, "postState");
            return (Criteria) this;
        }

        public Criteria andPostStateNotBetween(Integer value1, Integer value2) {
            addCriterion("post_state not between", value1, value2, "postState");
            return (Criteria) this;
        }

        public Criteria andPostSpareIsNull() {
            addCriterion("post_spare is null");
            return (Criteria) this;
        }

        public Criteria andPostSpareIsNotNull() {
            addCriterion("post_spare is not null");
            return (Criteria) this;
        }

        public Criteria andPostSpareEqualTo(String value) {
            addCriterion("post_spare =", value, "postSpare");
            return (Criteria) this;
        }

        public Criteria andPostSpareNotEqualTo(String value) {
            addCriterion("post_spare <>", value, "postSpare");
            return (Criteria) this;
        }

        public Criteria andPostSpareGreaterThan(String value) {
            addCriterion("post_spare >", value, "postSpare");
            return (Criteria) this;
        }

        public Criteria andPostSpareGreaterThanOrEqualTo(String value) {
            addCriterion("post_spare >=", value, "postSpare");
            return (Criteria) this;
        }

        public Criteria andPostSpareLessThan(String value) {
            addCriterion("post_spare <", value, "postSpare");
            return (Criteria) this;
        }

        public Criteria andPostSpareLessThanOrEqualTo(String value) {
            addCriterion("post_spare <=", value, "postSpare");
            return (Criteria) this;
        }

        public Criteria andPostSpareLike(String value) {
            addCriterion("post_spare like", value, "postSpare");
            return (Criteria) this;
        }

        public Criteria andPostSpareNotLike(String value) {
            addCriterion("post_spare not like", value, "postSpare");
            return (Criteria) this;
        }

        public Criteria andPostSpareIn(List<String> values) {
            addCriterion("post_spare in", values, "postSpare");
            return (Criteria) this;
        }

        public Criteria andPostSpareNotIn(List<String> values) {
            addCriterion("post_spare not in", values, "postSpare");
            return (Criteria) this;
        }

        public Criteria andPostSpareBetween(String value1, String value2) {
            addCriterion("post_spare between", value1, value2, "postSpare");
            return (Criteria) this;
        }

        public Criteria andPostSpareNotBetween(String value1, String value2) {
            addCriterion("post_spare not between", value1, value2, "postSpare");
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