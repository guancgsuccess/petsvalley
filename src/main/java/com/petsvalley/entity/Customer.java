package com.petsvalley.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * customer
 * @author 
 */
public class Customer implements Serializable {
    /**
     * 用户ID
     */
    private Integer custId;

    private String custName;

    /**
     *  用户密码
     */
    private String custPwd;

    /**
     * 用户年龄
     */
    private Integer custAge;

    /**
     * 用户电话
     */
    private String custPhone;

    /**
     * 用户性别
     */
    private Integer cusGender;

    /**
     * 用户邮箱
     */
    private String custEmail;

    /**
     * 用户注册时间
     */
    private Date custCreateTime;

    /**
     * 用户头像
     */
    private String headPhoto;

    /**
     * 用户积分
     */
    private Integer custIntegral;

    /**
     * 用户角色
     */
    private Integer custRole;

    /**
     * 用户状态
     */
    private Integer custState;

    private String custSpare;

    private static final long serialVersionUID = 1L;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustPwd() {
        return custPwd;
    }

    public Customer( String custName, String custPwd, Integer custAge, String custPhone, Integer cusGender, String custEmail, Date custCreateTime, String headPhoto, Integer custIntegral, Integer custRole, Integer custState, String custSpare ) {
        this.custName = custName;
        this.custPwd = custPwd;
        this.custAge = custAge;
        this.custPhone = custPhone;
        this.cusGender = cusGender;
        this.custEmail = custEmail;
        this.custCreateTime = custCreateTime;
        this.headPhoto = headPhoto;
        this.custIntegral = custIntegral;
        this.custRole = custRole;
        this.custState = custState;
        this.custSpare = custSpare;
    }

    public void setCustPwd( String custPwd) {
        this.custPwd = custPwd;
    }

    public Integer getCustAge() {
        return custAge;
    }

    public void setCustAge(Integer custAge) {
        this.custAge = custAge;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public Integer getCusGender() {
        return cusGender;
    }

    public void setCusGender(Integer cusGender) {
        this.cusGender = cusGender;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public Date getCustCreateTime() {
        return custCreateTime;
    }

    public void setCustCreateTime(Date custCreateTime) {
        this.custCreateTime = custCreateTime;
    }

    public String getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto;
    }

    public Integer getCustIntegral() {
        return custIntegral;
    }

    public void setCustIntegral(Integer custIntegral) {
        this.custIntegral = custIntegral;
    }

    public Integer getCustRole() {
        return custRole;
    }

    public void setCustRole(Integer custRole) {
        this.custRole = custRole;
    }

    public Integer getCustState() {
        return custState;
    }

    public Customer( ) {
    }

    public void setCustState( Integer custState) {
        this.custState = custState;
    }

    public String getCustSpare() {
        return custSpare;
    }

    public void setCustSpare(String custSpare) {
        this.custSpare = custSpare;
    }

    public Customer( Integer custId, String custName, String custPwd, Integer custAge, String custPhone, Integer cusGender, String custEmail, Date custCreateTime, String headPhoto, Integer custIntegral, Integer custRole, Integer custState, String custSpare ) {
        this.custId = custId;
        this.custName = custName;
        this.custPwd = custPwd;
        this.custAge = custAge;
        this.custPhone = custPhone;
        this.cusGender = cusGender;
        this.custEmail = custEmail;
        this.custCreateTime = custCreateTime;
        this.headPhoto = headPhoto;
        this.custIntegral = custIntegral;
        this.custRole = custRole;
        this.custState = custState;
        this.custSpare = custSpare;
    }

    @Override

    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Customer other = (Customer) that;
        return (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getCustName() == null ? other.getCustName() == null : this.getCustName().equals(other.getCustName()))
            && (this.getCustPwd() == null ? other.getCustPwd() == null : this.getCustPwd().equals(other.getCustPwd()))
            && (this.getCustAge() == null ? other.getCustAge() == null : this.getCustAge().equals(other.getCustAge()))
            && (this.getCustPhone() == null ? other.getCustPhone() == null : this.getCustPhone().equals(other.getCustPhone()))
            && (this.getCusGender() == null ? other.getCusGender() == null : this.getCusGender().equals(other.getCusGender()))
            && (this.getCustEmail() == null ? other.getCustEmail() == null : this.getCustEmail().equals(other.getCustEmail()))
            && (this.getCustCreateTime() == null ? other.getCustCreateTime() == null : this.getCustCreateTime().equals(other.getCustCreateTime()))
            && (this.getHeadPhoto() == null ? other.getHeadPhoto() == null : this.getHeadPhoto().equals(other.getHeadPhoto()))
            && (this.getCustIntegral() == null ? other.getCustIntegral() == null : this.getCustIntegral().equals(other.getCustIntegral()))
            && (this.getCustRole() == null ? other.getCustRole() == null : this.getCustRole().equals(other.getCustRole()))
            && (this.getCustState() == null ? other.getCustState() == null : this.getCustState().equals(other.getCustState()))
            && (this.getCustSpare() == null ? other.getCustSpare() == null : this.getCustSpare().equals(other.getCustSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getCustName() == null) ? 0 : getCustName().hashCode());
        result = prime * result + ((getCustPwd() == null) ? 0 : getCustPwd().hashCode());
        result = prime * result + ((getCustAge() == null) ? 0 : getCustAge().hashCode());
        result = prime * result + ((getCustPhone() == null) ? 0 : getCustPhone().hashCode());
        result = prime * result + ((getCusGender() == null) ? 0 : getCusGender().hashCode());
        result = prime * result + ((getCustEmail() == null) ? 0 : getCustEmail().hashCode());
        result = prime * result + ((getCustCreateTime() == null) ? 0 : getCustCreateTime().hashCode());
        result = prime * result + ((getHeadPhoto() == null) ? 0 : getHeadPhoto().hashCode());
        result = prime * result + ((getCustIntegral() == null) ? 0 : getCustIntegral().hashCode());
        result = prime * result + ((getCustRole() == null) ? 0 : getCustRole().hashCode());
        result = prime * result + ((getCustState() == null) ? 0 : getCustState().hashCode());
        result = prime * result + ((getCustSpare() == null) ? 0 : getCustSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", custId=").append(custId);
        sb.append(", custName=").append(custName);
        sb.append(", custPwd=").append(custPwd);
        sb.append(", custAge=").append(custAge);
        sb.append(", custPhone=").append(custPhone);
        sb.append(", cusGender=").append(cusGender);
        sb.append(", custEmail=").append(custEmail);
        sb.append(", custCreateTime=").append(custCreateTime);
        sb.append(", headPhoto=").append(headPhoto);
        sb.append(", custIntegral=").append(custIntegral);
        sb.append(", custRole=").append(custRole);
        sb.append(", custState=").append(custState);
        sb.append(", custSpare=").append(custSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}