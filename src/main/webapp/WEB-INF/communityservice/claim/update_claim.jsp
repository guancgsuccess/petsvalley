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
        <title>修改认领信息</title>
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
            <h1>修改认领信息</h1>
            <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;
                <a href="${pageContext.request.contextPath}/cs_claim">宠物认领</a>&nbsp;/&nbsp;修改认领信息
            </div>
        </div>

        <section id="container">
            <div class="container">
                <form role="form" class="form-horizontal" action="javascript:confirmUpdate()" method="post" onsubmit="return valid()" enctype="multipart/form-data">

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
                        <label class="col-sm-2 control-label" for="claimState">认领状态：</label>
                        <div class="btn-group controls">
                            <button type="button" id="claimState" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                            </button>
                            <ul class="dropdown-menu" role="menu">
                                <li><a onclick="changeClaimState(this)" href="#">未认领</a></li>
                                <li><a onclick="changeClaimState(this)" href="#">已认领</a></li>
                            </ul>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="claimTime">发现时间：</label>
                        <div class="controls">
                            <p class="text" id="claimTime"></p>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="claimPlace">发现地点：</label>
                        <div class="controls">
                            <input class="form-control" type="text" name="claimPlace" style="width: 210px;height:30px;"  id="claimPlace" placeholder="请填写发现地点"/>
                            <label class="ferror" for="claimPlace" id="claim_place_error">发现地点不能为空</label>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="claimMessage">具体信息：</label>
                        <div class="controls">
                            <textarea class="form-control" placeholder="请填写具体信息" name="claimMessage" id="claimMessage" rows="6"></textarea>
                            <label class="ferror" for="claimMessage" id="claim_message_error">具体信息不能为空</label>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="claimPhone">联系手机：</label>
                        <div class="controls">
                            <input class="form-control" type="text" name="claimPhone" style="width: 210px;height:30px;" id="claimPhone" placeholder="请填写联系手机">
                            <label class="ferror" for="claimPhone" id="claim_phone_error">联系手机不能为空</label>
                        </div>
                    </div>

                    <label hidden="hidden" id="claimId"></label>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" ></label>
                        <div class="controls">
                            <button class="btn" type="submit" id="update-btn">修改认领信息</button>
                        </div>
                    </div>

                </form>
            </div>
        </section>

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer_e.jsp"></jsp:include>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/claim/update_claim.js"></script>

    </body>
</html>
