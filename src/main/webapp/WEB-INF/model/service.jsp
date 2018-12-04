<%--
  Created by IntelliJ IDEA.
  User: mjs
  Date: 2018/9/28
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=100%; initial-scale=1; maximum-scale=1; minimum-scale=1; user-scalable=no;" />
    <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <title>图片展示</title>
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


</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top.jsp"></jsp:include>
<!--breadcrumbs -->
<div class="container breadcrumbs">
    <h1>图片展示</h1>
    <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;图片展示 </div>
</div>
<!--container-->
<section id="container">
    <div class="container">
        <!--filter-->
       <%-- <ul id="filtrable">
            <li class="current all"><a href="#">All</a></li>
            <li class="html"><a href="#">Html</a></li>
            <li class="css"><a href="#">CSS</a></li>
            <li class="php"><a href="#">PHP</a></li>
            <li class="javascript"><a href="#">JavaScript</a></li>
        </ul>--%>

        <div class="clear"></div>

        <section class="row da-thumbs portfolio filtrable">
            <article data-id="id-1" data-type="javascript html" class="span4">
                <img src="example/latest1.jpg" alt="photo" />
                <div>
                    <a href="example/latest1.jpg" class="p-view" data-rel="prettyPhoto"></a>

                </div>
            </article>
            <article data-id="id-2" data-type="php" class="span4">
                <img src="example/latest2.jpg" alt="photo" />
                <div>
                    <a href="example/latest2.jpg" class="p-view" data-rel="prettyPhoto"></a>

                </div>
            </article>
            <article data-id="id-3" data-type="javascript" class="span4">
                <img src="example/latest3.jpg" alt="photo" />
                <div>
                    <a href="example/latest3.jpg" class="p-view" data-rel="prettyPhoto"></a>
                </div>
            </article>
            <article data-id="id-4" data-type="php" class="span4">
                <img src="example/latest4.jpg" alt="photo" />
                <div>
                    <a href="example/latest4.jpg" class="p-view" data-rel="prettyPhoto"></a>

                </div>
            </article>
            <article data-id="id-5" data-type="javascript html" class="span4">
                <img src="example/latest5.jpg" alt="photo" />
                <div>
                    <a href="example/latest5.jpg" class="p-view" data-rel="prettyPhoto"></a>
                </div>
            </article>
            <article data-id="id-6" data-type="php" class="span4">
                <img src="example/latest6.jpg" alt="photo" />
                <div>
                    <a href="example/latest6.jpg" class="p-view" data-rel="prettyPhoto"></a>
                </div>
            </article>
            <article data-id="id-7" data-type="php" class="span4">
                <img src="example/latest7.jpg" alt="photo" />
                <div>
                    <a href="example/latest7.jpg" class="p-view" data-rel="prettyPhoto"></a>
                </div>
            </article>
            <article data-id="id-8" data-type="css" class="span4">
                <img src="example/latest8.jpg" alt="photo" />
                <div>
                    <a href="example/latest8.jpg" class="p-view" data-rel="prettyPhoto"></a>
                </div>
            </article>
            <article data-id="id-9" data-type="html" class="span4">
                <img src="example/latest4.jpg" alt="photo" />
                <div>
                    <a href="example/latest4.jpg" class="p-view" data-rel="prettyPhoto"></a>
                </div>
            </article>
            <article data-id="id-10" data-type="css" class="span4">
                <img src="example/latest3.jpg" alt="photo" />
                <div>
                    <a href="example/latest3.jpg" class="p-view" data-rel="prettyPhoto"></a>
                </div>
            </article>
            <article data-id="id-11" data-type="html" class="span4">
                <img src="example/latest2.jpg" alt="photo" />
                <div>
                    <a href="example/latest2.jpg" class="p-view" data-rel="prettyPhoto"></a>
                </div>
            </article>
            <article data-id="id-12" data-type="css" class="span4">
                <img src="example/latest1.jpg" alt="photo" />
                <div>
                    <a href="example/latest1.jpg" class="p-view" data-rel="prettyPhoto"></a>
                </div>
            </article>
        </section>
        <!--pagination-->
        <%--<div class="pagination pagination-centered">
            <ul>
                <li class="disabled"><a href="#">&laquo;</a></li>
                <li class="active"><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#">&raquo;</a></li>
            </ul>
        </div>--%>
    </div>
</section>




<jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer.jsp"></jsp:include>
<body>

</body>
</html>
