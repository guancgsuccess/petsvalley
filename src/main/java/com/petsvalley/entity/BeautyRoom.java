package com.petsvalley.entity;

import java.io.Serializable;

/**
 * beauty_room
 * @author 
 */
public class BeautyRoom implements Serializable {
    /**
     * 美容室ID
     */
    private Integer beautyId;

    /**
     * 美容室名
     */
    private String beautyName;

    /**
     * 联系方式
     */
    private String beautyPhone;

    /**
     * 美容室位置
     */
    private String beautyPlace;

    /**
     * 美容室照片
     */
    private String beautyPhoto;

    /**
     * 美容室简介
     */
    private String beautyMessage;

    /**
     * 美容师ID
     */
    private Integer custId;

    /**
     * 美容室状态
     */
    private Integer beautyState;

    private static final long serialVersionUID = 1L;

    public Integer getBeautyId() {
        return beautyId;
    }

    public void setBeautyId(Integer beautyId) {
        this.beautyId = beautyId;
    }

    public String getBeautyName() {
        return beautyName;
    }

    public void setBeautyName(String beautyName) {
        this.beautyName = beautyName;
    }

    public String getBeautyPhone() {
        return beautyPhone;
    }

    public void setBeautyPhone(String beautyPhone) {
        this.beautyPhone = beautyPhone;
    }

    public String getBeautyPlace() {
        return beautyPlace;
    }

    public void setBeautyPlace(String beautyPlace) {
        this.beautyPlace = beautyPlace;
    }

    public String getBeautyPhoto() {
        return beautyPhoto;
    }

    public void setBeautyPhoto(String beautyPhoto) {
        this.beautyPhoto = beautyPhoto;
    }

    public String getBeautyMessage() {
        return beautyMessage;
    }

    public void setBeautyMessage(String beautyMessage) {
        this.beautyMessage = beautyMessage;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getBeautyState() {
        return beautyState;
    }

    public void setBeautyState(Integer beautyState) {
        this.beautyState = beautyState;
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
        BeautyRoom other = (BeautyRoom) that;
        return (this.getBeautyId() == null ? other.getBeautyId() == null : this.getBeautyId().equals(other.getBeautyId()))
            && (this.getBeautyName() == null ? other.getBeautyName() == null : this.getBeautyName().equals(other.getBeautyName()))
            && (this.getBeautyPhone() == null ? other.getBeautyPhone() == null : this.getBeautyPhone().equals(other.getBeautyPhone()))
            && (this.getBeautyPlace() == null ? other.getBeautyPlace() == null : this.getBeautyPlace().equals(other.getBeautyPlace()))
            && (this.getBeautyPhoto() == null ? other.getBeautyPhoto() == null : this.getBeautyPhoto().equals(other.getBeautyPhoto()))
            && (this.getBeautyMessage() == null ? other.getBeautyMessage() == null : this.getBeautyMessage().equals(other.getBeautyMessage()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getBeautyState() == null ? other.getBeautyState() == null : this.getBeautyState().equals(other.getBeautyState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBeautyId() == null) ? 0 : getBeautyId().hashCode());
        result = prime * result + ((getBeautyName() == null) ? 0 : getBeautyName().hashCode());
        result = prime * result + ((getBeautyPhone() == null) ? 0 : getBeautyPhone().hashCode());
        result = prime * result + ((getBeautyPlace() == null) ? 0 : getBeautyPlace().hashCode());
        result = prime * result + ((getBeautyPhoto() == null) ? 0 : getBeautyPhoto().hashCode());
        result = prime * result + ((getBeautyMessage() == null) ? 0 : getBeautyMessage().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getBeautyState() == null) ? 0 : getBeautyState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", beautyId=").append(beautyId);
        sb.append(", beautyName=").append(beautyName);
        sb.append(", beautyPhone=").append(beautyPhone);
        sb.append(", beautyPlace=").append(beautyPlace);
        sb.append(", beautyPhoto=").append(beautyPhoto);
        sb.append(", beautyMessage=").append(beautyMessage);
        sb.append(", custId=").append(custId);
        sb.append(", beautyState=").append(beautyState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}