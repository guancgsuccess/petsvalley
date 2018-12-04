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
    <title>防疫记录管理</title>
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
        var url_getvaccine = '${pageContext.request.contextPath}/vaccine/get';
        var url_getvaccinelist ='${pageContext.request.contextPath}/vaccine/getAllByPageManage';
        //页面加载后，首先加载所有的消息数据
        window.onload=function() {
            refreshVaccineList(url_getvaccinelist);
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
         function refreshVaccineList(url_getvaccinelist) {
            var objArr = null;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_getvaccinelist, true);
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
            xhr.onreadystatechange = loadVaccines;
            xhr.send();
        }
       function delforVaccine(obr1){
            var url_delvaccine = '${pageContext.request.contextPath}/vaccine/delete/msgid/'+obr1;
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            } else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_delvaccine, true);
           //xhr.setRequestHeader("X-Requested-With","XMLHttpRequest");
            xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
           window.location="${pageContext.request.contextPath}/vaccine";
            xhr.send();
        }
       function loadVaccines() {
            if (xhr.readyState == 4 && xhr.status == 200) {
                var page = JSON.parse(xhr.responseText);
                var objArr=page.modelList;
                var tbody = document.getElementById("tbody");
                tbody.innerHTML = "";
                for (var i = 0; i < objArr.length; i++) {
                    tbody.innerHTML += ('<tr><td>' + objArr[i].vaccId + '</td>' +
                        '<td ><a style="cursor: pointer"onclick="getPetById(this)"data-toggle="modal" data-target="#petDetail">'+objArr[i].petId+'</a></td>' +
                        '<td >' + objArr[i].vaccType + '</td>' +
                        '<td >' + objArr[i].vaccMessage + '</td>' +
                        '<td>' +strFormat(objArr[i].vaccTime) +'</td>' + '<td ><a style="cursor: pointer"onclick="getCustomerById(this)"data-toggle="modal" data-target="#customerDetail">'+objArr[i].vaccSpare+'</a></td>' +
                        '<td><a id="btnDel"  style="cursor: pointer" onclick="delforVaccine('+ objArr[i].vaccId +')">删除</a>  &nbsp;&nbsp;&nbsp;&nbsp;  ' +
                        ' <a id="btnModif" name="' + objArr[i].vaccMessage+""+'"  style="cursor: pointer" onclick="get33Vaccine(this)" data-toggle="modal" data-target="#modalUpdateEmp">查看</a></td></tr>');
                }
                var pagearea=document.getElementById("pagearea");
                pagearea.innerHTML="";
                if(page.currentPageCode!=1){
                    var url_page=url_getvaccinelist+"/page/"+(page.currentPageCode-1);
                    var href='javascript:refreshVaccineList("'+url_page+'")';
                    var prePage="<a href='"+href+"'>上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                    pagearea.innerHTML+=prePage;
                }
                var currentpage="<span>当前第</span><span>"+page.currentPageCode+"</sapn><span>页</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                pagearea.innerHTML+=currentpage;
                if(page.currentPageCode<page.totalPages){
                    var url_page=url_getvaccinelist+"/page/"+(page.currentPageCode+1);
                    var href='javascript:refreshVaccineList("'+url_page+'")';
                    var nextPage="<a href='"+href+"' >下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                    pagearea.innerHTML+=nextPage;
                }
                //页面其他信息
                var otherEle="<span>共</span><span>"+page.totalPages+"<span>页</sapn>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='text' id='topage' style='padding: 2px !important;width: 40px;height: 25px'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+"<input type='button' onclick='href2page()' style='padding: 0 !important;display: inline-block' value='&nbsp;&nbsp;&nbsp;跳转&nbsp;&nbsp;&nbsp;'>";
                pagearea.innerHTML+=otherEle;
            }
        }
        function get33Vaccine(msg) {
            document.getElementById("myVaccine").innerText=msg.name;
        }

        function  href2page() {
            var url2page=url_getvaccinelist+"/page/"+(document.getElementById("topage").value);
            refreshVaccineList(url2page);
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
            var url_getvaccinelistbydate ='${pageContext.request.contextPath}/vaccine/getAllByPagedateManage/?from1='+from1+'&to='+to;
            refreshVaccineList(url_getvaccinelistbydate);
        }
        function addpetdiv() {
            var url_getpetbycustid= '${pageContext.request.contextPath}/pet/getallbycustid';
            if (window.XMLHttpRequest) {
                xhr = new XMLHttpRequest();
            }else {
                xhr = new ActiveXObject('Microsoft.XMLHTTP');
            }
            xhr.open("GET", url_getpetbycustid,true);
            xhr.setRequestHeader("Content-type", "application/json;charset=utf-8");
            xhr.onreadystatechange =addpettype;
            xhr.send();
        }
        function addpettype() {
            if (xhr.readyState == 4 && xhr.status == 200) {
                var list = JSON.parse(xhr.responseText);
                var objSelectet=document.getElementById("pettype");
                for(var t=0;t<list.length;t++){
                    var objOption = document.createElement("OPTION");
                    objOption.text= list[t].petName;
                    objOption.value=list[t].petId;
                    objSelectet.options.add(objOption);
                }
            }
        }
        $(function() {
            $( "#addpetagetime" ).datepicker();
            $( "#addpetagetime" ).datepicker( "option", "dateFormat","yy-mm-dd" );
        });
        function addpet() {
            var addpetname= document.getElementById("pettype").value;
            var addpetgender= document.getElementById("addpetgender").value;
            var addpetage= document.getElementById("addpetage").value;
          var  addpetagetime=document.getElementById("addpetagetime").value;
            if(addpetgender==""||addpetname==-1||addpetage==""){
                alert("信息不完整哦");
                return;
            }else {
                var url_addpet= '${pageContext.request.contextPath}/vaccine/insert';
                if (window.XMLHttpRequest) {
                    xhr = new XMLHttpRequest();
                } else {
                    xhr = new ActiveXObject('Microsoft.XMLHTTP');
                }
                var fd="petId="+addpetname+"&vaccType="+addpetgender+"&vaccMessage="+addpetage+"&vaccTime="+addpetagetime;
                xhr.open("POST", url_addpet,true);
                xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=utf-8");
                xhr.send(fd);
                location.reload();
            }

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
        function getPetById(obj){
            var url_getCustomer = '${pageContext.request.contextPath}/pet/get/msgid/'+obj.innerText;
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
                    var pet = JSON.parse(xhr.responseText);
                    if(pet.petGender==0)pet.petGender='雌性';
                    else pet.petGender='雄性';
                    document.getElementById("pet1").value=pet.petId;
                    document.getElementById("pet2").value=pet.petName;
                    document.getElementById("pet3").value=pet.petGender;
                    document.getElementById("pet4").value=pet.petAge;
                    document.getElementById("pet5").value=pet.petTypeId;
                    document.getElementById("pet6").value=pet.petWeight;
                    document.getElementById("pet7").value=pet.petMateState;
                    document.getElementById("pet8").value=pet.custId;
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
    .inpput{
        font-size: 14px!important;
        padding-left: 10px!important;
        height: 35px!important;
        width: 80%;
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
                 <%--   <label ><a style="cursor: pointer" onclick="addpetdiv()" data-toggle="modal" data-target="#addpetdiv">添加防疫记录</a></label>--%>
                </div>
            </div>
            <div style="background-color: #eee;height: 10px;width: 79%"></div>
            <div id="haha" style="background-color:whitesmoke;width:79% !important; height: 80%" >
                <table class="table table-hover"  id="tbl">
                    <thead>
                    <tr>
                        <td>防疫编号</td>
                        <td>防疫宠物</td>
                        <td>防疫类型</td>
                        <td>详细信息</td>
                        <td>防疫时间</td>
                        <td>相应用户</td>
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
                       消息详情
                    </h4>
                </div>
                <div class="modal-body">
                        <div class="form-group">
                           <table>
                               <tr>
                                   <td style="text-indent: 50px" id="myVaccine"></td>
                               </tr>
                           </table>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="button" style="float: right" class="btn btn-default" data-dismiss="modal">关闭</button>
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
    <div class="modal fade" id="petDetail" tabindex="-2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display:none">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" >
                        宠物详情
                    </h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        宠物编号：<input type="text" id="pet1" class="innput"><br/>
                        宠物姓名：<input type="text" id="pet2" class="innput"><br/>
                        宠物性别：<input type="text" id="pet3" class="innput"><br/>
                        宠物年龄：<input type="text" id="pet4" class="innput"><br/>
                        宠物类别：<input type="text" id="pet5" class="innput"><br/>
                        宠物体重：<input type="text" id="pet6" class="innput"><br/>
                        宠物配偶：<input type="text" id="pet7" class="innput"><br/>
                        宠物所属：<input type="text" id="pet8" class="innput">
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
    <div class="modal fade" id="addpetdiv" tabindex="-2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display:none">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" >
                        添加防疫记录
                    </h4>
                </div>
                <div class="modal-body">
                    <div class="form-group" style="text-align: center">
                        <form>
                            选择宠物:<select name="pettype" id="pettype" style="width: 80%" >
                                     <option value="-1">请选择您的宠物</option>
                                     </select><br/>
                            疫苗类型:<input type="text"  placeholder="请输入疫苗类型" id="addpetgender" class="inpput"/><br/>
                            防疫时间:<input type="text" id="addpetagetime" placeholder="请选择防疫时间" class="inpput"  ><br/>
                            详细信息:<input  type="text" placeholder="请输入详细信息" id="addpetage" class="inpput"/><br/>
                        </form>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10" style="float: right">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button><button type="button" onclick="addpet()" class="btn btn-primary">确认添加</button>
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
