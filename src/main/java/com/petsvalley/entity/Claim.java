package com.petsvalley.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * claim
 * @author 
 */
public class Claim implements Serializable {
    /**
     * 认领ID
     */
    private Integer claimId;

    /**
     * 用户ID
     */
    private Integer custId;

    /**
     * 捡到时间
     */
    private Date claimTime;

    /**
     * 捡到地方
     */
    private String claimPlace;

    /**
     * 详细信息
     */
    private String claimMessage;

    /**
     * 宠物照片
     */
    private String claimPhoto;

    /**
     * 联系方式
     */
    private String claimPhone;

    /**
     * 状态
     */
    private Integer claimState;

    private String claimSpare;

    private static final long serialVersionUID = 1L;

    public Integer getClaimId() {
        return claimId;
    }

    public void setClaimId(Integer claimId) {
        this.claimId = claimId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Date getClaimTime() {
        return claimTime;
    }

    public void setClaimTime(Date claimTime) {
        this.claimTime = claimTime;
    }

    public String getClaimPlace() {
        return claimPlace;
    }

    public void setClaimPlace(String claimPlace) {
        this.claimPlace = claimPlace;
    }

    public String getClaimMessage() {
        return claimMessage;
    }

    public void setClaimMessage(String claimMessage) {
        this.claimMessage = claimMessage;
    }

    public String getClaimPhoto() {
        return claimPhoto;
    }

    public void setClaimPhoto(String claimPhoto) {
        this.claimPhoto = claimPhoto;
    }

    public String getClaimPhone() {
        return claimPhone;
    }

    public void setClaimPhone(String claimPhone) {
        this.claimPhone = claimPhone;
    }

    public Integer getClaimState() {
        return claimState;
    }

    public void setClaimState(Integer claimState) {
        this.claimState = claimState;
    }

    public String getClaimSpare() {
        return claimSpare;
    }

    public void setClaimSpare(String claimSpare) {
        this.claimSpare = claimSpare;
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
        Claim other = (Claim) that;
        return (this.getClaimId() == null ? other.getClaimId() == null : this.getClaimId().equals(other.getClaimId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getClaimTime() == null ? other.getClaimTime() == null : this.getClaimTime().equals(other.getClaimTime()))
            && (this.getClaimPlace() == null ? other.getClaimPlace() == null : this.getClaimPlace().equals(other.getClaimPlace()))
            && (this.getClaimMessage() == null ? other.getClaimMessage() == null : this.getClaimMessage().equals(other.getClaimMessage()))
            && (this.getClaimPhoto() == null ? other.getClaimPhoto() == null : this.getClaimPhoto().equals(other.getClaimPhoto()))
            && (this.getClaimPhone() == null ? other.getClaimPhone() == null : this.getClaimPhone().equals(other.getClaimPhone()))
            && (this.getClaimState() == null ? other.getClaimState() == null : this.getClaimState().equals(other.getClaimState()))
            && (this.getClaimSpare() == null ? other.getClaimSpare() == null : this.getClaimSpare().equals(other.getClaimSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClaimId() == null) ? 0 : getClaimId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getClaimTime() == null) ? 0 : getClaimTime().hashCode());
        result = prime * result + ((getClaimPlace() == null) ? 0 : getClaimPlace().hashCode());
        result = prime * result + ((getClaimMessage() == null) ? 0 : getClaimMessage().hashCode());
        result = prime * result + ((getClaimPhoto() == null) ? 0 : getClaimPhoto().hashCode());
        result = prime * result + ((getClaimPhone() == null) ? 0 : getClaimPhone().hashCode());
        result = prime * result + ((getClaimState() == null) ? 0 : getClaimState().hashCode());
        result = prime * result + ((getClaimSpare() == null) ? 0 : getClaimSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", claimId=").append(claimId);
        sb.append(", custId=").append(custId);
        sb.append(", claimTime=").append(claimTime);
        sb.append(", claimPlace=").append(claimPlace);
        sb.append(", claimMessage=").append(claimMessage);
        sb.append(", claimPhoto=").append(claimPhoto);
        sb.append(", claimPhone=").append(claimPhone);
        sb.append(", claimState=").append(claimState);
        sb.append(", claimSpare=").append(claimSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}