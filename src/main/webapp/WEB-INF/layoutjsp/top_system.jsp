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
    <%
        Customer customer = (Customer) session.getAttribute("customer");
        if (customer != null) {
            String name = customer.getCustName();
        }
    %>

    <script>
        var xhr = null;

        function valid() {
            var titleI = document.getElementById("title");
            var contentT = document.getElementById("content");
            var title_error = document.getElementById("title_error");
            var content_error = document.getElementById("content_error");
            if (titleI.value=="" ||titleI.value==null) {
                title_error.style.display = "block";
                content_error.style.display = "none";
                return false;
            }else{
                title_error.style.display = "none";
            }
            if (contentT.value=="" || contentT.value==null) {
                content_error.style.display = "block";
                return false;
            }else{
                content_error.style.display = "none";
                return true;
            }
        }

        function addPost() {
            var form = new FormData();
            var type = document.getElementById("select").value;
            if (type == null) {
                alert("请选择类别")
                return;
            }
            if (type == "相关规定") {
                if (window.XMLHttpRequest) {
                    xhr = new XMLHttpRequest();
                }
                else {
                    xhr = new ActiveXObject("Microsoft.XMLHTTP");
                }

                var title = document.getElementById("title").value;
                var content = document.getElementById("content").value;
                form.append("title", title);
                form.append("content", content);
                document.getElementById("title").value = "";
                document.getElementById("content").value = "";

                xhr.open("POST", "${pageContext.request.contextPath}/SystemPost/saveRegulations", true);
                xhr.onreadystatechange = function () {
                    if (xhr.readyState == 4 && xhr.status == 200) {
                        form = null;
                        alert("发表成功");
                        window.location.reload();
                    }

                }
                xhr.send(form);
            }
            if (type == "疾病预防") {
                if (window.XMLHttpRequest) {
                    xhr = new XMLHttpRequest();
                }
                else {
                    xhr = new ActiveXObject("Microsoft.XMLHTTP");
                }

                var title = document.getElementById("title").value;
                var content = document.getElementById("content").value;
                form.append("title", title);
                form.append("content", content);
                document.getElementById("title").value = "";
                document.getElementById("content").value = "";

                xhr.open("POST", "${pageContext.request.contextPath}/SystemPost/saveStrategy", true);
                xhr.onreadystatechange = function () {
                    form = null;
                    if (xhr.responseText == "发表成功") {
                        alert("发表成功");
                        window.location.reload();
                    }
                    else if (xhr.responseText == "发表失败") {
                        alert("发表失败，请重新发布");
                        window.location.reload();
                    }
                }
                xhr.send(form);
            }
        }
    </script>
</head>
<body>
<section id="top-menu" style="position: fixed;z-index: 101;width: 100%;height: 35px">
    <div class="container">
        <div class="row">
            <div class="span6 hidden-phone">
                <ul class="top-social" style="float: left;margin-left: -20px!important;">
                    <li style="margin-left: 10px!important;"><a href="http://www.codeforge.cn/article/322157" class="twitter2"></a></li>
                    <li style="margin-left: 10px!important;"><a href="http://www.gplus.com.tw/" class="gplus"></a></li>
                    <li style="margin-left: 10px!important;"><a href="https://dribbble.com/" class="dribbble"></a></li>
                    <li style="margin-left: 10px!important;"><a href="http://www.kguowai.com/html/1518.html" class="vimeo"></a></li>
                    <li style="margin-left: 10px!important;"><a href="https://www.last.fm/zh/user/deliciousmeal" class="delicious last"></a></li>
                </ul>
            </div>
            <div class="span6" style="float: right;">
                <span class="active" style="float: right;">
                    <% if (customer != null && customer.getCustRole() == 1) { %>
                    <a class="tb-app" href="" data-toggle=modal data-target=#saveRegulation>发表规定/帖子</a>
                    <% } %>
                    <span>管理员</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${customer.custName}，欢迎&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/logout">退出</a>
                </span>
        </div>
        </div>
    </div>

</section>
<div class="modal fade" id="saveRegulation" tabindex="-2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display:none">
    <div class="modal-dialog">
        <div class="modal-content"> <!--整个页面-->
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" >
                    发布管理规定/疾病预防措施
                </h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" role="form" method="post" action="javascript:addPost()" onsubmit="return valid()">
                    <div class="form-group">
                        <label class="col-sm-2 control-label"
                               style="display: block;float: left">标题</label>
                        <div class="col-sm-10 controls">
                            <input type="text" id="title" class="form-control" placeholder="请输入标题"
                                   style="height: 35px;width: 300px;float: left"/>
                            <label style="display: none;color: red;" for="title" id="title_error">标题不能为空</label>
                        </div>
                    </div><br/><br/><br/>
                    <div class="form-group">
                        <label class="col-sm-2 control-label"
                               style="display: inline-block">类别</label>
                        <div id="addImg" style="display: inline-block;height:35px;width:300px;margin-left: 20px">
                            <SELECT id="select" style="height: 35px;width: 300px;">
                                <OPTION>相关规定</OPTION>
                                <OPTION>疾病预防</OPTION>
                            </SELECT>
                        </div>
                    </div><br/>
                    <div class="form-group">
                        <label class="col-sm-2 control-label"
                               style="display: block">内容</label>
                        <div class="col-sm-10 controls">
                                                    <textarea id="content" class="form-control" placeholder="请输入内容"
                                                              style="height: 150px;width: 300px"></textarea>
                            <label style="display: none;color: red;" for="content"
                                   id="content_error">内容不能为空</label>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10" style="margin-left: 200px">
                            <button type="button" class="btn btn-default"
                                    data-dismiss="modal">取消</button>
                            <button type="submit" id="btnupdate" class="btn btn-primary">发布</button>
                        </div>
                    </div>

                </form>

            </div>

        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal -->
</div>
</body>

</html>
