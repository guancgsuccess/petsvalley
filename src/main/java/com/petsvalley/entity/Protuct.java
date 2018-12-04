package com.petsvalley.entity;

import java.io.Serializable;

/**
 * protuct
 * @author 
 */
public class Protuct implements Serializable {
    /**
     * 商品推荐ID
     */
    private Integer proId;

    /**
     * 商品名称
     */
    private String proName;

    /**
     * 商品类型
     */
    private String proType;

    /**
     * 商品信息
     */
    private String proMessage;

    /**
     * 商品市场价格
     */
    private Double proPrice;

    /**
     * 商品图片
     */
    private String proPhoto;

    /**
     * 购买方式
     */
    private String proBuy;

    /**
     * 状态
     */
    private Integer proState;

    private String proSpare;

    private static final long serialVersionUID = 1L;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getProMessage() {
        return proMessage;
    }

    public void setProMessage(String proMessage) {
        this.proMessage = proMessage;
    }

    public Double getProPrice() {
        return proPrice;
    }

    public void setProPrice(Double proPrice) {
        this.proPrice = proPrice;
    }

    public String getProPhoto() {
        return proPhoto;
    }

    public void setProPhoto(String proPhoto) {
        this.proPhoto = proPhoto;
    }

    public String getProBuy() {
        return proBuy;
    }

    public void setProBuy(String proBuy) {
        this.proBuy = proBuy;
    }

    public Integer getProState() {
        return proState;
    }

    public void setProState(Integer proState) {
        this.proState = proState;
    }

    public String getProSpare() {
        return proSpare;
    }

    public void setProSpare(String proSpare) {
        this.proSpare = proSpare;
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
        Protuct other = (Protuct) that;
        return (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getProName() == null ? other.getProName() == null : this.getProName().equals(other.getProName()))
            && (this.getProType() == null ? other.getProType() == null : this.getProType().equals(other.getProType()))
            && (this.getProMessage() == null ? other.getProMessage() == null : this.getProMessage().equals(other.getProMessage()))
            && (this.getProPrice() == null ? other.getProPrice() == null : this.getProPrice().equals(other.getProPrice()))
            && (this.getProPhoto() == null ? other.getProPhoto() == null : this.getProPhoto().equals(other.getProPhoto()))
            && (this.getProBuy() == null ? other.getProBuy() == null : this.getProBuy().equals(other.getProBuy()))
            && (this.getProState() == null ? other.getProState() == null : this.getProState().equals(other.getProState()))
            && (this.getProSpare() == null ? other.getProSpare() == null : this.getProSpare().equals(other.getProSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getProName() == null) ? 0 : getProName().hashCode());
        result = prime * result + ((getProType() == null) ? 0 : getProType().hashCode());
        result = prime * result + ((getProMessage() == null) ? 0 : getProMessage().hashCode());
        result = prime * result + ((getProPrice() == null) ? 0 : getProPrice().hashCode());
        result = prime * result + ((getProPhoto() == null) ? 0 : getProPhoto().hashCode());
        result = prime * result + ((getProBuy() == null) ? 0 : getProBuy().hashCode());
        result = prime * result + ((getProState() == null) ? 0 : getProState().hashCode());
        result = prime * result + ((getProSpare() == null) ? 0 : getProSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proId=").append(proId);
        sb.append(", proName=").append(proName);
        sb.append(", proType=").append(proType);
        sb.append(", proMessage=").append(proMessage);
        sb.append(", proPrice=").append(proPrice);
        sb.append(", proPhoto=").append(proPhoto);
        sb.append(", proBuy=").append(proBuy);
        sb.append(", proState=").append(proState);
        sb.append(", proSpare=").append(proSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}