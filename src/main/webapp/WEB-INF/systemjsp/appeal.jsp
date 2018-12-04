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
    <title>申诉管理</title>
    <link href="${pageContext.request.contextPath}/css/userinfo.css" type="text/css" rel="stylesheet"/>
    <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
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
    <link rel="stylesheet" href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
    <script src="//apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
    <script>
        var url_getappeal = '${pageContext.request.contextPath}/appeal/get';
        var url_getappeallist ='${pageContext.request.contextPath}/appeal/getAllByPageManage';
        //页面加载后，首先加载所有的消息数据
        window.onload=function() {
            refreshAppealList(url_getappeallist);
            $( "#from" ).datepicker( "option", "dateFormat","yy-mm-dd" );
            $(function() {
                $( "#from" ).datepicker( "option", "dateFormat","yy-mm-dd" );
                $( "#from" ).datepicker({
                    defaultDate: "+1w",
                    showButtonPanel: true,
                    onClose: function( selectedDate ) {
                        $( "#to" ).datepicker( "option", "minDate", selectedDate );
                        $( "#from" ).datepicker( "option", "dateFormat","yy-mm-dd" );
                        $( "#to" ).datepicker( "option", "dateFormat","yy-mm-dd" );
                    }
                });
                $( "#to" ).datepicker({
                    defaultDate: "+1w",
                    showButtonPanel: true,
                    onClose: function( selectedDate ) {
                        $( "#from" ).datepicker( "option", "maxDate", selectedDate );
                        $( "#from" ).datepicker( "option", "dateFormat","yy-mm-dd" );
                        $( "#to" ).datepicker( "option", "dateFormat","yy-mm-dd" );
                    }
                });
            });
        }
        //加载消息数据
        var xhr = null;
         function refreshAppealList(url_getappeallist) {
            var objArr = null;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_getappeallist, true);
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            xhr.onreadystatechange = loadAppeal;
            xhr.send();
        }
       function delforAppeal(obr1){
            var url_delappeal = '${pageContext.request.contextPath}/appeal/delete/msgid/'+obr1;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_delappeal, true);
           //xhr.setRequestHeader("X-Requested-With","XMLHttpRequest");
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
           // xhr.onreadystatechange = refreshAppealList(url_getappeallist) ;
           window.location="${pageContext.request.contextPath}/appealmanage";
            xhr.send();
        }
       function loadAppeal() {
            if (xhr.readyState == 4 && xhr.status == 200) {
                var page = JSON.parse(xhr.responseText);
                var objArr=page.modelList;
                var tbody = document.getElementById("tbody");
                tbody.innerHTML = "";
                for (var i = 0; i < objArr.length; i++) {
                  if(objArr[i].aplResult==null)objArr[i].aplResult="待处理";
                    tbody.innerHTML += ('<tr><td>' + objArr[i].aplId + '</td>' +
                        '<td ><a style="cursor: pointer"onclick="getPunishmentById(this)"data-toggle="modal" data-target="#punishmentDetail">' +objArr[i].punId   +'</a></td>' +
                        '<td>' +strFormat(objArr[i].aplTime) +'</td>'
                        + '<td>'+objArr[i].appealSpare+'</td>'
                        + '<td><a style="cursor: pointer"onclick="getCustomerById(this)"data-toggle="modal" data-target="#customerDetail">' +objArr[i].custId   +'</a></td>'
                        +'<td>' +strFormat(objArr[i].resultTime) +'</td>'
                        + '<td >' + objArr[i].aplResult + '</td>' +
                        '<td>'+
                        '<a id="btnModif" name="申诉时间:' +strFormat(objArr[i].aplTime)+';申诉详情:' + objArr[i].appealSpare+""+'" accesskey="' + objArr[i].aplId + '"  style="cursor: pointer" onclick="get33Appeal(this)" data-toggle="modal" data-target="#modalUpdateEmp">审批</a></td></tr>');
                }
                var pagearea=document.getElementById("pagearea");
                pagearea.innerHTML="";
                if(page.currentPageCode!=1){
                    var url_page=url_getappeallist+"/page/"+(page.currentPageCode-1);
                    var href='javascript:refreshAppealList("'+url_page+'")';
                    var prePage="<a href='"+href+"'>上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                    pagearea.innerHTML+=prePage;
                }
                var currentpage="<span>当前第</span><span>"+page.currentPageCode+"</sapn><span>页</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                pagearea.innerHTML+=currentpage;
                if(page.currentPageCode<page.totalPages){
                    var url_page=url_getappeallist+"/page/"+(page.currentPageCode+1);
                    var href='javascript:refreshAppealList("'+url_page+'")';
                    var nextPage="<a href='"+href+"' >下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                    pagearea.innerHTML+=nextPage;
                }
                //页面其他信息
                var otherEle="<span>共</span><span>"+page.totalPages+"<span>页</sapn>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='text' id='topage' style='padding: 2px !important;width: 40px;height: 25px'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+"<input type='button' onclick='href2page()' style='padding: 0 !important;display: inline-block' value='&nbsp;&nbsp;&nbsp;跳转&nbsp;&nbsp;&nbsp;'>";
                pagearea.innerHTML+=otherEle;
            }
        }
        function get33Appeal(msg) {
            document.getElementById("myAppeal").innerText=msg.name;
            document.getElementById("applyid").value=msg.accessKey;
        }

        function  href2page() {
            var url2page=url_getappeallist+"/page/"+(document.getElementById("topage").value);
            refreshAppealList(url2page);
        }
        function strFormat(str){
            var date=new Date(str);
            var setDate=date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
            return setDate;
        }
        function selectbydate() {
            var to=document.getElementById("to").value;
            var from1=document.getElementById("from").value;
            if((to=="")||(from1=="")){
                alert("请选择结束(开始)时间");
                return;
            }
            var url_getappeallistbydate ='${pageContext.request.contextPath}/appeal/getAllByPagedateManage/?from1='+from1+'&to='+to;
            refreshAppealList(url_getappeallistbydate);
        }
        function refuse() {
            var applyid=document.getElementById("applyid").value;
            var url_refuseapply = '${pageContext.request.contextPath}/appeal/refuse/msgid/'+applyid;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_refuseapply, true);
            //xhr.setRequestHeader("X-Requested-With","XMLHttpRequest");
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            // xhr.onreadystatechange = refreshApplyList(url_getapplylist) ;
            location.reload();
            xhr.send();
        }
        function accept() {
            var applyid=document.getElementById("applyid").value;
            var url_acceptapply = '${pageContext.request.contextPath}/appeal/accept/msgid/'+applyid;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_acceptapply, true);
            //xhr.setRequestHeader("X-Requested-With","XMLHttpRequest");
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            // xhr.onreadystatechange = refreshApplyList(url_getapplylist) ;
            location.reload();
            xhr.send();
        }
        function getCustomerById(obj){
            var url_getCustomer = '${pageContext.request.contextPath}/customer/getById/msgid/'+obj.innerText;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_getCustomer, true);
            //xhr.setRequestHeader("X-Requested-With","XMLHttpRequest");
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            xhr.onreadystatechange =function () {
                if (xhr.readyState == 4 && xhr.status == 200) {
                    var customer = JSON.parse(xhr.responseText);
                    if(customer.cusGender==0)customer.cusGender='女';
                    else customer.cusGender='男';
                    document.getElementById("customer1").value=customer.custId;
                    document.getElementById("customer2").value=customer.custName;
                    document.getElementById("customer3").value=customer.custPwd;
                    document.getElementById("customer4").value=customer.cusGender;
                    document.getElementById("customer5").value=customer.custAge;
                    document.getElementById("customer6").value=customer.custPhone;
                    document.getElementById("customer7").value=customer.custEmail;
                    document.getElementById("customer8").value=customer.custIntegral;
                    document.getElementById("customer9").value=strFormat(customer.custCreateTime);
                }
            }
            xhr.send();
        }
        function getPunishmentById(obj){
            var url_getpunishment = '${pageContext.request.contextPath}/punishment/getById/msgid/'+obj.innerText;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_getpunishment, true);
            //xhr.setRequestHeader("X-Requested-With","XMLHttpRequest");
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            xhr.onreadystatechange =function () {
                if (xhr.readyState == 4 && xhr.status == 200) {
                    var punishment = JSON.parse(xhr.responseText);
                    document.getElementById("punishment1").value=punishment.punId;
                    document.getElementById("punishment2").value=punishment.custId;
                    document.getElementById("punishment3").value=punishment.regId;
                    document.getElementById("punishment4").value=strFormat(punishment.irregularitiesTime);
                    document.getElementById("punishment5").value=strFormat(punishment.punTime);
                    document.getElementById("punishment6").value=punishment.punContent;
                    document.getElementById("punishment7").value=punishment.punResult;
                }
            }
            xhr.send();
        }
    </script>
<style type="text/css">
    .col-md-4 label,.col-md-4 input{
        display: inline-block;
        font-size: 14px;
        text-overflow: ellipsis;
        overflow: hidden;
    }
    .col-md-4 label{
       vertical-align: middle;
    }
     .col-md-4 input{
        width: 35%;
        height: 40px;
        -webkit-appearance: none;
        -moz-appearance: none;
        border: 0;
        outline: 0;
        text-overflow: ellipsis;
        overflow: hidden;
        padding-left: 80px!important;
        color: #606266;
        background:url(${pageContext.request.contextPath}/example/day.png)no-repeat;
        background-color:whitesmoke;
    }
    .col-md-4{
        text-overflow: ellipsis;
        overflow: hidden;
        height: 80px;
    }
    #tbl{
        table-layout: fixed;
    }
    #tbl td{
        border: 1px solid #eee;
        word-break:keep-all;
        text-overflow: ellipsis;
        overflow: hidden;
        text-align: center;
        white-space:nowrap;
    }
    .innput{
        font-size: 14px!important;
        padding-left: 10px!important;
        height: 35px!important;
        width: 80%;
    }
</style>

</head>
<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_system.jsp"></jsp:include>
<!--breadcrumbs -->
<div style="height: 35px" >
</div>
<div id="container" style="text-align: center;background-color: #eee">
    <div class="row clearfix"  >
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
            <div id="haha" style="background-color:whitesmoke;width:79% !important; height: 80%" >
                <table class="table table-hover"  id="tbl">
                    <thead>
                    <tr>
                        <td>申诉编号</td>
                        <td>申诉对象</td>
                        <td>申诉时间</td>
                        <td>申诉描述</td>
                        <td>申诉用户</td>
                        <td>处理时间</td>
                        <td>处理结果</td>
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
    <div class="modal fade" id="modalUpdateEmp" tabindex="-2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display:none">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel">
                       申诉详情
                    </h4>
                </div>
                <div class="modal-body">
                        <div class="form-group">
                           <table>
                               <tr>
                                   <td style="text-indent: 50px" id="myAppeal"></td>
                                   <input type="hidden" id="applyid"/>
                               </tr>
                           </table>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10" style="text-align: center">
                                <button type="button" onclick="refuse()" class="btn btn-default">拒绝</button>&nbsp;&nbsp;
                                &nbsp;&nbsp;<button type="button" onclick="accept()" class="btn btn-primary">接受</button>
                            </div>
                        </div>
                </div>
            </div>
            <!-- /.modal-content -->
        </div>
        <!-- /.modal -->
    </div>
    <div class="modal fade" id="customerDetail" tabindex="-2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display:none">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" >
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

    <div class="modal fade" id="punishmentDetail" tabindex="-2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display:none">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" >
                      处罚详情
                    </h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        处罚编号：<input type="text" id="punishment1" class="innput"><br/>
                        处罚用户：<input type="text" id="punishment2" class="innput"><br/>
                        违反规定：<input type="text" id="punishment3" class="innput"><br/>
                        违规时间：<input type="text" id="punishment4" class="innput"><br/>
                        处罚时间：<input type="text" id="punishment5" class="innput"><br/>
                        处罚内容：<input type="text" id="punishment6" class="innput"><br/>
                        处罚结果：<input type="text" id="punishment7" class="innput"><br/>
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
