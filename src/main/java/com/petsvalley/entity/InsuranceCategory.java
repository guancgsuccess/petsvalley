package com.petsvalley.entity;

import java.io.Serializable;

/**
 * insurance_category
 * @author 
 */
public class InsuranceCategory implements Serializable {
    /**
     * 保险类别ID
     */
    private Integer icId;

    /**
     * 保险类别名称
     */
    private String icTypeName;

    /**
     * 保险内容
     */
    private String icContent;

    /**
     * 状态
     */
    private Integer icState;

    /**
     * 起保金额每年
     */
    private Double icMoney;

    private String icSpare;

    private static final long serialVersionUID = 1L;

    public Integer getIcId() {
        return icId;
    }

    public void setIcId(Integer icId) {
        this.icId = icId;
    }

    public String getIcTypeName() {
        return icTypeName;
    }

    public void setIcTypeName(String icTypeName) {
        this.icTypeName = icTypeName;
    }

    public String getIcContent() {
        return icContent;
    }

    public void setIcContent(String icContent) {
        this.icContent = icContent;
    }

    public Integer getIcState() {
        return icState;
    }

    public void setIcState(Integer icState) {
        this.icState = icState;
    }

    public Double getIcMoney() {
        return icMoney;
    }

    public void setIcMoney(Double icMoney) {
        this.icMoney = icMoney;
    }

    public String getIcSpare() {
        return icSpare;
    }

    public void setIcSpare(String icSpare) {
        this.icSpare = icSpare;
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
        InsuranceCategory other = (InsuranceCategory) that;
        return (this.getIcId() == null ? other.getIcId() == null : this.getIcId().equals(other.getIcId()))
            && (this.getIcTypeName() == null ? other.getIcTypeName() == null : this.getIcTypeName().equals(other.getIcTypeName()))
            && (this.getIcContent() == null ? other.getIcContent() == null : this.getIcContent().equals(other.getIcContent()))
            && (this.getIcState() == null ? other.getIcState() == null : this.getIcState().equals(other.getIcState()))
            && (this.getIcMoney() == null ? other.getIcMoney() == null : this.getIcMoney().equals(other.getIcMoney()))
            && (this.getIcSpare() == null ? other.getIcSpare() == null : this.getIcSpare().equals(other.getIcSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIcId() == null) ? 0 : getIcId().hashCode());
        result = prime * result + ((getIcTypeName() == null) ? 0 : getIcTypeName().hashCode());
        result = prime * result + ((getIcContent() == null) ? 0 : getIcContent().hashCode());
        result = prime * result + ((getIcState() == null) ? 0 : getIcState().hashCode());
        result = prime * result + ((getIcMoney() == null) ? 0 : getIcMoney().hashCode());
        result = prime * result + ((getIcSpare() == null) ? 0 : getIcSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", icId=").append(icId);
        sb.append(", icTypeName=").append(icTypeName);
        sb.append(", icContent=").append(icContent);
        sb.append(", icState=").append(icState);
        sb.append(", icMoney=").append(icMoney);
        sb.append(", icSpare=").append(icSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}