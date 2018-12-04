package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.List;

public class ProtuctExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ProtuctExample() {
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

        public Criteria andProIdIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_id not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("pro_name is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("pro_name =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("pro_name <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("pro_name >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_name >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("pro_name <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("pro_name <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("pro_name like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("pro_name not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("pro_name in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("pro_name not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("pro_name between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("pro_name not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProTypeIsNull() {
            addCriterion("pro_type is null");
            return (Criteria) this;
        }

        public Criteria andProTypeIsNotNull() {
            addCriterion("pro_type is not null");
            return (Criteria) this;
        }

        public Criteria andProTypeEqualTo(String value) {
            addCriterion("pro_type =", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotEqualTo(String value) {
            addCriterion("pro_type <>", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeGreaterThan(String value) {
            addCriterion("pro_type >", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pro_type >=", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLessThan(String value) {
            addCriterion("pro_type <", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLessThanOrEqualTo(String value) {
            addCriterion("pro_type <=", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLike(String value) {
            addCriterion("pro_type like", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotLike(String value) {
            addCriterion("pro_type not like", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeIn(List<String> values) {
            addCriterion("pro_type in", values, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotIn(List<String> values) {
            addCriterion("pro_type not in", values, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeBetween(String value1, String value2) {
            addCriterion("pro_type between", value1, value2, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotBetween(String value1, String value2) {
            addCriterion("pro_type not between", value1, value2, "proType");
            return (Criteria) this;
        }

        public Criteria andProMessageIsNull() {
            addCriterion("pro_message is null");
            return (Criteria) this;
        }

        public Criteria andProMessageIsNotNull() {
            addCriterion("pro_message is not null");
            return (Criteria) this;
        }

        public Criteria andProMessageEqualTo(String value) {
            addCriterion("pro_message =", value, "proMessage");
            return (Criteria) this;
        }

        public Criteria andProMessageNotEqualTo(String value) {
            addCriterion("pro_message <>", value, "proMessage");
            return (Criteria) this;
        }

        public Criteria andProMessageGreaterThan(String value) {
            addCriterion("pro_message >", value, "proMessage");
            return (Criteria) this;
        }

        public Criteria andProMessageGreaterThanOrEqualTo(String value) {
            addCriterion("pro_message >=", value, "proMessage");
            return (Criteria) this;
        }

        public Criteria andProMessageLessThan(String value) {
            addCriterion("pro_message <", value, "proMessage");
            return (Criteria) this;
        }

        public Criteria andProMessageLessThanOrEqualTo(String value) {
            addCriterion("pro_message <=", value, "proMessage");
            return (Criteria) this;
        }

        public Criteria andProMessageLike(String value) {
            addCriterion("pro_message like", value, "proMessage");
            return (Criteria) this;
        }

        public Criteria andProMessageNotLike(String value) {
            addCriterion("pro_message not like", value, "proMessage");
            return (Criteria) this;
        }

        public Criteria andProMessageIn(List<String> values) {
            addCriterion("pro_message in", values, "proMessage");
            return (Criteria) this;
        }

        public Criteria andProMessageNotIn(List<String> values) {
            addCriterion("pro_message not in", values, "proMessage");
            return (Criteria) this;
        }

        public Criteria andProMessageBetween(String value1, String value2) {
            addCriterion("pro_message between", value1, value2, "proMessage");
            return (Criteria) this;
        }

        public Criteria andProMessageNotBetween(String value1, String value2) {
            addCriterion("pro_message not between", value1, value2, "proMessage");
            return (Criteria) this;
        }

        public Criteria andProPriceIsNull() {
            addCriterion("pro_price is null");
            return (Criteria) this;
        }

        public Criteria andProPriceIsNotNull() {
            addCriterion("pro_price is not null");
            return (Criteria) this;
        }

        public Criteria andProPriceEqualTo(Double value) {
            addCriterion("pro_price =", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotEqualTo(Double value) {
            addCriterion("pro_price <>", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceGreaterThan(Double value) {
            addCriterion("pro_price >", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pro_price >=", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceLessThan(Double value) {
            addCriterion("pro_price <", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceLessThanOrEqualTo(Double value) {
            addCriterion("pro_price <=", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceIn(List<Double> values) {
            addCriterion("pro_price in", values, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotIn(List<Double> values) {
            addCriterion("pro_price not in", values, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceBetween(Double value1, Double value2) {
            addCriterion("pro_price between", value1, value2, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotBetween(Double value1, Double value2) {
            addCriterion("pro_price not between", value1, value2, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPhotoIsNull() {
            addCriterion("pro_photo is null");
            return (Criteria) this;
        }

        public Criteria andProPhotoIsNotNull() {
            addCriterion("pro_photo is not null");
            return (Criteria) this;
        }

        public Criteria andProPhotoEqualTo(String value) {
            addCriterion("pro_photo =", value, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoNotEqualTo(String value) {
            addCriterion("pro_photo <>", value, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoGreaterThan(String value) {
            addCriterion("pro_photo >", value, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("pro_photo >=", value, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoLessThan(String value) {
            addCriterion("pro_photo <", value, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoLessThanOrEqualTo(String value) {
            addCriterion("pro_photo <=", value, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoLike(String value) {
            addCriterion("pro_photo like", value, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoNotLike(String value) {
            addCriterion("pro_photo not like", value, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoIn(List<String> values) {
            addCriterion("pro_photo in", values, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoNotIn(List<String> values) {
            addCriterion("pro_photo not in", values, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoBetween(String value1, String value2) {
            addCriterion("pro_photo between", value1, value2, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProPhotoNotBetween(String value1, String value2) {
            addCriterion("pro_photo not between", value1, value2, "proPhoto");
            return (Criteria) this;
        }

        public Criteria andProBuyIsNull() {
            addCriterion("pro_buy is null");
            return (Criteria) this;
        }

        public Criteria andProBuyIsNotNull() {
            addCriterion("pro_buy is not null");
            return (Criteria) this;
        }

        public Criteria andProBuyEqualTo(String value) {
            addCriterion("pro_buy =", value, "proBuy");
            return (Criteria) this;
        }

        public Criteria andProBuyNotEqualTo(String value) {
            addCriterion("pro_buy <>", value, "proBuy");
            return (Criteria) this;
        }

        public Criteria andProBuyGreaterThan(String value) {
            addCriterion("pro_buy >", value, "proBuy");
            return (Criteria) this;
        }

        public Criteria andProBuyGreaterThanOrEqualTo(String value) {
            addCriterion("pro_buy >=", value, "proBuy");
            return (Criteria) this;
        }

        public Criteria andProBuyLessThan(String value) {
            addCriterion("pro_buy <", value, "proBuy");
            return (Criteria) this;
        }

        public Criteria andProBuyLessThanOrEqualTo(String value) {
            addCriterion("pro_buy <=", value, "proBuy");
            return (Criteria) this;
        }

        public Criteria andProBuyLike(String value) {
            addCriterion("pro_buy like", value, "proBuy");
            return (Criteria) this;
        }

        public Criteria andProBuyNotLike(String value) {
            addCriterion("pro_buy not like", value, "proBuy");
            return (Criteria) this;
        }

        public Criteria andProBuyIn(List<String> values) {
            addCriterion("pro_buy in", values, "proBuy");
            return (Criteria) this;
        }

        public Criteria andProBuyNotIn(List<String> values) {
            addCriterion("pro_buy not in", values, "proBuy");
            return (Criteria) this;
        }

        public Criteria andProBuyBetween(String value1, String value2) {
            addCriterion("pro_buy between", value1, value2, "proBuy");
            return (Criteria) this;
        }

        public Criteria andProBuyNotBetween(String value1, String value2) {
            addCriterion("pro_buy not between", value1, value2, "proBuy");
            return (Criteria) this;
        }

        public Criteria andProStateIsNull() {
            addCriterion("pro_state is null");
            return (Criteria) this;
        }

        public Criteria andProStateIsNotNull() {
            addCriterion("pro_state is not null");
            return (Criteria) this;
        }

        public Criteria andProStateEqualTo(Integer value) {
            addCriterion("pro_state =", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateNotEqualTo(Integer value) {
            addCriterion("pro_state <>", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateGreaterThan(Integer value) {
            addCriterion("pro_state >", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_state >=", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateLessThan(Integer value) {
            addCriterion("pro_state <", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateLessThanOrEqualTo(Integer value) {
            addCriterion("pro_state <=", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateIn(List<Integer> values) {
            addCriterion("pro_state in", values, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateNotIn(List<Integer> values) {
            addCriterion("pro_state not in", values, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateBetween(Integer value1, Integer value2) {
            addCriterion("pro_state between", value1, value2, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_state not between", value1, value2, "proState");
            return (Criteria) this;
        }

        public Criteria andProSpareIsNull() {
            addCriterion("pro_spare is null");
            return (Criteria) this;
        }

        public Criteria andProSpareIsNotNull() {
            addCriterion("pro_spare is not null");
            return (Criteria) this;
        }

        public Criteria andProSpareEqualTo(String value) {
            addCriterion("pro_spare =", value, "proSpare");
            return (Criteria) this;
        }

        public Criteria andProSpareNotEqualTo(String value) {
            addCriterion("pro_spare <>", value, "proSpare");
            return (Criteria) this;
        }

        public Criteria andProSpareGreaterThan(String value) {
            addCriterion("pro_spare >", value, "proSpare");
            return (Criteria) this;
        }

        public Criteria andProSpareGreaterThanOrEqualTo(String value) {
            addCriterion("pro_spare >=", value, "proSpare");
            return (Criteria) this;
        }

        public Criteria andProSpareLessThan(String value) {
            addCriterion("pro_spare <", value, "proSpare");
            return (Criteria) this;
        }

        public Criteria andProSpareLessThanOrEqualTo(String value) {
            addCriterion("pro_spare <=", value, "proSpare");
            return (Criteria) this;
        }

        public Criteria andProSpareLike(String value) {
            addCriterion("pro_spare like", value, "proSpare");
            return (Criteria) this;
        }

        public Criteria andProSpareNotLike(String value) {
            addCriterion("pro_spare not like", value, "proSpare");
            return (Criteria) this;
        }

        public Criteria andProSpareIn(List<String> values) {
            addCriterion("pro_spare in", values, "proSpare");
            return (Criteria) this;
        }

        public Criteria andProSpareNotIn(List<String> values) {
            addCriterion("pro_spare not in", values, "proSpare");
            return (Criteria) this;
        }

        public Criteria andProSpareBetween(String value1, String value2) {
            addCriterion("pro_spare between", value1, value2, "proSpare");
            return (Criteria) this;
        }

        public Criteria andProSpareNotBetween(String value1, String value2) {
            addCriterion("pro_spare not between", value1, value2, "proSpare");
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