package com.petsvalley.controller;

import com.petsvalley.entity.Comment;
import com.petsvalley.entity.Customer;
import com.petsvalley.entity.Img;
import com.petsvalley.entity.Post;
import com.petsvalley.service.CommentService;
import com.petsvalley.service.CustomerService;
import com.petsvalley.service.ImgService;
import com.petsvalley.service.PostService;
import com.petsvalley.util.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;
    @Autowired
    private PostService postService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ImgService imgService;

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public String insert(@Param("spare") String spare, @Param("content") String content,@Param("state") Integer state, @Param("postId") Integer postId, HttpServletRequest request){
        Customer customer=(Customer)request.getSession().getAttribute("customer");
        Comment comment=new Comment();
        comment.setCommContent(content);
        comment.setCommTime(new Date());
        comment.setCustId(customer.getCustId());
        comment.setPostId(postId);
        if (state==0) {
           int count= commentService.floorRecord(postId);
           comment.setCommState(count+1);
        }
        else {
            comment.setCommState(state);
        }
        Post post=postService.getByPostId(postId);

        if (!spare.equals("null")){
            comment.setCommSpare(spare);
        }
        int rows=commentService.save(comment);
        if (rows<=0){
            return "回复失败";
        }
        return "回复成功";
    }

    @RequestMapping("/getall")
    public  PageModel<CommUtil> getByPage( HttpServletResponse response,Integer page, PageModel<CommUtil> pageModel,Integer postId, HttpServletRequest request) throws ServletException, IOException {
        Customer c= (Customer)request.getSession().getAttribute("customer");
        if (c!=null){
        Post post1=postService.getByPostId(postId);
            List<Post> postList=new ArrayList<>();
        String key=c.getCustId().toString();
        if ((List<Post>)request.getSession().getAttribute(key)==null){
           HttpSession session= request.getSession();
           session.setMaxInactiveInterval(300*60);
           postList.add(post1);
            request.getSession().setAttribute(key,postList);
        }
        else {
         postList=(List<Post>) request.getSession().getAttribute(key);
         postList.add(post1);
           HttpSession session= request.getSession();
            session.setMaxInactiveInterval(300*60);
            session.setAttribute(key,postList);
        }
        }

        pageModel.setPageSize(5);
        pageModel.setCurrentPageCode(page);
        pageModel.setStartRecord((page-1)*pageModel.getPageSize());
        pageModel.setTotalRecord(commentService.floorRecord(postId));
        pageModel.setTotalPages(pageModel.getTotalRecord()%pageModel.getPageSize()==0 ? pageModel.getTotalRecord()/pageModel.getPageSize():pageModel.getTotalRecord()/pageModel.getPageSize()+1);
        pageModel.setEndRecord(pageModel.getCurrentPageCode()*pageModel.getPageSize()-1);
        List<Comment> commentList=commentService.getAll(pageModel,postId);
        CommUtil commUtil=new CommUtil();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        List<CommFloorUtil> commFloorUtilList=new ArrayList<>();
        for (Comment comment:commentList){
            List<CommentUtil> commentUtils=new ArrayList<>();
           List<Comment> comments= commentService.getByFloor(comment.getCommState(),postId);

            CommFloorUtil commFloorUtil=new CommFloorUtil();
           Integer floorCount=commentService.floorCount(postId,comment.getCommState());
            commFloorUtil.setFloorCount(floorCount);
           for (Comment comment1:comments){
               CommentUtil commentUtil=new CommentUtil();
               CommentUtil commentUtil2=new CommentUtil();
              Integer commId= Integer.parseInt(comment1.getCommSpare());
               Comment c1=commentService.getById(commId);//评论的哪个评论
              Customer customer= customerService.queryById(comment1.getCustId());
              commentUtil.setComment(comment1);
              commentUtil.setCustomer(customer);
              //封装评论哪个评论的
               Customer customer1=customerService.queryById(c1.getCustId());
               commentUtil2.setCustomer(customer1);
               commentUtil2.setComment(c1);
               commentUtil.setCommentUtil(commentUtil2);
               commentUtils.add(commentUtil);
           }
           commFloorUtil.setComment(comment);
           commFloorUtil.setCommentUtilList(commentUtils);
            Customer customer= customerService.queryById(comment.getCustId());
            commFloorUtil.setCustomer(customer);
           commFloorUtilList.add(commFloorUtil);

        }
        List<Post> posts=postService.getByCommCount();
        commUtil.setPostList(posts);
        commUtil.setCommFloorUtilList(commFloorUtilList);
        PostUtil postUtil=new PostUtil();
        Post post=postService.getByPostId(postId);
        List<Img> imgList=imgService.getByPostId(postId);
        Customer customer=customerService.queryById(post.getCustId());
        postUtil.setCustomer(customer);
        postUtil.setImgList(imgList);
        postUtil.setPost(post);
        commUtil.setPostUtil(postUtil);
        int postRecord= postService.recordCount2();
        commUtil.setPostRecord(postRecord);
        request.setAttribute("commUtil",commUtil);
        List<CommUtil> commUtilList=new ArrayList<>();
        commUtilList.add(commUtil);
        pageModel.setModelList(commUtilList);
        //request.getRequestDispatcher("/WEB-INF/post_details1.jsp").forward(request,response);
        return pageModel;
    }

}
