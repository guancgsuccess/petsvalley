package com.petsvalley.entity;

import java.io.Serializable;

/**
 * disc
 * @author 
 */
public class Disc implements Serializable {
    /**
     * 科类ID
     */
    private Integer discId;

    /**
     * 科类名
     */
    private String discName;

    /**
     * 科类状态
     */
    private Integer discState;

    private String discSpare;

    private static final long serialVersionUID = 1L;

    public Integer getDiscId() {
        return discId;
    }

    public void setDiscId(Integer discId) {
        this.discId = discId;
    }

    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public Integer getDiscState() {
        return discState;
    }

    public void setDiscState(Integer discState) {
        this.discState = discState;
    }

    public String getDiscSpare() {
        return discSpare;
    }

    public void setDiscSpare(String discSpare) {
        this.discSpare = discSpare;
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
        Disc other = (Disc) that;
        return (this.getDiscId() == null ? other.getDiscId() == null : this.getDiscId().equals(other.getDiscId()))
            && (this.getDiscName() == null ? other.getDiscName() == null : this.getDiscName().equals(other.getDiscName()))
            && (this.getDiscState() == null ? other.getDiscState() == null : this.getDiscState().equals(other.getDiscState()))
            && (this.getDiscSpare() == null ? other.getDiscSpare() == null : this.getDiscSpare().equals(other.getDiscSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDiscId() == null) ? 0 : getDiscId().hashCode());
        result = prime * result + ((getDiscName() == null) ? 0 : getDiscName().hashCode());
        result = prime * result + ((getDiscState() == null) ? 0 : getDiscState().hashCode());
        result = prime * result + ((getDiscSpare() == null) ? 0 : getDiscSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", discId=").append(discId);
        sb.append(", discName=").append(discName);
        sb.append(", discState=").append(discState);
        sb.append(", discSpare=").append(discSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}