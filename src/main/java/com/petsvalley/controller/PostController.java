package com.petsvalley.controller;

import com.petsvalley.entity.Customer;
import com.petsvalley.entity.Img;
import com.petsvalley.entity.Post;
import com.petsvalley.service.CommentService;
import com.petsvalley.service.CustomerService;
import com.petsvalley.service.ImgService;
import com.petsvalley.service.PostService;
import com.petsvalley.util.PageModel;
import com.petsvalley.util.PostUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@MultipartConfig
@RequestMapping("/post")
//@MultipartConfig(location="d:/SoftWare")
public class PostController {
    @Autowired
    private PostService postService;
    @Autowired
    private ImgService imgService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CommentService commentService;
    private static final long serialVersionUID = 1L;
    private String fileName=null;
    @RequestMapping("/insert")
    public Post insert(HttpServletRequest request,String content,String title,@RequestParam("files") MultipartFile[] files) throws IOException {
        //存储图片路径在webapp/upload上
        String path = request.getSession().getServletContext().getRealPath("/upload/");
        int postId=(int)(Math.random()*9*Math.pow(10,9-1)) + (int)Math.pow(10,9-1);
        Customer customer=(Customer)request.getSession().getAttribute("customer");
        Post post = new Post();
        post.setPostId(postId);
        post.setPostContent(content);
        post.setPostTime(new Date());
        post.setPostTitle(title);
        post.setPostState(0);
        post.setPostCount(11);
        post.setCustId(customer.getCustId());
        postService.save(post);
        if(files!=null&&files.length>0){
            //循环获取file数组中得文件
            for(int i = 0;i<files.length;i++){
                MultipartFile file = files[i];
                //保存文件
                String imgpath=saveFile(file, path);
                String[] paths=imgpath.split("/");
                String filepath="/upload/"+fileName;
                System.out.println(filepath);
                Img img=new Img();
                img.setCustId(customer.getCustId());
                img.setPath(filepath);
                img.setPostId(postId);
                imgService.save(img);
            }
        }


        return post;
    }

    private String saveFile(MultipartFile file, String path) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                File filepath = new File(path);
                if (!filepath.exists())
                    filepath.mkdirs();
                // 文件保存路径
                String uuid=UUID.randomUUID().toString();
                String savePath = path +uuid+file.getOriginalFilename();
                //System.out.println(file.getOriginalFilename());
                fileName=uuid+file.getOriginalFilename();
                // 转存文件
                file.transferTo(new File(savePath));
                return savePath;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @RequestMapping(value = "/getall",method =RequestMethod.GET)
    public PageModel<PostUtil> getAll(String name,int page,String spare,PageModel<PostUtil> pageModel,HttpServletRequest request){
        List<Post> posts=postService.getByCommCount();
        pageModel.setCurrentPageCode(page);
        pageModel.setPageSize(5);
        pageModel.setStartRecord((page-1)*pageModel.getPageSize());
        if (spare.equals("1")||spare.equals("3")){
            pageModel.setTotalRecord(postService.recordCount2());
        }
        else if (!name.equals("pets")){
            pageModel.setTotalRecord(postService.recordCount3(name));
        }
        else {
            pageModel.setTotalRecord(postService.recordCount(spare));
        }
        pageModel.setTotalPages(pageModel.getTotalRecord()%pageModel.getPageSize()==0 ? pageModel.getTotalRecord()/pageModel.getPageSize():pageModel.getTotalRecord()/pageModel.getPageSize()+1);
        pageModel.setEndRecord(pageModel.getCurrentPageCode()*pageModel.getPageSize()-1);
        List<PostUtil> postUtilList=new ArrayList<>();
       List<Post> postList= postService.getByPage(pageModel,name,spare);
       for (Post post:postList){
           PostUtil postUtil=new PostUtil();
           List<Img> imgList=imgService.getByPostId(post.getPostId());
           Customer customer=customerService.queryById(post.getCustId());
           Integer commentCount=commentService.recordCount(post.getPostId());
           postUtil.setCommentCount(commentCount);
           postUtil.setPost(post);
           postUtil.setImgList(imgList);
           postUtil.setCustomer(customer);
           postUtilList.add(postUtil);
       }
       postUtilList.get(0).setPostList(posts);
       pageModel.setModelList(postUtilList);
       return pageModel;
    }

    @RequestMapping("/getone")
    public Post getOne(Integer id){

        return null;
    }
    @RequestMapping("getAllByCustId")
    public String getAllByCustId(Integer id,HttpServletRequest request){
        List<Post> postList=postService.getAllById(id);
        request.getSession().setAttribute("postList",postList);
        return "personal_center";
    }
    @RequestMapping("/delete")
    public int delete(Integer postId){
        int rows=postService.delete(postId);
        return rows;
    }

    @RequestMapping(value="/postCount",method = RequestMethod.GET)
    public Post updatePostCount(int postId){
        postService.updatePostCountOfAdd(postId);
       Post post= postService.getByPostId(postId);
       return post;
    }

    @RequestMapping(value="/postCountReduce",method = RequestMethod.GET)
    public Post updatePostCountReduce(int postId){
        postService.updatePostOfReduce(postId);
        Post post= postService.getByPostId(postId);
        return post;
    }

    @RequestMapping("/record")
    public List<Post> getByRecord(HttpServletRequest request) {
           Customer customer= (Customer)request.getSession().getAttribute("customer");
        if (customer!=null){
            String key=customer.getCustId().toString();
            List<Post> postList=(List<Post>)request.getSession().getAttribute(key);
            return postList;
        }
        return null;
    }
}

