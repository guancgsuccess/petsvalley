<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/23/023
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>寄养宠物详情</title>
        <link href="${pageContext.request.contextPath}/css/find_pets/find_pet_info.css" type="text/css" rel="stylesheet"/>
    </head>
    <body>
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_e.jsp"></jsp:include>
        <div class="container breadcrumbs">
            <h1>寄养宠物详情</h1>
            <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;
                <a href="${pageContext.request.contextPath}/cs_foster">宠物寄养</a>&nbsp;/&nbsp;寄养宠物详情
            </div>
        </div>

        <section id="container">
            <div class="container">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h3 class="panel-title">寄养宠物详情</h3>
                    </div>
                    <div class="panel-body">
                        <div class="controls">
                            <label class="control-label lead" for="petName">宠物姓名：</label>
                            <p class="text" id="petName"></p>
                        </div>

                        <div class="controls" id="images">
                            <img alt="无法显示图片" id="fosterPhoto" style="width:270px;height:192.733px;" src=""/>
                        </div>

                        <div class="controls">
                            <label class="control-label lead">寄养状态：</label>
                            <p class="text" id="fosterState"></p>
                        </div>

                        <div class="controls">
                            <label class="control-label lead">寄养信息：</label>
                            <p class="text" id="fosterMessage"></p>
                        </div>

                        <div class="controls">
                            <label class="control-label lead">寄养原因：</label>
                            <p class="text" id="fosterReason"></p>
                        </div>

                        <label id="fosterId" hidden="hidden"></label>

                        <div class="controls">
                            <label class="control-label lead"></label>
                            <p class="text" id="contact">
                                <a data-toggle="modal" data-target="#apply-modal" id="apply-link">申请领养</a>
                                <div id="apply-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true" style="display:none">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <form action="javascript:submit()" method="post" onsubmit="return valid()">
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                    <h4 class="modal-title" id="myModalLabel">联系发布用户</h4>
                                                </div>
                                                <div class="modal-body">
                                                    <textarea id="apply_reason" rows="6" style="width: 100%" placeholder="申请理由"></textarea>
                                                    <label class="ferror" id="reason_error">请填写申请理由</label><br>
                                                </div>
                                                <div class="modal-footer">
                                                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                                                    <button type="submit" class="btn btn-primary">确认申请</button>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </p>
                        </div>

                    </div>
                </div>
            </div>
        </section>

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer_e.jsp"></jsp:include>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/foster/foster_info.js"></script>
    </body>
</html>
