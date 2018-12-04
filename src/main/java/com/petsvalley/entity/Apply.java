package com.petsvalley.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * apply
 * @author 
 */
public class Apply implements Serializable {
    /**
     * 申请表ID
     */
    private Integer applyId;

    /**
     * 服务ID
     */
    private Integer serviceId;

    /**
     * 领养寄养宠物ID
     */
    private Integer fosterId;

    /**
     * 申请用户ID
     */
    private Integer applyCustId;

    /**
     * 申请状态
     */
    private Integer applyState;

    /**
     * 申请时间
     */
    private Date applyTime;

    /**
     * 申请类别
     */
    private String applyClassify;

    /**
     * 审批进度
     */
    private String applySchedule;

    private String applySpare;

    private static final long serialVersionUID = 1L;

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getFosterId() {
        return fosterId;
    }

    public void setFosterId(Integer fosterId) {
        this.fosterId = fosterId;
    }

    public Integer getApplyCustId() {
        return applyCustId;
    }

    public void setApplyCustId(Integer applyCustId) {
        this.applyCustId = applyCustId;
    }

    public Integer getApplyState() {
        return applyState;
    }

    public void setApplyState(Integer applyState) {
        this.applyState = applyState;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getApplyClassify() {
        return applyClassify;
    }

    public void setApplyClassify(String applyClassify) {
        this.applyClassify = applyClassify;
    }

    public String getApplySchedule() {
        return applySchedule;
    }

    public void setApplySchedule(String applySchedule) {
        this.applySchedule = applySchedule;
    }

    public String getApplySpare() {
        return applySpare;
    }

    public void setApplySpare(String applySpare) {
        this.applySpare = applySpare;
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
        Apply other = (Apply) that;
        return (this.getApplyId() == null ? other.getApplyId() == null : this.getApplyId().equals(other.getApplyId()))
            && (this.getServiceId() == null ? other.getServiceId() == null : this.getServiceId().equals(other.getServiceId()))
            && (this.getFosterId() == null ? other.getFosterId() == null : this.getFosterId().equals(other.getFosterId()))
            && (this.getApplyCustId() == null ? other.getApplyCustId() == null : this.getApplyCustId().equals(other.getApplyCustId()))
            && (this.getApplyState() == null ? other.getApplyState() == null : this.getApplyState().equals(other.getApplyState()))
            && (this.getApplyTime() == null ? other.getApplyTime() == null : this.getApplyTime().equals(other.getApplyTime()))
            && (this.getApplyClassify() == null ? other.getApplyClassify() == null : this.getApplyClassify().equals(other.getApplyClassify()))
            && (this.getApplySchedule() == null ? other.getApplySchedule() == null : this.getApplySchedule().equals(other.getApplySchedule()))
            && (this.getApplySpare() == null ? other.getApplySpare() == null : this.getApplySpare().equals(other.getApplySpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApplyId() == null) ? 0 : getApplyId().hashCode());
        result = prime * result + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        result = prime * result + ((getFosterId() == null) ? 0 : getFosterId().hashCode());
        result = prime * result + ((getApplyCustId() == null) ? 0 : getApplyCustId().hashCode());
        result = prime * result + ((getApplyState() == null) ? 0 : getApplyState().hashCode());
        result = prime * result + ((getApplyTime() == null) ? 0 : getApplyTime().hashCode());
        result = prime * result + ((getApplyClassify() == null) ? 0 : getApplyClassify().hashCode());
        result = prime * result + ((getApplySchedule() == null) ? 0 : getApplySchedule().hashCode());
        result = prime * result + ((getApplySpare() == null) ? 0 : getApplySpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applyId=").append(applyId);
        sb.append(", serviceId=").append(serviceId);
        sb.append(", fosterId=").append(fosterId);
        sb.append(", applyCustId=").append(applyCustId);
        sb.append(", applyState=").append(applyState);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", applyClassify=").append(applyClassify);
        sb.append(", applySchedule=").append(applySchedule);
        sb.append(", applySpare=").append(applySpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}