<%@ page import="com.petsvalley.entity.Customer" %><%--
  Created by IntelliJ IDEA.
  User: mjs
  Date: 2018/9/10
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
   <meta name="viewport" content="width=100%; initial-scale=1; maximum-scale=1; minimum-scale=1; user-scalable=no;" />
    <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
    <title>主页</title>
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
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top.jsp"></jsp:include>
<section>
    <div id="mainslider" class="flexslider">
        <ul class="slides">
            <li>
                <img src="example/slider1.jpg" alt="photo" />
                <h3><span>关&nbsp;于&nbsp;&nbsp;我&nbsp;们</span><a href="about.html">请用心关爱您的宠物，您的关爱需要萌宠谷,优质的服务，放心的选择。</a></h3>
            </li>
            <li>
                <img src="example/slider2.jpg" alt="photo" />
                <h3><span>关&nbsp;于&nbsp;&nbsp;我&nbsp;们</span><a href="about.html">请用心关爱您的宠物，您的关爱需要萌宠谷,优质的服务，放心的选择。</a></h3>
            </li>
            <li>
                <img src="example/slider3.jpg" alt="photo" />
                <h3><span>关&nbsp;于&nbsp;&nbsp;我&nbsp;们</span><a href="about.html">请用心关爱您的宠物，您的关爱需要萌宠谷,优质的服务，放心的选择。</a></h3>
            </li>
        </ul>
    </div>
</section>
<section id="container">
    <div class="container">
        <section id="welcome">
            <h1>主人的爱，我的家。</h1>
            <p>爱是种责任，爱是种供养，爱是你我它，爱在<span class="color2">萌宠谷。</span>我不是你的唯一，但你是我的全部。--<span class="color2">萌宠谷</span>.</p>
        </section>
        <div class="block-divider">
        </div>
        <div class="row">
            <div class="span3">
                <h3 class="slider-recents">宠物广场</h3>
                <p class="hidden-phone">
                    看似坚强乐观的狗狗，心中其实很脆弱。它们要的，无非就是你的一颦一笑，一言一语。
                    它们的确不懂你的语言，却愿意去了解你的心，愿意在你落泪时陪着你悲伤，愿意在你大笑时陪着你欢乐。
                    的确，你有你的许多，事业、家庭，而它们没有，没有人类的思维、各种的想法。
                    只是认定了你的好，就一辈子忠心。它喜欢在你的身边，愿意用生命去守护你。
                </p>
            </div>
            <div class="span9" style="height: 190px">
                <div id="our-projects" class="carousel btleft">
                    <div class="carousel-wrapper">
                        <ul class="da-thumbs">
                            <li>
                                <img src="example/latest1.jpg" />
                                <div>
                                    <a href="example/latest1.jpg" class="p-view" data-rel="prettyPhoto"></a>

                                </div>
                            </li>
                            <li>
                                <img src="example/latest2.jpg" />
                                <div>
                                    <a href="example/latest2.jpg" class="p-view" data-rel="prettyPhoto"></a>
                                </div>
                            </li>
                            <li>
                                <img src="example/latest3.jpg" />
                                <div>
                                    <a href="example/latest3.jpg" class="p-view" data-rel="prettyPhoto"></a>
                                </div>
                            </li>
                            <li>
                                <img src="example/latest4.jpg" />
                                <div>
                                    <a href="example/latest4.jpg" class="p-view" data-rel="prettyPhoto"></a>

                                </div>
                            </li>
                            <li>
                                <img src="example/latest5.jpg" />
                                <div>
                                    <a href="example/latest5.jpg" class="p-view" data-rel="prettyPhoto"></a>
                                </div>
                            </li>
                            <li>
                                <img src="example/latest6.jpg" />
                                <div>
                                    <a href="example/latest6.jpg" class="p-view" data-rel="prettyPhoto"></a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
                <script type="text/javascript">
                    $(document).ready(function(){
                        $('#our-projects').elastislide({
                            imageW  : 270,
                            margin  : 30
                        });
                    });
                </script>
            </div>

        </div>
        <div class="block-divider">
        </div>
        <div class="row our-blog">
            <div class="title-divider span12">
                <div class="divider-arrow"></div>
                <h3>爱宠小常识</h3>
            </div>
            <article class="span3">
                <img src="example/latest8.jpg" alt="photo" />
                <p class="l-meta"><span>帖主 <a href="${pageContext.request.contextPath}/post">奥德赛</a>  | 05/09/2018 | 类别  <a href="${pageContext.request.contextPath}/post">爱宠人士</a></span></p>
                <h4 class="title"><a href="${pageContext.request.contextPath}/post">喜欢就来带走它</a></h4>
                <p>现在的爱狗人士越来越多，所以大部分人都选择的养只狗狗作为宠物，因为狗狗忠厚可爱还非常的听话，如果你也想养只狗狗的话，不妨看看以下内容，选择一只自己喜爱的类型抱回家吧。 </p>
                <a href="${pageContext.request.contextPath}/post" class="read-more">查看详细信息.</a>
            </article>
            <article class="span3">
                <img src="example/latest7.jpg" alt="photo" />
                <p class="l-meta"><span>帖主 <a href="${pageContext.request.contextPath}/post">小四</a> |05/09/2012 | 类别 <a href="${pageContext.request.contextPath}/post">宠物日常</a></span></p>
                <h4 class="title"><a href="${pageContext.request.contextPath}/post">养宠必备</a></h4>
                <p>养了宠物的人闭上眼想想;想养的人，也闭上眼睛想想，想想以后应该如何面对那个你一直没有发现的，有着人的情感的它。你也许就能理解，它们的欢乐与悲伤。</p>
                <a href="${pageContext.request.contextPath}/post" class="read-more">查看详细信息</a>
            </article>
            <article class="span3">
                <img src="example/latest6.jpg" alt="photo" />
                <p class="l-meta"><span>帖主 <a href="${pageContext.request.contextPath}/post">阿基德</a>  |05/09/2012 | 类别 <a href="${pageContext.request.contextPath}/post">用心爱它</a></span></p>
                <h4 class="title"><a href="${pageContext.request.contextPath}/post">陪伴是最好的告白</a></h4>
                <p>在我年老时请好好照顾我，因为你也会变老的。在你把我带回家之前，请记得，我的寿命约有10~15年，你的离开，会是我最大的痛苦。 </p>
                <br> <a href="${pageContext.request.contextPath}/post" class="read-more">查看详细信息</a>
            </article>
            <article class="span3">
                <img src="example/latest5.jpg" alt="photo" />
                <p class="l-meta"><span>帖主 <a href="${pageContext.request.contextPath}/post">艾迪康</a>  | 05/09/2012 | 类别 <a href="${pageContext.request.contextPath}/post">养宠常识</a></span></p>
                <h4 class="title"><a href="${pageContext.request.contextPath}/post">宠物情缘,快乐有源</a></h4>
                <p>当你因为责骂我的不合作、固执或懒惰，请你想想，是否有什么正困扰着我，或许我没获得应有的食物，我已经很久没在阳光下奔跑，又或者我的心脏已经太弱太老。 </p>
                <a href="${pageContext.request.contextPath}/post" class="read-more">查看详细信息</a>
            </article>
        </div>
        <div class="block-divider2">
        </div>
        <div class="row">
            <!--our news-->
            <div class="span3 our-news">
                <div class="title-divider">
                    <div class="divider-arrow"></div>
                    <h3>最新规定</h3>
                </div>
                <article class="divider-blok">
                    <div class="news-data"><span>30</span>5月</div>
                    <h4 class="title"><a href="${pageContext.request.contextPath}/system_post">相关规定</a></h4>
                    <p>凡饲养观赏性鸟类、小动物,如家兔、鹦鹉等,不得妨碍他人休息和生活;不得占用楼道、楼梯间等公用地方;不得在窗外或门角边挂放宠物;不得污染环境。</p>
                    <a href="${pageContext.request.contextPath}/system_post" class="read-more">查看详细信息</a>
                </article>
                <article>
                    <div class="news-data"><span>28</span>5月</div>
                    <h4 class="title"><a href="${pageContext.request.contextPath}/system_post">管理条例</a></h4>
                    <p>不得携带犬只进入除为病犬检疫或免疫接种疹疗之外的场所,以及道路、游乐园、广场等公共场所,携带犬只进入有关场所,须遵守有关场所规定。</p>
                    <a href="${pageContext.request.contextPath}/system_post" class="read-more">查看详细信息</a>
                </article>
            </div>

            <!--accordion-->
            <div class="span3">
                <div class="title-divider">
                    <div class="divider-arrow"></div>
                    <h3>我们的服务</h3>
                </div>
                <div id="accordion" class="accordion">
                    <div class="accordion-group">
                        <div class="accordion-heading">
                            <a href="#collapse1" data-parent="#accordion" data-toggle="collapse" class="accordion-toggle"><i class="icon-minus icon-white"></i>管理目标</a>
                        </div>
                        <div class="accordion-body in collapse" id="collapse1" style="height: auto;">
                            <div class="accordion-inner">
                                <p>为加强小区宠物饲养管理,保障小区业主的人身安全和健康,维护小区公共秩序和环境卫生。</p>
                                <a href="${pageContext.request.contextPath}/system_post" class="read-more">查看详细信息</a>
                            </div>
                        </div>
                    </div>
                    <div class="accordion-group">
                        <div class="accordion-heading">
                            <a href="#collapse2" data-parent="#accordion" data-toggle="collapse" class="accordion-toggle"><i class="icon-plus icon-white"></i>责任办法<span></span>
                            </a>
                        </div>
                        <div class="accordion-body collapse" id="collapse2" style="height: 0px;">
                            <div class="accordion-inner">
                                <p>业主养犬不得妨害他人正常生活,犬只影响他人生活、休息的,养犬人须采取有效措施予以制止。</p>
                                <a href="${pageContext.request.contextPath}/system_post" class="read-more">查看详细信息</a>
                            </div>
                        </div>
                    </div>
                    <div class="accordion-group">
                        <div class="accordion-heading">
                            <a href="#collapse3" data-parent="#accordion" data-toggle="collapse" class="accordion-toggle"><i class="icon-plus icon-white"></i>举报方式<span></span></a>
                        </div>
                        <div class="accordion-body collapse" id="collapse3" style="height: 0px;">
                            <div class="accordion-inner">
                                <p>发现违规饲养犬只的行为,任何人员均可向管理服务中心或公安机关举报。举报电话：0459-2525243</p>
                                <a href="${pageContext.request.contextPath}/system_post" class="read-more">查看详细信息</a>
                            </div>
                        </div>
                    </div>
                    <div class="accordion-group">
                        <div class="accordion-heading">
                            <a href="#collapse4" data-parent="#accordion" data-toggle="collapse" class="accordion-toggle"><i class="icon-plus icon-white"></i>相关部门<span></span></a>
                        </div>
                        <div class="accordion-body collapse" id="collapse4" style="height: 0px;">
                            <div class="accordion-inner">
                                <p>小区物业管理部门：0459-342451，小区管理服务中心：0459-245252，公安机关：0459-342424</p>
                                <a href="${pageContext.request.contextPath}/system_post" class="read-more">查看详细信息</a>
                            </div>
                        </div>
                    </div>
                </div>

                <script type="text/javascript">
                    $(document).ready(function(){
                        $('#accordion').collapse({
                            toggle: false
                        });
                    });
                </script>
            </div>
            <!--twitter-->
            <div class="span3">
                <div class="title-divider">
                    <div class="divider-arrow"></div>
                    <h3>宠物的好处</h3>
                </div>
                <div class="twitter">
                    <div id="carousel-wrapper">
                        <p>
                            &nbsp;&nbsp;&nbsp;&nbsp;宠物作为我们人类的伴侣动物是我们人类获得幸福和健康生活的一个来源，饲养宠物可以让人们生活的更健康，更充实，
                            同时对人的心脏有好处，能降低血压和血脂，研究发现患有心脏病和具它一些慢性病，饲养宠物犬猫后，通过调节人的一些心理状态，
                            可以明显减轻临床症状。通过遛犬，与它一起玩耍，可以放松人的精神。<br>
                            &nbsp;&nbsp;&nbsp;&nbsp; 对于一些独居的孤独老年人有益于他们的身心健康，通过与宠物的相互沟通使老年人生活的更充实。
                            犬对于独居的人是最好的伴侣。对于一些单身的老年人在家发生一些意外情况，如突然中风，心脏病突发，经过训练的伴侣宠物能及时起到报警作用。
                        </p>
                    </div>
                </div>
            </div>
            <div class="span3">
                <div class="title-divider">
                    <div class="divider-arrow">
                        <a href="#" class="arrow-prev"></a>
                        <a href="#" class="arrow-next"></a>
                    </div>
                    <h3>关于我们</h3>
                </div>
                <!--testimonals-->
                <div id="testimonial" class="carousel bttop">
                    <div class="carousel-wrapper">
                        <p>
                            &nbsp;&nbsp;&nbsp;&nbsp;萌宠谷（中国）有限公司的创建团队是来自于世界500强企业的精英，拥有着30多年的商业管理经验。所以在商品选择和管理上更具优势和竞争力。
                            公司成立于2005年11月，是一家集宠物用品、宠物美容、宠物寄养、宠物摄影、宠物保健、宠物沙龙、宠物学校、宠物café为一体的一站式宠物精品连锁公司。<br>
                            &nbsp;&nbsp;&nbsp;&nbsp; 萌宠谷（中国）有限公司是一个具有时尚、爱心、创新、激情的公司，我们相信生命的平等，用真诚和爱心尊重并善待他们。
                            用大爱无疆的心让每个生命展现光辉！这也是宠儿的使命和承诺！
                        </p>
                    </div>
                </div>
                <script type="text/javascript">
                    $(document).ready(function(){
                            $('#testimonial').elastislide({
                                imageW  : 670,
                                margin  : 30
                            });
                        }
                    );
                </script>
            </div>
        </div>
    </div>
</section>
<!--footer-->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer.jsp"></jsp:include>
<a href="#" id="toTop" style="display: inline;"><span id="toTopHover" style="opacity: 0;"></span>To Top</a>
</body>
</html>
