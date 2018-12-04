<%--
  Created by IntelliJ IDEA.
  User: mjs
  Date: 2018/10/11
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/css/userinfo.css" type="text/css" rel="stylesheet"/>
    <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <title>个人中心</title>
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
    <script type="text/javascript">
        var xhr=null;
        var xr=null;
        var headPhoto="";
        var url_getuser ="${pageContext.request.contextPath}/customer/update";
        function readFile() {
            var file= document.getElementById("fileImage").files[0];
            var img=window.URL.createObjectURL(file);
            document.getElementById("headimg").src = img;
        }
        function fileUpload(){
            var url="${pageContext.request.contextPath}/customer/fileUpload";
            var formData = new FormData();
            formData.append('file', $('#fileImage')[0].files[0]);
            if (window.XMLHttpRequest) {
                xr = new XMLHttpRequest();
            } else {
                 xr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xr.processData=false;
            xr.open("POST", url,true);
            xr.onreadystatechange = function () {
                if (xr.readyState == 4 && xr.status == 200) {
                   headPhoto =xr.responseText+"";
                    alert("头像上传成功");
                }
            };
            xr.send(formData);
           /* var formData = new FormData();
            formData.append('file', $('#fileImage')[0].files[0]);
            $.ajax({
                url: '',
                type: 'POST',
                cache: false,
                data: formData,
                dataType:'json',
                processData: false,
                contentType: false,
            }).done(function(res) {
            }).fail(function(res) {
            });*/
        }

        function updateInfo() {
            var url_updatepet= '${pageContext.request.contextPath}/customer/update';
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            var idd="${customer.custId}";
            var userPwd=null;
            if(document.getElementById("pwd").value!=""&& document.getElementById("pwd").value!=null)
                userPwd=Encrypt(document.getElementById("pwd").value)

            var fd="headPhoto="+headPhoto+"&custId="+idd+"&custPhone="+document.getElementById("phone").value+"&custEmail="+
                document.getElementById("email").value+"&custName="+document.getElementById("custName").value+
                "&custAge="+document.getElementById("age").value+"&custPwd="+userPwd;
            xhr.open("POST", url_updatepet,true);
            xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=utf-8");
           xhr.onreadystatechange=function () {
               if(xhr.readyState==4 && xhr.status==200)
               window.location="${pageContext.request.contextPath}/userInfo";
           }
            xhr.send(fd);

        }
        function getCheckCode() {
            var getCheckCode ="${pageContext.request.contextPath}/customer/getCheckCode";
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", getCheckCode,true);
            xhr.setRequestHeader("Content-type", "application/json; charset=utf-8");
            xhr.onreadystatechange =function () {
                var cc123 =JSON.parse(xhr.responseText);
                var pp=document.getElementById("phone").value;
                var pd=document.getElementById("phonecode").value;
                if(pp!=""&& pd!=cc123){
                    alert("验证码错误"+cc123);
                    return false;
                }else updateInfo();
            };
            xhr.send();
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

      function chepwd() {
          var pwd = Encrypt(document.getElementById("userpwd").value);
            if(pwd!="${customer.custPwd}"){
                document.getElementById("userpwd_error").innerText="密码错误";
                document.getElementById("userpwd_error").style.display="block";
                return false;
            }else{
                document.getElementById("userpwd_error").style.display="none";
                return true;
            }
        }

        var wait=60;
       function sendMessage() {
            var phone=document.getElementById("phone").value;
            var tt=/^[1][3,4,5,8,7,2,9,6][0-9]{9}$/;
            if(! tt.test(phone)){
                alert("手机格式不正确");
                return;
            }
            setgetcode(wait);
            var url_123ply = '${pageContext.request.contextPath}/customer/sendSms/phone/'+phone;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_123ply, true);
            //xhr.setRequestHeader("X-Requested-With","XMLHttpRequest");
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            xhr.send();
        }
        function setgetcode(wait) {
            if (wait == 0) {
                document.getElementById("get2code").removeAttribute("disabled");
                document.getElementById("get2code").value="获取验证码";
                wait = 60;
            } else {
                document.getElementById("get2code").setAttribute("disabled", true);
                document.getElementById("get2code").value=""+wait+"重新发送";
                wait--;
                window.setTimeout( "setgetcode("+wait+")",1*1000);
            }

        }
    </script>
    <style type="text/css">
        .showInfo{
            color: goldenrod;
        }
        .inpput{
            font-size: 14px!important;
            padding-left: 30px!important;
            height: 35px!important;
            width: 80%;
        }
    </style>
</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top1.jsp"></jsp:include>
<!--breadcrumbs -->
<div style="height: 35px" >
</div>

<div id="container" style="text-align: center;width: 100%;background-color: #eee">
    <div class="row clearfix">
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/infoleft.jsp"></jsp:include>
        <div id="head_image" class="col-md-4 column" style="width: 60%;display: inline-block;background-color:whitesmoke;">
            <div  style="overflow: hidden;text-overflow: ellipsis">
                <div style="float: left; margin:5% 10%;width: 20%; height:20%;display: inline-block">  <img alt="" src="${pageContext.request.contextPath}${customer.headPhoto}" class="img-circle" /></div>
                <div style="float: right;width:60%;display: inline-block;margin-top: 8%;">
                    <table style="text-align: left;width: 100%;border-collapse: separate;border-spacing: 20px ">
                        <tr><td colspan="2">您好:<span class="showInfo">${customer.custName}</span></td></tr>
                        <tr><td>账户安全:<span class="showInfo">一般</span></td><td>绑定手机:<span class="showInfo">${customer.custPhone}</span></td></tr>
                        <tr><td>积分:<span class="showInfo">${customer.custIntegral}</span></td><td>绑定邮箱:<span class="showInfo">${customer.custEmail}</span></td></tr>
                    </table>
                </div>

            </div>
            <div style="background-color: #eee;height: 10px;width: 100%"></div>
            <div class="right" style="display: inline-block;width: 100%;margin-top: -20px;font-size: 14px">
                <div class="info">
                    <ul class="show">
                        <li>
                            <img class="img-circle" src="${pageContext.request.contextPath}/example/username.png">个人信息
                        <li class="inline">
                            修改用户名,头像等个人信息
                        </li>
                        </li>
                        <li>
                            <img class="img-circle" src="${pageContext.request.contextPath}/example/password.png"> 账号密码
                        <li class="inline">
                            用于保证账号信息和密码安全
                        </li>
                        </li>
                        <li>
                            <img  class="img-circle"src="${pageContext.request.contextPath}/example/phone.png"> 绑定手机<span class="showInfo">${customer.custPhone}</span>
                        <li class="inline">
                            绑定手机后可以用手机登录和找回密码
                        </li>
                        </li>
                        <li>
                            <img  class="img-circle"src="${pageContext.request.contextPath}/example/email.png"> 绑定邮箱<span class="showInfo">${customer.custEmail}</span>
                        <li class="inline">
                            绑定邮箱后可以用邮箱登录和找回密码
                        </li>
                        </li>
                    </ul>
                    <ul class="button">
                        <li style="margin-top: 55px"><a id="modal-551194" href="#modal-container-551194" role="button" class="btn" data-toggle="modal">修改信息</a></li>
                        <li>     <a id="modal-441806" href="#modal-container-441806" role="button" class="btn" data-toggle="modal">修改密码</a></li>
                        <li>  <a id="modal-428715" href="#modal-container-428715" role="button" class="btn" data-toggle="modal">修改手机</a></li>
                        <li> <a id="modal-882597" href="#modal-container-882597" role="button" class="btn" data-toggle="modal">修改邮箱</a></li>
                    </ul>
                    <div class="modal fade" id="modal-container-551194" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                    <h4 class="modal-title" id="myModalLabel1" style="text-align: left">
                                        修改个人信息
                                    </h4>
                                </div>
                                <div class="modal-body">
                                    <form role="form" autocomplete="off" style="text-align: left;margin-left: 20%">
                                        <input type="text" style="background:url(${pageContext.request.contextPath}/example/userinfo.png)no-repeat" placeholder="请输入用户名" class="inpput" id="custName"/><br><br>
                                        <input type="text" style="background:url(${pageContext.request.contextPath}/example/age.png)no-repeat" placeholder="请输入年龄" onblur="age_check()" class="inpput" id="age"/><br><br>
                                        <label class="error" for="email" id="age_error"></label>
                                        您当前的头像:<div class="result" style="display: inline-block;width: 150px;height: 150px"><img src="${pageContext.request.contextPath}${customer.headPhoto}" id="headimg" class="img-circle"/></div><br><br>
                                        请先上传头像:<input type="file" id="fileImage" onchange="readFile()"  style="display: inline-block;margin-top: 5px"/><br><br>
                                    </form>
                                    <button type="button" class="btn btn-primary" onclick="fileUpload()" >上传头像</button>
                                    <button type="button" class="btn btn-default" data-dismiss="modal" >取消</button><button type="button" onclick="updateInfo()" class="btn btn-primary">修改</button>
                                </div>

                            </div>

                        </div>

                    </div>
                    <div class="modal fade" id="modal-container-441806" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                    <h4 class="modal-title" id="myModalLabel2" style="text-align: left">
                                        修改密码
                                    </h4>
                                </div>
                                <div class="modal-body">
                                    <form role="form" autocomplete="off">
                                        <input type="text" placeholder="请输入旧密码"style="background:url(${pageContext.request.contextPath}/example/password.png)no-repeat" onblur="chepwd()" class="inpput"id="userpwd" /><br><br>
                                        <label class="error" for="email" id="userpwd_error"></label>
                                        <input type="text" placeholder="请输入新密码" id="pwd"style="background:url(${pageContext.request.contextPath}/example/password2.png)no-repeat" class="inpput"/><br><br>
                                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button> <button type="button" onsubmit="return chepwd() " onclick="updateInfo()" class="btn btn-primary">修改</button>
                                    </form>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="modal fade" id="modal-container-428715" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                    <h4 class="modal-title" id="myModalLabel3" style="text-align: left">
                                        修改手机
                                    </h4>
                                </div>
                                <div class="modal-body">
                                    <form role="form" autocomplete="off">
                                        <input type="text" placeholder="请输入手机号"onblur="phone_check()" style="background:url(${pageContext.request.contextPath}/example/phone.png)no-repeat"   class="inpput" id="phone"/><br><br>
                                        <input type="text" placeholder="请输入验证码" id="phonecode"  style="background:url(${pageContext.request.contextPath}/example/checkcode.png)no-repeat" class="inpput" /><br><br>
                                        <input type="button" id="get2code" value="获  取  验  证  码" onclick="sendMessage()" class="inpput" style="margin-left:35%;width: 25%;padding-left:10px!important;background:#0e90d2;color: black;border: none"><br><br>
                                        <label class="error" for="email" id="phone_error"></label>
                                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button> <button type="button" onclick="getCheckCode()" class="btn btn-primary">修改</button>
                                    </form>
                                </div>
                            </div>

                        </div>

                    </div>
                    <div class="modal fade" id="modal-container-882597" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                    <h4 class="modal-title" id="myModalLabel4" style="text-align: left">
                                        修改邮箱
                                    </h4>
                                </div>
                                <div class="modal-body">
                                    <form role="form" autocomplete="off">
                                        <input type="text" placeholder="请输入邮箱" onblur="email_check()"style="background:url(${pageContext.request.contextPath}/example/email.png)no-repeat" class="inpput" id="email"/><br><br>
                                        <label class="error" for="email" id="email_error"></label>
                                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button> <button type="button" onclick="updateInfo()" class="btn btn-primary">修改</button>
                                    </form>
                                </div>
                            </div>

                        </div>

                    </div>
                </div>

            </div>

        </div>
    </div>
</div>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer1.jsp"></jsp:include>
</body>
</html>
