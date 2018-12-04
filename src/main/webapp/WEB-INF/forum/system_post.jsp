<%@ page import="com.petsvalley.entity.Customer" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/22/022
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>社区指南</title>
        <meta name="viewport" content="width=100%; initial-scale=1; maximum-scale=1; minimum-scale=1; user-scalable=no;" />
        <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
        <title>主页</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.css" type="text/css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/css/style.css" type="text/css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/css/prettyPhoto.css" type="text/css" rel="stylesheet" />
        <!--[if lt IE 9]>
        <!--<script type="text/javascript" src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>-->
        <link href="${pageContext.request.contextPath}/css/ie.css" type="text/css" rel="stylesheet"/>
        <!--<![endif]&ndash;&gt;-->
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easing.1.3.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.quicksand.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/superfish.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/hoverIntent.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.hoverdir.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.flexslider.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.prettyPhoto.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.elastislide.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/smoothscroll.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ui.totop.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/ajax-mail.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/accordion.settings.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />



        <style>

            @keyframes ran {
                from {
                    backgroud-position: 0 0;
                }
                to {
                    background-position: 2000px 0;
                }
            }

            .content span{
                line-height: 60px;
                color: blue;
            }


            *{
                margin: 0;
            }
            body{
                background: #f8f8f8;
                font-family: "Microsoft YaHei";
            }
            .ul li{
                list-style: none;
                margin-top: 10px;
            }
            .content{
                font-family: "Micrsoft Yahei"; /*//设置字体*/

                font-size: 16px; /*//设置字号*/
                margin: 0 auto;

                color:black;/*// 设置颜色*/

                text-indent: 2em; /*//段落缩进*/

                text-align: center; /*//段落排版居中(左右分别是, left, right)*/

                line-height: 2em; //行间距*/

            letter-spacing: 15px;/* //字间距(中文)*/
                width: 80%;
                margin-top: 20px
                /*word-spacing: 30px; //单词间距*/
            }

            #page{
                width: 78%;
                height: auto;
            }

            .pagination {
                margin-top: 30px;
                margin-left: 40px;
                margin-bottom: 20px;
                display: inline-block;
                padding: 0;

            }
            .pagination a{
                border:1px solid darkgrey}
            .pagination li {display: inline}

            .pagination li a {
                color: #E89E1A;
                float: left;

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
            var xhr=null;
            var regulations_url="${pageContext.request.contextPath}/SystemPost/regulations?page=1";
            var url2="${pageContext.request.contextPath}/SystemPost/strategy?page=1";
            window.onload=function () {
                Refresh1(regulations_url);
                Refresh2(url2);
            }

            function Refresh1(myurl) {
                var number=0;
                if (window.XMLHttpRequest)  {
                    xhr=new XMLHttpRequest();
                }  else  {
                    xhr=new ActiveXObject("Microsoft.XMLHTTP");
                }

                xhr.open("GET",myurl,false);
                console.log(myurl);
                xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");

                xhr.onreadystatechange = function(){
                    if (xhr.readyState==4&&xhr.status==200) {

                        var jsArr= JSON.parse(xhr.responseText);
                        console.log(xhr.responseText);
                        var div=document.getElementById("top");
                        div.innerHTML="<ul class='ul'>";
                        for (var i=0;i<jsArr.modelList.length;i++){
                            number++;
                            div.innerHTML+="<input type='hidden' value='1'> <a href='javascript:getContent(this)' onclick='getContent(this)'><li style='margin-top: 10px;list-style: none;margin-left: 5px'>"+number+"、"+jsArr.modelList[i].regTitle+"</li></a><input type='hidden' value="+jsArr.modelList[i].regId+"> ";

                        }
                        div.innerHTML+="</ul>";

                        var page="<div id=page><ul class='pagination'>";

                        if (jsArr.currentPageCode!=1){
                            var getAllUser="${pageContext.request.contextPath}/SystemPost/regulations?page="+(jsArr.currentPageCode-1);
                            var sPage="<li><a href='"+'javascript:Refresh1("'+getAllUser+'")'+"'>«</a></li>";
                            page+=sPage;
                        }
                        for (var i=1;i<=jsArr.totalPages;i++){
                            var getAllUsers="${pageContext.request.contextPath}/SystemPost/regulations?page="+i;
                            if (jsArr.currentPageCode==i){
                                page+="<li><a class='active' href='"+'javascript:Refresh1("'+getAllUsers+'")'+"'>"+i+"</a></li>"
                            }
                            else if (i<=10){
                                page+="<li><a href='"+'javascript:Refresh1("'+getAllUsers+'")'+"'>"+i+"</a></li>"
                            }
                        }
                        //var currentPage="<span>当前是第</span> <span>"+jsArr.currentPageCode+"页</span>"
                        //page+=currentPage;
                        if (jsArr.currentPageCode!=jsArr.totalPages){
                            var getAllUser="${pageContext.request.contextPath}/SystemPost/regulations?page="+(jsArr.currentPageCode+1);
                            var nextPage="<li><a href='"+'javascript:Refresh1("'+getAllUser+'")'+"'>»</a></li>";
                            page+=nextPage;
                        }

                        var getPage="<li><input type=text  style='padding: 3px 11px;width:60px;height: 40px'></li><li><input type='button' value='跳转' onclick='jump(this)' style='padding: 3px 11px;height: 40px'><input type='hidden' value='1'></li>";
                        page+=getPage;
                        page+="</ul></div>";
                        div.innerHTML+=page;

                        var titles=document.getElementById("titles");
                        titles.innerHTML="";
                        titles.innerHTML+="<span style='line-height: 50px;margin-left: 50px'>"+jsArr.modelList[0].regTitle+"</span><span style='display: block;margin-left: 600px;font-size: 14px'>日期："+strFormat(new Date())+"</span>" +
                            "<span style='display: block;margin-left: 602px;font-size: 14px'>by："+jsArr.modelList[0].regDepartment+"</span>";
                        var master=document.getElementById("master");
                        master.innerHTML="";
                        master.innerHTML+="<div class='content'>"+jsArr.modelList[0].regContent+"</div>";
                    }
                }
                xhr.send();
            }

            function mytest(){
                console.log("mytest....");
            }
            function Refresh2(url) {
                var number=0;
                if (window.XMLHttpRequest)
                {
                    xhr=new XMLHttpRequest();
                }
                else
                {
                    xhr=new ActiveXObject("Microsoft.XMLHTTP");
                }

                xhr.open("GET",url,false);
                xhr.setRequestHeader("Content-Type","application/json;charset=utf-8");

                xhr.onreadystatechange = function(){
                    if (xhr.readyState==4&&xhr.status==200) {
                        var jsArr = JSON.parse(xhr.responseText);
                        var div = document.getElementById("right-top");
                        div.innerHTML = "<ul class='ul'>";
                        for (var i = 0; i < jsArr.modelList.length; i++) {
                            number++;
                            div.innerHTML += "<input type='hidden' value='2'><a href='javascript:getContent(this)' onclick='getContent(this)'><li style='margin-top: 10px;list-style: none;margin-left: 5px'>" +number+"、"+ jsArr.modelList[i].straTitle + "</li></a><input type='hidden' value="+jsArr.modelList[i].straId+">";

                        }
                        div.innerHTML+="</ul>";
                        var page="<div id=page><ul class='pagination'>";

                        if (jsArr.currentPageCode!=1){
                            var getAllUser="${pageContext.request.contextPath}/SystemPost/strategy?page="+(jsArr.currentPageCode-1);
                            var sPage="<li><a href='"+'javascript:Refresh2("'+getAllUser+'")'+"'>«</a></li>";
                            page+=sPage;
                        }
                        for (var i=1;i<=jsArr.totalPages;i++){
                            var getAllUsers="${pageContext.request.contextPath}/SystemPost/strategy?page="+i;
                            if (jsArr.currentPageCode==i){
                                page+="<li><a class='active' href='"+'javascript:Refresh2("'+getAllUsers+'")'+"'>"+i+"</a></li>"
                            }
                            else if (i<=10){
                                page+="<li><a href='"+'javascript:Refresh2("'+getAllUsers+'")'+"'>"+i+"</a></li>"
                            }
                        }
                        //var currentPage="<span>当前是第</span> <span>"+jsArr.currentPageCode+"页</span>"
                        //page+=currentPage;
                        if (jsArr.currentPageCode!=jsArr.totalPages){
                            var getAllUser="${pageContext.request.contextPath}/SystemPost/strategy?page="+(jsArr.currentPageCode+1);
                            var nextPage="<li><a href='"+'javascript:Refresh2("'+getAllUser+'")'+"'>»</a></li>";
                            page+=nextPage;
                            //alert(page.innerHTML);
                        }
                        /*var pageCount="<li style='display: inline-block;border: 1px solid darkgray;margin-left: 3px;margin-right: 3px;padding: 4px 12px;'><sapn>共</span><span>"+jsArr.totalPages+"页</span></li>";
                        page+=pageCount;*/
                        var getPage="<li><input type=text  style='width:60px;height: 40px'></li><li><input type='button' value='跳转' onclick='jump(this)' style='padding: 3px 11px;height: 40px'><input type='hidden' value='2'> </li>";
                        page+=getPage;
                        page+="</ul></div>";
                        div.innerHTML+=page;
                    }
                }
                xhr.send( );
            }

            function getContent(x) {
                var id=x.nextElementSibling.value;
                var type=x.previousElementSibling.value;
                var url="${pageContext.request.contextPath}/SystemPost/getOne?id="+id+"&type="+type;
                if (window.XMLHttpRequest)
                {
                    xhr=new XMLHttpRequest();
                }
                else
                {
                    xhr=new ActiveXObject("Microsoft.XMLHTTP");
                }

                xhr.open("GET", url,true);
                xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
                xhr.onreadystatechange = function(){
                    if (xhr.readyState==4&&xhr.status==200) {
                        var jsArr = JSON.parse(xhr.responseText);
                        if (type==1){
                            var titles=document.getElementById("titles");
                            titles.innerHTML="";
                            titles.innerHTML+="<span style='line-height: 50px;margin-left: 50px'>"+jsArr.regTitle+"</span><span style='display: block;margin-left: 600px;font-size: 14px'>日期："+strFormat(new Date())+"</span>" +
                                "<span style='display: block;margin-left: 602px;font-size: 14px'>by："+jsArr.regDepartment+"</span>";
                            var master=document.getElementById("master");
                            master.innerHTML="";
                            master.innerHTML+="<div class='content'>"+jsArr.regContent+"</div>";
                        }
                        else if(type==2){
                            var titles=document.getElementById("titles");
                            titles.innerHTML="";
                            titles.innerHTML+="<span style='line-height: 40px;margin-left: 50px'>"+jsArr.straTitle+"</span><span style='display: block;margin-left: 600px;font-size: 14px'>日期："+strFormat(jsArr.straTime)+"</span>" +
                                "<span style='display: block;margin-left: 602px;font-size: 14px'>by："+jsArr.straSpare+"</span>";
                            var master=document.getElementById("master");
                            master.innerHTML="";
                            master.innerHTML+="<div class='content'>"+jsArr.straMessage+"</div>";
                        }

                    }
                }
                xhr.send(null);
            }
            //日期类型转换
            function strFormat(str){
                var date=new Date(str);
                var setDate=date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
                return setDate;
            }

            function jump(x) {
                var page=x.parentNode.previousSibling.firstChild.value;
                var type=x.nextElementSibling.value;
                if (type==1){
                    var url="${pageContext.request.contextPath}/SystemPost/regulations?page="+page;
                    Refresh1(url);
                }
                else if (type==2){
                    var url="${pageContext.request.contextPath}/SystemPost/strategy?page="+page;
                    Refresh2(url);
                }

            }
        </script>
    </head>
    <body>
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_e.jsp"></jsp:include>

        <div class="container breadcrumbs">
            <h1>社区指南</h1>
            <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;社区指南 </div>
        </div>
        <section id="container">
            <div class="container">
                <!--分类-->
                <%--<a href="${pageContext.request.contextPath}/cs_release_foster">发布寄养信息</a>--%>
                <div id="left" style="display: inline-block;position: absolute">
                    <span style="font-size: 17px;margin-left: 20px;">疾病预防：</span>
                    <div id="top" style="margin-left: 20px;height: 300px;width: 500px;border: 3px solid #d2e4ff;">
                    </div>
                </div>
                <div id="right" style="display: inline-block;">
                    <span style="margin-left: 630px;font-size: 17px;">相关规定：</span>
                    <div id="right-top" style="margin-left: 630px;border: 3px solid #d2e4ff;height: 300px;width: 500px;border-radius: 3px 3px 0 0;">
                    </div>
                </div>

                <div id="titles" style="margin: 0 auto;width: 70%;height: 100px;background-color: #c09853;margin-top: 30px;color: white">
                </div>

                <div id="master" style="background-color:#c09853;margin: 0 auto;width: 70%;height: auto;margin-top: -20px">
                    <div class="content" style="">
                    </div>
                </div>
        </section>
                <!--footer-->
                <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer.jsp"></jsp:include>
                <a href="#" id="toTop" style="display: inline;"><span id="toTopHover" style="opacity: 0;"></span>To Top</a>
    </body>
</html>
