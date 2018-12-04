<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/22/022
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>宠物寄养</title>
        <meta name="viewport" content="width=100%; initial-scale=1; maximum-scale=1; minimum-scale=1; user-scalable=no;" />
        <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
        <link href="${pageContext.request.contextPath}/css/bootstrap.css" type="text/css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/css/ie.css" type="text/css" rel="stylesheet"/>
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
    </head>
    <body>
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_e.jsp"></jsp:include>

        <div class="container breadcrumbs">
            <h1>宠物寄养</h1>
            <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;宠物寄养 </div>
        </div>

        <section id="container">
            <div class="container">
                <!--分类-->
                <a href="${pageContext.request.contextPath}/cs_release_foster">发布寄养信息</a>

                <div class="btn-group" style="display: inline-block;float: right;">
                    <button type="button" id="pet-disc-btn" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                        宠物种类<span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" role="menu">
                        <li><a onclick="changePetDisc(this)" href="#">所有种类</a></li>
                        <li><a onclick="changePetDisc(this)" href="#">狗</a></li>
                        <li><a onclick="changePetDisc(this)" href="#">猫</a></li>
                        <li><a onclick="changePetDisc(this)" href="#">猪</a></li>
                        <li><a onclick="changePetDisc(this)" href="#">兔</a></li>
                        <li><a onclick="changePetDisc(this)" href="#">鼠</a></li>
                        <li><a onclick="changePetDisc(this)" href="#">鱼</a></li>
                        <li><a onclick="changePetDisc(this)" href="#">鸟</a></li>
                        <li><a onclick="changePetDisc(this)" href="#">龟</a></li>
                        <li><a onclick="changePetDisc(this)" href="#">蛇</a></li>
                        <li><a onclick="changePetDisc(this)" href="#">猴</a></li>
                        <li><a onclick="changePetDisc(this)" href="#">蜘蛛</a></li>
                        <li><a onclick="changePetDisc(this)" href="#">蜥蜴</a></li>
                        <li><a onclick="changePetDisc(this)" href="#">狐狸</a></li>
                        <li><a onclick="changePetDisc(this)" href="#">鳄鱼</a></li>
                        <li><a onclick="changePetDisc(this)" href="#">其他</a></li>
                    </ul>
                </div>
                <ul id="filtrable">
                    <li class=""><a id="all" href="javascript:conditionAllClick()">所有</a></li>
                    <li class=""><a id="not" href="javascript:conditionNotClick()">未寄养</a></li>
                    <li class=""><a id="already" href="javascript:conditionAlreadyClick()">已寄养</a></li>
                </ul>

                <div class="clear"></div>

                <section id="foster-list" class="row da-thumbs portfolio filtrable clearfix">
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

        <script type="text/javascript" src="${pageContext.request.contextPath}/js/foster/foster.js"></script>
    </body>
</html>
