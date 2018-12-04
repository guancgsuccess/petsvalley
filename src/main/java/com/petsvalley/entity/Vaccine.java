package com.petsvalley.entity;

import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * vaccine
 * @author 
 */
public class Vaccine implements Serializable {
    /**
     * 疫苗ID
     */
    private Integer vaccId;

    /**
     * 宠物ID
     */
    private Integer petId;

    /**
     * 疫苗类型
     */
    private String vaccType;

    /**
     * 注射时间
     */
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date vaccTime;

    /**
     * 具体信息
     */
    private String vaccMessage;

    /**
     * 状态
     */
    private Integer vaccState;

    private String vaccSpare;

    private static final long serialVersionUID = 1L;

    public Integer getVaccId() {
        return vaccId;
    }

    public void setVaccId(Integer vaccId) {
        this.vaccId = vaccId;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public String getVaccType() {
        return vaccType;
    }

    public void setVaccType(String vaccType) {
        this.vaccType = vaccType;
    }

    public Date getVaccTime() {
        return vaccTime;
    }

    public void setVaccTime(Date vaccTime) {
        this.vaccTime = vaccTime;
    }

    public String getVaccMessage() {
        return vaccMessage;
    }

    public void setVaccMessage(String vaccMessage) {
        this.vaccMessage = vaccMessage;
    }

    public Integer getVaccState() {
        return vaccState;
    }

    public void setVaccState(Integer vaccState) {
        this.vaccState = vaccState;
    }

    public String getVaccSpare() {
        return vaccSpare;
    }

    public void setVaccSpare(String vaccSpare) {
        this.vaccSpare = vaccSpare;
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
        Vaccine other = (Vaccine) that;
        return (this.getVaccId() == null ? other.getVaccId() == null : this.getVaccId().equals(other.getVaccId()))
            && (this.getPetId() == null ? other.getPetId() == null : this.getPetId().equals(other.getPetId()))
            && (this.getVaccType() == null ? other.getVaccType() == null : this.getVaccType().equals(other.getVaccType()))
            && (this.getVaccTime() == null ? other.getVaccTime() == null : this.getVaccTime().equals(other.getVaccTime()))
            && (this.getVaccMessage() == null ? other.getVaccMessage() == null : this.getVaccMessage().equals(other.getVaccMessage()))
            && (this.getVaccState() == null ? other.getVaccState() == null : this.getVaccState().equals(other.getVaccState()))
            && (this.getVaccSpare() == null ? other.getVaccSpare() == null : this.getVaccSpare().equals(other.getVaccSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVaccId() == null) ? 0 : getVaccId().hashCode());
        result = prime * result + ((getPetId() == null) ? 0 : getPetId().hashCode());
        result = prime * result + ((getVaccType() == null) ? 0 : getVaccType().hashCode());
        result = prime * result + ((getVaccTime() == null) ? 0 : getVaccTime().hashCode());
        result = prime * result + ((getVaccMessage() == null) ? 0 : getVaccMessage().hashCode());
        result = prime * result + ((getVaccState() == null) ? 0 : getVaccState().hashCode());
        result = prime * result + ((getVaccSpare() == null) ? 0 : getVaccSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vaccId=").append(vaccId);
        sb.append(", petId=").append(petId);
        sb.append(", vaccType=").append(vaccType);
        sb.append(", vaccTime=").append(vaccTime);
        sb.append(", vaccMessage=").append(vaccMessage);
        sb.append(", vaccState=").append(vaccState);
        sb.append(", vaccSpare=").append(vaccSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}