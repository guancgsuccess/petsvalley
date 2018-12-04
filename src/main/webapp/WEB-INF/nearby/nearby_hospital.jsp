<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/2/002
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>附近宠物医院</title>
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
    <div>您当前的位置: &nbsp;&nbsp;<a href="${pageContext.request.contextPath}/index">首页</a> &nbsp;/&nbsp;附近宠物医院</div>
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
    window.onload = function () {
        var map = new BMap.Map("map_canvas");
        map.enableScrollWheelZoom();    //启用滚轮放大缩小，默认禁用
        map.enableContinuousZoom();    //启用地图惯性拖拽，默认禁用
        map.addControl(new BMap.OverviewMapControl({ isOpen: true, anchor: BMAP_ANCHOR_BOTTOM_RIGHT }));   //右下角，打开
        var localSearch = new BMap.LocalSearch(map);
        localSearch.enableAutoViewport(); //允许自动调节窗体大小

        var geolocation = new BMap.Geolocation();
        geolocation.getCurrentPosition(function(r){
            if(this.getStatus() == BMAP_STATUS_SUCCESS){
                var point = new BMap.Point(r.point.lng,r.point.lat);
                map.centerAndZoom(point,14);
                var myIcon = new BMap.Icon("../images/mylocation.png", new BMap.Size(23, 25), {
                    anchor: new BMap.Size(10, 25),
                });
                // 创建标注对象并添加到地图
                var marker = new BMap.Marker(point);
                map.addOverlay(marker);
                var opts = {
                    width : 100,     // 信息窗口宽度
                    height: 20,     // 信息窗口高度
                }
                var infoWindow = new BMap.InfoWindow("您的位置", opts);  // 创建信息窗口对象
                marker.addEventListener("mouseover", function () { this.openInfoWindow(infoWindow); });
                marker.addEventListener("mouseout", function () { this.closeInfoWindow(infoWindow); });
                map.openInfoWindow(infoWindow, map.getCenter());      // 打开信息窗口
            }
            else {
                alert('failed'+this.getStatus());
            }
        },{enableHighAccuracy: true});

        var local = new BMap.LocalSearch(map, {
            renderOptions:{map: map}
        });
        local.search("宠物医院");
    }
</script>
</html>
