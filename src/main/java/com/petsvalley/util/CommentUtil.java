package com.petsvalley.util;

import com.petsvalley.entity.Comment;
import com.petsvalley.entity.Customer;
import com.petsvalley.entity.Img;

import java.util.List;

public class CommentUtil {
    private Comment comment;
    private Customer customer;
    private CommentUtil commentUtil;


    @Override
    public String toString() {
        return "CommentUtil{" +
                "comment=" + comment +
                ", customer=" + customer +
                ", commentUtil=" + commentUtil +
                '}';
    }

    public CommentUtil getCommentUtil() {
        return commentUtil;
    }

    public void setCommentUtil(CommentUtil commentUtil) {
        this.commentUtil = commentUtil;
    }


    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
