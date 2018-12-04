<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: mjs
  Date: 2018/10/14
  Time: 0:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>宠物管理</title>
    <link href="${pageContext.request.contextPath}/css/userinfo.css" type="text/css" rel="stylesheet"/>
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
    <link rel="stylesheet" href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
    <script src="//apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
    <script>
        var url_getpet = '${pageContext.request.contextPath}/pet/get';
        var url_getpetlist = '${pageContext.request.contextPath}/pet/getAllByPageManage';
        //页面加载后，首先加载所有的消息数据
        window.onload = function () {
            refreshPetList(url_getpetlist);
            $("#from").datepicker("option", "dateFormat", "yy-mm-dd");
            $(function () {
                $("#from").datepicker("option", "dateFormat", "yy-mm-dd");
                $("#from").datepicker({
                    defaultDate: "+1w",
                    showButtonPanel: true,
                    onClose: function (selectedDate) {
                        $("#to").datepicker("option", "minDate", selectedDate);
                        $("#from").datepicker("option", "dateFormat", "yy-mm-dd");
                        $("#to").datepicker("option", "dateFormat", "yy-mm-dd");
                    }
                });
                $("#to").datepicker({
                    defaultDate: "+1w",
                    showButtonPanel: true,
                    onClose: function (selectedDate) {
                        $("#from").datepicker("option", "maxDate", selectedDate);
                        $("#from").datepicker("option", "dateFormat", "yy-mm-dd");
                        $("#to").datepicker("option", "dateFormat", "yy-mm-dd");
                    }
                });
            });
        }
        //加载消息数据
        var xhr = null;

        function refreshPetList(url_getpetlist) {
            var objArr = null;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_getpetlist, true);
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            xhr.onreadystatechange = loadPets;
            xhr.send();
        }

        function delforPet(obr1) {
            var url_delpet = '${pageContext.request.contextPath}/pet/delete/msgid/' + obr1;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_delpet, true);
            //xhr.setRequestHeader("X-Requested-With","XMLHttpRequest");
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            window.location = "${pageContext.request.contextPath}/petmanage";
            xhr.send();
        }

        function loadPets() {
            if (xhr.readyState == 4 && xhr.status == 200) {
                var page = JSON.parse(xhr.responseText);
                var objArr = page.modelList;
                var tbody = document.getElementById("tbody");
                tbody.innerHTML = "";
                for (var i = 0; i < objArr.length; i++) {
                    if (objArr[i].petGender == 0) {
                        objArr[i].petGender = "雌性";
                    } else
                        objArr[i].petGender = "雄性";
                    if (objArr[i].petMateState == 0) objArr[i].petMateState = "无";
                    tbody.innerHTML += ('<tr><td>' + objArr[i].petId + '</td>' +
                        '<td >' + objArr[i].petName + '</td>' +
                        '<td >' + objArr[i].petGender + '</td>' +
                        '<td>' + objArr[i].petAge + '</td>' +
                        '<td><a style="cursor: pointer"onclick="getPetTypeName(this)"data-toggle="modal" data-target="#petTypeName">' + objArr[i].petTypeId + '</a></td>' +
                        '<td>' + objArr[i].petWeight + '</td>' +
                        '<td>' + objArr[i].petMateState + '</td>' + '<td><a style="cursor: pointer"onclick="getCustomerById(this)"data-toggle="modal" data-target="#customerDetail">' + objArr[i].custId + '</a></td>' +
                        '<td><a id="btnDel"  style="cursor: pointer" onclick="delforPet(' + objArr[i].petId + ')">删除</a>' +
                        ' <a id="btnModif" name="' + objArr[i].petId + "" + '"  style="cursor: pointer" onclick="get33Pet(this)" data-toggle="modal" data-target="#modalUpdateEmp">修改</a></td></tr>');
                }
                var pagearea = document.getElementById("pagearea");
                pagearea.innerHTML = "";
                if (page.currentPageCode != 1) {
                    var url_page = url_getpetlist + "/page/" + (page.currentPageCode - 1);
                    var href = 'javascript:refreshPetList("' + url_page + '")';
                    var prePage = "<a href='" + href + "'>上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                    pagearea.innerHTML += prePage;
                }
                var currentpage = "<span>当前第</span><span>" + page.currentPageCode + "</sapn><span>页</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                pagearea.innerHTML += currentpage;
                if (page.currentPageCode < page.totalPages) {
                    var url_page = url_getpetlist + "/page/" + (page.currentPageCode + 1);
                    var href = 'javascript:refreshPetList("' + url_page + '")';
                    var nextPage = "<a href='" + href + "' >下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                    pagearea.innerHTML += nextPage;
                }
                //页面其他信息
                var otherEle = "<span>共</span><span>" + page.totalPages + "<span>页</sapn>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='text' id='topage' style='padding: 2px !important;width: 40px;height: 25px'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + "<input type='button' onclick='href2page()' style='padding: 0 !important;display: inline-block' value='&nbsp;&nbsp;&nbsp;跳转&nbsp;&nbsp;&nbsp;'>";
                pagearea.innerHTML += otherEle;
            }
        }

        function getPetTypeName(obj) {
            var url_getType = '${pageContext.request.contextPath}/pettype/getType/msgid/' + obj.innerText;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_getType, true);
            //xhr.setRequestHeader("X-Requested-With","XMLHttpRequest");
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            xhr.onreadystatechange = function () {
                if (xhr.readyState == 4 && xhr.status == 200) {
                    var petType = JSON.parse(xhr.responseText);
                    document.getElementById("pettype1").value = petType.typeId;
                    document.getElementById("pettype2").value = petType.typeName;
                }
            }
            xhr.send();
        }

        function get33Pet(msg) {
            var url_getpet = '${pageContext.request.contextPath}/pet/get/msgid/' + msg.name;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_getpet, true);
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            xhr.onreadystatechange = getpetbyid
            xhr.send();
        }

        function getpetbyid() {
            if (xhr.readyState == 4 && xhr.status == 200) {
                objArr = JSON.parse(xhr.responseText);
                document.getElementById("petid").value = objArr.petId;
                document.getElementById("petname").value = objArr.petName;
                document.getElementById("petage").value = objArr.petAge;
                document.getElementById("petweight").value = objArr.petWeight;
            }
        }

        function updatepet() {
            var url_updatepet = '${pageContext.request.contextPath}/pet/updatepet';
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            var idd = document.getElementById("petid").value;
            var fd = "petId=" + idd + "&petName=" + document.getElementById("petname").value + "&petAge=" + document.getElementById("petage").value + "&petWeight=" + document.getElementById("petweight").value;
            xhr.open("POST", url_updatepet, true);
            xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=utf-8");
            xhr.send(fd);
            location.reload();
        }

        function href2page() {
            var url2page = url_getpetlist + "/page/" + (document.getElementById("topage").value);
            refreshPetList(url2page);
        }

        function strFormat(str) {
            var date = new Date(str);
            var setDate = date.getFullYear() + "-" + (date.getMonth() + 1) + "-" + date.getDate() + " " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds();
            return setDate;
        }

        function selectbydate() {
            var to = document.getElementById("to").value;
            var from1 = document.getElementById("from").value;
            if ((to == "") || (from1 == "")) {
                alert("请选择结束(开始)时间");
                return;
            }
            var url_getpetlistbydate = '${pageContext.request.contextPath}/pet/getAllByPagedateManage/?from1=' + from1 + '&to=' + to;
            refreshPetList(url_getpetlistbydate);
        }

        function getCustomerById(obj) {
            var url_getCustomer = '${pageContext.request.contextPath}/customer/getById/msgid/' + obj.innerText;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_getCustomer, true);
            //xhr.setRequestHeader("X-Requested-With","XMLHttpRequest");
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            xhr.onreadystatechange = function () {
                if (xhr.readyState == 4 && xhr.status == 200) {
                    var customer = JSON.parse(xhr.responseText);
                    if (customer.cusGender == 0) customer.cusGender = '女';
                    else customer.cusGender = '男';
                    document.getElementById("customer1").value = customer.custId;
                    document.getElementById("customer2").value = customer.custName;
                    document.getElementById("customer3").value = customer.custPwd;
                    document.getElementById("customer4").value = customer.cusGender;
                    document.getElementById("customer5").value = customer.custAge;
                    document.getElementById("customer6").value = customer.custPhone;
                    document.getElementById("customer7").value = customer.custEmail;
                    document.getElementById("customer8").value = customer.custIntegral;
                    document.getElementById("customer9").value = strFormat(customer.custCreateTime);
                }
            }
            xhr.send();
        }

    </script>
    <style type="text/css">
        .col-md-4 label, .col-md-4 input {
            display: inline-block;
            font-size: 14px;
            text-overflow: ellipsis;
            overflow: hidden;
        }

        .col-md-4 label {
            vertical-align: middle;
        }

        .col-md-4 input {
            width: 35%;
            height: 40px;
            -webkit-appearance: none;
            -moz-appearance: none;
            border: 0;
            outline: 0;
            text-overflow: ellipsis;
            overflow: hidden;
            padding-left: 80px !important;
            color: #606266;
            background: url(${pageContext.request.contextPath}/example/day.png) no-repeat;
            background-color: whitesmoke;
        }

        .col-md-4 {
            text-overflow: ellipsis;
            overflow: hidden;
            height: 80px;
        }

        #tbl {
            table-layout: fixed;
        }

        #tbl td {
            border: 1px solid #eee;
            word-break: keep-all;
            text-overflow: ellipsis;
            overflow: hidden;
            text-align: center;
            white-space: nowrap;
        }

        .inpput {
            font-size: 14px !important;
            padding-left: 10px !important;
            height: 35px !important;
            width: 80%;
        }

        .innput {
            font-size: 14px !important;
            padding-left: 10px !important;
            height: 35px !important;
            width: 80%;
        }
    </style>

</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_system.jsp"></jsp:include>
<!--breadcrumbs -->
<div style="height: 35px">
</div>
<div id="container" style="text-align: center;background-color: #eee">
    <div class="row clearfix">
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/applyleft.jsp"></jsp:include>
        <div style="display: inline-block;width:79% !important;margin-right: -16%">
            <div class="col-md-4 column" style="background-color:whitesmoke;margin-top: 40px;width: 79%">
                <div style="margin-top: 25px;">
                    <label for="from">选择日期:&nbsp;&nbsp;&nbsp;&nbsp;</label>
                    <input type="text" onchange="selectbydate()" id="from" placeholder="请选择开始时间" name="from">
                    <label for="to">到&nbsp;&nbsp;&nbsp;&nbsp;</label>
                    <input type="text" onchange="selectbydate()" id="to" placeholder="请选择结束时间" name="to">
                </div>
            </div>
            <div style="background-color: #eee;height: 10px;width: 79%"></div>
            <div id="haha" style="background-color:whitesmoke;width:79% !important; height: 80%">
                <table class="table table-hover" id="tbl">
                    <thead>
                    <tr>
                        <td>编号</td>
                        <td>姓名</td>
                        <td>性别</td>
                        <td>年龄(岁)</td>
                        <td>类别</td>
                        <td>体重(kg)</td>
                        <td>配偶</td>
                        <td>用户</td>
                        <td>操作</td>
                    </tr>
                    </thead>
                    <tbody id="tbody">

                    </tbody>
                </table>

                <div id="pagearea"></div>
            </div>

        </div>
    </div>
</div>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer1.jsp"></jsp:include>
<!-- 修改框 -->
<div>
    <div class="modal fade" id="modalUpdateEmp" tabindex="-2" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true" style="display:none">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel">
                        修改宠物信息
                    </h4>
                </div>
                <div class="modal-body">
                    <div class="form-group" style="text-align: center">
                        <form>
                            <input type="hidden" id="petid" class="inpput"/>
                            宠物名称:<input type="text" id="petname" class="inpput"/><br/>
                            宠物年龄:<input type="text" id="petage" class="inpput"/><br/>
                            宠物体重:<input type="text" id="petweight" class="inpput"/><br/>
                        </form>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10" style="float: right">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button type="button" onclick="updatepet()" class="btn btn-primary">修改</button>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.modal-content -->
        </div>
        <!-- /.modal -->
    </div>

    <div class="modal fade" id="addpetdiv" tabindex="-2" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true" style="display:none">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title">
                        添加宠物信息
                    </h4>
                </div>
                <div class="modal-body">
                    <div class="form-group" style="text-align: center">
                        <form>
                            宠物姓名:<input type="text" placeholder="请输入宠物姓名" id="addpetname" class="inpput"/><br/>
                            宠物性别:<select id="addpetgender" style="width: 80%">
                            <option value="-1">请选择性别</option>
                            <option value="0">雌性</option>
                            <option value="1">雄性</option>
                        </select><br/>
                            宠物年龄:<input type="text" placeholder="请输入宠物年龄(年)" id="addpetage" class="inpput"/><br/>
                            宠物体重:<input type="text" placeholder="请输入宠物体重(kg)" id="addpetweight" class="inpput"/><br/>
                            宠物类别:<select name="pettype" id="pettype" style="width: 80%">
                            <option value="-1">请选择类别</option>
                        </select>
                        </form>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10" style="float: right">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button type="button" onclick="addpet()" class="btn btn-primary">确认添加</button>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.modal-content -->
        </div>
        <!-- /.modal -->
    </div>
    <div class="modal fade" id="customerDetail" tabindex="-2" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true" style="display:none">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title">
                        用户详情
                    </h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        用户编号：<input type="text" id="customer1" class="innput"><br/>
                        用户姓名：<input type="text" id="customer2" class="innput"><br/>
                        用户密码：<input type="text" id="customer3" class="innput"><br/>
                        用户性别：<input type="text" id="customer4" class="innput"><br/>
                        用户年龄：<input type="text" id="customer5" class="innput"><br/>
                        用户电话：<input type="text" id="customer6" class="innput"><br/>
                        用户邮箱：<input type="text" id="customer7" class="innput"><br/>
                        用户积分：<input type="text" id="customer8" class="innput"><br/>
                        注册日期：<input type="text" id="customer9" class="innput">
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10" style="text-align: center">
                            <button type="button" data-dismiss="modal" class="btn btn-default">关闭</button>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.modal-content -->
        </div>
        <!-- /.modal -->
    </div>
    <div class="modal fade" id="petTypeName" tabindex="-2" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true" style="display:none">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title">
                        宠物类别
                    </h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        类别编号：<input type="text" id="pettype1" class="innput"><br/>
                        类别名称：<input type="text" id="pettype2" class="innput"><br/>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10" style="text-align: center">
                            <button type="button" data-dismiss="modal" class="btn btn-default">关闭</button>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.modal-content -->
        </div>
        <!-- /.modal -->
    </div>
</div>
</body>
</html>
