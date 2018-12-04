package com.petsvalley.entity;

import java.io.Serializable;

/**
 * img
 * @author 
 */
public class Img implements Serializable {
    private Integer imgId;

    private String path;

    private Integer imgState;

    /**
     * 0帖1寻2认3寄4领
     */
    private Integer imgType;

    private Integer custRole;

    private Integer custId;

    private Integer petId;

    private Integer postId;

    private Integer strategyId;

    private String imgSpare;

    private static final long serialVersionUID = 1L;

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getImgState() {
        return imgState;
    }

    public void setImgState(Integer imgState) {
        this.imgState = imgState;
    }

    public Integer getImgType() {
        return imgType;
    }

    public void setImgType(Integer imgType) {
        this.imgType = imgType;
    }

    public Integer getCustRole() {
        return custRole;
    }

    public void setCustRole(Integer custRole) {
        this.custRole = custRole;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Integer strategyId) {
        this.strategyId = strategyId;
    }

    public String getImgSpare() {
        return imgSpare;
    }

    public void setImgSpare(String imgSpare) {
        this.imgSpare = imgSpare;
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
        Img other = (Img) that;
        return (this.getImgId() == null ? other.getImgId() == null : this.getImgId().equals(other.getImgId()))
            && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
            && (this.getImgState() == null ? other.getImgState() == null : this.getImgState().equals(other.getImgState()))
            && (this.getImgType() == null ? other.getImgType() == null : this.getImgType().equals(other.getImgType()))
            && (this.getCustRole() == null ? other.getCustRole() == null : this.getCustRole().equals(other.getCustRole()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getPetId() == null ? other.getPetId() == null : this.getPetId().equals(other.getPetId()))
            && (this.getPostId() == null ? other.getPostId() == null : this.getPostId().equals(other.getPostId()))
            && (this.getStrategyId() == null ? other.getStrategyId() == null : this.getStrategyId().equals(other.getStrategyId()))
            && (this.getImgSpare() == null ? other.getImgSpare() == null : this.getImgSpare().equals(other.getImgSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getImgId() == null) ? 0 : getImgId().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        result = prime * result + ((getImgState() == null) ? 0 : getImgState().hashCode());
        result = prime * result + ((getImgType() == null) ? 0 : getImgType().hashCode());
        result = prime * result + ((getCustRole() == null) ? 0 : getCustRole().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getPetId() == null) ? 0 : getPetId().hashCode());
        result = prime * result + ((getPostId() == null) ? 0 : getPostId().hashCode());
        result = prime * result + ((getStrategyId() == null) ? 0 : getStrategyId().hashCode());
        result = prime * result + ((getImgSpare() == null) ? 0 : getImgSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", imgId=").append(imgId);
        sb.append(", path=").append(path);
        sb.append(", imgState=").append(imgState);
        sb.append(", imgType=").append(imgType);
        sb.append(", custRole=").append(custRole);
        sb.append(", custId=").append(custId);
        sb.append(", petId=").append(petId);
        sb.append(", postId=").append(postId);
        sb.append(", strategyId=").append(strategyId);
        sb.append(", imgSpare=").append(imgSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}