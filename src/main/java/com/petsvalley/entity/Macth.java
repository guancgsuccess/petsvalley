package com.petsvalley.entity;

import java.io.Serializable;

/**
 * macth
 * @author 
 */
public class Macth implements Serializable {
    /**
     * 匹配ID
     */
    private Integer macId;

    /**
     * 宠物ID
     */
    private Integer petId;

    /**
     * 配偶ID
     */
    private Integer couplePetId;

    /**
     * 伙伴ID
     */
    private Integer partnerPetId;

    /**
     * 配偶用户ID
     */
    private Integer coupleCustId;

    /**
     * 伙伴用户ID
     */
    private Integer partnerCustId;

    /**
     * 配偶匹配状态
     */
    private Integer coupleMacState;

    /**
     * 伙伴匹配状态
     */
    private Integer partnerMacState;

    private String macthSpare;

    private static final long serialVersionUID = 1L;

    public Integer getMacId() {
        return macId;
    }

    public void setMacId(Integer macId) {
        this.macId = macId;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Integer getCouplePetId() {
        return couplePetId;
    }

    public void setCouplePetId(Integer couplePetId) {
        this.couplePetId = couplePetId;
    }

    public Integer getPartnerPetId() {
        return partnerPetId;
    }

    public void setPartnerPetId(Integer partnerPetId) {
        this.partnerPetId = partnerPetId;
    }

    public Integer getCoupleCustId() {
        return coupleCustId;
    }

    public void setCoupleCustId(Integer coupleCustId) {
        this.coupleCustId = coupleCustId;
    }

    public Integer getPartnerCustId() {
        return partnerCustId;
    }

    public void setPartnerCustId(Integer partnerCustId) {
        this.partnerCustId = partnerCustId;
    }

    public Integer getCoupleMacState() {
        return coupleMacState;
    }

    public void setCoupleMacState(Integer coupleMacState) {
        this.coupleMacState = coupleMacState;
    }

    public Integer getPartnerMacState() {
        return partnerMacState;
    }

    public void setPartnerMacState(Integer partnerMacState) {
        this.partnerMacState = partnerMacState;
    }

    public String getMacthSpare() {
        return macthSpare;
    }

    public void setMacthSpare(String macthSpare) {
        this.macthSpare = macthSpare;
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
        Macth other = (Macth) that;
        return (this.getMacId() == null ? other.getMacId() == null : this.getMacId().equals(other.getMacId()))
            && (this.getPetId() == null ? other.getPetId() == null : this.getPetId().equals(other.getPetId()))
            && (this.getCouplePetId() == null ? other.getCouplePetId() == null : this.getCouplePetId().equals(other.getCouplePetId()))
            && (this.getPartnerPetId() == null ? other.getPartnerPetId() == null : this.getPartnerPetId().equals(other.getPartnerPetId()))
            && (this.getCoupleCustId() == null ? other.getCoupleCustId() == null : this.getCoupleCustId().equals(other.getCoupleCustId()))
            && (this.getPartnerCustId() == null ? other.getPartnerCustId() == null : this.getPartnerCustId().equals(other.getPartnerCustId()))
            && (this.getCoupleMacState() == null ? other.getCoupleMacState() == null : this.getCoupleMacState().equals(other.getCoupleMacState()))
            && (this.getPartnerMacState() == null ? other.getPartnerMacState() == null : this.getPartnerMacState().equals(other.getPartnerMacState()))
            && (this.getMacthSpare() == null ? other.getMacthSpare() == null : this.getMacthSpare().equals(other.getMacthSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMacId() == null) ? 0 : getMacId().hashCode());
        result = prime * result + ((getPetId() == null) ? 0 : getPetId().hashCode());
        result = prime * result + ((getCouplePetId() == null) ? 0 : getCouplePetId().hashCode());
        result = prime * result + ((getPartnerPetId() == null) ? 0 : getPartnerPetId().hashCode());
        result = prime * result + ((getCoupleCustId() == null) ? 0 : getCoupleCustId().hashCode());
        result = prime * result + ((getPartnerCustId() == null) ? 0 : getPartnerCustId().hashCode());
        result = prime * result + ((getCoupleMacState() == null) ? 0 : getCoupleMacState().hashCode());
        result = prime * result + ((getPartnerMacState() == null) ? 0 : getPartnerMacState().hashCode());
        result = prime * result + ((getMacthSpare() == null) ? 0 : getMacthSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", macId=").append(macId);
        sb.append(", petId=").append(petId);
        sb.append(", couplePetId=").append(couplePetId);
        sb.append(", partnerPetId=").append(partnerPetId);
        sb.append(", coupleCustId=").append(coupleCustId);
        sb.append(", partnerCustId=").append(partnerCustId);
        sb.append(", coupleMacState=").append(coupleMacState);
        sb.append(", partnerMacState=").append(partnerMacState);
        sb.append(", macthSpare=").append(macthSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}