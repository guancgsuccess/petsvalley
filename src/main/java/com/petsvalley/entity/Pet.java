package com.petsvalley.entity;

import java.io.Serializable;

/**
 * pet
 * @author 
 */
public class Pet implements Serializable {
    /**
     * 宠物ID
     */
    private Integer petId;

    /**
     * 用户ID
     */
    private Integer custId;

    /**
     * 配偶状态
     */
    private Integer petMateState;

    /**
     * 宠物姓名
     */
    private String petName;

    /**
     * 宠物性别
     */
    private Integer petGender;

    /**
     * 宠物年龄
     */
    private Integer petAge;

    /**
     * 种类ID
     */
    private Integer petTypeId;

    /**
     * 宠物图片
     */
    private String petPhoto;

    /**
     * 宠物体重
     */
    private Double petWeight;

    /**
     * 宠物状态
     */
    private Integer petState;

    private String petSpare;

    private static final long serialVersionUID = 1L;

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getPetMateState() {
        return petMateState;
    }

    public void setPetMateState(Integer petMateState) {
        this.petMateState = petMateState;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Integer getPetGender() {
        return petGender;
    }

    public void setPetGender(Integer petGender) {
        this.petGender = petGender;
    }

    public Integer getPetAge() {
        return petAge;
    }

    public void setPetAge(Integer petAge) {
        this.petAge = petAge;
    }

    public Integer getPetTypeId() {
        return petTypeId;
    }

    public void setPetTypeId(Integer petTypeId) {
        this.petTypeId = petTypeId;
    }

    public String getPetPhoto() {
        return petPhoto;
    }

    public void setPetPhoto(String petPhoto) {
        this.petPhoto = petPhoto;
    }

    public Double getPetWeight() {
        return petWeight;
    }

    public void setPetWeight(Double petWeight) {
        this.petWeight = petWeight;
    }

    public Integer getPetState() {
        return petState;
    }

    public void setPetState(Integer petState) {
        this.petState = petState;
    }

    public String getPetSpare() {
        return petSpare;
    }

    public void setPetSpare(String petSpare) {
        this.petSpare = petSpare;
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
        Pet other = (Pet) that;
        return (this.getPetId() == null ? other.getPetId() == null : this.getPetId().equals(other.getPetId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getPetMateState() == null ? other.getPetMateState() == null : this.getPetMateState().equals(other.getPetMateState()))
            && (this.getPetName() == null ? other.getPetName() == null : this.getPetName().equals(other.getPetName()))
            && (this.getPetGender() == null ? other.getPetGender() == null : this.getPetGender().equals(other.getPetGender()))
            && (this.getPetAge() == null ? other.getPetAge() == null : this.getPetAge().equals(other.getPetAge()))
            && (this.getPetTypeId() == null ? other.getPetTypeId() == null : this.getPetTypeId().equals(other.getPetTypeId()))
            && (this.getPetPhoto() == null ? other.getPetPhoto() == null : this.getPetPhoto().equals(other.getPetPhoto()))
            && (this.getPetWeight() == null ? other.getPetWeight() == null : this.getPetWeight().equals(other.getPetWeight()))
            && (this.getPetState() == null ? other.getPetState() == null : this.getPetState().equals(other.getPetState()))
            && (this.getPetSpare() == null ? other.getPetSpare() == null : this.getPetSpare().equals(other.getPetSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPetId() == null) ? 0 : getPetId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getPetMateState() == null) ? 0 : getPetMateState().hashCode());
        result = prime * result + ((getPetName() == null) ? 0 : getPetName().hashCode());
        result = prime * result + ((getPetGender() == null) ? 0 : getPetGender().hashCode());
        result = prime * result + ((getPetAge() == null) ? 0 : getPetAge().hashCode());
        result = prime * result + ((getPetTypeId() == null) ? 0 : getPetTypeId().hashCode());
        result = prime * result + ((getPetPhoto() == null) ? 0 : getPetPhoto().hashCode());
        result = prime * result + ((getPetWeight() == null) ? 0 : getPetWeight().hashCode());
        result = prime * result + ((getPetState() == null) ? 0 : getPetState().hashCode());
        result = prime * result + ((getPetSpare() == null) ? 0 : getPetSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", petId=").append(petId);
        sb.append(", custId=").append(custId);
        sb.append(", petMateState=").append(petMateState);
        sb.append(", petName=").append(petName);
        sb.append(", petGender=").append(petGender);
        sb.append(", petAge=").append(petAge);
        sb.append(", petTypeId=").append(petTypeId);
        sb.append(", petPhoto=").append(petPhoto);
        sb.append(", petWeight=").append(petWeight);
        sb.append(", petState=").append(petState);
        sb.append(", petSpare=").append(petSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}