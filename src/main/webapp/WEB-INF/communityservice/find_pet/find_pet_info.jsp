<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/17/017
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
    <head>
        <title>寻宠详情</title>
        <link href="${pageContext.request.contextPath}/css/find_pets/find_pet_info.css" type="text/css" rel="stylesheet"/>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/find_pets/find_pet_info.js"></script>
    </head>
    <body>

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_e.jsp"></jsp:include>

        <div class="container breadcrumbs">
            <h1>寻宠详情</h1>
            <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;
                <a href="${pageContext.request.contextPath}/cs_find_pets">寻宠信息</a>&nbsp;/&nbsp;寻宠详情
            </div>
        </div>

        <section id="container">
            <div class="container">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h3 class="panel-title">寻宠详情</h3>
                    </div>
                    <div class="panel-body">
                        <div class="controls">
                            <label class="control-label lead" for="petName">宠物姓名：</label>
                            <p class="text" id="petName"></p>
                        </div>

                        <div class="controls" id="images">
                            <img alt="无法显示图片" id="petPhoto" style="width:270px;height:192.733px;" src=""/>
                        </div>

                        <div class="controls">
                            <label class="control-label lead">寻宠状态：</label>
                            <p class="text" id="fpState"></p>
                        </div>

                        <div class="controls">
                            <label class="control-label lead">丢失时间：</label>
                            <p class="text" id="lostTime"></p>
                        </div>

                        <div class="controls">
                            <label class="control-label lead">丢失地点：</label>
                            <p class="text" id="lostPlace"></p>
                        </div>

                        <div class="controls">
                            <label class="control-label lead">详细信息：</label>
                            <p class="text" id="lostMessage"></p>
                        </div>

                        <div class="controls">
                            <label class="control-label lead">悬赏金额：</label>
                            <p class="text" id="fpReward"></p>
                        </div>

                        <div class="controls">
                            <label class="control-label lead">联系方式：</label>
                            <p class="text" id="fpPhone"></p>
                        </div>
                        <label id="petId" hidden="hidden"></label>

                        <div class="controls">
                            <label class="control-label lead"></label>
                            <p class="text" id="contact">
                                找到丢失宠物了？
                                <a data-toggle="modal" data-target="#contact-modal" id="contact-link">联系宠物主人</a>
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
                            <a href="" id="update_info" hidden="hidden">修改寻宠信息</a>
                        </div>

                    </div>
                </div>
            </div>
        </section>

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer_e.jsp"></jsp:include>

    </body>

</html>
