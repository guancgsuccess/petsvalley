package com.petsvalley.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * service
 * @author 
 */
public class Service implements Serializable {
    /**
     * 服务ID
     */
    private Integer serviceId;

    /**
     * 服务标题
     */
    private String serviceTitle;

    /**
     * 服务内容
     */
    private String serviceContent;

    /**
     * 积分奖励
     */
    private Integer serviceReward;

    /**
     * 需求人数
     */
    private Integer serviceNo;

    /**
     * 发布日期
     */
    private Date serviceTime;

    /**
     * 状态
     */
    private Integer serviceState;

    private String serviceSpare;

    private static final long serialVersionUID = 1L;

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceTitle() {
        return serviceTitle;
    }

    public void setServiceTitle(String serviceTitle) {
        this.serviceTitle = serviceTitle;
    }

    public String getServiceContent() {
        return serviceContent;
    }

    public void setServiceContent(String serviceContent) {
        this.serviceContent = serviceContent;
    }

    public Integer getServiceReward() {
        return serviceReward;
    }

    public void setServiceReward(Integer serviceReward) {
        this.serviceReward = serviceReward;
    }

    public Integer getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Integer serviceNo) {
        this.serviceNo = serviceNo;
    }

    public Date getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(Date serviceTime) {
        this.serviceTime = serviceTime;
    }

    public Integer getServiceState() {
        return serviceState;
    }

    public void setServiceState(Integer serviceState) {
        this.serviceState = serviceState;
    }

    public String getServiceSpare() {
        return serviceSpare;
    }

    public void setServiceSpare(String serviceSpare) {
        this.serviceSpare = serviceSpare;
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
        Service other = (Service) that;
        return (this.getServiceId() == null ? other.getServiceId() == null : this.getServiceId().equals(other.getServiceId()))
            && (this.getServiceTitle() == null ? other.getServiceTitle() == null : this.getServiceTitle().equals(other.getServiceTitle()))
            && (this.getServiceContent() == null ? other.getServiceContent() == null : this.getServiceContent().equals(other.getServiceContent()))
            && (this.getServiceReward() == null ? other.getServiceReward() == null : this.getServiceReward().equals(other.getServiceReward()))
            && (this.getServiceNo() == null ? other.getServiceNo() == null : this.getServiceNo().equals(other.getServiceNo()))
            && (this.getServiceTime() == null ? other.getServiceTime() == null : this.getServiceTime().equals(other.getServiceTime()))
            && (this.getServiceState() == null ? other.getServiceState() == null : this.getServiceState().equals(other.getServiceState()))
            && (this.getServiceSpare() == null ? other.getServiceSpare() == null : this.getServiceSpare().equals(other.getServiceSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        result = prime * result + ((getServiceTitle() == null) ? 0 : getServiceTitle().hashCode());
        result = prime * result + ((getServiceContent() == null) ? 0 : getServiceContent().hashCode());
        result = prime * result + ((getServiceReward() == null) ? 0 : getServiceReward().hashCode());
        result = prime * result + ((getServiceNo() == null) ? 0 : getServiceNo().hashCode());
        result = prime * result + ((getServiceTime() == null) ? 0 : getServiceTime().hashCode());
        result = prime * result + ((getServiceState() == null) ? 0 : getServiceState().hashCode());
        result = prime * result + ((getServiceSpare() == null) ? 0 : getServiceSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serviceId=").append(serviceId);
        sb.append(", serviceTitle=").append(serviceTitle);
        sb.append(", serviceContent=").append(serviceContent);
        sb.append(", serviceReward=").append(serviceReward);
        sb.append(", serviceNo=").append(serviceNo);
        sb.append(", serviceTime=").append(serviceTime);
        sb.append(", serviceState=").append(serviceState);
        sb.append(", serviceSpare=").append(serviceSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}