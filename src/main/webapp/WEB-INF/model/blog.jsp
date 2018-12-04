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


</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top.jsp"></jsp:include>
<!--breadcrumbs -->
<div class="container breadcrumbs">
    <h1>模板页</h1>
    <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;个人博客 </div>
</div>
<section id="container">
    <div class="container">
        <div class="row">
            <section id="page-sidebar" class="alignleft span9">
                <article class="blog-post">
                    <a href="#"><img src="example/blog2.jpg" alt="photo" /></a>
                    <h2 class="post-title"><a href="#">Lorem ipsum dolor sit amet consectetur</a></h2>
                    <ul class="meta clearfix">
                        <li>01/09/2012</li>
                        <li>By: <a href="#">DXThemes</a></li>
                        <li>Comments: <a href="#">3</a></li>
                        <li>Posted in: <a href="#">News</a> | <a href="#">Business</a></li>
                    </ul>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                        Morbi posuere metus ut sem pellentesque nec ullamcorper leo sollicitudin.
                        Sed adipiscing placerat eros id tincidunt. Donec eu luctus tortor.
                        Posuere metus ut sem pellentesque nec ullamcorper leo
                    </p>
                    <a href="#" class="read-more">Read More...</a>
                </article>

                <div class="block-divider"></div>

                <article class="blog-post">
                    <h2><a href="#">Lorem ipsum dolor sit amet consectetur</a></h2>
                    <ul class="meta clearfix">
                        <li>01/09/2012</li>
                        <li>By: <a href="#">DXThemes</a></li>
                        <li>Comments: <a href="#">3</a></li>
                        <li>Posted in: <a href="#">News</a> | <a href="#">Business</a></li>
                    </ul>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                        Morbi posuere metus ut sem pellentesque nec ullamcorper leo sollicitudin.
                        Sed adipiscing placerat eros id tincidunt. Donec eu luctus tortor.
                        Posuere metus ut sem pellentesque nec ullamcorper leo
                    </p>
                    <a href="#" class="read-more">Read More ...</a>
                </article>

                <div class="block-divider"></div>

                <article class="blog-post">
                    <h2><a href="#">Lorem ipsum dolor sit consectetur</a></h2>
                    <ul class="meta clearfix">
                        <li>01/09/2012</li>
                        <li>By: <a href="#">DXThemes</a></li>
                        <li>Comments: <a href="#">3</a></li>
                        <li>Posted in: <a href="#">News</a> | <a href="#">Business</a></li>
                    </ul>
                    <blockquote>
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                            Morbi posuere metus ut sem pellentesque nec ullamcorper leo sollicitudin.
                            Sed adipiscing placerat eros id tincidunt. Donec eu luctus tortor.
                        </p>
                    </blockquote>
                </article>

                <div class="block-divider"></div>

                <article class="blog-post">
                    <div class="video">
                        <iframe src="http://player.vimeo.com/video/46225302" width="" height="" frameborder="0" webkitallowfullscreen="" mozallowfullscreen="" allowfullscreen=""></iframe>
                    </div>
                    <h2><a href="#">Post With Slider</a></h2>
                    <ul class="meta clearfix">
                        <li>01/09/2012</li>
                        <li>By: <a href="#">DXThemes</a></li>
                        <li>Comments: <a href="#">3</a></li>
                        <li>Posted in: <a href="#">News</a> | <a href="#">Business</a></li>
                    </ul>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                        Morbi posuere metus ut sem pellentesque nec ullamcorper leo sollicitudin.
                        Sed adipiscing placerat eros id tincidunt. Donec eu luctus tortor.
                        Posuere metus ut sem pellentesque nec ullamcorper leo
                    </p>
                    <a href="#" class="read-more">Read More ...</a>
                </article>
                <!--pagination-->
                <div class="pagination pagination-centered">
                    <ul>
                        <li class="disabled"><a href="#">&laquo;</a></li>
                        <li class="active"><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li><a href="#">&raquo;</a></li>
                    </ul>
                </div>
            </section>
            <!--sidebar-->
            <aside id="sidebar" class="alignright span3">
                <section>
                    <div class="title-divider">
                        <div class="divider-arrow"></div>
                        <h4>Blog Category</h4>
                    </div>
                    <ul class="ul-col2 clearfix">
                        <li><a href="#">News</a></li>
                        <li><a href="#">Quotes</a></li>
                        <li><a href="#">Video</a></li>
                        <li><a href="#">Link</a></li>
                    </ul>
                </section>
                <section>
                    <div class="title-divider">
                        <div class="divider-arrow"></div>
                        <h4>Blog Arhive</h4>
                    </div>
                    <ul class="ul-col2 clearfix">
                        <li><a href="#">February 2012</a></li>
                        <li><a href="#">March 2012</a></li>
                        <li><a href="#">April 2012</a></li>
                        <li><a href="#">May 2012</a></li>
                        <li><a href="#">June 2012</a></li>
                        <li><a href="#">August 2012</a></li>
                    </ul>
                </section>
                <section class="post-widget">
                    <div class="title-divider">
                        <div class="divider-arrow"></div>
                        <h4>Popular Post Widget</h4>
                    </div>
                    <ul class="clearfix">
                        <li>
                            <a href="#"><img src="example/sidebar1.jpg" alt="photo" /></a>
                            <a href="#">Ut in lacus rhoncus elit egesta sluctus. Nullam at</a>
                            <p>comments 2</p>
                            <div class="clear"></div>
                        </li>
                        <li>
                            <a href="#"><img src="example/sidebar2.jpg" alt="photo" /></a>
                            <a href="#">Ut in lacus rhoncus elit egesta sluctus. Nullam at</a>
                            <p>comments 5</p>
                            <div class="clear"></div>
                        </li>
                        <li>
                            <a href="#"><img src="example/sidebar3.jpg" alt="photo" /></a>
                            <a href="#">Ut in lacus rhoncus elit egesta sluctus. Nullam at</a>
                            <p>comments 3</p>
                            <div class="clear"></div>
                        </li>
                    </ul>
                </section>
                <!--twitter -->
                <section id="twitter-sidebar">
                    <div class="title-divider">
                        <div class="divider-arrow"></div>
                        <h4>Twitter</h4>
                    </div>
                    <div class="twitter"></div>
                    <script type="text/javascript">
                        $(document).ready(function(){
                            $(".twitter").tweet({
                                join_text: "auto",
                                username: "twitter",
                                avatar_size:40,
                                count: 5,
                                auto_join_text_default: "we said,",
                                auto_join_text_ed: "we",
                                auto_join_text_ing: "we were",
                                auto_join_text_reply: "we replied",
                                auto_join_text_url: "we were checking out",
                                loading_text: "loading tweets..."
                            });
                        });
                    </script>
                </section>
            </aside>
        </div>
    </div>
</section>




<jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer.jsp"></jsp:include>
<body>

</body>
</html>
