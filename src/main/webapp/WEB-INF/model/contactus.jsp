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
    <meta name="viewport" content="width=100%; initial-scale=1; maximum-scale=1; minimum-scale=1; user-scalable=no;"/>
    <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png"/><!--设置主页logo-->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png"/>
    <!--设置主页logo-->
    <title>联系我们</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" type="text/css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/style.css" type="text/css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/prettyPhoto.css" type="text/css" rel="stylesheet"/>
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
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="text/javascript">
        var xhr = null;

        function sendemail() {
            var title = document.getElementById("name").value;
            var address = document.getElementById("email").value;
            var message = document.getElementById("input-message").value;
            var url_sendemail = '${pageContext.request.contextPath}/message/sendemail';
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            url_sendemail += '/' + title + '/' + address + '/' + message;
            /*var fd="title="+title+"&address="+address+"&message="+message;*/
            xhr.open("GET", url_sendemail, true);
            xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=utf-8");
            xhr.onreadystatechange = function () {
                if (xhr.readyState == 4 && xhr.status == 200) {
                    alert("邮件发送成功");
                }
            }
            xhr.send();
        }

    </script>

</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top.jsp"></jsp:include>
<!--breadcrumbs -->
<div class="container breadcrumbs">
    <h1>联系我们</h1>
    <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;联系我们</div>
</div>
<!--container-->
<section id="container">
    <div class="container">
        <div class="row">
            <section id="page-sidebar" class="alignrleft span9">
                <article>
                    <h3>联系我们</h3>
                    <p>
                        如果在使用过程中，你遇到任何问题，请马上联系我们，<br>
                        如果您忘记了密码,建议您使用注册的手机进行登录并修改密码,<br>
                        如果您注册的手机号暂时用不了请联系我们.....<br>
                        联系邮箱：cutepetvalley@nowcoder.com<br>
                        我们会认真对待你的每一个问题，以最快的速度给你答复。<br>
                        固定电话：010-60728802
                    </p>
                </article>
                <div class="block-divider"></div>
                <form name="contact" method="post" autocomplete="off" action="contact.html" class="af-form"
                      id="af-form"/>
                <div class="af-outer af-required">
                    <div class="af-inner">
                        <label for="name" id="name_label">邮件标题:</label>
                        <input type="text" name="name" id="name" size="30" value="" class="text-input input-xlarge"/>
                        <label class="error" for="name" id="name_error">标题不能为空</label>
                    </div>
                </div>
                <div class="af-outer af-required">
                    <div class="af-inner">
                        <label for="email" id="email_label">收件邮箱地址:</label>
                        <input type="text" name="email" onblur="email_check()" id="email" size="30" value=""
                               class="text-input input-xlarge"/>
                        <label class="error" for="email" id="email_error"></label>
                    </div>
                </div>
                <div class="af-outer af-required">
                    <div class="af-inner">
                        <label for="input-message" id="message_label">邮件内容:</label>
                        <textarea name="message" id="input-message" cols="30" class="text-input"></textarea>
                        <label class="error" for="input-message" id="message_error">邮件内容不能为空</label>
                    </div>
                </div>
                <div class="af-outer af-required">
                    <div class="af-inner">
                        <input type="submit" name="submit" onclick="sendemail()"
                               style="background-color: #0e90d2!important;" class="form-button" id="submit_btn"
                               value="发送邮件"/>
                    </div>
                </div>
                </form>
            </section>
            <!--sidebar-->
            <aside id="sidebar" class="alignright span3">
                <section>
                    <div class="title-divider">
                        <div class="divider-arrow"></div>
                        <h4>我们的地址</h4>
                    </div>
                    <address>
                        <strong>城市\街道</strong><br/>
                        苏州 学伟大街 432/2<br/>
                        创意产业园, 90210<br/>
                        <abbr title="Phone">电话:</abbr> (123) 456-7890
                    </address>
                    <address>
                        <strong>邮箱地址</strong><br/>
                        <a href="mailto:#">cutepetvalley@email.com</a>
                    </address>
                </section>
            </aside>
        </div>
    </div>
</section>


<jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer.jsp"></jsp:include>
<body>

</body>
</html>
