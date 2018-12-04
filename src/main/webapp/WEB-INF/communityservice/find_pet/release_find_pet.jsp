<%@ page import="com.petsvalley.entity.Customer" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/10/010
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>发布寻宠信息</title>
        <meta name="viewport" content="width=100%; initial-scale=1; maximum-scale=1; minimum-scale=1; user-scalable=no;" />
        <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
        <link href="${pageContext.request.contextPath}/css/find_pets/release_find_pet.css" type="text/css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/css/bootstrap.css" type="text/css" rel="stylesheet" />
        <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=X2Ed1hXzCOMRLhbsBQG5ow0zlGNG11Ns"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    </head>
    <body>
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_e.jsp"></jsp:include>

        <div class="container breadcrumbs">
            <h1>发布寻宠信息</h1>
            <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;<a href="${pageContext.request.contextPath}/cs_find_pets">寻宠信息</a> &nbsp;/&nbsp;发布寻宠信息</div>
        </div>

        <section id="container">
            <div class="container" id="form-find-pet">
                <form role="form" class="form-horizontal" action="javascript:submit()" method="post" onsubmit="return valid()" enctype="multipart/form-data">

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="choose-pet-div">丢失宠物：</label>
                        <div class="controls" id="choose-pet-div">
                            <button class="btn" id="choose-pet" type="button" onclick="choosePet()">选择丢失宠物</button>
                            <div id="all-pets" hidden="hidden" class="radio">
                            </div>
                            <label class="ferror" id="all_pet_error">请选择丢失宠物</label>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="lost-time">丢失时间：</label>
                        <div class="controls">
                            <input class="form-control" type="date" style="width: 210px;line-height: normal;height:30px;" name="lostTimeStr" id="lost-time"/>
                            <label class="ferror" for="lost-time" id="lost_time_error">丢失时间不能为空</label>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="lost-place">丢失地点：</label>
                        <div class="controls">
                            <button class="btn btn-warning btn-lg" data-toggle="modal" data-target="#choose-place-modal" id="choose-place-btn">选择丢失地点</button>
                            <span id="lost-place" hidden="hidden"></span>
                            <div id="choose-place-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true" style="display:none">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                            <h4 class="modal-title" id="myModalLabel">选择丢失地点</h4>
                                        </div>
                                        <div class="modal-body">
                                            <div id="map_canvas"
                                                 style="position: center;
                                                    width: 520px;
                                                    height: 400px;
                                                    border: 1px solid gray;
                                                    overflow:hidden;">
                                            </div>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                                            <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="javascript:choose_place_submit()">确定</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <label class="ferror" for="lost-place" id="lost_place_error">丢失地点不能为空</label>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="lost-message">具体信息：</label>
                        <div class="controls">
                            <textarea class="form-control" placeholder="请填写具体信息" name="lostMessage" id="lost-message" rows="6"></textarea>
                            <label class="ferror" for="lost-message" id="lost_message_error">具体信息不能为空</label>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" <%--for="fp-images"--%>>上传照片：</label>
                        <div class="controls" id="upload">
                            <div id="img-container">
                                <div class="img-up-add img-item"><span class="img-add-icon">+</span> </div>
                                <input type="file" name="files" id="img-file-input" accept="image/*">
                            </div>
                            <label class="ferror" for="img-file-input" id="file_error">至少上传一张照片</label>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="reward">悬赏金额：</label>
                        <div class="controls">
                            <input class="form-control" type="text" style="width: 210px;height:30px;" name="fpReward" id="reward" placeholder="请填写悬赏金额">
                            <label class="ferror" for="reward" id="reward_error">悬赏金额不能为空</label>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="phone">联系手机：</label>
                        <div class="controls">
                            <input class="form-control" type="text" style="width: 210px;height:30px;" name="fpPhone" id="phone" placeholder="请填写联系手机">
                            <label class="ferror" for="phone" id="phone_error">联系手机不能为空</label>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" ></label>
                        <div class="controls">
                            <button class="btn btn-warning" type="submit" id="release-btn">发布寻宠信息</button>
                            <a href="/cs_my_find_pet">我发布的</a>
                        </div>
                    </div>

                </form>
            </div>
        </section>

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer_e.jsp"></jsp:include>
    </body>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/find_pets/release_find_pet.js"></script>

</html>
