<%@ page import="com.petsvalley.entity.Customer" %><%--
  Created by IntelliJ IDEA.
  User: mjs
  Date: 2018/9/11
  Time: 8:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <script type="text/javascript">
            $(document).ready(function () {
                $("#loginButton").click(function () {
                    $("#loginBox").slideToggle("slow");
                });
                messLogin();
            });

            function messLogin() {
                document.all.username.placeholder = "请输入手机号";
                document.all.password.placeholder = "请输入动态验证码";
                document.all.nameLogin.className = "aa";
                document.all.messLogin.className = "dd";
                document.all.getcode.style.display = "block";
                document.all.checkcode.style.display = "none";
                document.all.kanbuqing.style.display = "none";
            }

            function namePass() {
                document.all.username.placeholder = "请输入用户名";
                document.all.password.placeholder = "请输入密码";
                document.all.messLogin.className = "aa";
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

   /*         function doLogin() {
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
            }*/
        </script>

        <%
            Customer customer = (Customer) session.getAttribute("customer");
            if (customer != null) {
                String name = customer.getCustName();
            }
            String errormsg = (String) request.getAttribute("errormsg");
        %>
    </head>
    <body>
        <section id="top-menu" style="position: fixed;z-index: 101;width: 100%;height: 35px">
            <div class="container">
                <div class="row">
                    <div class="span6 hidden-phone">
                        <ul class="top-menu">
                            <li><a href="${pageContext.request.contextPath}/index">主页</a></li>
                            <li><a href="${pageContext.request.contextPath}/about">关于我们</a></li>
                            <li><a href="${pageContext.request.contextPath}/service">宠物照片展示</a></li>
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
                            if (customer != null) {
                        %>
                        <span class="active"
                              style="float: right;"><span>欢迎:</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${customer.custName}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a
                                href="${pageContext.request.contextPath}/logout">退出</a>
                        </span>
                        <%} else if (request.getSession().getAttribute("errormsg") != null) {%>
                        <span style="margin-left: 30%;color: red"> ${errormsg} </span> <a id="loginButton" class="active"><span>
                登录/注册</span></a>
                        <%} else {%>
                        <a id="loginButton" class="active"><span>
                登录/注册</span></a>
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
                        <input type="checkbox" id="checkbox" style="margin-top: 26px !important;"/> <span class="remeber"
                                                                                                          style="margin-top: 24px !important;">记住我</span>
                        <a href="javascript:loadimage();" id="kanbuqing"
                           style="margin-top: 24px !important;margin-left: 40%;font-size:14px ;"><font class="pt95">看不清点我</font></a>
                        <a href="javascript:void(0)" id="getcode" onclick="sendMessage()" style="display: none">获取验证码</a>
                        <input type="button" id="login" onclick="dologin()" style=" width: 80%;" value="登录"><br><br>
                        <a href="${pageContext.request.contextPath}/register" id="register">快速注册</a>
                        <span><a href="#" onclick="messLogin()" id="forget">忘记密码?</a></span>
                    </form>
                </div>
            </div>
        </section>
    </body>
</html>
