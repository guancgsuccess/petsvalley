<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/30/030
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>寻宠信息</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

    </head>
    <body>
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_e.jsp"></jsp:include>

        <div class="container breadcrumbs">
            <h1>寻宠信息</h1>
            <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;寻宠信息 </div>
        </div>
        <!--container-->
        <section id="container">
            <div class="container">
                <!--分类-->
                <a href="${pageContext.request.contextPath}/cs_release_find_pet">发布寻宠信息</a>
                <ul id="filtrable">
                    <li class="all"><a id="all-link" href="javascript:all_link_click()">所有</a></li>
                    <li class="not-founded"><a id="not-founded-link" href="javascript:not_founded_link_click()">未找到</a></li>
                    <li class="founded"><a id="founded-link" href="javascript:founded_link_click()">已找到</a></li>
                </ul>

                <div class="clear"></div>

                <section id="find-pet-list" class="row da-thumbs portfolio filtrable clearfix">
                </section>
                <!--pagination-->
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
        <a href="#" id="toTop" style="display: inline;"><span id="toTopHover" style="opacity: 0;"></span>To Top</a>
    </body>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/find_pets/find_pets.js"></script>
</html>
