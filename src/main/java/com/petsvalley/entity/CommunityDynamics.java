package com.petsvalley.entity;

import java.io.Serializable;

/**
 * community_dynamics
 * @author 
 */
public class CommunityDynamics implements Serializable {
    /**
     * 健康表ID
     */
    private Integer cdId;

    /**
     * 宠物ID
     */
    private Integer petId;

    /**
     * 就医ID
     */
    private Integer docId;

    /**
     * 疫苗ID
     */
    private Integer vaccId;

    /**
     * 健康情况
     */
    private String cdDetatil;

    private String cdSpare;

    private static final long serialVersionUID = 1L;

    public Integer getCdId() {
        return cdId;
    }

    public void setCdId(Integer cdId) {
        this.cdId = cdId;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public Integer getVaccId() {
        return vaccId;
    }

    public void setVaccId(Integer vaccId) {
        this.vaccId = vaccId;
    }

    public String getCdDetatil() {
        return cdDetatil;
    }

    public void setCdDetatil(String cdDetatil) {
        this.cdDetatil = cdDetatil;
    }

    public String getCdSpare() {
        return cdSpare;
    }

    public void setCdSpare(String cdSpare) {
        this.cdSpare = cdSpare;
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
        CommunityDynamics other = (CommunityDynamics) that;
        return (this.getCdId() == null ? other.getCdId() == null : this.getCdId().equals(other.getCdId()))
            && (this.getPetId() == null ? other.getPetId() == null : this.getPetId().equals(other.getPetId()))
            && (this.getDocId() == null ? other.getDocId() == null : this.getDocId().equals(other.getDocId()))
            && (this.getVaccId() == null ? other.getVaccId() == null : this.getVaccId().equals(other.getVaccId()))
            && (this.getCdDetatil() == null ? other.getCdDetatil() == null : this.getCdDetatil().equals(other.getCdDetatil()))
            && (this.getCdSpare() == null ? other.getCdSpare() == null : this.getCdSpare().equals(other.getCdSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCdId() == null) ? 0 : getCdId().hashCode());
        result = prime * result + ((getPetId() == null) ? 0 : getPetId().hashCode());
        result = prime * result + ((getDocId() == null) ? 0 : getDocId().hashCode());
        result = prime * result + ((getVaccId() == null) ? 0 : getVaccId().hashCode());
        result = prime * result + ((getCdDetatil() == null) ? 0 : getCdDetatil().hashCode());
        result = prime * result + ((getCdSpare() == null) ? 0 : getCdSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cdId=").append(cdId);
        sb.append(", petId=").append(petId);
        sb.append(", docId=").append(docId);
        sb.append(", vaccId=").append(vaccId);
        sb.append(", cdDetatil=").append(cdDetatil);
        sb.append(", cdSpare=").append(cdSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}