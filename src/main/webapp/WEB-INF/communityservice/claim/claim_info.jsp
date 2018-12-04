<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/25/025
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>认领详情</title>
        <link href="${pageContext.request.contextPath}/css/find_pets/find_pet_info.css" type="text/css" rel="stylesheet"/>
    </head>
    <body>
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_e.jsp"></jsp:include>
        <div class="container breadcrumbs">
            <h1>宠物认领</h1>
            <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;
                <a href="${pageContext.request.contextPath}/cs_find_pets">宠物认领</a>&nbsp;/&nbsp;认领详情
            </div>
        </div>

        <section id="container">
            <div class="container">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h3 class="panel-title">认领详情</h3>
                    </div>
                    <div class="panel-body">

                        <div class="controls" id="images">
                            <img alt="无法显示图片" id="petPhoto" style="width:210px;height:150px;" src=""/>
                        </div>

                        <div class="controls">
                            <label class="control-label lead">发布时间：</label>
                            <p class="text" id="claimTime"></p>
                        </div>

                        <div class="controls">
                            <label class="control-label lead">认领状态：</label>
                            <p class="text" id="claimState"></p>
                        </div>

                        <div class="controls">
                            <label class="control-label lead">丢失地点：</label>
                            <p class="text" id="claimPlace"></p>
                        </div>

                        <div class="controls">
                            <label class="control-label lead">详细信息：</label>
                            <p class="text" id="claimMessage"></p>
                        </div>

                        <div class="controls">
                            <label class="control-label lead">联系方式：</label>
                            <p class="text" id="claimPhone"></p>
                        </div>

                        <div class="controls">
                            <label class="control-label lead"></label>
                            <p class="text" id="contact">
                                这是您丢失的宠物？
                                <a data-toggle="modal" data-target="#contact-modal" id="contact-link">联系发布用户</a>
                                <div id="contact-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true" style="display:none">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <form action="javascript:submit()" method="post" onsubmit="return valid()">
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                    <h4 class="modal-title" id="myModalLabel">联系发布用户</h4>
                                                </div>
                                                <div class="modal-body">
                                                    <textarea id="contact-content" rows="6" style="width: 100%" placeholder="具体信息"></textarea>
                                                    <label class="ferror" id="content_error">请填写具体信息</label><br>
                                                    <input type="text" id="contact-phone" style="height:30px;width: 210px;" placeholder="联系电话">
                                                    <label class="ferror" id="phone_error">请输入正确的手机号</label><br>
                                                </div>
                                                <div class="modal-footer">
                                                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                                                    <button type="submit" class="btn btn-primary">发送信息</button>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </p>
                            <a href="" id="update_info" hidden="hidden">修改认领信息</a>
                        </div>

                    </div>
                </div>
            </div>
        </section>

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer_e.jsp"></jsp:include>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/claim/claim_info.js"></script>
    </body>
</html>
