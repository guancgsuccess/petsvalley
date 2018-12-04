package com.petsvalley.entity;

import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * physicals
 * @author 
 */
public class Physicals implements Serializable {
    /**
     * 体检ID
     */
    private Integer phyId;

    /**
     * 宠物ID
     */
    private Integer petId;

    /**
     * 体检时间
     */
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date phyTime;

    /**
     * 体检类型
     */
    private String phyType;

    /**
     * 体检地点
     */
    private String phyLoc;

    /**
     * 体检结果信息
     */
    private String phyMessage;

    /**
     * 体检状态
     */
    private Integer phyState;

    private String phySpare;

    private static final long serialVersionUID = 1L;

    public Integer getPhyId() {
        return phyId;
    }

    public void setPhyId(Integer phyId) {
        this.phyId = phyId;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Date getPhyTime() {
        return phyTime;
    }

    public void setPhyTime(Date phyTime) {
        this.phyTime = phyTime;
    }

    public String getPhyType() {
        return phyType;
    }

    public void setPhyType(String phyType) {
        this.phyType = phyType;
    }

    public String getPhyLoc() {
        return phyLoc;
    }

    public void setPhyLoc(String phyLoc) {
        this.phyLoc = phyLoc;
    }

    public String getPhyMessage() {
        return phyMessage;
    }

    public void setPhyMessage(String phyMessage) {
        this.phyMessage = phyMessage;
    }

    public Integer getPhyState() {
        return phyState;
    }

    public void setPhyState(Integer phyState) {
        this.phyState = phyState;
    }

    public String getPhySpare() {
        return phySpare;
    }

    public void setPhySpare(String phySpare) {
        this.phySpare = phySpare;
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
        Physicals other = (Physicals) that;
        return (this.getPhyId() == null ? other.getPhyId() == null : this.getPhyId().equals(other.getPhyId()))
            && (this.getPetId() == null ? other.getPetId() == null : this.getPetId().equals(other.getPetId()))
            && (this.getPhyTime() == null ? other.getPhyTime() == null : this.getPhyTime().equals(other.getPhyTime()))
            && (this.getPhyType() == null ? other.getPhyType() == null : this.getPhyType().equals(other.getPhyType()))
            && (this.getPhyLoc() == null ? other.getPhyLoc() == null : this.getPhyLoc().equals(other.getPhyLoc()))
            && (this.getPhyMessage() == null ? other.getPhyMessage() == null : this.getPhyMessage().equals(other.getPhyMessage()))
            && (this.getPhyState() == null ? other.getPhyState() == null : this.getPhyState().equals(other.getPhyState()))
            && (this.getPhySpare() == null ? other.getPhySpare() == null : this.getPhySpare().equals(other.getPhySpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPhyId() == null) ? 0 : getPhyId().hashCode());
        result = prime * result + ((getPetId() == null) ? 0 : getPetId().hashCode());
        result = prime * result + ((getPhyTime() == null) ? 0 : getPhyTime().hashCode());
        result = prime * result + ((getPhyType() == null) ? 0 : getPhyType().hashCode());
        result = prime * result + ((getPhyLoc() == null) ? 0 : getPhyLoc().hashCode());
        result = prime * result + ((getPhyMessage() == null) ? 0 : getPhyMessage().hashCode());
        result = prime * result + ((getPhyState() == null) ? 0 : getPhyState().hashCode());
        result = prime * result + ((getPhySpare() == null) ? 0 : getPhySpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", phyId=").append(phyId);
        sb.append(", petId=").append(petId);
        sb.append(", phyTime=").append(phyTime);
        sb.append(", phyType=").append(phyType);
        sb.append(", phyLoc=").append(phyLoc);
        sb.append(", phyMessage=").append(phyMessage);
        sb.append(", phyState=").append(phyState);
        sb.append(", phySpare=").append(phySpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}