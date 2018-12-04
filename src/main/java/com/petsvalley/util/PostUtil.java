package com.petsvalley.util;

import com.petsvalley.entity.Customer;
import com.petsvalley.entity.Img;
import com.petsvalley.entity.Post;

import java.util.List;

public class PostUtil {
    private Post post;
    private List<Img> imgList;
    private Customer customer;
    private Integer commentCount;
    private List<Post> postList;

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public List<Img> getImgList() {
        return imgList;
    }

    public void setImgList(List<Img> imgList) {
        this.imgList = imgList;
    }

    @Override
    public String toString() {
        return "PostUtil{" +
                "post=" + post +
                ", imgList=" + imgList +
                ", customer=" + customer +
                ", commentCount=" + commentCount +
                '}';
    }
}
