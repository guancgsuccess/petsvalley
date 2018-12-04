package com.petsvalley.util;

import com.petsvalley.entity.Comment;
import com.petsvalley.entity.Customer;

import java.util.List;

public class CommFloorUtil {
    private Comment comment;
    private Customer customer;
    private Integer floorCount;
    private List<CommentUtil> commentUtilList;

    public Integer getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(Integer floorCount) {
        this.floorCount = floorCount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public List<CommentUtil> getCommentUtilList() {
        return commentUtilList;
    }

    public void setCommentUtilList(List<CommentUtil> commentUtilList) {
        this.commentUtilList = commentUtilList;
    }

    @Override
    public String toString() {
        return "CommFloorUtil{" +
                "comment=" + comment +
                ", customer=" + customer +
                ", floorCount=" + floorCount +
                ", commentUtilList=" + commentUtilList +
                '}';
    }
}
