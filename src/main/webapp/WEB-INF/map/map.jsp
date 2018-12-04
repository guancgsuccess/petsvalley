<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26/026
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>公司地址</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=X2Ed1hXzCOMRLhbsBQG5ow0zlGNG11Ns"></script>
        <meta name="viewport" content="width=100%; initial-scale=1; maximum-scale=1; minimum-scale=1; user-scalable=no;" />
        <link rel="icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.png" type="image/png" /><!--设置主页logo-->
        <link href="${pageContext.request.contextPath}/css/bootstrap.css" type="text/css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/css/style.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/top_e.jsp"></jsp:include>

        <div class="container breadcrumbs">
            <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;公司地址 </div>
        </div>

        <!--container-->
        <section id="container">
            <div style="width:730px;margin:auto;">
                <div id="map_canvas"
                     style="position: center;
                        width: 730px;
                        height: 590px;
                        border: 1px solid gray;
                        overflow:hidden;">
                </div>
            </div>
        </section>

        <jsp:include page="${pageContext.request.contextPath}/WEB-INF/layoutjsp/footer_e.jsp"></jsp:include>
    </body>
    <script type="text/javascript">
        window.onload = function (ev) {
            var map = new BMap.Map("map_canvas");
            map.centerAndZoom(new BMap.Point(120.740392,31.270454),13);
            /*map.centerAndZoom("苏州", 12);*/
            map.enableScrollWheelZoom();    //启用滚轮放大缩小，默认禁用
            map.enableContinuousZoom();    //启用地图惯性拖拽，默认禁用

            map.addControl(new BMap.NavigationControl());  //添加默认缩放平移控件
            map.addControl(new BMap.OverviewMapControl()); //添加默认缩略地图控件
            map.addControl(new BMap.OverviewMapControl({ isOpen: true, anchor: BMAP_ANCHOR_BOTTOM_RIGHT }));   //右下角，打开
            var localSearch = new BMap.LocalSearch(map);
            localSearch.enableAutoViewport(); //允许自动调节窗体大小
            localSearch.search("创意产业园区");
            var marker = new BMap.Marker(new BMap.Point(120.740392,31.270454));  // 创建标注，为要查询的地方对应的经纬度
            map.addOverlay(marker);
            var content = "中国,苏州, 创意产业园, 1栋210<br/>电话：(0211) 7787-564<br/>邮箱：mengchonggu@163.com";
            var infoWindow = new BMap.InfoWindow("<p style='font-size:14px;'>" + content + "</p>");
            marker.addEventListener("click", function () { this.openInfoWindow(infoWindow); });
        }
    </script>
</html>
