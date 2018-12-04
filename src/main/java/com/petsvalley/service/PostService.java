package com.petsvalley.service;

import com.petsvalley.entity.Post;
import com.petsvalley.util.PageModel;
import com.petsvalley.util.PostUtil;
import javafx.geometry.Pos;

import java.util.List;

public interface PostService {
    //新建发帖
    public Integer save(Post post);

    //根据帖子id查询单个帖子
    public Post getByPostId(Integer id);

    //分页
    //public PageModel<Post> getByPage(PageModel<Post> pageModel);
    public List<Post> getByPage(PageModel<PostUtil> pageModel,String name,String spare);

    //查询所有帖子
    public List<Post> getAll();

    //通过id查询个人所有帖子
    public List<Post> getAllById(Integer custId);

    //通过标题关键字查询帖子
    public List<Post> getByTitle(String title);

    //通过id删除帖子
    public Integer delete(Integer id);

    //总记录数
    public int recordCount(String spare);

    //总记录数
    public int recordCount2();

    //搜索总记录数
    public int recordCount3(String name);

    //点赞
    public int updatePostCountOfAdd(int postId);

    //取消点赞
    public int updatePostOfReduce(int postId);

    //议论榜
    public List<Post> getByCommCount();
}
