package com.petsvalley.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CustomerExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCustNameIsNull() {
            addCriterion("cust_name is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("cust_name =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("cust_name <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("cust_name >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_name >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("cust_name <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("cust_name <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("cust_name like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("cust_name not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("cust_name in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("cust_name not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("cust_name between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("cust_name not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustPwdIsNull() {
            addCriterion("cust_pwd is null");
            return (Criteria) this;
        }

        public Criteria andCustPwdIsNotNull() {
            addCriterion("cust_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andCustPwdEqualTo(String value) {
            addCriterion("cust_pwd =", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdNotEqualTo(String value) {
            addCriterion("cust_pwd <>", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdGreaterThan(String value) {
            addCriterion("cust_pwd >", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdGreaterThanOrEqualTo(String value) {
            addCriterion("cust_pwd >=", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdLessThan(String value) {
            addCriterion("cust_pwd <", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdLessThanOrEqualTo(String value) {
            addCriterion("cust_pwd <=", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdLike(String value) {
            addCriterion("cust_pwd like", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdNotLike(String value) {
            addCriterion("cust_pwd not like", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdIn(List<String> values) {
            addCriterion("cust_pwd in", values, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdNotIn(List<String> values) {
            addCriterion("cust_pwd not in", values, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdBetween(String value1, String value2) {
            addCriterion("cust_pwd between", value1, value2, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdNotBetween(String value1, String value2) {
            addCriterion("cust_pwd not between", value1, value2, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustAgeIsNull() {
            addCriterion("cust_age is null");
            return (Criteria) this;
        }

        public Criteria andCustAgeIsNotNull() {
            addCriterion("cust_age is not null");
            return (Criteria) this;
        }

        public Criteria andCustAgeEqualTo(Integer value) {
            addCriterion("cust_age =", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeNotEqualTo(Integer value) {
            addCriterion("cust_age <>", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeGreaterThan(Integer value) {
            addCriterion("cust_age >", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_age >=", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeLessThan(Integer value) {
            addCriterion("cust_age <", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeLessThanOrEqualTo(Integer value) {
            addCriterion("cust_age <=", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeIn(List<Integer> values) {
            addCriterion("cust_age in", values, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeNotIn(List<Integer> values) {
            addCriterion("cust_age not in", values, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeBetween(Integer value1, Integer value2) {
            addCriterion("cust_age between", value1, value2, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_age not between", value1, value2, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustPhoneIsNull() {
            addCriterion("cust_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustPhoneIsNotNull() {
            addCriterion("cust_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustPhoneEqualTo(String value) {
            addCriterion("cust_phone =", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotEqualTo(String value) {
            addCriterion("cust_phone <>", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneGreaterThan(String value) {
            addCriterion("cust_phone >", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("cust_phone >=", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneLessThan(String value) {
            addCriterion("cust_phone <", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneLessThanOrEqualTo(String value) {
            addCriterion("cust_phone <=", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneLike(String value) {
            addCriterion("cust_phone like", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotLike(String value) {
            addCriterion("cust_phone not like", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneIn(List<String> values) {
            addCriterion("cust_phone in", values, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotIn(List<String> values) {
            addCriterion("cust_phone not in", values, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneBetween(String value1, String value2) {
            addCriterion("cust_phone between", value1, value2, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotBetween(String value1, String value2) {
            addCriterion("cust_phone not between", value1, value2, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCusGenderIsNull() {
            addCriterion("cus_gender is null");
            return (Criteria) this;
        }

        public Criteria andCusGenderIsNotNull() {
            addCriterion("cus_gender is not null");
            return (Criteria) this;
        }

        public Criteria andCusGenderEqualTo(Integer value) {
            addCriterion("cus_gender =", value, "cusGender");
            return (Criteria) this;
        }

        public Criteria andCusGenderNotEqualTo(Integer value) {
            addCriterion("cus_gender <>", value, "cusGender");
            return (Criteria) this;
        }

        public Criteria andCusGenderGreaterThan(Integer value) {
            addCriterion("cus_gender >", value, "cusGender");
            return (Criteria) this;
        }

        public Criteria andCusGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("cus_gender >=", value, "cusGender");
            return (Criteria) this;
        }

        public Criteria andCusGenderLessThan(Integer value) {
            addCriterion("cus_gender <", value, "cusGender");
            return (Criteria) this;
        }

        public Criteria andCusGenderLessThanOrEqualTo(Integer value) {
            addCriterion("cus_gender <=", value, "cusGender");
            return (Criteria) this;
        }

        public Criteria andCusGenderIn(List<Integer> values) {
            addCriterion("cus_gender in", values, "cusGender");
            return (Criteria) this;
        }

        public Criteria andCusGenderNotIn(List<Integer> values) {
            addCriterion("cus_gender not in", values, "cusGender");
            return (Criteria) this;
        }

        public Criteria andCusGenderBetween(Integer value1, Integer value2) {
            addCriterion("cus_gender between", value1, value2, "cusGender");
            return (Criteria) this;
        }

        public Criteria andCusGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("cus_gender not between", value1, value2, "cusGender");
            return (Criteria) this;
        }

        public Criteria andCustEmailIsNull() {
            addCriterion("cust_email is null");
            return (Criteria) this;
        }

        public Criteria andCustEmailIsNotNull() {
            addCriterion("cust_email is not null");
            return (Criteria) this;
        }

        public Criteria andCustEmailEqualTo(String value) {
            addCriterion("cust_email =", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotEqualTo(String value) {
            addCriterion("cust_email <>", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailGreaterThan(String value) {
            addCriterion("cust_email >", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailGreaterThanOrEqualTo(String value) {
            addCriterion("cust_email >=", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailLessThan(String value) {
            addCriterion("cust_email <", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailLessThanOrEqualTo(String value) {
            addCriterion("cust_email <=", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailLike(String value) {
            addCriterion("cust_email like", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotLike(String value) {
            addCriterion("cust_email not like", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailIn(List<String> values) {
            addCriterion("cust_email in", values, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotIn(List<String> values) {
            addCriterion("cust_email not in", values, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailBetween(String value1, String value2) {
            addCriterion("cust_email between", value1, value2, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotBetween(String value1, String value2) {
            addCriterion("cust_email not between", value1, value2, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeIsNull() {
            addCriterion("cust_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeIsNotNull() {
            addCriterion("cust_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("cust_create_time =", value, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("cust_create_time <>", value, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("cust_create_time >", value, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cust_create_time >=", value, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("cust_create_time <", value, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cust_create_time <=", value, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("cust_create_time in", values, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("cust_create_time not in", values, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cust_create_time between", value1, value2, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cust_create_time not between", value1, value2, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIsNull() {
            addCriterion("head_photo is null");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIsNotNull() {
            addCriterion("head_photo is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoEqualTo(String value) {
            addCriterion("head_photo =", value, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoNotEqualTo(String value) {
            addCriterion("head_photo <>", value, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoGreaterThan(String value) {
            addCriterion("head_photo >", value, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("head_photo >=", value, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoLessThan(String value) {
            addCriterion("head_photo <", value, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoLessThanOrEqualTo(String value) {
            addCriterion("head_photo <=", value, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoLike(String value) {
            addCriterion("head_photo like", value, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoNotLike(String value) {
            addCriterion("head_photo not like", value, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIn(List<String> values) {
            addCriterion("head_photo in", values, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoNotIn(List<String> values) {
            addCriterion("head_photo not in", values, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoBetween(String value1, String value2) {
            addCriterion("head_photo between", value1, value2, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoNotBetween(String value1, String value2) {
            addCriterion("head_photo not between", value1, value2, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andCustIntegralIsNull() {
            addCriterion("cust_integral is null");
            return (Criteria) this;
        }

        public Criteria andCustIntegralIsNotNull() {
            addCriterion("cust_integral is not null");
            return (Criteria) this;
        }

        public Criteria andCustIntegralEqualTo(Integer value) {
            addCriterion("cust_integral =", value, "custIntegral");
            return (Criteria) this;
        }

        public Criteria andCustIntegralNotEqualTo(Integer value) {
            addCriterion("cust_integral <>", value, "custIntegral");
            return (Criteria) this;
        }

        public Criteria andCustIntegralGreaterThan(Integer value) {
            addCriterion("cust_integral >", value, "custIntegral");
            return (Criteria) this;
        }

        public Criteria andCustIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_integral >=", value, "custIntegral");
            return (Criteria) this;
        }

        public Criteria andCustIntegralLessThan(Integer value) {
            addCriterion("cust_integral <", value, "custIntegral");
            return (Criteria) this;
        }

        public Criteria andCustIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("cust_integral <=", value, "custIntegral");
            return (Criteria) this;
        }

        public Criteria andCustIntegralIn(List<Integer> values) {
            addCriterion("cust_integral in", values, "custIntegral");
            return (Criteria) this;
        }

        public Criteria andCustIntegralNotIn(List<Integer> values) {
            addCriterion("cust_integral not in", values, "custIntegral");
            return (Criteria) this;
        }

        public Criteria andCustIntegralBetween(Integer value1, Integer value2) {
            addCriterion("cust_integral between", value1, value2, "custIntegral");
            return (Criteria) this;
        }

        public Criteria andCustIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_integral not between", value1, value2, "custIntegral");
            return (Criteria) this;
        }

        public Criteria andCustRoleIsNull() {
            addCriterion("cust_role is null");
            return (Criteria) this;
        }

        public Criteria andCustRoleIsNotNull() {
            addCriterion("cust_role is not null");
            return (Criteria) this;
        }

        public Criteria andCustRoleEqualTo(Integer value) {
            addCriterion("cust_role =", value, "custRole");
            return (Criteria) this;
        }

        public Criteria andCustRoleNotEqualTo(Integer value) {
            addCriterion("cust_role <>", value, "custRole");
            return (Criteria) this;
        }

        public Criteria andCustRoleGreaterThan(Integer value) {
            addCriterion("cust_role >", value, "custRole");
            return (Criteria) this;
        }

        public Criteria andCustRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_role >=", value, "custRole");
            return (Criteria) this;
        }

        public Criteria andCustRoleLessThan(Integer value) {
            addCriterion("cust_role <", value, "custRole");
            return (Criteria) this;
        }

        public Criteria andCustRoleLessThanOrEqualTo(Integer value) {
            addCriterion("cust_role <=", value, "custRole");
            return (Criteria) this;
        }

        public Criteria andCustRoleIn(List<Integer> values) {
            addCriterion("cust_role in", values, "custRole");
            return (Criteria) this;
        }

        public Criteria andCustRoleNotIn(List<Integer> values) {
            addCriterion("cust_role not in", values, "custRole");
            return (Criteria) this;
        }

        public Criteria andCustRoleBetween(Integer value1, Integer value2) {
            addCriterion("cust_role between", value1, value2, "custRole");
            return (Criteria) this;
        }

        public Criteria andCustRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_role not between", value1, value2, "custRole");
            return (Criteria) this;
        }

        public Criteria andCustStateIsNull() {
            addCriterion("cust_state is null");
            return (Criteria) this;
        }

        public Criteria andCustStateIsNotNull() {
            addCriterion("cust_state is not null");
            return (Criteria) this;
        }

        public Criteria andCustStateEqualTo(Integer value) {
            addCriterion("cust_state =", value, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateNotEqualTo(Integer value) {
            addCriterion("cust_state <>", value, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateGreaterThan(Integer value) {
            addCriterion("cust_state >", value, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_state >=", value, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateLessThan(Integer value) {
            addCriterion("cust_state <", value, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateLessThanOrEqualTo(Integer value) {
            addCriterion("cust_state <=", value, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateIn(List<Integer> values) {
            addCriterion("cust_state in", values, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateNotIn(List<Integer> values) {
            addCriterion("cust_state not in", values, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateBetween(Integer value1, Integer value2) {
            addCriterion("cust_state between", value1, value2, "custState");
            return (Criteria) this;
        }

        public Criteria andCustStateNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_state not between", value1, value2, "custState");
            return (Criteria) this;
        }

        public Criteria andCustSpareIsNull() {
            addCriterion("cust_spare is null");
            return (Criteria) this;
        }

        public Criteria andCustSpareIsNotNull() {
            addCriterion("cust_spare is not null");
            return (Criteria) this;
        }

        public Criteria andCustSpareEqualTo(String value) {
            addCriterion("cust_spare =", value, "custSpare");
            return (Criteria) this;
        }

        public Criteria andCustSpareNotEqualTo(String value) {
            addCriterion("cust_spare <>", value, "custSpare");
            return (Criteria) this;
        }

        public Criteria andCustSpareGreaterThan(String value) {
            addCriterion("cust_spare >", value, "custSpare");
            return (Criteria) this;
        }

        public Criteria andCustSpareGreaterThanOrEqualTo(String value) {
            addCriterion("cust_spare >=", value, "custSpare");
            return (Criteria) this;
        }

        public Criteria andCustSpareLessThan(String value) {
            addCriterion("cust_spare <", value, "custSpare");
            return (Criteria) this;
        }

        public Criteria andCustSpareLessThanOrEqualTo(String value) {
            addCriterion("cust_spare <=", value, "custSpare");
            return (Criteria) this;
        }

        public Criteria andCustSpareLike(String value) {
            addCriterion("cust_spare like", value, "custSpare");
            return (Criteria) this;
        }

        public Criteria andCustSpareNotLike(String value) {
            addCriterion("cust_spare not like", value, "custSpare");
            return (Criteria) this;
        }

        public Criteria andCustSpareIn(List<String> values) {
            addCriterion("cust_spare in", values, "custSpare");
            return (Criteria) this;
        }

        public Criteria andCustSpareNotIn(List<String> values) {
            addCriterion("cust_spare not in", values, "custSpare");
            return (Criteria) this;
        }

        public Criteria andCustSpareBetween(String value1, String value2) {
            addCriterion("cust_spare between", value1, value2, "custSpare");
            return (Criteria) this;
        }

        public Criteria andCustSpareNotBetween(String value1, String value2) {
            addCriterion("cust_spare not between", value1, value2, "custSpare");
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