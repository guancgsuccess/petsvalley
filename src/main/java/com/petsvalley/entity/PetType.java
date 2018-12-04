package com.petsvalley.entity;

import java.io.Serializable;

/**
 * pet_type
 * @author 
 */
public class PetType implements Serializable {
    /**
     * 种类ID
     */
    private Integer typeId;

    /**
     * 种类名称
     */
    private String typeName;

    /**
     * 种类状态
     */
    private Integer typeState;

    /**
     * 科类ID
     */
    private Integer discId;

    private String typeSpare;

    private static final long serialVersionUID = 1L;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getTypeState() {
        return typeState;
    }

    public void setTypeState(Integer typeState) {
        this.typeState = typeState;
    }

    public Integer getDiscId() {
        return discId;
    }

    public void setDiscId(Integer discId) {
        this.discId = discId;
    }

    public String getTypeSpare() {
        return typeSpare;
    }

    public void setTypeSpare(String typeSpare) {
        this.typeSpare = typeSpare;
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
        PetType other = (PetType) that;
        return (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getTypeName() == null ? other.getTypeName() == null : this.getTypeName().equals(other.getTypeName()))
            && (this.getTypeState() == null ? other.getTypeState() == null : this.getTypeState().equals(other.getTypeState()))
            && (this.getDiscId() == null ? other.getDiscId() == null : this.getDiscId().equals(other.getDiscId()))
            && (this.getTypeSpare() == null ? other.getTypeSpare() == null : this.getTypeSpare().equals(other.getTypeSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        result = prime * result + ((getTypeState() == null) ? 0 : getTypeState().hashCode());
        result = prime * result + ((getDiscId() == null) ? 0 : getDiscId().hashCode());
        result = prime * result + ((getTypeSpare() == null) ? 0 : getTypeSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", typeId=").append(typeId);
        sb.append(", typeName=").append(typeName);
        sb.append(", typeState=").append(typeState);
        sb.append(", discId=").append(discId);
        sb.append(", typeSpare=").append(typeSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}