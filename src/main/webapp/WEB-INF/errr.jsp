<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/5/005
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gbk"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>出错了</title>
    <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <style>
        body {
            background-color: #0A7189;
            color: #fff;
            font: 100% "Lato", sans-serif;
            font-size: 1.8rem;
            font-weight: 300;
        }

        a {
            color: #75C6D9;
            text-decoration: none;
        }

        h3 {
            margin-bottom: 1%;
        }

        ul {
            list-style: none;
            margin: 0;
            padding: 0;
            line-height: 50px;
        }

        li {
            display: inline-block;
        }

        li a:hover {
            color: #fff;
        }

        .center {
            text-align: center;
        }

        /* Search Bar Styling */
        form > * {
            vertical-align: middle;
        }

        /* 404 Styling */
        .header {
            font-size: 13rem;
            font-weight: 700;
            margin: 2% 0 2% 0;
            text-shadow: 0px 3px 0px #7f8c8d;
        }

    </style>
    <script language="javascript" type="text/javascript">
        function back() {
            window.history.back(-1);
        }
        var i = 5;
        var intervalid;
        intervalid = setInterval("fun()", 1000);

        function fun() {
            if (i == 0) {
                back()
                clearInterval(intervalid);
            }
            document.getElementById("mes").innerHTML = i;
            i--;
        }
    </script>
</head>
<body>
<section class="center">
    <article><h1 class="header">404</h1>页面出错,请联系管理员!</article>
    <article>
        <ul>
            <li>将在 <span id="mes">5</span> 秒钟后返回<a href="javascript:back()">上一页</a>!</li>
        </ul>
    </article>
</section>
</body>
</html>
