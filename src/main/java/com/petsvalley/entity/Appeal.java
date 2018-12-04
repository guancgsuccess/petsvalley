package com.petsvalley.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * appeal
 * @author 
 */
public class Appeal implements Serializable {
    /**
     * 申诉ID
     */
    private Integer aplId;

    /**
     * 申诉时间
     */
    private Date aplTime;

    /**
     * 处罚ID
     */
    private Integer punId;

    /**
     * 受理结果
     */
    private String aplResult;

    /**
     * 受理时间
     */
    private Date resultTime;

    /**
     * 受理人
     */
    private Integer custId;

    /**
     * 受理状态
     */
    private Integer aplState;

    private String appealSpare;

    private static final long serialVersionUID = 1L;

    public Integer getAplId() {
        return aplId;
    }

    public void setAplId(Integer aplId) {
        this.aplId = aplId;
    }

    public Date getAplTime() {
        return aplTime;
    }

    public void setAplTime(Date aplTime) {
        this.aplTime = aplTime;
    }

    public Integer getPunId() {
        return punId;
    }

    public void setPunId(Integer punId) {
        this.punId = punId;
    }

    public String getAplResult() {
        return aplResult;
    }

    public void setAplResult(String aplResult) {
        this.aplResult = aplResult;
    }

    public Date getResultTime() {
        return resultTime;
    }

    public void setResultTime(Date resultTime) {
        this.resultTime = resultTime;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getAplState() {
        return aplState;
    }

    public void setAplState(Integer aplState) {
        this.aplState = aplState;
    }

    public String getAppealSpare() {
        return appealSpare;
    }

    public void setAppealSpare(String appealSpare) {
        this.appealSpare = appealSpare;
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
        Appeal other = (Appeal) that;
        return (this.getAplId() == null ? other.getAplId() == null : this.getAplId().equals(other.getAplId()))
            && (this.getAplTime() == null ? other.getAplTime() == null : this.getAplTime().equals(other.getAplTime()))
            && (this.getPunId() == null ? other.getPunId() == null : this.getPunId().equals(other.getPunId()))
            && (this.getAplResult() == null ? other.getAplResult() == null : this.getAplResult().equals(other.getAplResult()))
            && (this.getResultTime() == null ? other.getResultTime() == null : this.getResultTime().equals(other.getResultTime()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getAplState() == null ? other.getAplState() == null : this.getAplState().equals(other.getAplState()))
            && (this.getAppealSpare() == null ? other.getAppealSpare() == null : this.getAppealSpare().equals(other.getAppealSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAplId() == null) ? 0 : getAplId().hashCode());
        result = prime * result + ((getAplTime() == null) ? 0 : getAplTime().hashCode());
        result = prime * result + ((getPunId() == null) ? 0 : getPunId().hashCode());
        result = prime * result + ((getAplResult() == null) ? 0 : getAplResult().hashCode());
        result = prime * result + ((getResultTime() == null) ? 0 : getResultTime().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getAplState() == null) ? 0 : getAplState().hashCode());
        result = prime * result + ((getAppealSpare() == null) ? 0 : getAppealSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aplId=").append(aplId);
        sb.append(", aplTime=").append(aplTime);
        sb.append(", punId=").append(punId);
        sb.append(", aplResult=").append(aplResult);
        sb.append(", resultTime=").append(resultTime);
        sb.append(", custId=").append(custId);
        sb.append(", aplState=").append(aplState);
        sb.append(", appealSpare=").append(appealSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}