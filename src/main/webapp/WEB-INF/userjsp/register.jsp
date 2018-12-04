<%@ page import="com.petsvalley.entity.Customer" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.logging.SimpleFormatter" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: mjs
  Date: 2018/9/10
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
    <meta name="viewport" content="width=100%; initial-scale=1; maximum-scale=1; minimum-scale=1; user-scalable=no;" />
    <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <title>注册账号</title>
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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/crypto_js/crypto-js.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

</head>
    <body>
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top.jsp"></jsp:include>
        <!--breadcrumbs -->
        <div class="container breadcrumbs">
    <h1>注册账号</h1>
    <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;注册账号 </div>
</div>
        <section id="container">
        <div class="container">
        <div id="regis" style="display: inline-block;text-align: center;overflow: hidden"  >
            <form name="register" method="post" autocomplete="off"   class="af-form" id="af-form" />
            <div class="af-outer af-required">
                <div class="af-inner">
                    <label for="name" id="name_label">用&nbsp;户&nbsp;名&nbsp;:&nbsp;</label>
                    <input type="text"  onblur="name_check()" name="custName" id="name" size="30" value="" class="text-input input-xlarge" />
                    <label class="error" for="name" id="name_error"></label>
                </div>
            </div>
            <div class="af-outer af-required">
                <div class="af-inner">
                    <label for="email" id="password_label">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:</label>
                    <input type="password"  onblur="name_psw()" name="custPwd" id="psd" style="display: inline-block;height: 35px; border:none; !important;" value="" class="text-input input-xlarge" />
                    <label class="error"  id="psd_erroe"></label>
                </div>
            </div>
            <div class="af-outer af-required">
                <div class="af-inner">
                    <label for="email" id="password_again">确认密码:</label>
                    <input style="display: inline-block;height: 35px; border:none; !important;"type="password" onblur="psw_check()"  id="psd_again" size="30" value="" class="text-input input-xlarge" />
                    <label class="error" for="email" id="psdagain_error"></label>
                </div>
            </div>
            <div class="af-outer af-required">
                <div class="af-inner">
                    <label for="email" id="age_label">年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄:</label>
                    <input type="text" name="custAge" onblur="age_check()" id="age" size="30" value="" class="text-input input-xlarge" />
                    <label class="error" for="email" id="age_error"></label>
                </div>
            </div>
            <div class="af-outer af-required">
                <div class="af-inner">
                    <label for="email" id="phone_label">联系电话:</label>
                    <input type="text" name="custPhone" onblur="phone_check()" id="phone" size="30" value="" class="text-input input-xlarge" />
                    <label class="error" for="email" id="phone_error"></label>
                </div>
            </div>

            <div class="af-outer af-required">
                <div class="af-inner">
                    <label for="email" id="email_label">用户邮箱:</label>
                    <input type="text" name="custEmail" onblur="email_check()" id="email" size="30" value="" class="text-input input-xlarge" />
                    <label class="error" for="email" id="email_error"></label>
                </div>
            </div>
            <div class="af-outer af-required" style="overflow: hidden;">
                <div class="af-inner" style="margin-left: 6.5%">
                 <label for="email" >用户性别:</label>
                   <label style="margin-left:17%">男</label> <input type="radio" name="cusGender" checked="checked" value="0" class="text-input input-xlarge" style="display: inline-block!important;" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <label>女</label> <input type="radio" id="gender" name="cusGender" value="1" class="text-input input-xlarge"style="display: inline-block;margin-right: 25%;!important;" />
                </div>
            </div>
            <div class="af-outer af-required">
                <div class="af-inner">
                    <input type="button"  onclick="regist()" id="submit_btn" value="注&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;册" />
                </div>
            </div>
            </form>
            <script type="text/javascript">
                var xhr=null;
                var url_regist ="${pageContext.request.contextPath}/customer/regist";
                function regist() {
                    if(!submit_btn23()){
                        alert("注册信息有误,请重试") ;
                        return;
                    }
                    if (window.XMLHttpRequest){
                        xhr = new XMLHttpRequest();
                    } else {
                        xhr = new ActiveXObject('Microsoft.XMLHTTP');
                    }
                    var cusGender=0;
                    var gen=document.getElementById("gender");
                    if(gen.checked) {
                        cusGender = 1;
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
                    var pwd = Encrypt(document.getElementById("psd").value);
                    var formData="custName="+document.getElementById("name").value+"&custPwd="+pwd
                        +"&custAge="+document.getElementById("age").value+"&custPhone="+document.getElementById("phone").value+"&custEmail="+document.getElementById("email").value
                        +"&cusGender="+cusGender+"&custRole="+0+"&custState="+0+"&custIntegral="+0+"&custCreateTime="+ "<%=new Date()%>";
                    xhr.open("POST", url_regist,true);
                    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=utf-8");
                    xhr.onreadystatechange = checkRegist;
                    xhr.send(formData);
                }
                function checkRegist(){
                    if (xhr.readyState == 4 && xhr.status == 200){
                        var obj = JSON.parse(xhr.responseText);
                        if(obj==0){
                            alert("注册失败,请重试");
                        }else {
                            alert("欢迎加入我们,请登录");
                            window.location="${pageContext.request.contextPath}/login";
                        }
                    }
                }
            </script>
        </div>
        <div class="introduce">
            <div class="sp">
                <h3>欢迎加入我们</h3>
                <p>眼里只有你，宠爱萌宠谷。萌宠谷，只为宠爱负责。<br>萌宠谷，我和宝贝的共同向往！关爱您的宠物，关注萌宠谷。<br>给您宠物一片灿烂的蓝天。爱在萌宠谷，宠物也奢华。
                    您的宠物，我们的宝贝。<br>
                    请用心关爱您的宠物，您的关爱需要萌宠谷,优质的服务，放心的选择。<br>给予爱宠一生的至尊呵护。<br>
                    一样的宠爱，不同的风采。不同的宠爱，共同的选择。</p>
                <h3>会员福利</h3>
                <p>一、会员积分奖励<br>二、会员服务中心<br>三、宠物健康管理<br>四、宠物登记备案<br>
                </p>
                <h3>打开手机扫一扫,关注我们</h3>
                <img src="${pageContext.request.contextPath}/example/erweima.jpg">
            </div>
        </div>
        </div>
        </section>

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer.jsp"></jsp:include>
    </body>
</html>
