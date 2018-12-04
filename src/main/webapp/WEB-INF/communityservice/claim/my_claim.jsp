<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/25/025
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>我的认领信息</title>
    </head>
    <body>
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_e.jsp"></jsp:include>

        <div class="container breadcrumbs">
            <h1>我的认领信息</h1>
            <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;<a href="${pageContext.request.contextPath}/cs_claim">宠物认领</a> &nbsp;/&nbsp;我的认领信息 </div>
        </div>
        <!--container-->
        <section id="container">
            <div class="container">

                <div class="clear"></div>

                <section id="claim-list" class="row da-thumbs portfolio filtrable clearfix">
                </section>
            </div>
        </section>

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer_e.jsp"></jsp:include>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/claim/my_claim.js"></script>
    </body>
</html>
