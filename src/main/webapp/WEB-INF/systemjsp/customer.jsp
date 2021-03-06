<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: mjs
  Date: 2018/10/14
  Time: 0:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户管理</title>
    <link href="${pageContext.request.contextPath}/css/userinfo.css" type="text/css" rel="stylesheet"/>
    <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
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
    <link rel="stylesheet" href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
    <script src="//apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
    <script>
        var url_getcustomerlist ='${pageContext.request.contextPath}/customer/getAllByPage';
        //页面加载后，首先加载所有的消息数据
        window.onload=function() {
            refreshCustomerList(url_getcustomerlist);
            $( "#from" ).datepicker( "option", "dateFormat","yy-mm-dd" );
            $(function() {
                $( "#from" ).datepicker( "option", "dateFormat","yy-mm-dd" );
                $( "#from" ).datepicker({
                    defaultDate: "+1w",
                    showButtonPanel: true,
                    onClose: function( selectedDate ) {
                        $( "#to" ).datepicker( "option", "minDate", selectedDate );
                        $( "#from" ).datepicker( "option", "dateFormat","yy-mm-dd" );
                        $( "#to" ).datepicker( "option", "dateFormat","yy-mm-dd" );
                    }
                });
                $( "#to" ).datepicker({
                    defaultDate: "+1w",
                    showButtonPanel: true,
                    onClose: function( selectedDate ) {
                        $( "#from" ).datepicker( "option", "maxDate", selectedDate );
                        $( "#from" ).datepicker( "option", "dateFormat","yy-mm-dd" );
                        $( "#to" ).datepicker( "option", "dateFormat","yy-mm-dd" );
                    }
                });
            });
        }
        //加载消息数据
        var xhr = null;
        function refreshCustomerList(url_getcustomerlist) {
            var objArr = null;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_getcustomerlist, true);
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            xhr.onreadystatechange = loadCustomers;
            xhr.send();
        }
        function delforCustomer(obr1){
            var url_delcustomer = '${pageContext.request.contextPath}/customer/delete/msgid/'+obr1;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_delcustomer, true);
            //xhr.setRequestHeader("X-Requested-With","XMLHttpRequest");
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            window.location="${pageContext.request.contextPath}/customer";
            xhr.send();
        }
        function loadCustomers() {
            if (xhr.readyState == 4 && xhr.status == 200) {
                var page = JSON.parse(xhr.responseText);
                var objArr=page.modelList;
                var tbody = document.getElementById("tbody");
                tbody.innerHTML = "";
                for (var i = 0; i < objArr.length; i++) {
                    if(objArr[i].cusGender==0){
                        objArr[i].cusGender="女";
                    }else
                        objArr[i].cusGender="男";
                    tbody.innerHTML += ('<tr><td>' + objArr[i].custId + '</td>' +
                        '<td >' + objArr[i].custName + '</td>' +
                        '<td >' + objArr[i].custPwd + '</td>' +
                        '<td >' + objArr[i].cusGender + '</td>' +
                        '<td>' +objArr[i].custAge+'</td>' +
                        '<td>' +objArr[i].custPhone+'</td>' +
                        '<td>' +objArr[i].custEmail+'</td>' +
                        '<td>' +objArr[i].custIntegral+'</td>' +
                        '<td>' +strFormat(objArr[i].custCreateTime)+'</td>' +
                        '<td><a id="btnDel"  style="cursor: pointer" onclick="delforCustomer('+ objArr[i].custId +')">删除</a></td></tr>');
                }
                var pagearea=document.getElementById("pagearea");
                pagearea.innerHTML="";
                if(page.currentPageCode!=1){
                    var url_page=url_getcustomerlist+"/page/"+(page.currentPageCode-1);
                    var href='javascript:refreshCustomerList("'+url_page+'")';
                    var prePage="<a href='"+href+"'>上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                    pagearea.innerHTML+=prePage;
                }
                var currentpage="<span>当前第</span><span>"+page.currentPageCode+"</sapn><span>页</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                pagearea.innerHTML+=currentpage;
                if(page.currentPageCode<page.totalPages){
                    var url_page=url_getcustomerlist+"/page/"+(page.currentPageCode+1);
                    var href='javascript:refreshCustomerList("'+url_page+'")';
                    var nextPage="<a href='"+href+"' >下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                    pagearea.innerHTML+=nextPage;
                }
                //页面其他信息
                var otherEle="<span>共</span><span>"+page.totalPages+"<span>页</sapn>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='text' id='topage' style='padding: 2px !important;width: 40px;height: 25px'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+"<input type='button' onclick='href2page()' style='padding: 0 !important;display: inline-block' value='&nbsp;&nbsp;&nbsp;跳转&nbsp;&nbsp;&nbsp;'>";
                pagearea.innerHTML+=otherEle;
            }
        }
        function  href2page() {
            var url2page=url_getcustomerlist+"/page/"+(document.getElementById("topage").value);
            refreshCustomerList(url2page);
        }
        function strFormat(str){
            var date=new Date(str);
            var setDate=date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
            return setDate;
        }
        function selectbydate() {
            var to=document.getElementById("to").value;
            var from1=document.getElementById("from").value;
            if((to=="")||(from1=="")){
                alert("请选择结束(开始)时间");
                return;
            }
            var url_getcustomerlistbydate ='${pageContext.request.contextPath}/customer/getAllByPagedate/?from1='+from1+'&to='+to;
            refreshCustomerList(url_getcustomerlistbydate);
        }


    </script>
    <style type="text/css">
        .col-md-4 label,.col-md-4 input{
            display: inline-block;
            font-size: 14px;
            text-overflow: ellipsis;
            overflow: hidden;
        }
        .col-md-4 label{
            vertical-align: middle;
        }
        .col-md-4 input{
            width: 35%;
            height: 40px;
            -webkit-appearance: none;
            -moz-appearance: none;
            border: 0;
            outline: 0;
            text-overflow: ellipsis;
            overflow: hidden;
            padding-left: 80px!important;
            color: #606266;
            background:url(${pageContext.request.contextPath}/example/day.png)no-repeat;
            background-color:whitesmoke;
        }
        .col-md-4{
            text-overflow: ellipsis;
            overflow: hidden;
            height: 80px;
        }
        #tbl{
            table-layout: fixed;
        }
        #tbl td{
            border: 1px solid #eee;
            word-break:keep-all;
            text-overflow: ellipsis;
            overflow: hidden;
            text-align: center;
            white-space:nowrap;
        }
        .inpput{
            font-size: 14px!important;
            padding-left: 10px!important;
            height: 35px!important;
            width: 80%;
        }
    </style>

</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_system.jsp"></jsp:include>
<!--breadcrumbs -->
<div style="height: 35px" >
</div>
<div id="container" style="text-align: center;background-color: #eee">
    <div class="row clearfix"  >
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/applyleft.jsp"></jsp:include>
        <div style="display: inline-block;width:79% !important;margin-right: -16%">
            <div class="col-md-4 column" style="background-color:whitesmoke;margin-top: 40px;width: 79%">
                <div style="margin-top: 25px;">
                    <label for="from">选择日期:&nbsp;&nbsp;&nbsp;&nbsp;</label>
                    <input type="text" onchange="selectbydate()" id="from" placeholder="请选择开始时间" name="from">
                    <label for="to">到&nbsp;&nbsp;&nbsp;&nbsp;</label>
                    <input type="text" onchange="selectbydate()" id="to" placeholder="请选择结束时间" name="to">
                </div>
            </div>
            <div style="background-color: #eee;height: 10px;width: 79%"></div>
            <div id="haha" style="background-color:whitesmoke;width:79% !important; height: 80%" >
                <table class="table table-hover"  id="tbl">
                    <thead>
                    <tr>
                        <td>编号</td>
                        <td>姓名</td>
                        <td>密码</td>
                        <td>性别</td>
                        <td>年龄</td>
                        <td>电话</td>
                        <td>邮箱</td>
                        <td>积分</td>
                        <td>注册日期</td>
                        <td>操作</td>
                    </tr>
                    </thead>
                    <tbody id="tbody">

                    </tbody>
                </table>

                <div id="pagearea"></div>
            </div>

        </div>
    </div>
</div>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer1.jsp"></jsp:include>
</body>
</html>
