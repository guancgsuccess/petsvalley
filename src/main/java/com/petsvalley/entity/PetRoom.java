package com.petsvalley.entity;

import java.io.Serializable;

/**
 * pet_room
 * @author 
 */
public class PetRoom implements Serializable {
    /**
     * 美容室ID
     */
    private Integer petRoomId;

    /**
     * 美容室名
     */
    private String petName;

    /**
     * 联系方式
     */
    private String petPhone;

    /**
     * 美容室位置
     */
    private String petPlace;

    /**
     * 美容室照片
     */
    private String petPhoto;

    /**
     * 美容室简介
     */
    private String petMessage;

    /**
     * 美容师ID
     */
    private Integer custId;

    /**
     * 美容室状态
     */
    private Integer petRoomState;

    private String petRoomSpare;

    private static final long serialVersionUID = 1L;

    public Integer getPetRoomId() {
        return petRoomId;
    }

    public void setPetRoomId(Integer petRoomId) {
        this.petRoomId = petRoomId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetPhone() {
        return petPhone;
    }

    public void setPetPhone(String petPhone) {
        this.petPhone = petPhone;
    }

    public String getPetPlace() {
        return petPlace;
    }

    public void setPetPlace(String petPlace) {
        this.petPlace = petPlace;
    }

    public String getPetPhoto() {
        return petPhoto;
    }

    public void setPetPhoto(String petPhoto) {
        this.petPhoto = petPhoto;
    }

    public String getPetMessage() {
        return petMessage;
    }

    public void setPetMessage(String petMessage) {
        this.petMessage = petMessage;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getPetRoomState() {
        return petRoomState;
    }

    public void setPetRoomState(Integer petRoomState) {
        this.petRoomState = petRoomState;
    }

    public String getPetRoomSpare() {
        return petRoomSpare;
    }

    public void setPetRoomSpare(String petRoomSpare) {
        this.petRoomSpare = petRoomSpare;
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
        PetRoom other = (PetRoom) that;
        return (this.getPetRoomId() == null ? other.getPetRoomId() == null : this.getPetRoomId().equals(other.getPetRoomId()))
            && (this.getPetName() == null ? other.getPetName() == null : this.getPetName().equals(other.getPetName()))
            && (this.getPetPhone() == null ? other.getPetPhone() == null : this.getPetPhone().equals(other.getPetPhone()))
            && (this.getPetPlace() == null ? other.getPetPlace() == null : this.getPetPlace().equals(other.getPetPlace()))
            && (this.getPetPhoto() == null ? other.getPetPhoto() == null : this.getPetPhoto().equals(other.getPetPhoto()))
            && (this.getPetMessage() == null ? other.getPetMessage() == null : this.getPetMessage().equals(other.getPetMessage()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getPetRoomState() == null ? other.getPetRoomState() == null : this.getPetRoomState().equals(other.getPetRoomState()))
            && (this.getPetRoomSpare() == null ? other.getPetRoomSpare() == null : this.getPetRoomSpare().equals(other.getPetRoomSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPetRoomId() == null) ? 0 : getPetRoomId().hashCode());
        result = prime * result + ((getPetName() == null) ? 0 : getPetName().hashCode());
        result = prime * result + ((getPetPhone() == null) ? 0 : getPetPhone().hashCode());
        result = prime * result + ((getPetPlace() == null) ? 0 : getPetPlace().hashCode());
        result = prime * result + ((getPetPhoto() == null) ? 0 : getPetPhoto().hashCode());
        result = prime * result + ((getPetMessage() == null) ? 0 : getPetMessage().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getPetRoomState() == null) ? 0 : getPetRoomState().hashCode());
        result = prime * result + ((getPetRoomSpare() == null) ? 0 : getPetRoomSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", petRoomId=").append(petRoomId);
        sb.append(", petName=").append(petName);
        sb.append(", petPhone=").append(petPhone);
        sb.append(", petPlace=").append(petPlace);
        sb.append(", petPhoto=").append(petPhoto);
        sb.append(", petMessage=").append(petMessage);
        sb.append(", custId=").append(custId);
        sb.append(", petRoomState=").append(petRoomState);
        sb.append(", petRoomSpare=").append(petRoomSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}