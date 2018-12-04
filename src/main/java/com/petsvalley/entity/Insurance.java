package com.petsvalley.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * insurance
 * @author 
 */
public class Insurance implements Serializable {
    /**
     * 保险ID
     */
    private Integer insId;

    /**
     * 宠物ID
     */
    private Integer petId;

    /**
     * 保险类别ID
     */
    private Integer icId;

    /**
     * 投保时间
     */
    private Date insTime;

    /**
     * 投保金额
     */
    private Double insMoney;

    /**
     * 保险公司名称
     */
    private String insComName;

    /**
     * 投保状态
     */
    private Integer insState;

    /**
     * 到期时间
     */
    private Date insEndTime;

    private String insSpare;

    private static final long serialVersionUID = 1L;

    public Integer getInsId() {
        return insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Integer getIcId() {
        return icId;
    }

    public void setIcId(Integer icId) {
        this.icId = icId;
    }

    public Date getInsTime() {
        return insTime;
    }

    public void setInsTime(Date insTime) {
        this.insTime = insTime;
    }

    public Double getInsMoney() {
        return insMoney;
    }

    public void setInsMoney(Double insMoney) {
        this.insMoney = insMoney;
    }

    public String getInsComName() {
        return insComName;
    }

    public void setInsComName(String insComName) {
        this.insComName = insComName;
    }

    public Integer getInsState() {
        return insState;
    }

    public void setInsState(Integer insState) {
        this.insState = insState;
    }

    public Date getInsEndTime() {
        return insEndTime;
    }

    public void setInsEndTime(Date insEndTime) {
        this.insEndTime = insEndTime;
    }

    public String getInsSpare() {
        return insSpare;
    }

    public void setInsSpare(String insSpare) {
        this.insSpare = insSpare;
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
        Insurance other = (Insurance) that;
        return (this.getInsId() == null ? other.getInsId() == null : this.getInsId().equals(other.getInsId()))
            && (this.getPetId() == null ? other.getPetId() == null : this.getPetId().equals(other.getPetId()))
            && (this.getIcId() == null ? other.getIcId() == null : this.getIcId().equals(other.getIcId()))
            && (this.getInsTime() == null ? other.getInsTime() == null : this.getInsTime().equals(other.getInsTime()))
            && (this.getInsMoney() == null ? other.getInsMoney() == null : this.getInsMoney().equals(other.getInsMoney()))
            && (this.getInsComName() == null ? other.getInsComName() == null : this.getInsComName().equals(other.getInsComName()))
            && (this.getInsState() == null ? other.getInsState() == null : this.getInsState().equals(other.getInsState()))
            && (this.getInsEndTime() == null ? other.getInsEndTime() == null : this.getInsEndTime().equals(other.getInsEndTime()))
            && (this.getInsSpare() == null ? other.getInsSpare() == null : this.getInsSpare().equals(other.getInsSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInsId() == null) ? 0 : getInsId().hashCode());
        result = prime * result + ((getPetId() == null) ? 0 : getPetId().hashCode());
        result = prime * result + ((getIcId() == null) ? 0 : getIcId().hashCode());
        result = prime * result + ((getInsTime() == null) ? 0 : getInsTime().hashCode());
        result = prime * result + ((getInsMoney() == null) ? 0 : getInsMoney().hashCode());
        result = prime * result + ((getInsComName() == null) ? 0 : getInsComName().hashCode());
        result = prime * result + ((getInsState() == null) ? 0 : getInsState().hashCode());
        result = prime * result + ((getInsEndTime() == null) ? 0 : getInsEndTime().hashCode());
        result = prime * result + ((getInsSpare() == null) ? 0 : getInsSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", insId=").append(insId);
        sb.append(", petId=").append(petId);
        sb.append(", icId=").append(icId);
        sb.append(", insTime=").append(insTime);
        sb.append(", insMoney=").append(insMoney);
        sb.append(", insComName=").append(insComName);
        sb.append(", insState=").append(insState);
        sb.append(", insEndTime=").append(insEndTime);
        sb.append(", insSpare=").append(insSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}