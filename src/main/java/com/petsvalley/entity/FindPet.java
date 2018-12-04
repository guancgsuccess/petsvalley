package com.petsvalley.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * find_pet
 * @author 
 */
public class FindPet implements Serializable {
    /**
     * 寻宠ID
     */
    private Integer fpId;

    /**
     * 宠物ID
     */
    private Integer petId;

    /**
     * 丢失时间
     */
    private Date lostTime;

    /**
     * 丢失信息
     */
    private String lostMessage;

    /**
     * 丢失地点
     */
    private String lostPlace;

    /**
     * 宠物照片
     */
    private String petPhoto;

    /**
     * 悬赏金额
     */
    private Integer fpReward;

    /**
     * 联系方式
     */
    private String fpPhone;

    /**
     * 状态
     */
    private Integer fpState;

    private String fdSpare;

    private static final long serialVersionUID = 1L;

    public Integer getFpId() {
        return fpId;
    }

    public void setFpId(Integer fpId) {
        this.fpId = fpId;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Date getLostTime() {
        return lostTime;
    }

    public void setLostTime(Date lostTime) {
        this.lostTime = lostTime;
    }

    public String getLostMessage() {
        return lostMessage;
    }

    public void setLostMessage(String lostMessage) {
        this.lostMessage = lostMessage;
    }

    public String getLostPlace() {
        return lostPlace;
    }

    public void setLostPlace(String lostPlace) {
        this.lostPlace = lostPlace;
    }

    public String getPetPhoto() {
        return petPhoto;
    }

    public void setPetPhoto(String petPhoto) {
        this.petPhoto = petPhoto;
    }

    public Integer getFpReward() {
        return fpReward;
    }

    public void setFpReward(Integer fpReward) {
        this.fpReward = fpReward;
    }

    public String getFpPhone() {
        return fpPhone;
    }

    public void setFpPhone(String fpPhone) {
        this.fpPhone = fpPhone;
    }

    public Integer getFpState() {
        return fpState;
    }

    public void setFpState(Integer fpState) {
        this.fpState = fpState;
    }

    public String getFdSpare() {
        return fdSpare;
    }

    public void setFdSpare(String fdSpare) {
        this.fdSpare = fdSpare;
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
        FindPet other = (FindPet) that;
        return (this.getFpId() == null ? other.getFpId() == null : this.getFpId().equals(other.getFpId()))
            && (this.getPetId() == null ? other.getPetId() == null : this.getPetId().equals(other.getPetId()))
            && (this.getLostTime() == null ? other.getLostTime() == null : this.getLostTime().equals(other.getLostTime()))
            && (this.getLostMessage() == null ? other.getLostMessage() == null : this.getLostMessage().equals(other.getLostMessage()))
            && (this.getLostPlace() == null ? other.getLostPlace() == null : this.getLostPlace().equals(other.getLostPlace()))
            && (this.getPetPhoto() == null ? other.getPetPhoto() == null : this.getPetPhoto().equals(other.getPetPhoto()))
            && (this.getFpReward() == null ? other.getFpReward() == null : this.getFpReward().equals(other.getFpReward()))
            && (this.getFpPhone() == null ? other.getFpPhone() == null : this.getFpPhone().equals(other.getFpPhone()))
            && (this.getFpState() == null ? other.getFpState() == null : this.getFpState().equals(other.getFpState()))
            && (this.getFdSpare() == null ? other.getFdSpare() == null : this.getFdSpare().equals(other.getFdSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFpId() == null) ? 0 : getFpId().hashCode());
        result = prime * result + ((getPetId() == null) ? 0 : getPetId().hashCode());
        result = prime * result + ((getLostTime() == null) ? 0 : getLostTime().hashCode());
        result = prime * result + ((getLostMessage() == null) ? 0 : getLostMessage().hashCode());
        result = prime * result + ((getLostPlace() == null) ? 0 : getLostPlace().hashCode());
        result = prime * result + ((getPetPhoto() == null) ? 0 : getPetPhoto().hashCode());
        result = prime * result + ((getFpReward() == null) ? 0 : getFpReward().hashCode());
        result = prime * result + ((getFpPhone() == null) ? 0 : getFpPhone().hashCode());
        result = prime * result + ((getFpState() == null) ? 0 : getFpState().hashCode());
        result = prime * result + ((getFdSpare() == null) ? 0 : getFdSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fpId=").append(fpId);
        sb.append(", petId=").append(petId);
        sb.append(", lostTime=").append(lostTime);
        sb.append(", lostMessage=").append(lostMessage);
        sb.append(", lostPlace=").append(lostPlace);
        sb.append(", petPhoto=").append(petPhoto);
        sb.append(", fpReward=").append(fpReward);
        sb.append(", fpPhone=").append(fpPhone);
        sb.append(", fpState=").append(fpState);
        sb.append(", fdSpare=").append(fdSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}