<%--
  Created by IntelliJ IDEA.
  User: mjs
  Date: 2018/9/11
  Time: 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<footer id="footer">
    <div class="container">
        <div class="row">
            <div class="span3">
                <h3>加入我们</h3>
                <p>眼里只有你，宠爱萌宠谷。萌宠谷，只为宠爱负责。萌宠谷，我和宝贝的共同向往！关爱您的宠物，关注萌宠谷。给您宠物一片灿烂的蓝天。爱在萌宠谷，宠物也奢华。您的宠物，我们的宝贝。</p>
                <p>请用心关爱您的宠物，您的关爱需要萌宠谷,优质的服务，放心的选择。给予爱宠一生的至尊呵护。
                    一样的宠爱，不同的风采。不同的宠爱，共同的选择。</p>
            </div>
            <div class="span3">
                <h3>让爱传承</h3>
                <ul class="flickr clearfix">
                    <image src="${pageContext.request.contextPath}/example/team6.jpg"></image>
                </ul>
            </div>
            <div class="span3">
                <h3>欢迎骚扰我们</h3>
                <form id="contact" class="form-horizontal" method="post" />
                <div class="control-group">
                    <label class="control-label" for="inputName">姓名</label>
                    <div class="controls">
                        <input type="text" id="inputName" placeholder="姓名" name="inputName" />
                        <label class="ferror" for="inputName" id="fname_error">姓名不能为空</label>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="inputEmail">邮箱</label>
                    <div class="controls">
                        <input type="text" id="inputEmail" placeholder="邮箱" name="inputEmail" />
                        <label class="ferror" for="inputEmail" id="femail_error">邮箱不能为空</label>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="inputMessage"></label>
                    <div class="controls">
                        <textarea rows="3" id="inputMessage" name="inputMessage"></textarea>
                        <label class="ferror" for="inputMessage" id="fmessage_error">亲,信息内容不能为空哦.</label>
                    </div>
                </div>
                <div class="submit-div">
                    <input type="submit" class="btn pull-right footer-button" value="SUBMIT!" />
                </div>
                </form>
            </div>
            <div class="span3">
                <h3>我们的地址</h3>
                <address>
                    中国,苏州, 创意产业园, 1栋210<a href="/map">查看地图</a><br />
                    <i class="myicon-phone"></i>(0211) 7787-564<br />
                    <i class="myicon-mail"></i>mengchonggu@163.com
                </address>
                苏州是中国首批24座国家历史文化名城之一，有近2500年历史，是吴文化的发祥地。苏州人多属江浙民系，使用吴语。
                苏州园林是中国私家园林的代表，被联合国教科文组织列为世界文化遗产。中国大运河苏州段入选世界遗产名录。
            </div>
        </div>
    </div>
</footer>
<!--footer menu-->
<section id="footer-menu">
    <div class="container">
        <div class="row">
            <div class="span8 hidden-phone">
                <ul>
                    <li><a href="./index.html">主页</a></li>
                    <li><a href="./about.html">关于我们</a></li>
                    <li><a href="./services.html">我们的服务</a></li>
                    <li><a href="./contact.html">联系我们</a></li>
                </ul>
            </div>
            <p class="animated wow slideInLeft" data-wow-delay=".5s">苏州驰星
                &copy;萌宠谷研发团队&nbsp;版权所有&copy;侵权必究 <a href="./index.html" target="_blank" title="宠物之家">宠物之家</a>
                - &copy;<a href="./index.html" title="宠物之家" target="_blank">萌宠谷</a></p>

        </div>
    </div>
</section>
<a href="#" id="toTop" style="display: inline;"><span id="toTopHover" style="opacity: 0;"></span>To Top</a>
</body>
</html>
