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
    <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;个人博客2 </div>
</div>
<!--container-->
<section id="container">
    <div class="container">
        <div class="row">
            <section id="page-sidebar" class="alignrleft span9">
                <article class="blog-post">
                    <h1>Lorem ipsum dolor sit amet consectetur</h1>
                    <ul class="meta clearfix">
                        <li>01/09/2012</li>
                        <li>By: <a href="#">DXThemes</a></li>
                        <li>Comments: <a href="#">3</a></li>
                        <li>Posted in: <a href="#">News</a> | <a href="#">Business</a></li>
                    </ul>
                    <img src="example/blog2.jpg" alt="photo" />
                    <p>
                        Etiam imperdiet, ante at porttitor rutrum, felis nisi pellentesque enim, vel viverra quam orci eu massa.
                        Integer commodo, velit eget dapibus tincidunt, mauris ligula porttitor sapien, eget rhoncus dolor mi eu velit.
                        Fusce mattis dui eu velit fringilla viverra. Aliquam non nibh non orci imperdiet venenatis.
                        Quisque varius orci a lacus adipiscing id tempus elit pharetra.
                    </p>
                    <blockquote>
                        <p>
                            Etiam imperdiet, ante at porttitor rutrum, felis nisi pellentesque enim, vel viverra quam orci eu massa.
                            Integer commodo, velit eget dapibus tincidunt, mauris ligula porttitor sapien, eget rhoncus dolor mi eu velit.
                        </p>
                    </blockquote>
                    <p>
                        Duis et eros at nulla euismod aliquet vitae ac odio.
                        Nulla porta metus vitae mi ornare quis accumsan ligula congue.
                        Integer commodo, velit eget dapibus tincidunt, mauris ligula porttitor sapien, eget rhoncus dolor mi eu velit.
                        Fusce mattis dui eu velit fringilla viverra. Aliquam non nibh non orci imperdiet venenatis.
                    </p>
                </article>

                <div class="block-divider"></div>

                <!--comments-->
                <div class="title-divider">
                    <div class="divider-arrow"></div>
                    <h3>4 Comments</h3>
                </div>
                <div class="comments">
                    <ul class="comments-list">
                        <li class="clearfix comments_li">
                            <img src="images/avatar.png" alt="avatar" class="avatar" />
                            <div class="textarea">
                                <p class="meta">May 18, 2012 Designmd says:</p>
                                <p>
                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                                    Etiam a sapien odio, sit amet
                                </p>
                            </div>
                            <ul>
                                <li>
                                    <img src="images/avatar.png" alt="avatar" class="avatar" />
                                    <div class="textarea">
                                        <p class="meta">May 17, 2012 bingumd says:</p>
                                        <p>
                                            Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                                        </p>
                                        <div class="shadow-comments2"></div>
                                    </div>
                                    <ul>
                                        <li>
                                            <img src="images/avatar.png" alt="avatar" class="avatar" />
                                            <div class="textarea">
                                                <p class="meta">May 17, 2012 bingumd says:</p>
                                                <p>
                                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                                                </p>
                                                <div class="shadow-comments2"></div>
                                            </div>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <div><img src="images/avatar.png" alt="avatar" class="avatar" /></div>
                            <div class="textarea lastbt">
                                <p class="meta">May 16, 2012 Designmd says:</p>
                                <p>
                                    scelerisque felis. Maecenas tincidunt ligula eu magna tincidunt eget imperdiet erat malesuada.
                                    Ut in diam et metus facilisis venenatis sit amet vel enim.
                                </p>
                            </div>
                        </li>
                    </ul>
                </div>

                <div class="block-divider"></div>

                <!--commetns form-->
                <div class="title-divider">
                    <div class="divider-arrow"></div>
                    <h3>Leave A Reply</h3>
                </div>
                <form name="comment" method="post" action="" class="af-form" id="af-form" />
                <div class="af-outer af-required">
                    <div class="af-inner">
                        <label for="name" id="name_label">Your Name:</label>
                        <input type="text" name="name" id="name" size="30" value="" class="text-input input-xlarge" />
                        <label class="error" for="name" id="name_error">Name is required.</label>
                    </div>
                </div>
                <div class="af-outer af-required">
                    <div class="af-inner">
                        <label for="email" id="email_label">Your Email:</label>
                        <input type="text" name="email" id="email" size="30" value="" class="text-input input-xlarge" />
                        <label class="error" for="email" id="email_error">Email is required.</label>
                    </div>
                </div>
                <div class="af-outer af-required">
                    <div class="af-inner">
                        <label for="input-message" id="message_label">Your Message:</label>
                        <textarea name="message" id="input-message" cols="30" class="text-input"></textarea>
                        <label class="error" for="input-message" id="message_error">Message is required.</label>
                    </div>
                </div>
                <div class="af-outer af-required">
                    <div class="af-inner">
                        <input type="submit" name="submit" class="form-button btn" id="submit_btn" value="Send Message!" />
                    </div>
                </div>
                </form>
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
                            //twitter
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
