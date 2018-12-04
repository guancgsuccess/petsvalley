<%@ page import="com.petsvalley.entity.Customer" %><%--
  Created by IntelliJ IDEA.
  User: mjs
  Date: 2018/10/14
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        .panel-title{
            display: block;
            width: 80%;
            height: 40px;
            font-size: 16px;
            padding-top: 10px;
            border: 1px solid goldenrod;
            text-overflow: ellipsis;
            overflow: hidden;
        }
        .panel-title:hover{
            background-color: #dbc59e;
        }
        </style>
    <% Customer customer=(Customer ) session.getAttribute( "customer" );%>
</head>
<body>
<div class="clumn1" style=" width: 20%;display: inline-block;vertical-align: top;margin-top: 40px">
    <div class="panel-group" id="panel-671719">
        <div class="panel panel-default">
            <div class="panel-heading">
                <a class="panel-title collapsed" href="javascript:void(0)"><img style="background: none" class="img-circle" src="${pageContext.request.contextPath}/example/userinfo1.png" >个&nbsp;&nbsp;人&nbsp;&nbsp;中&nbsp;&nbsp;心</a>
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading">
                <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-671719" href="#panel-element-431105"><img class="img-circle" src="${pageContext.request.contextPath}/example/baseinfo1.png" >基&nbsp;&nbsp;础&nbsp;&nbsp;信&nbsp;&nbsp;息</a>
            </div>
            <div id="panel-element-431105" class="panel-collapse collapse">
                <div class="panel-body">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/userInfo">账号设置</a>
                </div>
                <div class="panel-body">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/message">消息中心<%if(customer!=null&&(Integer.parseInt( customer.getCustSpare().trim()))>0){%><span class="badge pull-right" style="margin-left: -100px;background-color: #c43c35"><%=customer.getCustSpare()%></span><%}%> </a>
                </div>
                <div class="panel-body">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/myposts">我的帖子</a>
                </div>
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading">
                <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-671719" href="#panel-element-957670"><img class="img-circle" src="${pageContext.request.contextPath}/example/relateinfo1.png">相&nbsp;&nbsp;关&nbsp;&nbsp;信&nbsp;&nbsp;息</a>
            </div>
            <div id="panel-element-957670" class="panel-collapse collapse">
                <div class="panel-body">
                    <a class="panel-title collapsed" href="${pageContext.request.contextPath}/service2">志愿服务</a>
                </div>
                <div class="panel-body">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/punishment">处罚记录</a>
                </div>
                <div class="panel-body">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/apply">我的申请</a>
                </div>
                <div class="panel-body">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/appeal">我的申诉</a>
                </div>
                <div class="panel-body">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/foster">我的寄养</a>
                </div>
                <div class="panel-body">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/findPet">我的寻宠</a>
                </div>
                <%--<div class="panel-body">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/strategy">匹配邀请</a>
                </div>--%>

            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading">
                <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-34342" href="#panel-element-56870"><img class="img-circle" src="${pageContext.request.contextPath}/example/mypet1.png">我&nbsp;&nbsp;的&nbsp;&nbsp;宠&nbsp;&nbsp;物</a>
            </div>
            <div id="panel-element-56870" class="panel-collapse collapse">
                <div class="panel-body">
                    <a class="panel-title collapsed" href="${pageContext.request.contextPath}/mypets">基本信息</a>
                </div>
                <div class="panel-body">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/seedoctor">就医记录</a>
                </div>
               <%-- <div class="panel-body">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/match">匹配信息</a>
                </div>--%>
                <div class="panel-body">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/vaccine">防疫记录</a>
                </div>
                <div class="panel-body">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/physical">体检记录</a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
