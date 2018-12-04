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
        .panel-title:active{
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
                <a class="panel-title collapsed" href="javascript:void(0)"><img style="background: none" class="img-circle" src="${pageContext.request.contextPath}/example/system.png" >系统管理</a>
            </div>
        </div>
        <div class="panel panel-default">
                <div class="panel-heading">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/customer"><img style="background: none" class="img-circle" src="${pageContext.request.contextPath}/example/usermanage .png" >用户管理</a>
                </div>
                <div class="panel-heading">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/postmanage"><img style="background: none" class="img-circle" src="${pageContext.request.contextPath}/example/relateinfo1.png" >帖子管理</a>
                </div>
                <div class="panel-heading">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/petmanage"><img style="background: none" class="img-circle" src="${pageContext.request.contextPath}/example/mypet1.png" >宠物管理</a>
                </div>
                <div class="panel-heading">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/system"><img style="background: none" class="img-circle" src="${pageContext.request.contextPath}/example/applymanage.png">申请管理</a>
                </div>
                <div class="panel-heading">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/appealmanage"><img style="background: none" class="img-circle" src="${pageContext.request.contextPath}/example/appeal.png" >申诉管理</a>
                </div>
                <div class="panel-heading">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/physicalmanage"><img style="background: none" class="img-circle" src="${pageContext.request.contextPath}/example/physical.png" >体检管理</a>
                </div>
                <div class="panel-heading">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/vaccinemanage"><img style="background: none" class="img-circle" src="${pageContext.request.contextPath}/example/vaccine.png" >防疫管理</a>
                </div>
                <div class="panel-heading">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/servicemanage"><img style="background: none" class="img-circle" src="${pageContext.request.contextPath}/example/service.png" >服务管理</a>
                </div>
                <div class="panel-heading">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/punishmentmanage"><img style="background: none" class="img-circle" src="${pageContext.request.contextPath}/example/punishment.png" >处罚管理</a>
                </div>
                <div class="panel-heading">
                    <a class="panel-title collapsed"  href="${pageContext.request.contextPath}/messagemanage"><img style="background: none" class="img-circle" src="${pageContext.request.contextPath}/example/message.png" >消息管理</a>
                </div>
        </div>

    </div>
</div>
</body>
</html>
