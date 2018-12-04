package com.petsvalley.entity;

import java.io.Serializable;

/**
 * regulations
 * @author 
 */
public class Regulations implements Serializable {
    /**
     * 规定ID
     */
    private Integer regId;

    /**
     * 规定内容
     */
    private String regContent;

    /**
     * 法规标题
     */
    private String regTitle;

    /**
     * 相关部门
     */
    private String regDepartment;

    /**
     * 处罚内容
     */
    private String punContent;

    /**
     * 状态
     */
    private Integer regState;

    private String regSpare;

    private static final long serialVersionUID = 1L;

    public Integer getRegId() {
        return regId;
    }

    public void setRegId(Integer regId) {
        this.regId = regId;
    }

    public String getRegContent() {
        return regContent;
    }

    public void setRegContent(String regContent) {
        this.regContent = regContent;
    }

    public String getRegTitle() {
        return regTitle;
    }

    public void setRegTitle(String regTitle) {
        this.regTitle = regTitle;
    }

    public String getRegDepartment() {
        return regDepartment;
    }

    public void setRegDepartment(String regDepartment) {
        this.regDepartment = regDepartment;
    }

    public String getPunContent() {
        return punContent;
    }

    public void setPunContent(String punContent) {
        this.punContent = punContent;
    }

    public Integer getRegState() {
        return regState;
    }

    public void setRegState(Integer regState) {
        this.regState = regState;
    }

    public String getRegSpare() {
        return regSpare;
    }

    public void setRegSpare(String regSpare) {
        this.regSpare = regSpare;
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
        Regulations other = (Regulations) that;
        return (this.getRegId() == null ? other.getRegId() == null : this.getRegId().equals(other.getRegId()))
            && (this.getRegContent() == null ? other.getRegContent() == null : this.getRegContent().equals(other.getRegContent()))
            && (this.getRegTitle() == null ? other.getRegTitle() == null : this.getRegTitle().equals(other.getRegTitle()))
            && (this.getRegDepartment() == null ? other.getRegDepartment() == null : this.getRegDepartment().equals(other.getRegDepartment()))
            && (this.getPunContent() == null ? other.getPunContent() == null : this.getPunContent().equals(other.getPunContent()))
            && (this.getRegState() == null ? other.getRegState() == null : this.getRegState().equals(other.getRegState()))
            && (this.getRegSpare() == null ? other.getRegSpare() == null : this.getRegSpare().equals(other.getRegSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRegId() == null) ? 0 : getRegId().hashCode());
        result = prime * result + ((getRegContent() == null) ? 0 : getRegContent().hashCode());
        result = prime * result + ((getRegTitle() == null) ? 0 : getRegTitle().hashCode());
        result = prime * result + ((getRegDepartment() == null) ? 0 : getRegDepartment().hashCode());
        result = prime * result + ((getPunContent() == null) ? 0 : getPunContent().hashCode());
        result = prime * result + ((getRegState() == null) ? 0 : getRegState().hashCode());
        result = prime * result + ((getRegSpare() == null) ? 0 : getRegSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", regId=").append(regId);
        sb.append(", regContent=").append(regContent);
        sb.append(", regTitle=").append(regTitle);
        sb.append(", regDepartment=").append(regDepartment);
        sb.append(", punContent=").append(punContent);
        sb.append(", regState=").append(regState);
        sb.append(", regSpare=").append(regSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}