<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/23/023
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>发布寄养信息</title>
        <link href="${pageContext.request.contextPath}/css/find_pets/release_find_pet.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_e.jsp"></jsp:include>

        <div class="container breadcrumbs">
            <h1>发布寻宠信息</h1>
            <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;<a href="${pageContext.request.contextPath}/cs_foster">宠物寄养</a> &nbsp;/&nbsp;发布寄养信息</div>
        </div>

        <section id="container">
            <div class="container" id="form-find-pet">
                <form role="form" class="form-horizontal" action="javascript:submit()" method="post" onsubmit="return valid()" enctype="multipart/form-data">

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="choose-pet-div">寄养宠物：</label>
                        <div class="controls" id="choose-pet-div">
                            <button class="btn" id="choose-pet" type="button" onclick="choosePet()">选择寄养宠物</button>
                            <div id="all-pets" hidden="hidden" class="radio">
                            </div>
                            <label class="ferror" id="all_pet_error">请选择寄养宠物</label>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="foster-message">寄养宠物信息：</label>
                        <div class="controls">
                            <textarea class="form-control" name="fosterMessage"  id="foster-message" placeholder="请填写寄养的宠物信息" rows="4"></textarea>
                            <label class="ferror" for="foster-message" id="foster_message_error">寄养宠物信息不能为空</label>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="col-sm-2 control-label" for="foster-reason">寄养原因：</label>
                        <div class="controls">
                            <textarea class="form-control" placeholder="请填写具体信息" name="fosterReason" id="foster-reason" rows="6"></textarea>
                            <label class="ferror" for="foster-reason" id="foster_reason_error">寄养原因不能为空</label>
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
                        <label class="col-sm-2 control-label" ></label>
                        <div class="controls">
                            <button class="btn btn-warning" type="submit" id="release-btn">发布寄养信息</button>
                        </div>
                    </div>

                </form>
            </div>
        </section>

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer_e.jsp"></jsp:include>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/foster/release_foster.js"></script>

    </body>
</html>
