<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/18/018
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>志愿服务</title>
        <meta name="viewport" content="width=100%; initial-scale=1; maximum-scale=1; minimum-scale=1; user-scalable=no;" />
        <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
        <link href="${pageContext.request.contextPath}/css/volunteer_service/volunteer_service.css" type="text/css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    </head>
    <body>
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_e.jsp"></jsp:include>

        <div class="container breadcrumbs">
            <h1>志愿服务</h1>
            <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;志愿服务</div>
        </div>

        <section id="container">

            <div class="container">
                <ul id="filtrable">
                    <li><a id="service-by-time" href="javascript:time_click()">按时间</a></li>
                    <li><a id="service-by-no" href="javascript:no_click()">按人数</a></li>
                    <li><a id="service-by-reward" href="javascript:reward_click()">按积分</a></li>
                </ul>

                <div class="clear"></div>
                <section class="service-list" id="service-list">
                </section>

                <div class="pagination pagination-centered">
                    <ul id="page-ul">
                        <li class="disabled"><a href="#">&laquo;</a></li>
                        <li class="active"><a href="#">1</a>
                        <li class="disabled"><a href="#">&raquo;</a></li>
                    </ul>
                </div>
            </div>

        </section>

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer_e.jsp"></jsp:include>

        <script type="text/javascript" src="${pageContext.request.contextPath}/js/volunteer_service/volunteer_service.js"></script>
    </body>
</html>
