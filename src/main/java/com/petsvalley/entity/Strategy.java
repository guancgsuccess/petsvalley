package com.petsvalley.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * strategy
 * @author 
 */
public class Strategy implements Serializable {
    /**
     * 攻略ID
     */
    private Integer straId;

    /**
     * 攻略类型
     */
    private String straType;

    /**
     * 攻略标题
     */
    private String straTitle;

    /**
     * 攻略内容
     */
    private String straMessage;

    /**
     * 攻略照片
     */
    private String straPhoto;

    /**
     * 发布日期
     */
    private Date straTime;

    /**
     * 状态
     */
    private Integer straState;

    private String straSpare;

    private static final long serialVersionUID = 1L;

    public Integer getStraId() {
        return straId;
    }

    public void setStraId(Integer straId) {
        this.straId = straId;
    }

    public String getStraType() {
        return straType;
    }

    public void setStraType(String straType) {
        this.straType = straType;
    }

    public String getStraTitle() {
        return straTitle;
    }

    public void setStraTitle(String straTitle) {
        this.straTitle = straTitle;
    }

    public String getStraMessage() {
        return straMessage;
    }

    public void setStraMessage(String straMessage) {
        this.straMessage = straMessage;
    }

    public String getStraPhoto() {
        return straPhoto;
    }

    public void setStraPhoto(String straPhoto) {
        this.straPhoto = straPhoto;
    }

    public Date getStraTime() {
        return straTime;
    }

    public void setStraTime(Date straTime) {
        this.straTime = straTime;
    }

    public Integer getStraState() {
        return straState;
    }

    public void setStraState(Integer straState) {
        this.straState = straState;
    }

    public String getStraSpare() {
        return straSpare;
    }

    public void setStraSpare(String straSpare) {
        this.straSpare = straSpare;
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
        Strategy other = (Strategy) that;
        return (this.getStraId() == null ? other.getStraId() == null : this.getStraId().equals(other.getStraId()))
            && (this.getStraType() == null ? other.getStraType() == null : this.getStraType().equals(other.getStraType()))
            && (this.getStraTitle() == null ? other.getStraTitle() == null : this.getStraTitle().equals(other.getStraTitle()))
            && (this.getStraMessage() == null ? other.getStraMessage() == null : this.getStraMessage().equals(other.getStraMessage()))
            && (this.getStraPhoto() == null ? other.getStraPhoto() == null : this.getStraPhoto().equals(other.getStraPhoto()))
            && (this.getStraTime() == null ? other.getStraTime() == null : this.getStraTime().equals(other.getStraTime()))
            && (this.getStraState() == null ? other.getStraState() == null : this.getStraState().equals(other.getStraState()))
            && (this.getStraSpare() == null ? other.getStraSpare() == null : this.getStraSpare().equals(other.getStraSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStraId() == null) ? 0 : getStraId().hashCode());
        result = prime * result + ((getStraType() == null) ? 0 : getStraType().hashCode());
        result = prime * result + ((getStraTitle() == null) ? 0 : getStraTitle().hashCode());
        result = prime * result + ((getStraMessage() == null) ? 0 : getStraMessage().hashCode());
        result = prime * result + ((getStraPhoto() == null) ? 0 : getStraPhoto().hashCode());
        result = prime * result + ((getStraTime() == null) ? 0 : getStraTime().hashCode());
        result = prime * result + ((getStraState() == null) ? 0 : getStraState().hashCode());
        result = prime * result + ((getStraSpare() == null) ? 0 : getStraSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", straId=").append(straId);
        sb.append(", straType=").append(straType);
        sb.append(", straTitle=").append(straTitle);
        sb.append(", straMessage=").append(straMessage);
        sb.append(", straPhoto=").append(straPhoto);
        sb.append(", straTime=").append(straTime);
        sb.append(", straState=").append(straState);
        sb.append(", straSpare=").append(straSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}