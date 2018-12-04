package com.petsvalley.entity;

import java.io.Serializable;

/**
 * after_sale_service
 * @author 
 */
public class AfterSaleService implements Serializable {
    /**
     * 售后服务ID
     */
    private Integer assId;

    /**
     * 用户ID
     */
    private Integer custId;

    /**
     * 服务内容
     */
    private String assDetails;

    /**
     * 服务状态
     */
    private Integer assState;

    /**
     * 服务结果评价
     */
    private String assEvaluate;

    private String assSpare;

    private static final long serialVersionUID = 1L;

    public Integer getAssId() {
        return assId;
    }

    public void setAssId(Integer assId) {
        this.assId = assId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getAssDetails() {
        return assDetails;
    }

    public void setAssDetails(String assDetails) {
        this.assDetails = assDetails;
    }

    public Integer getAssState() {
        return assState;
    }

    public void setAssState(Integer assState) {
        this.assState = assState;
    }

    public String getAssEvaluate() {
        return assEvaluate;
    }

    public void setAssEvaluate(String assEvaluate) {
        this.assEvaluate = assEvaluate;
    }

    public String getAssSpare() {
        return assSpare;
    }

    public void setAssSpare(String assSpare) {
        this.assSpare = assSpare;
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
        AfterSaleService other = (AfterSaleService) that;
        return (this.getAssId() == null ? other.getAssId() == null : this.getAssId().equals(other.getAssId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getAssDetails() == null ? other.getAssDetails() == null : this.getAssDetails().equals(other.getAssDetails()))
            && (this.getAssState() == null ? other.getAssState() == null : this.getAssState().equals(other.getAssState()))
            && (this.getAssEvaluate() == null ? other.getAssEvaluate() == null : this.getAssEvaluate().equals(other.getAssEvaluate()))
            && (this.getAssSpare() == null ? other.getAssSpare() == null : this.getAssSpare().equals(other.getAssSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAssId() == null) ? 0 : getAssId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getAssDetails() == null) ? 0 : getAssDetails().hashCode());
        result = prime * result + ((getAssState() == null) ? 0 : getAssState().hashCode());
        result = prime * result + ((getAssEvaluate() == null) ? 0 : getAssEvaluate().hashCode());
        result = prime * result + ((getAssSpare() == null) ? 0 : getAssSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", assId=").append(assId);
        sb.append(", custId=").append(custId);
        sb.append(", assDetails=").append(assDetails);
        sb.append(", assState=").append(assState);
        sb.append(", assEvaluate=").append(assEvaluate);
        sb.append(", assSpare=").append(assSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}