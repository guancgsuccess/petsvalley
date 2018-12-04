<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="com.petsvalley.entity.Post" %>
<%@ page import="com.petsvalley.entity.Customer" %><%--
  Created by IntelliJ IDEA.
  User: xcy
  Date: 2018/10/26
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>宠物论坛</title>
    <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->

    <link href="${pageContext.request.contextPath}/css/post.css" type="text/css" rel="stylesheet" />
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/popper.js/1.12.5/umd/popper.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/js/bootstrap.min.js"></script>
    <style>
        #title{
            height: 30px;

        }

        .title image {
            width: 20px;
            height: 10px;

        }
        #image{
            height: auto;
            width: 100%;
        }
        #image img{
            height: 75px;
            width: 75px;
            margin-left: 10px;
        }
        #addImg{
            margin-top: -13px;
        }
        #addImg{
            height: auto;
        }
        #addImg img{
            width: 50px;
            height: 45px;
            margin-top: -5px;
            margin-left: 13px;
        }
        #addImg>input{
            background:none;
            outline:none;
            border:0px;
            opacity:0;
            margin-left: -62px;
            margin-top: -5px;
        }
        #addImg span{
            margin-left: -222px;
            line-height: 35px;
            height: 35px;
            position: absolute;
        }
        #page{
            width: 78%;
            height: auto;
            border-right: 1px solid darkgrey;
        }

        .pagination {
            margin-top: 30px;
            margin-left: 50px;
            margin-bottom: 20px;
            display: inline-block;
            padding: 0;

        }
        .pagination a{
            border:1px solid darkgrey}
        .pagination li {display: inline}

        .pagination li a {
            color: black;
            float: left;
            padding: 4px 12px;
            text-decoration: none;
            margin-left:3px;
        }

        .pagination li a.active {
            background-color: #4CAF50;
            color: white;
        }

        .pagination li a:hover:not(.active) {background-color: #ddd;}
    </style>
    <script>
        var form = new FormData();
        var number=0;
        var custId=null;
        var websocket=null;
        var customer;

        //移除图片
        function remove(x) {
            x.remove();
        }

        //签到
        function sign() {
            document.getElementById("sign-in").innerText="已签到";
            document.getElementById("numbers").innerText="已签2天";
        }

        //发帖上传图片
        function addImages(obj) {
            number++;
            var files=document.getElementById("files").files[0];
            /* for(var i=0;i<files.length;i++){

             }*/
            var fi=new Array;

            var path=window.URL.createObjectURL(files);
            var div=document.getElementById("image");
            var addImg=document.getElementById("addImg");

            div.innerHTML+="<img src='"+path+"' onclick='remove(this)'>";
            //alert(div.innerHTML);
            //var file=document.getElementsById("files").files[0];
            if (number<=6){
                form.append("files",files);
            }
            else {
                alert("图片添加上限，最多可添加6张图片");
                addImg.innerHTML="";
            }

            //arrayFile.push(files);

        }

        //发帖
        function addPost() {

            if (window.XMLHttpRequest)
            {
                xhr=new XMLHttpRequest();
            }
            else
            {
                xhr=new ActiveXObject("Microsoft.XMLHTTP");
            }
            var title=document.getElementById("title").value;
            var content=document.getElementById("content").value;
            var files=document.getElementById("files").files[0];
            /*   var path=window.URL.createObjectURL(files);
               var fileList=document.getElementById("files").files;*/

            form.append("title",title);
            form.append("content",content);

            xhr.open("POST","${pageContext.request.contextPath}/post/insert",true);
            //xhr.setRequestHeader("Content-Type", "multipart/form-data; charset=utf-8");
            //var formData="title="+title+"&content="+content+"&imgPath="+arrayList+"&files="+arrayFile+"&fileList="+fileList;
            xhr.onreadystatechange=function () {
                if (xhr.readyState == 4 && xhr.status == 200) {
                    alert("发帖成功");
                    document.getElementById("title").value="";
                    document.getElementById("content").value="";
                    form.remove();
                    //var jsArr=JSON.parse(xhr.responseText);

                }
            }
            xhr.send(form);
        }

        //聊天室
        function chatRoom() {
            customer=document.getElementById("customer").value;
            document.getElementById("posts").innerHTML="";
            document.getElementById("posts").innerHTML+="<div id=chat style='width:78%;height: 500px;border: 1px solid darkgray'><div id='chat-top' style='width: 100%;height: 40px;text-align: center;color: pink;border-bottom: 1px solid darkgray'>" +
                "<h2>萌宠聊天室</h2></div><div id='chat-center' style='overflow:auto;height: 420px;width: 100%'><ul id='ul' style='list-style: none'></ul> </div> <div id='chat-bottom' style='float: bottom;width: 100%;height: 40px'><input type='text' id='contentPut' style='width: 90%;height: 100%'>" +
                "<span type='button' style='height: 100%;width: 10%;margin-top:-15px;line-height:40px;text-align:center;font-size:18px;background-color: blue;color: whitesmoke' onclick='send()'>发送</span></div> </div>";
            customer=document.getElementById("customer").value;
            if (customer!=null&&customer!=""){

                if ('WebSocket' in window) {
                    websocket = new WebSocket('ws://134.175.17.147:8089/websocket?custId='+customer);
                }
                else {
                    alert('当前浏览器 Not support websocket')
                }
            }
            else {
                alert("请先登录");
            }
            //监听服务器发送过来的所有信息
        }

        //连接发生错误的回调方法
        websocket.onerror = function () {
            setMessageInnerHTML1("WebSocket连接发生错误");
        }

        //连接成功建立的回调方法
        websocket.onopen = function () {
         alert("open");
        }


        //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
        window.onbeforeunload = function () {
            closeWebSocket();
        }

        //日期类型转换
        function strFormat(str){
            var date=new Date(str);
            var setDate=date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
            return setDate;
        }

        //发送消息
        function send() {
            if (customer==null||customer==""){
                alert("请先登录")
                document.getElementById("contentPut").value="";
            }
            else {
                var value = document.getElementById("contentPut").value;
                var object = null;
                var type=0;
                if (custId==null||custId==""){
                    type=1;
                }
                object = {
                    to : custId,
                    msg : value,
                    type:type,

                }
                //将object转成json字符串发送给服务端
                var json = JSON.stringify(object);
                websocket.send(json);
                var now=new Date();
                document.getElementById("contentPut").value="";
                websocket.onmessage = function(event) {
                    eval("var result=" + event.data);
                    if (result.alert==null) {
                        //document.getElementById("content-area").innerHTML += result.from+""+result.date+"<br/>"+result.sendMsg+"<br>" ;
                        document.getElementById("ul").innerHTML += "<li style='list-style:none;height: 25px'><span style='color: green;margin-left: -30px'>" + result.from + " " + result.date + "</span><br/><span style='margin-left: -30px'>" + result.sendMsg + "</span><li><br>";

                    }
                    else {
                        document.getElementById("ul").innerHTML += "<li style='list-style:none;height: 25px'><span style='color: green;margin-left: -30px'>" + result.from + "给您发来了消息" + result.date + "</span><br/><span style='margin-left: -30px'>" + result.sendMsg + "</span><li><br>";
                    }
                }
            }
        }

        //浏览记录
        function record() {
           var url_record="${pageContext.request.contextPath}/post/record"
            if (window.XMLHttpRequest)
            {
                xhr=new XMLHttpRequest();
            }
            else
            {
                xhr=new ActiveXObject("Microsoft.XMLHTTP");
            }
            xhr.open("GET", url_record,true);
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            var forum=document.getElementById("posts");
            forum.innerHTML="";
            forum.style.minHeight="450px"
            xhr.onreadystatechange = function(){
                if (xhr.readyState == 4 && xhr.status == 200) {
                    var jsArr = JSON.parse(xhr.responseText);
                    if (jsArr==null||jsArr==""){
                        alert("当前没有浏览记录或没有登录");
                    }
                    else {
                        for (var i=0;i<jsArr.length;i++){
                            var post="<div class=post>";
                            var content1="<div class='content' style='margin-left: -10px'>";
                            post+=content1;
                            var title="<div class='title' style='margin-top:66px'><a href='${pageContext.request.contextPath}/post_details/?postId="+jsArr[i].postId+"&page="+1+"'><span class=title-content>"+jsArr[i].postTitle+"</span></a></div>";
                            post+=title;

                            if (jsArr[i].postContent!=null){
                                var context="<div class=context><span>"+jsArr[i].postContent+"</span></div>";
                                post+=context;
                            }
                            post+="</div></div>"
                            forum.innerHTML+=post;
                        }
                    }
                }
            }
            xhr.send(null);
        }
    </script>

    <script>
        var name="pets";  //查询初始值
        var a=0;
        var spare="1";     //查询类型初始值
        var totalPage=0;

        //获得搜索宠物类别名
        function getname(xxx){
            name=xxx.innerText;
            //getAll(url_getAllPost);
        }

        //搜索后改变为初始值
        function changeName(){
            name="pets";
        }

        //搜索框搜索
        function search() {
            name=document.getElementById("searchValue").value;
            spare="6";
        }

        //查询精品
        function good() {
            spare="4";
        }

        //查询置顶
        function topPost() {
            spare="2";
        }
        //查询热帖、按点赞数从高到低排序
        function hot() {
            spare="3";
        }
        //根据宠物图片搜索
        function urlByHeadphoto(xx){
            var url=xx.nextSbiling.innerText;
        }

        //点赞、取消点赞
        function like(x){
            var value=x.firstElementChild.value;
            if (value==0){
                value=1;
                if (window.XMLHttpRequest)
                {
                    xhr=new XMLHttpRequest();
                }
                else
                {
                    xhr=new ActiveXObject("Microsoft.XMLHTTP");
                }
                var postId=x.lastElementChild.value;
                var url="${pageContext.request.contextPath}/post/postCount?postId="+postId;
                xhr.open("GET", url,false);
                xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
                x.innerHTML="";
                xhr.onreadystatechange = function(){

                    var jsArr = JSON.parse(xhr.responseText);
                    x.innerHTML+="<input type=hidden value="+value+"><img style='' src='${pageContext.request.contextPath}/images/like1.png'><span>"+jsArr.postCount+"</span><input type=hidden value="+jsArr.postId+">"
                }


                xhr.send(null);
            }
            else if (value==1) {
                value=0;
                if (window.XMLHttpRequest)
                {
                    xhr=new XMLHttpRequest();
                }
                else
                {
                    xhr=new ActiveXObject("Microsoft.XMLHTTP");
                }
                var postId=x.lastElementChild.value;
                var url="${pageContext.request.contextPath}/post/postCountReduce?postId="+postId;
                xhr.open("GET", url,false);
                xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
                x.innerHTML="";
                xhr.onreadystatechange = function(){

                    var jsArr = JSON.parse(xhr.responseText);
                    x.innerHTML+="<input type=hidden value="+value+"><img style='' src='${pageContext.request.contextPath}/images/like.png'><span>"+jsArr.postCount+"</span><input type=hidden value="+jsArr.postId+">"
                }


                xhr.send(null);
            }

        }


        //onload加载页面
        url_getAllPost="${pageContext.request.contextPath}/post/getall?page="+1;
        window.onload=function () {

            getAll(url_getAllPost);
        }
        //加载所有帖子
        function getAll(url_getAllPost) {
            //alert(spare);
            url_getAllPost+="&name="+name+"&spare="+spare;
            spare="1";
            name="pets";
            if (window.XMLHttpRequest)
            {
                xhr=new XMLHttpRequest();
            }
            else
            {
                xhr=new ActiveXObject("Microsoft.XMLHTTP");
            }
            xhr.open("GET", url_getAllPost,true);
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            var forum=document.getElementById("posts");
            forum.innerHTML="";
            xhr.onreadystatechange = function(){
                if (xhr.readyState == 4 && xhr.status == 200) {
                    var jsArr = JSON.parse(xhr.responseText);
                    if (jsArr.modelList==null||jsArr.modelList==""){
                        alert("没有搜索到关于"+name+"的信息");
                    }
                    document.getElementById("postCount").innerText=jsArr.totalRecord;
                    for (var i=0;i<jsArr.modelList.length;i++){
                        var post="<div class=post>";
                        var number="<div class='number'> <img class='bor' src='${pageContext.request.contextPath}/images/描边框.png'><span class='count' >"+jsArr.modelList[i].commentCount+"</span></div>";
                        post+=number;
                        var content1="<div class='content'>";
                        post+=content1;
                        var title="<div class='title'><a href='${pageContext.request.contextPath}/post_details/?postId="+jsArr.modelList[i].post.postId+"&page="+1+"'><span class=title-content>"+jsArr.modelList[i].post.postTitle+"</span></a>";
                        post+=title;
                        var customer="<a href=''><span class='customer' ><img class='customer-img' src='${pageContext.request.contextPath}/images/customer.png'>"+jsArr.modelList[i].customer.custName+"</span></a></div>";
                        post+=customer;
                        if (jsArr.modelList[i].post.postContent!=null){
                            var context="<div class=context><span>"+jsArr.modelList[i].post.postContent+"</span></div>";
                            post+=context;
                        }

                        if (jsArr.modelList[i].imgList!=null){
                            var images="<div class=images>";
                            for (var j=0;j<jsArr.modelList[i].imgList.length;j++){
                                images+="<img class='msg' src='"${pageContext.request.contextPath}+jsArr.modelList[i].imgList[j].path+"'>";
                            }
                            images+="</div>";
                            post+=images;

                            //post+="</a>";

                        }
                        post+="</div>";
                        post+="<div class=likes><a class='like' href='javascript:like(this)' onclick=like(this) value='0'><input type=hidden value=0><span class='like-count'><img src='${pageContext.request.contextPath}/images/like.png'>"+jsArr.modelList[i].post.postCount+"</span><input type=hidden value="+jsArr.modelList[i].post.postId+"></a></div>";
                        post+="</div>";
                        forum.innerHTML+=post;
                    }
                    totalPage=jsArr.totalPages;
                    var page="<div id=page><ul class='pagination'>";

                    if (jsArr.currentPageCode!=1){
                        var getAllUser="${pageContext.request.contextPath}/post/getall?page="+(jsArr.currentPageCode-1);
                        var sPage="<li><a href='"+'javascript:getAll("'+getAllUser+'")'+"'>«</a></li>";
                        page+=sPage;
                    }
                    for (var i=1;i<=jsArr.totalPages;i++){
                        var getAllUsers="${pageContext.request.contextPath}/post/getall?page="+i;
                        if (jsArr.currentPageCode==i){
                            page+="<li><a class='active' href='"+'javascript:getAll("'+getAllUsers+'")'+"'>"+i+"</a></li>"
                        }
                        else if (i<=10){
                            page+="<li><a href='"+'javascript:getAll("'+getAllUsers+'")'+"'>"+i+"</a></li>"
                        }
                    }
                    //var currentPage="<span>当前是第</span> <span>"+jsArr.currentPageCode+"页</span>"
                    //page+=currentPage;
                    if (jsArr.currentPageCode!=jsArr.totalPages){
                        var getAllUser="${pageContext.request.contextPath}/post/getall?page="+(jsArr.currentPageCode+1);
                        var nextPage="<li><a href='"+'javascript:getAll("'+getAllUser+'")'+"'>»</a></li>";
                        page+=nextPage;
                        //alert(page.innerHTML);
                    }
                    var pageCount="<li style='display: inline-block;border: 1px solid darkgray;margin-left: 3px;margin-right: 3px;padding: 4px 12px;'><sapn>共</span><span>"+jsArr.totalPages+"页</span></li>";
                    page+=pageCount;
                    var getPage="<li><input type=text id='pageCode' style='padding: 4px 12px;width:60px'></li><li><input type='button' value='跳转' onclick='jump()' style='padding: 4px 12px'></li>";
                    page+=getPage;
                    page+="</ul></div>";
                    forum.innerHTML+=page;

                    var bottom= document.getElementById("hot-title");
                    bottom.innerHTML="";
                    for (var b=1;b<jsArr.modelList[0].postList.length+1;b++){
                        if (b<4){
                            bottom.innerHTML+="<ul><li class='rank' ><span class=rank-span>"+b+"</span>" +
                                "</li><a href='${pageContext.request.contextPath}/post_details?postId="+jsArr.modelList[0].postList[b].postId+"&page="+1+"'> <li class='list' style='margin-left: 5px'>"+jsArr.modelList[0].postList[b].postTitle+"</li></a></ul>"
                        }
                        else {
                            bottom.innerHTML+=" <ul><li class=rank1><span class=rang2>"+b+"</span>" +
                                "</li><a href='${pageContext.request.contextPath}/post_details?postId="+jsArr.modelList[0].postList[b].postId+"&page="+1+"'><li class=list style='margin-left: 5px'>"+jsArr.modelList[0].postList[b].postTitle+"</li></a></ul>"
                        }
                    }
                }
            }
            xhr.send(null);
        }

        //跳转页面、分页
        function jump() {
            var page=document.getElementById("pageCode").value;
            if (page>totalPage||page<=0){
                alert("请输入正确的页码");
            }
            else {
                var url="${pageContext.request.contextPath}/post/getall?page="+page;
                getAll(url);
            }

        }
    </script>
</head>
<body>
<div id="top">
    <ul>
        <a href="${pageContext.request.contextPath}/index"> <li>首页</li></a>
        <%
           Customer customer=(Customer)request.getSession().getAttribute("customer");
           if (customer!=null){
        %>
        <a href="" style="color: red"><li>${customer.custName}</li></a>
        <%} else { %>
        <a href="${pageContext.request.contextPath}/login"><li>请登录</li></a>
       <% } %>
        <a href=""> <li>消息</li></a>
        <a href=""><li>微博</li></a>
        <a  class="tb-app" href="" data-toggle=modal data-target=#modalUpdateEmp><li>我要发帖</li></a>

    </ul>
</div>
<div id="search">
    <img src="${pageContext.request.contextPath}/images/萌宠.png">
    <input type="text" id="searchValue">
    <a href="javascript:getAll(url_getAllPost)" >
    <span class="search" onclick="search()">搜索</span>
    </a>
</div>

<div id="body" style="background-color: #40260C">
    <div id="demo" class="carousel slide" data-ride="carousel">

        <!-- 指示符 -->
        <ul class="carousel-indicators">
            <li data-target="#demo" data-slide-to="0" class="active"></li>
            <li data-target="#demo" data-slide-to="1"></li>
            <li data-target="#demo" data-slide-to="2"></li>
            <li data-target="#demo" data-slide-to="3"></li>
            <li data-target="#demo" data-slide-to="4"></li>
        </ul>

        <!-- 轮播图片 -->
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="http://static.runoob.com/images/mix/img_fjords_wide.jpg">
            </div>
            <div class="carousel-item">
                <img src="http://static.runoob.com/images/mix/img_nature_wide.jpg">
            </div>
            <div class="carousel-item">
                <img src="http://static.runoob.com/images/mix/img_mountains_wide.jpg">
            </div>
            <div class="carousel-item">
                <img src="http://static.runoob.com/images/mix/img_fjords_wide.jpg">
            </div>
            <div class="carousel-item">
                <img src="http://static.runoob.com/images/mix/img_mountains_wide.jpg">
            </div>
        </div>

        <!-- 左右切换按钮 -->
        <a class="carousel-control-prev" href="#demo" data-slide="prev">
            <span class="carousel-control-prev-icon"></span>
        </a>
        <a class="carousel-control-next" href="#demo" data-slide="next">
            <span class="carousel-control-next-icon"></span>
        </a>

    </div>
    <div id="logo">
        <img src="${pageContext.request.contextPath}/images/dog1.jpg" class="logo">
        <span class="logo_name">萌宠谷</span>
        <span class="introduce">欢迎来到萌宠爱好者、萌宠趣事分享聚集地</span>
        <div>
            <img src="${pageContext.request.contextPath}/images/关注1.png" id="focus" onclick="focus()">
            <span style="position:absolute;margin-top: 30px;font-size: 12px;margin-left: 5px">关注： <span style="color: red"> 22</span></span>
            <span style="position:absolute;margin-top: 30px;font-size: 12px;margin-left: 100px">帖子： <span id="postCount" style="color: red"> 33</span></span>
            <div id="sign">
                <div id="sign1" onclick="sign()">
                    <span class="sign1" id="sign-in">签到</span>
                </div>
                <div id="sign2">
                    <%
                        SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
                        String date=sdf.format(new Date());
                        request.getSession().setAttribute("date",date);
                    %>
                    <span class="sign2"><%=request.getSession().getAttribute("date")%></span>
                    <span class="sign3" id="numbers">已签1天</span>
                </div>
            </div>

        </div>

    </div>
    <div id="cd">
        <ul>
            <a href="javascript:getAll(url_getAllPost)" onclick="changeName()"><li>看帖</li></a><a href="javascript:getAll(url_getAllPost)" onclick="good()"><li>精品</li></a><a href="javascript:getAll(url_getAllPost)" onclick="topPost()"><li>置顶</li></a><a href="javascript:getAll(url_getAllPost)" onclick="hot()"><li>热帖</li></a><a href="javascript:record()"><li>浏览记录</li></a><a href="javascript:chatRoom()"><li>聊天室</li></a>
        </ul>
    </div>



    <div id="post">

        <div id="right">
            <div id="center" >
                <span class="mypost">我的萌宠论坛</span>
                <%
                    if (request.getSession().getAttribute("customer")!=null&&request.getSession().getAttribute("customer")!="")
                    {
                %>
                <img src="${pageContext.request.contextPath}${customer.headPhoto}" class="myHeadPhoto">
                <ul class="center-ul">
                    <a href="${pageContext.request.contextPath}/login"><li><span class="center-ul-span" style="color: red">${customer.custName}</span></li></a>
                    <li class="center-ul-li"><span >积分：${customer.custIntegral}</span></li>
                </ul>
                <%

                    }
                    else {
                %>
                <img src="${pageContext.request.contextPath}/images/headPhoto.png" class="myHeadPhoto">
                <ul class="center-ul">
                    <a href="${pageContext.request.contextPath}/login"><li><span class="center-ul-span">点此去登录</span></li></a>
                    <li class="center-ul-li"><span >享受快乐之旅</span></li>
                </ul>
                <%
                    }
                %>
            </div>

            <div id="bottom">
               <span id="list">论坛热议榜</span>
                <div id="hot-title">

                </div>

            </div>
        </div>

        <div id="posts">


        </div>
        </div>
    </div>
</div>
<input type="hidden" id="customer" value="${customer.custId}">
<div  class="modal fade" id="modalUpdateEmp" tabindex="-2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div  class="modal-content"> <!--整个页面-->
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>

            </div>
            <div class="modal-body">
                <form id="form_update"  class="form-horizontal" role="form" method="post" enctype="multipart/form-data">
                    <%-- <form id="form_update" action="${pageContext.request.contextPath}/post/insert" class="form-horizontal" role="form" method="get" enctype="multipart/form-data" >--%>
                    <input type="text" id ="id" name="id"         hidden="hidden">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">标题</label>
                        <div class="col-sm-10">
                            <input type="text" id="title" class="form-control"  name="title" placeholder="请输入标题">
                        </div>
                    </div>
                    <div id="addImg">
                        <img  src="${pageContext.request.contextPath}/images/img.png">
                        <input type="file" id="files" name="files" onchange="addImages(this)" accept="image/gif,image/jpeg,image/x-png" multiple="multiple"/>

                        <span>添加图片</span>
                    </div>
                    <div id="image">

                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">内容</label>
                        <div class="col-sm-10">
                            <textarea id="content" class="form-control" name="content" placeholder="请输入内容" style="height: 150px"></textarea>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                            <button id="btnupdate" type="button" class="btn btn-primary" data-dismiss="modal" onclick="addPost()">确认发布</button>
                        </div>
                    </div>
                </form>
            </div>

        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal -->
</div>
</body>

</html>
