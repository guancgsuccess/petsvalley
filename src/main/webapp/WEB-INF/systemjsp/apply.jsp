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
    <title>系统申请管理</title>
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
        var url_getapply = '${pageContext.request.contextPath}/apply/get';
        var url_getapplylist ='${pageContext.request.contextPath}/apply/getAllByPageManage';
        //页面加载后，首先加载所有的消息数据
        window.onload=function() {
            refreshApplyList(url_getapplylist);
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
                $("#to").datepicker({
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
         function refreshApplyList(url_getapplylist) {
            var objArr = null;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_getapplylist, true);
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            xhr.onreadystatechange = loadApply;
            xhr.send();
        }
       function delforApply(obr1){
            var url_delapply = '${pageContext.request.contextPath}/apply/delete/msgid/'+obr1;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_delapply, true);
           //xhr.setRequestHeader("X-Requested-With","XMLHttpRequest");
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
           // xhr.onreadystatechange = refreshApplyList(url_getapplylist) ;
           window.location="${pageContext.request.contextPath}/system";
            xhr.send();
        }
       function loadApply() {
            if (xhr.readyState == 4 && xhr.status == 200) {
                var page = JSON.parse(xhr.responseText);
                var objArr=page.modelList;
                var tbody = document.getElementById("tbody");
                tbody.innerHTML = "";
                for (var i = 0; i < objArr.length; i++) {
                    if(objArr[i].serviceId==null)objArr[i].serviceId=0;
                    if(objArr[i].fosterId==null)objArr[i].fosterId=0;
                    if(objArr[i].applySpare==null)objArr[i].applySpare="无";
                    tbody.innerHTML += ('<tr><td>' + objArr[i].applyId + '</td>' +
                        '<td ><a style="cursor: pointer" data-target="#serviceDetail"data-toggle="modal" onclick="getServiceById(this)">' + objArr[i].serviceId + '</a></td>' +
                        '<td><a style="cursor: pointer"onclick="getFosterById(this)" data-toggle="modal"data-target="#fosterDetail">' +objArr[i].fosterId   +'</a></td>'+'<td><a style="cursor: pointer"onclick="getCustomerById(this)"data-toggle="modal" data-target="#customerDetail">' +objArr[i].applyCustId   +'</a></td>'+'<td>' +strFormat(objArr[i].applyTime) +'</td>' +'<td>' +objArr[i].applySchedule +'</td>' + '<td >' + objArr[i].applyClassify + '</td>'+
                        '<td>'+
                        '<a id="btnModif"   style="cursor: pointer" name="申请时间:'+strFormat(objArr[i].applyTime)+';申请详情:'+objArr[i].applyClassify+';申请理由:'+objArr[i].applySpare+'\n\n"  accesskey="' + objArr[i].applyId + '"  onclick="get33Apply(this)" data-toggle="modal" data-target="#modalUpdateEmp">审批</a></td></tr>');
                }
                /*<a id="btnDel"  style="cursor: pointer" onclick="delforApply('+ objArr[i].applyId +')">删除</a>&nbsp;&nbsp;&nbsp;' */
                var pagearea=document.getElementById("pagearea");
                pagearea.innerHTML="";
                if(page.currentPageCode!=1){
                    var url_page=url_getapplylist+"/page/"+(page.currentPageCode-1);
                    var href='javascript:refreshApplyList("'+url_page+'")';
                    var prePage="<a href='"+href+"'>上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                    pagearea.innerHTML+=prePage;
                }
                var currentpage="<span>当前第</span><span>"+page.currentPageCode+"</sapn><span>页</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                pagearea.innerHTML+=currentpage;
                if(page.currentPageCode<page.totalPages){
                    var url_page=url_getapplylist+"/page/"+(page.currentPageCode+1);
                    var href='javascript:refreshApplyList("'+url_page+'")';
                    var nextPage="<a href='"+href+"' >下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                    pagearea.innerHTML+=nextPage;
                }
                //页面其他信息
                var otherEle="<span>共</span><span>"+page.totalPages+"<span>页</sapn>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='text' id='topage' style='padding: 2px !important;width: 40px;height: 25px'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+"<input type='button' onclick='href2page()' style='padding: 0 !important;display: inline-block' value='&nbsp;&nbsp;&nbsp;跳转&nbsp;&nbsp;&nbsp;'>";
                pagearea.innerHTML+=otherEle;
            }
        }
        function get33Apply(msg) {
            document.getElementById("myApply").innerText=msg.name;
            document.getElementById("applyid").value=msg.accessKey;

        }
        function getServiceById(obj){
            if(obj.innerText==0){
                document.getElementById("service1").value=null;
                document.getElementById("service2").value=null;
                document.getElementById("service3").value=null;
                document.getElementById("service4").value=null;
                document.getElementById("service5").value=null;
                document.getElementById("service6").value=null;
                return false;
            }
            var url_getService = '${pageContext.request.contextPath}/service/getById/msgid/'+obj.innerText;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_getService, true);
            //xhr.setRequestHeader("X-Requested-With","XMLHttpRequest");
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
             xhr.onreadystatechange =function () {
                 if (xhr.readyState == 4 && xhr.status == 200) {
                     var service = JSON.parse(xhr.responseText);
                         document.getElementById("service1").value = service.serviceId;
                         document.getElementById("service2").value = service.serviceTitle;
                         document.getElementById("service3").value = service.serviceContent;
                         document.getElementById("service4").value = service.serviceReward;
                         document.getElementById("service5").value = service.serviceNo;
                         document.getElementById("service6").value = strFormat(service.serviceTime);
                 }
             }
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
        function getFosterById(obj){
            if(obj.innerText==0){
                document.getElementById("foster1").value=null;
                document.getElementById("foster2").value=null;
                document.getElementById("foster3").value=null;
                document.getElementById("foster4").value=null;
                return false;
            }
            var url_getFoster = '${pageContext.request.contextPath}/foster/getById/msgid/'+obj.innerText;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_getFoster, true);
            //xhr.setRequestHeader("X-Requested-With","XMLHttpRequest");
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            xhr.onreadystatechange =function () {
                if (xhr.readyState == 4 && xhr.status == 200) {
                    var foster = JSON.parse(xhr.responseText);
                    document.getElementById("foster1").value=foster.fosterId;
                    document.getElementById("foster2").value=foster.fosterPetId;
                    document.getElementById("foster3").value=foster.fosterMessage;
                    document.getElementById("foster4").value=foster.fosterReason;
                }
            }
            xhr.send();
        }

        function  href2page() {
            var url2page=url_getapplylist+"/page/"+(document.getElementById("topage").value);
            refreshApplyList(url2page);
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
            var url_getapplylistbydate ='${pageContext.request.contextPath}/apply/getAllByPagedateManage/?from1='+from1+'&to='+to;
            refreshApplyList(url_getapplylistbydate);
        }
        function refuse() {
            var applyid=document.getElementById("applyid").value;
            var url_refuseapply = '${pageContext.request.contextPath}/apply/refuse/msgid/'+applyid;
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
            var url_acceptapply = '${pageContext.request.contextPath}/apply/accept/msgid/'+applyid;
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
<div style="height: 35px">
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
                        <td>申请编号</td>
                        <td>服务编号</td>
                        <td>寄养编号</td>
                        <td>申请用户</td>
                        <td>申请时间</td>
                        <td>审批状态</td>
                        <td>申请详情</td>
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
                       申请详情
                    </h4>
                </div>
                <div class="modal-body">
                        <div class="form-group">
                           <table>
                               <tr>
                                   <td style="text-indent: 50px" id="myApply"></td>
                                   <input type="hidden" id="applyid"/>
                               </tr>
                           </table>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10" style="text-align: center">
                                <button type="button" data-dismiss="modal" class="btn btn-default">关闭</button>&nbsp;&nbsp;&nbsp;&nbsp;<button type="button" onclick="refuse()"data-dismiss="modal" class="btn btn-default">拒绝</button>&nbsp;&nbsp;&nbsp;&nbsp;<button type="button" onclick="accept()" class="btn btn-primary">接受</button>
                            </div>
                        </div>
                </div>
            </div>
            <!-- /.modal-content -->
        </div>
        <!-- /.modal -->
    </div>

    <div   class="modal fade" id="serviceDetail" tabindex="-2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display:none">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" >
                        服务详情
                    </h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                            服务编号：<input type="text" id="service1" class="innput"><br/>
                            服务主题：<input type="text" id="service2" class="innput"><br/>
                            服务详情：<input type="text" id="service3" class="innput"><br/>
                            积分奖励：<input type="text" id="service4" class="innput"><br/>
                            需求人数：<input type="text" id="service5" class="innput"><br/>
                            发布时间：<input type="text" id="service6" class="innput">
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
    <div   class="modal fade" id="customerDetail" tabindex="-2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display:none">
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
    <div   class="modal fade" id="fosterDetail" tabindex="-2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display:none">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" >
                        寄养详情
                    </h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                            寄养编号：<input type="text" id="foster1" class="innput"><br/>
                            宠物编号：<input type="text" id="foster2" class="innput"><br/>
                            宠物信息：<input type="text" id="foster3" class="innput"><br/>
                            寄养原因：<input type="text" id="foster4" class="innput"><br/>
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
