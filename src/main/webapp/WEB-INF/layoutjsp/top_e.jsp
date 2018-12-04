<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/30/030
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.petsvalley.entity.Customer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <%
        Customer customer = (Customer) session.getAttribute("customer");
        if (customer != null) {
            String name = customer.getCustName();
        }
        String errormsg = (String) request.getAttribute("errormsg");
    %>
    <head>
        <meta name="viewport" content="width=100%; initial-scale=1; maximum-scale=1; minimum-scale=1; user-scalable=no;"/>
        <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png"/><!--设置主页logo-->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png"/>
        <!--设置主页logo-->
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
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/crypto_js/crypto-js.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $("#loginButton").click(function () {
                    $("#loginBox").slideToggle("slow");
                });
                messLogin();
            });

            function messLogin() {
                document.getElementById("username").value = "";
                document.getElementById("password").value = "";
                document.all.username.placeholder = "请输入手机号";
                document.all.password.placeholder = "请输入动态验证码";
                document.all.password.type = "text";

                document.all.nameLogin.className = "aa";
                document.all.messLogin.className = "dd";
                document.all.getcode.style.display = "block";
                document.all.checkcode.style.display = "none";
                document.all.kanbuqing.style.display = "none";
            }

            function namePass() {
                document.getElementById("username").value = getCookie("cookie_name");
                document.getElementById("password").value = getCookie("cookie_pwd");
                if (getCookie("cookie_name") != "")
                    document.getElementById("checkbox").checked = "checked";
                document.all.username.placeholder = "请输入用户名";
                document.all.password.placeholder = "请输入密码";
                document.all.messLogin.className = "aa";
                document.all.password.type = "password";
                document.all.nameLogin.className = "dd";
                document.all.checkcode.style.display = "block";
                document.all.getcode.style.display = "none";
                document.all.kanbuqing.style.display = "block";
            }

            function loadimage() {
                document.getElementById("randImage").src = "${pageContext.request.contextPath}/image?" + Math.random();
            }

            var xhr = null;
            var url_login = "${pageContext.request.contextPath}/customer/login";

            function doLogin() {
                var cc=document.getElementById("checkbox");
                var flag=false;
                if(cc.checked){
                    flag=true;
                }
                if(window.XMLHttpRequest){
                    xhr=new XMLHttpRequest();
                }else {
                    xhr=new ActiveXObject('Microsoft.XMLHTTP');
                }
                //看作随机生成
                var key  = CryptoJS.enc.Utf8.parse('o7H8uIM2O5qv65l2');
                //加密算法
                function Encrypt(word) {
                    var srcs = CryptoJS.enc.Utf8.parse(word);
                    var encrypted = CryptoJS.AES.encrypt(srcs, key, {
                        mode: CryptoJS.mode.ECB,
                        padding: CryptoJS.pad.Pkcs7
                    });
                    return encrypted.toString();
                }

                //解密算法
                function Decrypt(word) {
                    var decrypt = CryptoJS.AES.decrypt(word, key, {
                        mode: CryptoJS.mode.ECB,
                        padding: CryptoJS.pad.Pkcs7
                    });
                    return CryptoJS.enc.Utf8.stringify(decrypt).toString();
                }

                //对密码进行加密
                var pwd = Encrypt(document.getElementById("password").value);

                var formData="custName="+document.getElementById("username").value+"&custPwd="+pwd
                    +"&input="+document.getElementById("input").value+"&flag="+flag;
                xhr.open("POST",url_login,true);
                xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded; charset=utf-8");
                xhr.onreadystatechange=checkLogin;
                xhr.send(formData);
            }

            function checkLogin() {
                if (xhr.readyState == 4 && xhr.status == 200) {
                    var str = xhr.responseText;
                    if (str == "system") {
                        window.location.href = "/system";
                    }
                    else
                        window.location.reload();
                }
            }

            var wait = 60;

            function sendMessage() {
                var phone = document.getElementById("username").value;
                var tt = /^[1][3,4,5,8][0-9]{9}$/;
                if (!tt.test(phone)) {
                    alert("手机格式不正确");
                    return;
                }
                setgetcode(wait);
                var url_refuseapply = '${pageContext.request.contextPath}/customer/sendSms/phone/' + phone;
                if (window.XMLHttpRequest) {
                    xhr = new XMLHttpRequest();
                } else {
                    xhr = new ActiveXObject('Microsoft.XMLHTTP');
                }
                xhr.open("GET", url_refuseapply, true);
                //xhr.setRequestHeader("X-Requested-With","XMLHttpRequest");
                xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
                /*  xhr.onreadystatechange = setgetcode ;*/
                /* location.reload();*/
                xhr.send();
            }

            function setgetcode(wait) {
                if (wait == 0) {
                    document.getElementById("getcode").removeAttribute("disabled");
                    document.getElementById("getcode").value = "获取验证码";
                    wait = 60;
                } else {
                    document.getElementById("getcode").setAttribute("disabled", true);
                    document.getElementById("getcode").value = "" + wait + "重新发送";
                    wait--;
                    window.setTimeout("setgetcode(" + wait + ")", 1 * 1000);
                }

            }

            function getCookie(c_name) {
                if (document.cookie.length > 0) {
                    c_start = document.cookie.indexOf(c_name + "=")
                    if (c_start != -1) {
                        c_start = c_start + c_name.length + 1
                        c_end = document.cookie.indexOf(";", c_start)
                        if (c_end == -1) c_end = document.cookie.length
                        return unescape(document.cookie.substring(c_start, c_end))
                    }
                }
                return ""
            }

        </script>
    </head>
    <body>
        <section id="top-menu">
            <div class="container">
                <div class="row">
                    <div class="span6 hidden-phone">
                        <ul class="top-menu">
                            <li><a href="${pageContext.request.contextPath}/index">主页</a></li>
                            <li><a href="${pageContext.request.contextPath}/about">关于我们</a></li>
                            <li><a href="${pageContext.request.contextPath}/service">宠物图片展示</a></li>
                            <li><a href="${pageContext.request.contextPath}/contactus">联系我们</a></li>
                        </ul>
                    </div>
                    <div class="span6">
                        <ul class="top-social">
                            <li><a href="http://www.codeforge.cn/article/322157" class="twitter2"></a></li>
                            <li><a href="http://www.gplus.com.tw/" class="gplus"></a></li>
                            <li><a href="https://dribbble.com/" class="dribbble"></a></li>
                            <li><a href="http://www.kguowai.com/html/1518.html" class="vimeo"></a></li>
                            <li><a href="https://www.last.fm/zh/user/deliciousmeal" class="delicious last"></a></li>
                        </ul>
                        <%
                            if(customer!=null){
                        %>
                        <span class="active" style="float: right;">
                            <span>欢迎:</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${customer.custName}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="${pageContext.request.contextPath}/logout">退出</a>
                        </span>
                        <%}else if(request.getSession().getAttribute( "errormsg" )!=null){%>
                        <span style="margin-left: 30%;color: red"> ${errormsg} </span>
                        <a id="loginButton" class="active">
                            <span>登录/注册</span>
                        </a>
                        <%}else{%>
                        <a id="loginButton" class="active">
                            <span>登录/注册</span>
                        </a>
                        <%}%>
                    </div>
                </div>
            </div>
            <div id="top-right">
                <div id="loginBox" style="display: none;">
                    <form id="loginForm" autocomplete="off" action="customer/login">
                        <a href="javascript:void(0)" id="messLogin" class="aa" onclick="messLogin()">短信快捷登录</a>
                        <a href="javascript:void(0)" id="nameLogin" class="dd" onclick="namePass()">账号密码登录</a><br><br>
                        <input type="text" id="username" name="custName" placeholder="请输入用户名"
                               style="background: url(${pageContext.request.contextPath}/example/username.png) no-repeat 0 1px;background-color:white;font-size: 20px;padding-left:35px!important;height: 35px!important;margin-top: 20px ;!important;margin-left: 10%;width: 80%;"/><br><br>
                        <input type="password" id="password" name="custPwd" placeholder="请输入密码"
                               style="background: url(${pageContext.request.contextPath}/example/password.png)no-repeat 0 1px;background-color:white;font-size: 20px;height: 35px;padding-left:35px !important;margin-left: 10%;width: 80%;"/><br><br>
                        <span id="checkcode"><input type="text" value="" id="input" name="input" placeholder="请输入验证码"
                                                    style="background: url(${pageContext.request.contextPath}/example/checkcode.png)no-repeat 0 1px; font-size: 20px;background-color:white;height: 35px;padding-left:35px!important;margin-left: 10%;width: 50%;"/>
                         <img alt="code..." name="randImage" id="randImage" src="${pageContext.request.contextPath}/image"
                              width="80" height="40" style="vertical-align:bottom;">
                        </span>
                        <input type="checkbox" id="checkbox" style="margin-top: 26px !important;display: inline-block" ;/> <span
                            class="remeber" style="margin-top: 24px !important;">记住我</span>
                        <a href="javascript:loadimage();" id="kanbuqing"
                           style="margin-top: 24px !important;margin-left: 40%;font-size:14px ;"><font class="pt95">看不清点我</font></a>
                        <input type="button" id="getcode" value="获取验证码" onclick="sendMessage()"
                               style="display: none;height:35px;width: 38%;background:#0e90d2;color: black;border: none">
                        <input type="button" id="login" onclick="dologin()" style=" width: 80%;" value="登录"><br><br>
                        <a href="${pageContext.request.contextPath}/register" id="register">快速注册</a>
                        <span><a href="${pageContext.request.contextPath}/contactus" id="forget">忘记密码?</a></span>
                    </form>
                </div>
            </div>
        </section>
        <header id="header">
            <div class="container">
                <nav id="menu">
                    <ul>
                        <li><a href="${pageContext.request.contextPath}/index" class="current">首页</a></li>

                        <li class="last"><a>社区服务</a>
                            <ul style="display: none;">
                                <li><a href="${pageContext.request.contextPath}/cs_find_pets">寻宠信息</a></li>
                                <li><a href="${pageContext.request.contextPath}/cs_claim">宠物认领</a></li>
                                <li><a href="${pageContext.request.contextPath}/cs_foster">宠物寄养</a></li>
                                <li class="last"><a href="${pageContext.request.contextPath}/cs_volunteer_service">志愿服务</a></li>
                            </ul>
                        </li>
                        </li>
                        <li class="last"><a>附近的服务</a>
                            <ul style="display: none;">
                                <li><a href="${pageContext.request.contextPath}/nearby_pet_shop">宠物店</a></li>
                                <li class="last"><a href="${pageContext.request.contextPath}/nearby_hospital">宠物医院</a></li>
                            </ul>
                        </li>
                        <li class="last"><a>萌宠圈</a>
                            <ul style="display: none;">
                                <li><a href="${pageContext.request.contextPath}/post">宠物论坛</a></li>
                                <li><a href="${pageContext.request.contextPath}/system_post">社区指南</a></li>
                            </ul>
                        </li>
                        <li class="last"><a>用户中心</a>
                            <ul style="display: none;">
                                <li>
                                    <a href="${pageContext.request.contextPath}/userInfo">
                                        用户中心&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <%if(customer!=null&&!customer.getCustSpare().equals( "0" )){%>
                                        <span class="badge pull-right" style="margin-left: -100px;background-color: #c43c35">
                                            <%=customer.getCustSpare()%>
                                        </span><%}%>
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </nav>
            </div>
        </header>
    </body>
</html>

