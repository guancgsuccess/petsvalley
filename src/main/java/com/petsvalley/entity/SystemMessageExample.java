package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SystemMessageExample() {
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

        public Criteria andSystemMessageIdIsNull() {
            addCriterion("system_message_id is null");
            return (Criteria) this;
        }

        public Criteria andSystemMessageIdIsNotNull() {
            addCriterion("system_message_id is not null");
            return (Criteria) this;
        }

        public Criteria andSystemMessageIdEqualTo(Integer value) {
            addCriterion("system_message_id =", value, "systemMessageId");
            return (Criteria) this;
        }

        public Criteria andSystemMessageIdNotEqualTo(Integer value) {
            addCriterion("system_message_id <>", value, "systemMessageId");
            return (Criteria) this;
        }

        public Criteria andSystemMessageIdGreaterThan(Integer value) {
            addCriterion("system_message_id >", value, "systemMessageId");
            return (Criteria) this;
        }

        public Criteria andSystemMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("system_message_id >=", value, "systemMessageId");
            return (Criteria) this;
        }

        public Criteria andSystemMessageIdLessThan(Integer value) {
            addCriterion("system_message_id <", value, "systemMessageId");
            return (Criteria) this;
        }

        public Criteria andSystemMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("system_message_id <=", value, "systemMessageId");
            return (Criteria) this;
        }

        public Criteria andSystemMessageIdIn(List<Integer> values) {
            addCriterion("system_message_id in", values, "systemMessageId");
            return (Criteria) this;
        }

        public Criteria andSystemMessageIdNotIn(List<Integer> values) {
            addCriterion("system_message_id not in", values, "systemMessageId");
            return (Criteria) this;
        }

        public Criteria andSystemMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("system_message_id between", value1, value2, "systemMessageId");
            return (Criteria) this;
        }

        public Criteria andSystemMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("system_message_id not between", value1, value2, "systemMessageId");
            return (Criteria) this;
        }

        public Criteria andSystemMessageStatueIsNull() {
            addCriterion("system_message_statue is null");
            return (Criteria) this;
        }

        public Criteria andSystemMessageStatueIsNotNull() {
            addCriterion("system_message_statue is not null");
            return (Criteria) this;
        }

        public Criteria andSystemMessageStatueEqualTo(Integer value) {
            addCriterion("system_message_statue =", value, "systemMessageStatue");
            return (Criteria) this;
        }

        public Criteria andSystemMessageStatueNotEqualTo(Integer value) {
            addCriterion("system_message_statue <>", value, "systemMessageStatue");
            return (Criteria) this;
        }

        public Criteria andSystemMessageStatueGreaterThan(Integer value) {
            addCriterion("system_message_statue >", value, "systemMessageStatue");
            return (Criteria) this;
        }

        public Criteria andSystemMessageStatueGreaterThanOrEqualTo(Integer value) {
            addCriterion("system_message_statue >=", value, "systemMessageStatue");
            return (Criteria) this;
        }

        public Criteria andSystemMessageStatueLessThan(Integer value) {
            addCriterion("system_message_statue <", value, "systemMessageStatue");
            return (Criteria) this;
        }

        public Criteria andSystemMessageStatueLessThanOrEqualTo(Integer value) {
            addCriterion("system_message_statue <=", value, "systemMessageStatue");
            return (Criteria) this;
        }

        public Criteria andSystemMessageStatueIn(List<Integer> values) {
            addCriterion("system_message_statue in", values, "systemMessageStatue");
            return (Criteria) this;
        }

        public Criteria andSystemMessageStatueNotIn(List<Integer> values) {
            addCriterion("system_message_statue not in", values, "systemMessageStatue");
            return (Criteria) this;
        }

        public Criteria andSystemMessageStatueBetween(Integer value1, Integer value2) {
            addCriterion("system_message_statue between", value1, value2, "systemMessageStatue");
            return (Criteria) this;
        }

        public Criteria andSystemMessageStatueNotBetween(Integer value1, Integer value2) {
            addCriterion("system_message_statue not between", value1, value2, "systemMessageStatue");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTitleIsNull() {
            addCriterion("system_message_title is null");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTitleIsNotNull() {
            addCriterion("system_message_title is not null");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTitleEqualTo(String value) {
            addCriterion("system_message_title =", value, "systemMessageTitle");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTitleNotEqualTo(String value) {
            addCriterion("system_message_title <>", value, "systemMessageTitle");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTitleGreaterThan(String value) {
            addCriterion("system_message_title >", value, "systemMessageTitle");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTitleGreaterThanOrEqualTo(String value) {
            addCriterion("system_message_title >=", value, "systemMessageTitle");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTitleLessThan(String value) {
            addCriterion("system_message_title <", value, "systemMessageTitle");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTitleLessThanOrEqualTo(String value) {
            addCriterion("system_message_title <=", value, "systemMessageTitle");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTitleLike(String value) {
            addCriterion("system_message_title like", value, "systemMessageTitle");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTitleNotLike(String value) {
            addCriterion("system_message_title not like", value, "systemMessageTitle");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTitleIn(List<String> values) {
            addCriterion("system_message_title in", values, "systemMessageTitle");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTitleNotIn(List<String> values) {
            addCriterion("system_message_title not in", values, "systemMessageTitle");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTitleBetween(String value1, String value2) {
            addCriterion("system_message_title between", value1, value2, "systemMessageTitle");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTitleNotBetween(String value1, String value2) {
            addCriterion("system_message_title not between", value1, value2, "systemMessageTitle");
            return (Criteria) this;
        }

        public Criteria andSystemMessageContentIsNull() {
            addCriterion("system_message_content is null");
            return (Criteria) this;
        }

        public Criteria andSystemMessageContentIsNotNull() {
            addCriterion("system_message_content is not null");
            return (Criteria) this;
        }

        public Criteria andSystemMessageContentEqualTo(String value) {
            addCriterion("system_message_content =", value, "systemMessageContent");
            return (Criteria) this;
        }

        public Criteria andSystemMessageContentNotEqualTo(String value) {
            addCriterion("system_message_content <>", value, "systemMessageContent");
            return (Criteria) this;
        }

        public Criteria andSystemMessageContentGreaterThan(String value) {
            addCriterion("system_message_content >", value, "systemMessageContent");
            return (Criteria) this;
        }

        public Criteria andSystemMessageContentGreaterThanOrEqualTo(String value) {
            addCriterion("system_message_content >=", value, "systemMessageContent");
            return (Criteria) this;
        }

        public Criteria andSystemMessageContentLessThan(String value) {
            addCriterion("system_message_content <", value, "systemMessageContent");
            return (Criteria) this;
        }

        public Criteria andSystemMessageContentLessThanOrEqualTo(String value) {
            addCriterion("system_message_content <=", value, "systemMessageContent");
            return (Criteria) this;
        }

        public Criteria andSystemMessageContentLike(String value) {
            addCriterion("system_message_content like", value, "systemMessageContent");
            return (Criteria) this;
        }

        public Criteria andSystemMessageContentNotLike(String value) {
            addCriterion("system_message_content not like", value, "systemMessageContent");
            return (Criteria) this;
        }

        public Criteria andSystemMessageContentIn(List<String> values) {
            addCriterion("system_message_content in", values, "systemMessageContent");
            return (Criteria) this;
        }

        public Criteria andSystemMessageContentNotIn(List<String> values) {
            addCriterion("system_message_content not in", values, "systemMessageContent");
            return (Criteria) this;
        }

        public Criteria andSystemMessageContentBetween(String value1, String value2) {
            addCriterion("system_message_content between", value1, value2, "systemMessageContent");
            return (Criteria) this;
        }

        public Criteria andSystemMessageContentNotBetween(String value1, String value2) {
            addCriterion("system_message_content not between", value1, value2, "systemMessageContent");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTimeIsNull() {
            addCriterion("system_message_time is null");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTimeIsNotNull() {
            addCriterion("system_message_time is not null");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTimeEqualTo(Date value) {
            addCriterion("system_message_time =", value, "systemMessageTime");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTimeNotEqualTo(Date value) {
            addCriterion("system_message_time <>", value, "systemMessageTime");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTimeGreaterThan(Date value) {
            addCriterion("system_message_time >", value, "systemMessageTime");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("system_message_time >=", value, "systemMessageTime");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTimeLessThan(Date value) {
            addCriterion("system_message_time <", value, "systemMessageTime");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTimeLessThanOrEqualTo(Date value) {
            addCriterion("system_message_time <=", value, "systemMessageTime");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTimeIn(List<Date> values) {
            addCriterion("system_message_time in", values, "systemMessageTime");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTimeNotIn(List<Date> values) {
            addCriterion("system_message_time not in", values, "systemMessageTime");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTimeBetween(Date value1, Date value2) {
            addCriterion("system_message_time between", value1, value2, "systemMessageTime");
            return (Criteria) this;
        }

        public Criteria andSystemMessageTimeNotBetween(Date value1, Date value2) {
            addCriterion("system_message_time not between", value1, value2, "systemMessageTime");
            return (Criteria) this;
        }

        public Criteria andSystemMessageSpareIsNull() {
            addCriterion("system_message_spare is null");
            return (Criteria) this;
        }

        public Criteria andSystemMessageSpareIsNotNull() {
            addCriterion("system_message_spare is not null");
            return (Criteria) this;
        }

        public Criteria andSystemMessageSpareEqualTo(String value) {
            addCriterion("system_message_spare =", value, "systemMessageSpare");
            return (Criteria) this;
        }

        public Criteria andSystemMessageSpareNotEqualTo(String value) {
            addCriterion("system_message_spare <>", value, "systemMessageSpare");
            return (Criteria) this;
        }

        public Criteria andSystemMessageSpareGreaterThan(String value) {
            addCriterion("system_message_spare >", value, "systemMessageSpare");
            return (Criteria) this;
        }

        public Criteria andSystemMessageSpareGreaterThanOrEqualTo(String value) {
            addCriterion("system_message_spare >=", value, "systemMessageSpare");
            return (Criteria) this;
        }

        public Criteria andSystemMessageSpareLessThan(String value) {
            addCriterion("system_message_spare <", value, "systemMessageSpare");
            return (Criteria) this;
        }

        public Criteria andSystemMessageSpareLessThanOrEqualTo(String value) {
            addCriterion("system_message_spare <=", value, "systemMessageSpare");
            return (Criteria) this;
        }

        public Criteria andSystemMessageSpareLike(String value) {
            addCriterion("system_message_spare like", value, "systemMessageSpare");
            return (Criteria) this;
        }

        public Criteria andSystemMessageSpareNotLike(String value) {
            addCriterion("system_message_spare not like", value, "systemMessageSpare");
            return (Criteria) this;
        }

        public Criteria andSystemMessageSpareIn(List<String> values) {
            addCriterion("system_message_spare in", values, "systemMessageSpare");
            return (Criteria) this;
        }

        public Criteria andSystemMessageSpareNotIn(List<String> values) {
            addCriterion("system_message_spare not in", values, "systemMessageSpare");
            return (Criteria) this;
        }

        public Criteria andSystemMessageSpareBetween(String value1, String value2) {
            addCriterion("system_message_spare between", value1, value2, "systemMessageSpare");
            return (Criteria) this;
        }

        public Criteria andSystemMessageSpareNotBetween(String value1, String value2) {
            addCriterion("system_message_spare not between", value1, value2, "systemMessageSpare");
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