package com.petsvalley.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * post
 * @author 
 */
public class Post implements Serializable {
    /**
     * 帖子ID
     */
    private Integer postId;

    /**
     * 用户ID
     */
    private Integer custId;

    /**
     * 帖子标题
     */
    private String postTitle;

    /**
     * 帖子内容
     */
    private String postContent;

    /**
     * 发表时间
     */
    private Date postTime;

    /**
     * 点赞数
     */
    private Integer postCount;

    /**
     * 图片
     */
    private String postPhoto;

    /**
     * 状态
     */
    private Integer postState;

    private String postSpare;

    private static final long serialVersionUID = 1L;

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

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public Integer getPostCount() {
        return postCount;
    }

    public void setPostCount(Integer postCount) {
        this.postCount = postCount;
    }

    public String getPostPhoto() {
        return postPhoto;
    }

    public void setPostPhoto(String postPhoto) {
        this.postPhoto = postPhoto;
    }

    public Integer getPostState() {
        return postState;
    }

    public void setPostState(Integer postState) {
        this.postState = postState;
    }

    public String getPostSpare() {
        return postSpare;
    }

    public void setPostSpare(String postSpare) {
        this.postSpare = postSpare;
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
        Post other = (Post) that;
        return (this.getPostId() == null ? other.getPostId() == null : this.getPostId().equals(other.getPostId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getPostTitle() == null ? other.getPostTitle() == null : this.getPostTitle().equals(other.getPostTitle()))
            && (this.getPostContent() == null ? other.getPostContent() == null : this.getPostContent().equals(other.getPostContent()))
            && (this.getPostTime() == null ? other.getPostTime() == null : this.getPostTime().equals(other.getPostTime()))
            && (this.getPostCount() == null ? other.getPostCount() == null : this.getPostCount().equals(other.getPostCount()))
            && (this.getPostPhoto() == null ? other.getPostPhoto() == null : this.getPostPhoto().equals(other.getPostPhoto()))
            && (this.getPostState() == null ? other.getPostState() == null : this.getPostState().equals(other.getPostState()))
            && (this.getPostSpare() == null ? other.getPostSpare() == null : this.getPostSpare().equals(other.getPostSpare()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPostId() == null) ? 0 : getPostId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getPostTitle() == null) ? 0 : getPostTitle().hashCode());
        result = prime * result + ((getPostContent() == null) ? 0 : getPostContent().hashCode());
        result = prime * result + ((getPostTime() == null) ? 0 : getPostTime().hashCode());
        result = prime * result + ((getPostCount() == null) ? 0 : getPostCount().hashCode());
        result = prime * result + ((getPostPhoto() == null) ? 0 : getPostPhoto().hashCode());
        result = prime * result + ((getPostState() == null) ? 0 : getPostState().hashCode());
        result = prime * result + ((getPostSpare() == null) ? 0 : getPostSpare().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postId=").append(postId);
        sb.append(", custId=").append(custId);
        sb.append(", postTitle=").append(postTitle);
        sb.append(", postContent=").append(postContent);
        sb.append(", postTime=").append(postTime);
        sb.append(", postCount=").append(postCount);
        sb.append(", postPhoto=").append(postPhoto);
        sb.append(", postState=").append(postState);
        sb.append(", postSpare=").append(postSpare);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}