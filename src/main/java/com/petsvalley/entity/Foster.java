package com.petsvalley.entity;

import java.io.Serializable;

/**
 * foster
 * @author 
 */
public class Foster implements Serializable {
    /**
     * 寄养ID
     */
    private Integer fosterId;

    /**
     * 寄养用户ID
     */
    private Integer fosterCustId;

    /**
     * 寄养宠物ID
     */
    private Integer fosterPetId;

    /**
     * 寄养宠物信息
     */
    private String fosterMessage;

    /**
     * 寄养原因
     */
    private String fosterReason;

    /**
     *  寄养宠物图片
     */
    private String fosterPhoto;

    /**
     * 寄养状态
     */
    private Integer fosterState;

    private String fosterSpare;

    private static final long serialVersionUID = 1L;

    public Integer getFosterId() {
        return fosterId;
    }

    public void setFosterId(Integer fosterId) {
        this.fosterId = fosterId;
    }

    public Integer getFosterCustId() {
        return fosterCustId;
    }

    public void setFosterCustId(Integer fosterCustId) {
        this.fosterCustId = fosterCustId;
    }

    public Integer getFosterPetId() {
        return fosterPetId;
    }

    public void setFosterPetId(Integer fosterPetId) {
        this.fosterPetId = fosterPetId;
    }

    public String getFosterMessage() {
        return fosterMessage;
    }

    public void setFosterMessage(String fosterMessage) {
        this.fosterMessage = fosterMessage;
    }

    public String getFosterReason() {
        return fosterReason;
    }

    public void setFosterReason(String fosterReason) {
        this.fosterReason = fosterReason;
    }

    public String getFosterPhoto() {
        return fosterPhoto;
    }

    public void setFosterPhoto(String fosterPhoto) {
        this.fosterPhoto = fosterPhoto;
    }

    public Integer getFosterState() {
        return fosterState;
    }

    public void setFosterState(Integer fosterState) {
        this.fosterState = fosterState;
    }

    public String getFosterSpare() {
        return fosterSpare;
    }

    public void setFosterSpare(String fosterSpare) {
        this.fosterSpare = fosterSpare;
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
        Foster other = (Foster) that;
        return (this.getFosterId() == null ? other.getFosterId() == null : this.getFosterId().equals(other.getFosterId()))
            && (this.getFosterCustId() == null ? other.getFosterCustId() == null : this.getFosterCustId().equals(other.getFosterCustId()))
            && (this.getFosterPetId() == null ? other.getFosterPetId() == null : this.getFosterPetId().equals(other.getFosterPetId()))
            && (this.getFosterMessage() == null ? other.getFosterMessage() == null : this.getFosterMessage().equals(other.getFosterMessage()))
            && (this.getFosterReason() == null ? other.getFosterReason() == null : this.getFosterReason().equals(other.getFosterReason()))
            && (this.getFosterPhoto() == null ? other.getFosterPhoto() == null : this.getFosterPhoto().equals(other.getFosterPhoto()))
            && (this.getFosterState() == null ? other.getFosterState() == null : this.getFosterState().equals(other.getFosterState()))
            && (this.getFosterSpare() == null ? other.getFosterSpare() == null : this.getFosterSpare().equals(other.getFosterSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFosterId() == null) ? 0 : getFosterId().hashCode());
        result = prime * result + ((getFosterCustId() == null) ? 0 : getFosterCustId().hashCode());
        result = prime * result + ((getFosterPetId() == null) ? 0 : getFosterPetId().hashCode());
        result = prime * result + ((getFosterMessage() == null) ? 0 : getFosterMessage().hashCode());
        result = prime * result + ((getFosterReason() == null) ? 0 : getFosterReason().hashCode());
        result = prime * result + ((getFosterPhoto() == null) ? 0 : getFosterPhoto().hashCode());
        result = prime * result + ((getFosterState() == null) ? 0 : getFosterState().hashCode());
        result = prime * result + ((getFosterSpare() == null) ? 0 : getFosterSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fosterId=").append(fosterId);
        sb.append(", fosterCustId=").append(fosterCustId);
        sb.append(", fosterPetId=").append(fosterPetId);
        sb.append(", fosterMessage=").append(fosterMessage);
        sb.append(", fosterReason=").append(fosterReason);
        sb.append(", fosterPhoto=").append(fosterPhoto);
        sb.append(", fosterState=").append(fosterState);
        sb.append(", fosterSpare=").append(fosterSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}