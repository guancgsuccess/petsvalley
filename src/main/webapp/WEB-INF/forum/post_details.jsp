<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.petsvalley.entity.Customer" %><%--
  Created by IntelliJ IDEA.
  User: xcy
  Date: 2018/10/28
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>帖子详情</title>
    <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <link href="${pageContext.request.contextPath}/css/post_details.css" type="text/css" rel="stylesheet" />

    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/popper.js/1.12.5/umd/popper.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/js/bootstrap.min.js"></script>
    <script>
        var value=null;
        var content;
        function show(x){
            value= x.nextSibling.value;

            if(value==0){
                content= x.innerText;
                x.parentNode.parentNode.nextElementSibling.style.display="block";
                /* x.innerHTML="";
                 x.innerHTML+=""*/
                x.innerText="收起回复";
                x.style.backgroundColor="#ffd7bd";
                x.nextSibling.value=1;
            }
            else if(value==1){
                x.parentNode.parentNode.nextElementSibling.style.display="none";
                x.innerText=content;
                x.style.backgroundColor="white";
                x.nextSibling.value=0;
            }
        }

    </script>
    <style>
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
        <a href="javascript:open()" id="message"> <li  onclick="open()">消息</li></a>
        <a href=""><li>微博</li></a>
        <%--<a  class="tb-app" href="${pageContext.request.contextPath}/post"><li>我要发帖</li></a>--%>

    </ul>
</div>
<div id="search">
    <img src="${pageContext.request.contextPath}/images/萌宠.png">
    <input type="text" id="searchValue">
    <a href="${pageContext.request.contextPath}/post" >
        <span class="search" onclick="search()">搜索</span>
    </a>
</div>

<div id="body" style="background-color: lightcyan">
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
                <img src="http://static.runoob.com/images/mix/img_nature_wide.jpg">
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
            <img src="${pageContext.request.contextPath}/images/关注1.png" id="focus">
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
            <a href="${pageContext.request.contextPath}/post?name=pets&spare=1"><li>看帖</li></a><a href="${pageContext.request.contextPath}/post?name=pets&spare=4"><li>精品</li></a><a href="${pageContext.request.contextPath}/post?name=pets&spare=2"><li>置顶</li></a><a href="${pageContext.request.contextPath}/post?name=pets&spare=3"><li>热帖</li></a><a href="javascript:chatRooms()"><li>聊天室</li></a>
        </ul>
    </div>

    <div id="title" >

    </div>

    <div id="post" >

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


        <div id="comments">

        </div>







        <div style="clear:both;height:1px;width:100%; overflow:hidden; margin-top:-1px;"></div>
    </div>

</div>

<div >
    <div  class="modal fade" id="modalUpdateEmp" tabindex="-2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div  class="modal-content"> <!--整个页面-->
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <%--<h4 class="modal-title" id="myModalLabel">
                        正在编辑
                    </h4>--%>
                </div>
                <div class="modal-body">
                    <form id="form_update"  class="form-horizontal" role="form" method="post">

                        <div class="form-group">
                            <label  class="col-sm-2 control-label">内容</label>
                            <div class="col-sm-10">
                                <textarea id="content" class="form-control" name="content" placeholder="请输入内容" style="height: 150px"></textarea>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                                <button id="btnupdate" type="button" class="btn btn-primary" data-dismiss="modal" onclick="insert()">确认回复</button>
                            </div>
                        </div>
                    </form>
                </div>

            </div>
            <!-- /.modal-content -->
        </div>
        <!-- /.modal -->
    </div>
</div>

<div id="chats">
    <div id="chat-top">
        <span id="chatName"></span>
        <a href="javascript:close()"> <span class="close"><img src="${pageContext.request.contextPath}/images/close.png" style="margin-top: -2px"> </span></a>
    </div>

    <div id="chat-content">

    </div>
    <div id="chat-bottom">
        <input type="text" id="chat-input" placeholder="请输入发送内容">
        <button value="发送" onclick="send2()">发送</button>
    </div>
</div>


<input type="hidden" id="customer" value="${customer.custId}">
</body>
<script>
    var spare=null;
    var number=0;
    var custId=null;
    var websocket=null;
    var customer=document.getElementById("customer").value;
    var floor=0;
    var content1=null;
    var postId=null;
    var totalPage=0;
    window.onload=function () {
        function GetRequest() {
            var url = location.search; //获取url中"?"符后的字串
            var theRequest = new Object();
            if (url.indexOf("?") != -1) {
                var str = url.substr(1);
                strs = str.split("&");
                for (var i = 0; i < strs.length; i++) {
                    theRequest[strs[i].split("=")[0]] = unescape(strs[i].split("=")[1]);
                }
            }
            return theRequest;
        }

        var Request = new Object();
        Request = GetRequest();
        var page = Request['page'];
        postId = Request['postId'];
        refresh(postId, page);

        if (customer!=null&&customer!=""){

            if ('WebSocket' in window) {
                websocket = new WebSocket('ws://134.175.17.147:8089/websocket?custId='+customer);

            }
            else {
                alert('当前浏览器 Not support websocket')
            }
            websocket.onmessage = function(event) {
                eval("var result=" + event.data);
                if (result.alert!=null){
                    var message= document.getElementById("message");
                    message.innerHTML="";
                    message.innerHTML="<li style='color:red'>"+result.from+"给你发来了消息</li>"
                    //document.getElementById("content-area").innerHTML += result.from+""+result.date+"<br/>"+result.sendMsg+"<br>" ;
                    document.getElementById("chat-content").innerHTML += "<li style='list-style:none;height: 25px'><span style='color: green'>"+result.from+" "+result.date+"</span><br/><span style='margin-top: -20px'>"+result.sendMsg+"</span><li><br>" ;
                    //setMessageInnerHTML2(event.data);

                }

            }
        }
    }


    function sign() {
        document.getElementById("sign-in").innerText="已签到";
        document.getElementById("numbers").innerText="已签2天";
    }


    function chatRooms() {
        customer=document.getElementById("customer").value;
        document.getElementById("comments").innerHTML="";
        document.getElementById("comments").innerHTML+="<div id=chat style='width:78%;height: 500px;border: 1px solid darkgray'><div id='chat-top' style='width: 100%;height: 40px;text-align: center;color: pink;border-bottom: 1px solid darkgray'>" +
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

    }
    //将消息发送给后台服务器
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
                if (result.alert==null){
                    document.getElementById("ul").innerHTML += "<li style='list-style:none;height: 25px'><span style='color: green;margin-left: -30px'>"+result.from+" "+result.date+"</span><br/><span style='margin-left: -30px'>"+result.sendMsg+"</span><li><br>" ;

                }

            }
        }
    }
    //点击聊天获取用户id
    function getcustId(x) {
        custId= x.firstElementChild.value;
        document.getElementById("chatName").innerText=x.previousElementSibling.value;
        document.getElementById("chats").style.display="block";


    }

    //打开单聊界面
    function open() {
        /*document.getElementById("chats").style.display="block";*/
        var message= document.getElementById("message");
        message.innerHTML="";
        message.innerHTML="<li>消息</li>"
    }
    //关闭单聊界面
    function close() {
        document.getElementById("chats").style.display="none";
        custId=null;
    }


//单聊发送机制
    function send2() {
        if (customer==null||customer==""){
            alert("请先登录")
            document.getElementById("chat-input").value="";
        }
        else {
            var value = document.getElementById("chat-input").value;
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
            document.getElementById("chat-content").innerHTML += "<li style='list-style:none;height: 25px'><span style='color: green'>我："+strFormat(new Date())+"</span><br/><span style='margin-top: -20px'>"+value+"</span><li><br>" ;
            document.getElementById("chat-input").value="";
            websocket.onmessage = function(event) {
                eval("var result=" + event.data);
                if (result.alert!=null){
                    var message= document.getElementById("message");
                    message.innerHTML="";
                    message.innerHTML="<li style='color:red'>"+result.from+"给你发来了消息</li>"
                    //document.getElementById("content-area").innerHTML += result.from+""+result.date+"<br/>"+result.sendMsg+"<br>" ;
                    document.getElementById("chat-content").innerHTML += "<li style='list-style:none;height: 25px'><span style='color: green'>"+result.from+" "+result.date+"</span><br/><span style='margin-top: -20px'>"+result.sendMsg+"</span><li><br>" ;
                    //setMessageInnerHTML2(event.data);

                }

            }
        }
    }


   //刷新加载评论页面
    function refresh(postId,page) {
        var url="${pageContext.request.contextPath}/comment/getall";
        if (window.XMLHttpRequest)
        {
            xhr=new XMLHttpRequest();
        }
        else
        {
            xhr=new ActiveXObject("Microsoft.XMLHTTP");
        }
        xhr.open("POST", url,true);

        var formdate=new FormData;
        formdate.append("page",page);
        formdate.append("postId",postId);
        xhr.onreadystatechange = function(){
            if (xhr.readyState == 4 && xhr.status == 200){
                var jsArr = JSON.parse(xhr.responseText);
                document.getElementById("postCount").innerText=jsArr.modelList[0].postRecord;
                var div=document.getElementById("comments");
                var title=document.getElementById("title");
                div.innerHTML="";
                title.innerHTML="";
                title.innerHTML+="<span class=title>"+jsArr.modelList[0].postUtil.post.postTitle+ "</span><a  class='response' href='' data-toggle=modal data-target=#modalUpdateEmp><img src='${pageContext.request.contextPath}/images/回复.png' ><span>回复</span></a>";
                 var a="<div class='post_details'><div class='left'><img src='${pageContext.request.contextPath}/images/楼主.png' class='floorMaster'><div class=left-content>" +
                     "<img src='${pageContext.request.contextPath}"+jsArr.modelList[0].postUtil.customer.headPhoto+"' class=head>" +
                     "<span><div class=dropdown><button class=dropbtn>"+jsArr.modelList[0].postUtil.customer.custName+"</button>"+
                     "<div class=dropdown-content>"+
                    "<input type='hidden' value="+jsArr.modelList[0].postUtil.customer.custName+"><a href='javascript:getcustId(this)' onclick='getcustId(this)'>聊天<input type='hidden' value="+jsArr.modelList[0].postUtil.customer.custId+"></a>"+
                    "<a href=''>个人中心</a></div>"+
                    "</div></span>"+
                     "</div></div><div class=comment ><div class=content >" +
                     "<span class=text>"+jsArr.modelList[0].postUtil.post.postContent+"</span>";
                if (jsArr.modelList[0].postUtil.imgList!=null){
                    var images="<div id=images>";
                    for (var i=0;i<jsArr.modelList[0].postUtil.imgList.length;i++){
                        images+="<img class='imgs' src=${pageContext.request.contextPath}"+jsArr.modelList[0].postUtil.imgList[i].path+">";
                    }
                    images+="</div>"
                    a+=images;
                }
                a+="<span class=customer>1楼 "+strFormat(jsArr.modelList[0].postUtil.post.postTime)+ "<a  class='tb-app' href='' data-toggle=modal data-target=#modalUpdateEmp> 回复</a><input type=hidden value=0> </span></div></div></div>";
                div.innerHTML+=a;

                var number=(jsArr.currentPageCode-1)*jsArr.pageSize+1;
                if (jsArr.modelList.length>0){

                    for (var j=0;j<jsArr.modelList.length;j++){
                        for (var m=0;m<jsArr.modelList[j].commFloorUtilList.length;m++){
                            number++;
                           // alert(jsArr.modelList[j].commFloorUtilList[m].Customer.custName);
                            var b="<div class=post_details ><div class=left ><div class=left-content>" +
                                "<img src='${pageContext.request.contextPath}"+jsArr.modelList[j].commFloorUtilList[m].customer.headPhoto+"' >" +
                                "<span><div class=dropdown><button class=dropbtn >"+jsArr.modelList[j].commFloorUtilList[m].customer.custName+"</button><div class=dropdown-content>"+
                                "<input type=hidden value="+jsArr.modelList[j].commFloorUtilList[m].customer.custName+"><a href='javascript:getcustId(this)' onclick='getcustId(this)'>聊天<input type=hidden value="+jsArr.modelList[j].commFloorUtilList[m].customer.custId+"></a>" +
                                "<a href=''>个人中心</a></div>" +
                                "</div></span></div></div>"+
                                "<div class=comment>" +
                                "<div class=content>" +
                                "<span class=text>"+jsArr.modelList[j].commFloorUtilList[m].comment.commContent+"</span>" +
                                "<span class=customer>"+number+"楼 "+strFormat(jsArr.modelList[j].commFloorUtilList[m].comment.commTime)+"<a  onclick='show(this)' style='color:blue' class='connect'>回复("+jsArr.modelList[j].commFloorUtilList[m].floorCount+")</a><input type='hidden' value='0'> </span>" +
                                " </div>" +
                                "<div class=hide >";

                            if (jsArr.modelList[j].commFloorUtilList[m].commentUtilList.length>0){
                                for (var n=0;n<jsArr.modelList[j].commFloorUtilList[m].commentUtilList.length;n++){
                                    b+=" <ul class=ul>" +
                                        " <li>" +
                                        " <img src='${pageContext.request.contextPath}/"+jsArr.modelList[j].commFloorUtilList[m].commentUtilList[n].customer.headPhoto+"' class='ul-img' >" +
                                        " <a href=''>"+jsArr.modelList[j].commFloorUtilList[m].commentUtilList[n].customer.custName+"</a><span> 回复</span><a href=''>"+jsArr.modelList[j].commFloorUtilList[m].commentUtilList[n].commentUtil.customer.custName+"：</a> <span>"+jsArr.modelList[j].commFloorUtilList[m].commentUtilList[n].comment.commContent+"</span>" +
                                        " </li>" +
                                        " <li class='ul-li'>"+strFormat(jsArr.modelList[j].commFloorUtilList[m].commentUtilList[n].comment.commTime)+"<input type='hidden' id='spare' value="+jsArr.modelList[j].commFloorUtilList[m].commentUtilList[n].comment.commId+"><a  class='tb-app' href='' onclick='getId(this)' data-toggle=modal data-target=#modalUpdateEmp>回复</a><input type='hidden' id='spare' value="+jsArr.modelList[j].commFloorUtilList[m].comment.commState+"> </li>" +
                                        " </ul>"
                                }
                            }
                            b+="<span class='spake'>我也说一句</span><input  class='spake-input' type='text' ><input type=hidden value="+jsArr.modelList[j].commFloorUtilList[m].comment.commId+"><a href='javascript:insert1(this)' onclick='getId(this)' class=spake-a>发表</a><input type=hidden value="+jsArr.modelList[j].commFloorUtilList[m].comment.commState+">" +
                                "</div>";
                            div.innerHTML+=b;
                        }

                    }
                }
                div.innerHTML+="<input type=hidden id='postId' value="+jsArr.modelList[0].postUtil.post.postId+">";

                var page="<div id=page><ul class='pagination'>";
                 totalPage=jsArr.totalPages;
                if (jsArr.currentPageCode!=1){
                    var sPage="<li><a href='"+'javascript:refresh('+postId+','+(jsArr.currentPageCode-1)+')'+"'>«</a></li>";
                    page+=sPage;
                }
                for (var i=1;i<=jsArr.totalPages;i++){
                    if (jsArr.currentPageCode==i){
                        page+="<li><a class='active' href='"+'javascript:refresh('+postId+','+i+')'+"'>"+i+"</a></li>"
                    }
                    else if (i<=10){
                        page+="<li><a href='"+'javascript:refresh('+postId+','+i+')'+"'>"+i+"</a></li>"
                    }
                }
                //var currentPage="<span>当前是第</span> <span>"+jsArr.currentPageCode+"页</span>"
                //page+=currentPage;
                if (jsArr.currentPageCode!=jsArr.totalPages){
                    var nextPage="<li><a href='"+'javascript:refresh('+postId+','+(jsArr.currentPageCode+1)+')'+"'>»</a></li>";
                    page+=nextPage;
                }
                var pageCount="<li style='display: inline-block;border: 1px solid darkgray;margin-left: 3px;margin-right: 3px;padding: 4px 12px;'><sapn>共</span><span>"+jsArr.totalPages+"页</span></li>";
                page+=pageCount;
                var getPage="<li><input type=text id='pageCode' style='padding: 4px 12px;width:60px'></li><li><input type='button' value='跳转' onclick='jump()' style='padding: 4px 12px'></li>";
                page+=getPage;
                page+="</ul></div>";
                div.innerHTML+=page;

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
        xhr.send(formdate);
    }

    //评论时获取被评论人id和楼层
    function getId(xx) {
        spare=xx.previousElementSibling.value;
        floor=xx.nextElementSibling.value;
        content1=xx.previousElementSibling.previousElementSibling.value;
        //document.getElementById("spare").value=spare;
    }

    //发表评论
    function insert() {

        if (customer==null||customer==""){
            alert("请先登录");
            document.getElementById("content").value="";
        }
        else{

        if (window.XMLHttpRequest)
        {
            xhr=new XMLHttpRequest();
        }
        else
        {
            xhr=new ActiveXObject("Microsoft.XMLHTTP");
        }
        //xhr.open("POST", url,true);

        var form=new FormData;
        var content=document.getElementById("content").value;
        var postId=document.getElementById("postId").value;
        //var spare=document.getElementById("spare").value;
        var url="${pageContext.request.contextPath}/comment/insert";
        form.append("spare",spare);
        form.append("content",content);
        form.append("postId",postId);
        form.append("state",floor);
        xhr.open("POST", url,true);
        xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=utf-8");


        var data="spare="+spare+"&content="+content+"&postId="+postId+"&state="+floor;

        var page=1;
        xhr.onreadystatechange = function(){
            spare=null;
            floor=0;
            document.getElementById("content").value="";
            if (xhr.readyState == 4 && xhr.status == 200) {
                alert("回复成功");
                refresh(postId, page);
            }

        }
        xhr.send(data);
        }
    }

    //第二种发表评论方式
    function insert1(x) {
        if (customer==null||customer==""){
            alert("请先登录")
        }
        else{

        if (window.XMLHttpRequest)
        {
            xhr=new XMLHttpRequest();
        }
        else
        {
            xhr=new ActiveXObject("Microsoft.XMLHTTP");
        }
        var form=new FormData;
        var postId=document.getElementById("postId").value;
        var url="${pageContext.request.contextPath}/comment/insert";
        xhr.open("POST", url,true);
        xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=utf-8");

        var data="spare="+spare+"&content="+content1+"&postId="+postId+"&state="+floor;

        var page=1;
        xhr.onreadystatechange = function(){
            spare=null;
            floor=0;
            //document.getElementById("contents").value="";
            if (xhr.readyState == 4 && xhr.status == 200) {
                alert("回复成功");
                refresh(postId, page);
            }

        }
        xhr.send(data);

        }
    }

    //跳转页面
    function jump() {
        var page=document.getElementById("pageCode").value;
        if (page>totalPage||page<=0){
            alert("当前最大页码为"+totalPage+",请输入正确的页码")
        }
        else{
            var postId=document.getElementById("postId").value;
            refresh(postId,page);
        }
    }

    //日期类型转换
    function strFormat(str){
        var date=new Date(str);
        var setDate=date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
        return setDate;
    }

</script>

</html>
