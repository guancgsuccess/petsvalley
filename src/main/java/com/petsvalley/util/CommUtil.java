package com.petsvalley.util;

import com.petsvalley.entity.Post;

import java.util.List;

public class CommUtil {
    private PostUtil postUtil;
    private List<Post> postList;
    private List<CommFloorUtil> commFloorUtilList;
    private Integer postRecord;

    public Integer getPostRecord() {
        return postRecord;
    }

    public void setPostRecord(Integer postRecord) {
        this.postRecord = postRecord;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    public PostUtil getPostUtil() {
        return postUtil;
    }

    public void setPostUtil(PostUtil postUtil) {
        this.postUtil = postUtil;
    }

    @Override
    public String toString() {
        return "CommUtil{" +
                "postUtil=" + postUtil +
                ", commFloorUtilList=" + commFloorUtilList +
                '}';
    }

    public List<CommFloorUtil> getCommFloorUtilList() {
        return commFloorUtilList;
    }

    public void setCommFloorUtilList(List<CommFloorUtil> commFloorUtilList) {
        this.commFloorUtilList = commFloorUtilList;
    }
}
