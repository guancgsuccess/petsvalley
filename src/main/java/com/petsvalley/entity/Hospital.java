package com.petsvalley.entity;

import java.io.Serializable;

/**
 * hospital
 * @author 
 */
public class Hospital implements Serializable {
    /**
     * 医疗室ID
     */
    private Integer hosId;

    /**
     * 医疗室名字
     */
    private String hosName;

    /**
     * 联系方式
     */
    private String hosTele;

    /**
     * 医疗室地址
     */
    private String hosPlace;

    /**
     * 宠物医生ID
     */
    private Integer custId;

    /**
     * 医疗室照片
     */
    private String hosPhoto;

    /**
     * 医疗室简介
     */
    private String hosMessage;

    /**
     * 医疗室状态
     */
    private Integer hosState;

    private String hosSpare;

    private static final long serialVersionUID = 1L;

    public Integer getHosId() {
        return hosId;
    }

    public void setHosId(Integer hosId) {
        this.hosId = hosId;
    }

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName;
    }

    public String getHosTele() {
        return hosTele;
    }

    public void setHosTele(String hosTele) {
        this.hosTele = hosTele;
    }

    public String getHosPlace() {
        return hosPlace;
    }

    public void setHosPlace(String hosPlace) {
        this.hosPlace = hosPlace;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getHosPhoto() {
        return hosPhoto;
    }

    public void setHosPhoto(String hosPhoto) {
        this.hosPhoto = hosPhoto;
    }

    public String getHosMessage() {
        return hosMessage;
    }

    public void setHosMessage(String hosMessage) {
        this.hosMessage = hosMessage;
    }

    public Integer getHosState() {
        return hosState;
    }

    public void setHosState(Integer hosState) {
        this.hosState = hosState;
    }

    public String getHosSpare() {
        return hosSpare;
    }

    public void setHosSpare(String hosSpare) {
        this.hosSpare = hosSpare;
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
        Hospital other = (Hospital) that;
        return (this.getHosId() == null ? other.getHosId() == null : this.getHosId().equals(other.getHosId()))
            && (this.getHosName() == null ? other.getHosName() == null : this.getHosName().equals(other.getHosName()))
            && (this.getHosTele() == null ? other.getHosTele() == null : this.getHosTele().equals(other.getHosTele()))
            && (this.getHosPlace() == null ? other.getHosPlace() == null : this.getHosPlace().equals(other.getHosPlace()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getHosPhoto() == null ? other.getHosPhoto() == null : this.getHosPhoto().equals(other.getHosPhoto()))
            && (this.getHosMessage() == null ? other.getHosMessage() == null : this.getHosMessage().equals(other.getHosMessage()))
            && (this.getHosState() == null ? other.getHosState() == null : this.getHosState().equals(other.getHosState()))
            && (this.getHosSpare() == null ? other.getHosSpare() == null : this.getHosSpare().equals(other.getHosSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHosId() == null) ? 0 : getHosId().hashCode());
        result = prime * result + ((getHosName() == null) ? 0 : getHosName().hashCode());
        result = prime * result + ((getHosTele() == null) ? 0 : getHosTele().hashCode());
        result = prime * result + ((getHosPlace() == null) ? 0 : getHosPlace().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getHosPhoto() == null) ? 0 : getHosPhoto().hashCode());
        result = prime * result + ((getHosMessage() == null) ? 0 : getHosMessage().hashCode());
        result = prime * result + ((getHosState() == null) ? 0 : getHosState().hashCode());
        result = prime * result + ((getHosSpare() == null) ? 0 : getHosSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hosId=").append(hosId);
        sb.append(", hosName=").append(hosName);
        sb.append(", hosTele=").append(hosTele);
        sb.append(", hosPlace=").append(hosPlace);
        sb.append(", custId=").append(custId);
        sb.append(", hosPhoto=").append(hosPhoto);
        sb.append(", hosMessage=").append(hosMessage);
        sb.append(", hosState=").append(hosState);
        sb.append(", hosSpare=").append(hosSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}