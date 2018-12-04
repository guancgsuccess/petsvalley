package com.petsvalley.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * comment
 * @author 
 */
public class Comment implements Serializable {
    /**
     * 评论ID
     */
    private Integer commId;

    /**
     * 帖子ID
     */
    private Integer postId;

    /**
     * 用户ID
     */
    private Integer custId;

    /**
     * 评论内容
     */
    private String commContent;

    /**
     * 评论时间
     */
    private Date commTime;

    /**
     * 状态
     */
    private Integer commState;

    private String commSpare;

    private static final long serialVersionUID = 1L;

    public Integer getCommId() {
        return commId;
    }

    public void setCommId(Integer commId) {
        this.commId = commId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCommContent() {
        return commContent;
    }

    public void setCommContent(String commContent) {
        this.commContent = commContent;
    }

    public Date getCommTime() {
        return commTime;
    }

    public void setCommTime(Date commTime) {
        this.commTime = commTime;
    }

    public Integer getCommState() {
        return commState;
    }

    public void setCommState(Integer commState) {
        this.commState = commState;
    }

    public String getCommSpare() {
        return commSpare;
    }

    public void setCommSpare(String commSpare) {
        this.commSpare = commSpare;
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
        Comment other = (Comment) that;
        return (this.getCommId() == null ? other.getCommId() == null : this.getCommId().equals(other.getCommId()))
            && (this.getPostId() == null ? other.getPostId() == null : this.getPostId().equals(other.getPostId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getCommContent() == null ? other.getCommContent() == null : this.getCommContent().equals(other.getCommContent()))
            && (this.getCommTime() == null ? other.getCommTime() == null : this.getCommTime().equals(other.getCommTime()))
            && (this.getCommState() == null ? other.getCommState() == null : this.getCommState().equals(other.getCommState()))
            && (this.getCommSpare() == null ? other.getCommSpare() == null : this.getCommSpare().equals(other.getCommSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommId() == null) ? 0 : getCommId().hashCode());
        result = prime * result + ((getPostId() == null) ? 0 : getPostId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getCommContent() == null) ? 0 : getCommContent().hashCode());
        result = prime * result + ((getCommTime() == null) ? 0 : getCommTime().hashCode());
        result = prime * result + ((getCommState() == null) ? 0 : getCommState().hashCode());
        result = prime * result + ((getCommSpare() == null) ? 0 : getCommSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commId=").append(commId);
        sb.append(", postId=").append(postId);
        sb.append(", custId=").append(custId);
        sb.append(", commContent=").append(commContent);
        sb.append(", commTime=").append(commTime);
        sb.append(", commState=").append(commState);
        sb.append(", commSpare=").append(commSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}