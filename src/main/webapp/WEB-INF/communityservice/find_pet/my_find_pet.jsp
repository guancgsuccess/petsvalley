<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/24/024
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>我的寻宠信息</title>
    </head>
    <body>
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_e.jsp"></jsp:include>

        <div class="container breadcrumbs">
            <h1>我的寻宠信息</h1>
            <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;<a href="${pageContext.request.contextPath}/cs_find_pets">寻宠信息</a> &nbsp;/&nbsp;我的寻宠信息 </div>
        </div>
        <!--container-->
        <section id="container">
            <div class="container">

                <div class="clear"></div>

                <section id="find-pet-list" class="row da-thumbs portfolio filtrable clearfix">
                </section>
            </div>
        </section>

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer_e.jsp"></jsp:include>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/find_pets/my_find_pet.js"></script>
    </body>
</html>
