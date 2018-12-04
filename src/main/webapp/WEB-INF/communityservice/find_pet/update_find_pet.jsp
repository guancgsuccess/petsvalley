<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/24/024
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改寻宠信息</title>
    <meta name="viewport" content="width=100%; initial-scale=1; maximum-scale=1; minimum-scale=1; user-scalable=no;" />
    <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" type="text/css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/css/ie.css" type="text/css" rel="stylesheet"/>
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
    <link href="${pageContext.request.contextPath}/css/find_pets/release_find_pet.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_e.jsp"></jsp:include>
        <div class="container breadcrumbs">
            <h1>修改寻宠信息</h1>
            <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;
                <a href="${pageContext.request.contextPath}/cs_find_pets">寻宠信息</a>&nbsp;/&nbsp;修改寻宠信息
            </div>
        </div>

        <section id="container">
            <div class="container">
                <form role="form" class="form-horizontal" action="javascript:confirmUpdate()" method="post" onsubmit="return valid()" enctype="multipart/form-data">

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="petName">宠物姓名：</label>
                        <div class="controls">
                            <p class="text" id="petName"></p>
                        </div>
                    </div>

                    <div class="control-group">
                        <div class="controls" id="upload">
                            <div id="images-al" style="display: inline-block;float: left;"></div>
                            <div id="img-container">
                                <div class="img-up-add img-item"><span class="img-add-icon">+</span> </div>
                                <input type="file" name="files" id="img-file-input" accept="image/*">
                            </div>
                            <label class="ferror" for="img-file-input" id="file_error"></label>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="fpState">寻宠状态：</label>
                        <div class="btn-group controls">
                            <button type="button" id="fpState" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                            </button>
                            <ul class="dropdown-menu" role="menu">
                                <li><a onclick="changeFpState(this)" href="#">未找到</a></li>
                                <li><a onclick="changeFpState(this)" href="#">已找到</a></li>
                            </ul>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="lostTime">丢失时间：</label>
                        <div class="controls">
                            <p class="text" id="lostTime"></p>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="lostPlace">丢失地点：</label>
                        <div class="controls">
                            <input class="form-control" type="text" name="lostPlace" style="width: 210px;height:30px;"  id="lostPlace" placeholder="请填写丢失地点"/>
                            <label class="ferror" for="lostPlace" id="lost_place_error">丢失地点不能为空</label>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="lostMessage">具体信息：</label>
                        <div class="controls">
                            <textarea class="form-control" placeholder="请填写具体信息" name="lostMessage" id="lostMessage" rows="6"></textarea>
                            <label class="ferror" for="lostMessage" id="lost_message_error">具体信息不能为空</label>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="fpReward">悬赏金额：</label>
                        <div class="controls">
                            <input class="form-control" type="text" name="fpReward" style="width: 210px;height:30px;" id="fpReward" placeholder="请填写悬赏金额">
                            <label class="ferror" for="fpReward" id="reward_error">悬赏金额不能为空</label>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="fpPhone">联系手机：</label>
                        <div class="controls">
                            <input class="form-control" type="text" name="fpPhone" style="width: 210px;height:30px;" id="fpPhone" placeholder="请填写联系手机">
                            <label class="ferror" for="fpPhone" id="phone_error">联系手机不能为空</label>
                        </div>
                    </div>

                    <label hidden="hidden" id="fpId"></label>
                    <label hidden="hidden" id="petId"></label>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" ></label>
                        <div class="controls">
                            <button class="btn" type="submit" id="update-btn">修改寻宠信息</button>
                        </div>
                    </div>

                </form>
            </div>
        </section>

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer_e.jsp"></jsp:include>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/find_pets/update_find_pet.js"></script>
    </body>
</html>
