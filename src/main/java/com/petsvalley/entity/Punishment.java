package com.petsvalley.entity;

import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * punishment
 * @author 
 */
public class Punishment implements Serializable {
    /**
     * 处罚ID
     */
    private Integer punId;

    /**
     * 用户ID
     */
    private Integer custId;

    /**
     * 规定ID
     */
    private Integer regId;

    /**
     * 违规时间
     */
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date irregularitiesTime;

    /**
     * 处罚时间
     */
    private Date punTime;

    /**
     * 处罚内容
     */
    private String punContent;

    /**
     * 处罚结果
     */
    private String punResult;

    /**
     * 状态
     */
    private Integer punState;

    private String punSpare;

    private static final long serialVersionUID = 1L;

    public Integer getPunId() {
        return punId;
    }

    public void setPunId(Integer punId) {
        this.punId = punId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getRegId() {
        return regId;
    }

    public void setRegId(Integer regId) {
        this.regId = regId;
    }

    public Date getIrregularitiesTime() {
        return irregularitiesTime;
    }

    public void setIrregularitiesTime(Date irregularitiesTime) {
        this.irregularitiesTime = irregularitiesTime;
    }

    public Date getPunTime() {
        return punTime;
    }

    public void setPunTime(Date punTime) {
        this.punTime = punTime;
    }

    public String getPunContent() {
        return punContent;
    }

    public void setPunContent(String punContent) {
        this.punContent = punContent;
    }

    public String getPunResult() {
        return punResult;
    }

    public void setPunResult(String punResult) {
        this.punResult = punResult;
    }

    public Integer getPunState() {
        return punState;
    }

    public void setPunState(Integer punState) {
        this.punState = punState;
    }

    public String getPunSpare() {
        return punSpare;
    }

    public void setPunSpare(String punSpare) {
        this.punSpare = punSpare;
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
        Punishment other = (Punishment) that;
        return (this.getPunId() == null ? other.getPunId() == null : this.getPunId().equals(other.getPunId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getIrregularitiesTime() == null ? other.getIrregularitiesTime() == null : this.getIrregularitiesTime().equals(other.getIrregularitiesTime()))
            && (this.getPunTime() == null ? other.getPunTime() == null : this.getPunTime().equals(other.getPunTime()))
            && (this.getPunContent() == null ? other.getPunContent() == null : this.getPunContent().equals(other.getPunContent()))
            && (this.getPunResult() == null ? other.getPunResult() == null : this.getPunResult().equals(other.getPunResult()))
            && (this.getPunState() == null ? other.getPunState() == null : this.getPunState().equals(other.getPunState()))
            && (this.getPunSpare() == null ? other.getPunSpare() == null : this.getPunSpare().equals(other.getPunSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPunId() == null) ? 0 : getPunId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getIrregularitiesTime() == null) ? 0 : getIrregularitiesTime().hashCode());
        result = prime * result + ((getPunTime() == null) ? 0 : getPunTime().hashCode());
        result = prime * result + ((getPunContent() == null) ? 0 : getPunContent().hashCode());
        result = prime * result + ((getPunResult() == null) ? 0 : getPunResult().hashCode());
        result = prime * result + ((getPunState() == null) ? 0 : getPunState().hashCode());
        result = prime * result + ((getPunSpare() == null) ? 0 : getPunSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", punId=").append(punId);
        sb.append(", custId=").append(custId);
        sb.append(", regId=").append(regId);
        sb.append(", irregularitiesTime=").append(irregularitiesTime);
        sb.append(", punTime=").append(punTime);
        sb.append(", punContent=").append(punContent);
        sb.append(", punResult=").append(punResult);
        sb.append(", punState=").append(punState);
        sb.append(", punSpare=").append(punSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}