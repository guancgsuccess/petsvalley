<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/24/024
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>宠物认领</title>
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
        <link href="${pageContext.request.contextPath}/css/claim/claim.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_e.jsp"></jsp:include>

        <div class="container breadcrumbs">
            <h1>宠物认领</h1>
            <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;宠物认领</div>
        </div>
        <!--container-->
        <section id="container">
            <div class="container">
                <!--分类-->
                <a href="${pageContext.request.contextPath}/cs_release_claim">发布认领信息</a>
                <div id="img-search" style="display: inline-block;float: right;">
                    <button class="btn btn-warning btn-lg" data-toggle="modal" data-target="#upload">识图查找</button>
                    <div id="upload" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                    <h4 class="modal-title" id="myModalLabel">添加要识别的图片</h4>
                                </div>
                                <div class="modal-body">
                                    <div id="img-container" style="display: inline-block;margin: 0px auto;">
                                        <div class="img-up-add img-item"><span class="img-add-icon">+</span></div>
                                        <input type="file" name="files" id="img-file-input" accept="image/*">
                                    </div>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                                    <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="javascript:distinguish()">识别</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <a href="/claim" id="return-claim" style="display:none;">返回</a>
                <ul id="filtrable">
                    <li class="all"><a id="all-link" href="javascript:all_link_click()">所有</a></li>
                    <li class="not-claimed"><a id="not-claimed-link" href="javascript:not_claimed_link_click()">未认领</a></li>
                    <li class="claimed"><a id="claimed-link" href="javascript:claimed_link_click()">已认领</a></li>
                </ul>

                <div class="clear"></div>

                <section id="claim-list" class="row da-thumbs portfolio filtrable clearfix">
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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/claim/claim.js"></script>
</html>
