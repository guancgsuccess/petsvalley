//创建XMLHttpRequest对象
var xhr = null;
//获取页面对象
var claim_time = document.getElementById("claim-time");
var claim_time_error = document.getElementById("claim_time_error");
var claim_place = document.getElementById("claim-place");
var claim_place_error = document.getElementById("claim_place_error");
var claim_message = document.getElementById("claim-message");
var claim_message_error = document.getElementById("claim_message_error");
var file_error = document.getElementById("file_error");
var claim_phone = document.getElementById("claim-phone");
var claim_phone_error = document.getElementById("claim_phone_error");
//文件上传的对象
var eleList = document.querySelectorAll("#upload");
var ele = eleList[0].querySelector('#img-container');
ele.files = [];

// 为添加按钮绑定点击事件，设置选择图片的功能
var addBtn = document.querySelector('.img-up-add');
addBtn.addEventListener('click',function () {
    document.querySelector('#img-file-input').value = null;
    document.querySelector('#img-file-input').click();
    return false;
},false)

// 预览图片
//处理input选择的图片
function handleFileSelect(evt) {
    var files = evt.target.files;

    for(var i=0, f; f=files[i];i++){
        // 过滤掉非图片类型文件
        if(!f.type.match('image.*')){
            continue;
        }
        // 过滤掉重复上传的图片
        var tip = false;
        for(var j=0; j<(ele.files).length; j++){
            if((ele.files)[j].name == f.name){
                tip = true;
                break;
            }
        }
        if(!tip){
            // 图片文件绑定到容器元素上
            ele.files.push(f);

            var reader = new FileReader();
            reader.onload = (function (theFile) {
                return function (e) {
                    var oDiv = document.createElement('div');
                    oDiv.className = 'img-thumb img-item';
                    // 向图片容器里添加元素
                    oDiv.innerHTML = '<img class="thumb-icon" src="'+e.target.result+'" />'+
                        '<a href="javascript:;" class="img-remove">x</a>'

                    ele.insertBefore(oDiv, addBtn);
                };
            })(f);

            reader.readAsDataURL(f);
        }
    }
}
document.querySelector('#img-file-input').addEventListener('change', handleFileSelect, false);

// 删除图片
function removeImg(evt) {
    if(evt.target.className.match(/img-remove/)){
        /*console.log('3',ele.files);*/
        // 获取删除的节点的索引
        function getIndex(ele){

            if(ele && ele.nodeType && ele.nodeType == 1) {
                var oParent = ele.parentNode;
                var oChilds = oParent.children;
                for(var i = 0; i < oChilds.length; i++){
                    if(oChilds[i] == ele)
                        return i;
                }
            }else {
                return -1;
            }
        }
        // 根据索引删除指定的文件对象
        var index = getIndex(evt.target.parentNode);
        ele.removeChild(evt.target.parentNode);
        if(index < 0){
            return;
        }else {
            ele.files.splice(index, 1);
        }
        /*console.log('4',ele.files);*/
    }
}
ele.addEventListener('click', removeImg, false);

//接收百度地图获取的地点
var claim_place_str;
//页面加载创建地图
window.onload = function (ev) {
    //创建地图
    var map = new BMap.Map("map_canvas");
    map.enableScrollWheelZoom();    //启用滚轮放大缩小，默认禁用
    map.enableContinuousZoom();    //启用地图惯性拖拽，默认禁用
    //map.addControl(new BMap.OverviewMapControl()); //添加默认缩略地图控件
    map.addControl(new BMap.OverviewMapControl({ isOpen: true, anchor: BMAP_ANCHOR_BOTTOM_RIGHT }));   //右下角，打开
    var localSearch = new BMap.LocalSearch(map);
    localSearch.enableAutoViewport(); //允许自动调节窗体大小

    //获取自身位置
    var geolocation = new BMap.Geolocation();
    geolocation.getCurrentPosition(function(r){
        if(this.getStatus() == BMAP_STATUS_SUCCESS){
            //获取自身位置经纬度
            var point = new BMap.Point(r.point.lng,r.point.lat);
            map.centerAndZoom(point,17);
            var geoc = new BMap.Geocoder();
            //创建自身位置标记
            var marker = new BMap.Marker(point);
            var infoWindow = new BMap.InfoWindow("<p style='font-size:14px;'>您的位置</p>");
            marker.addEventListener("mouseover", function () { this.openInfoWindow(infoWindow); });
            marker.addEventListener("mouseout", function () { this.closeInfoWindow(infoWindow); });
            map.addOverlay(marker);
            //地图内单击事件
            map.addEventListener("click", function(e){
                var pt = e.point;
                geoc.getLocation(pt, function(rs){
                    marker.remove();
                    var addComp = rs.addressComponents;
                    claim_place_str=addComp.province + ", " + addComp.city + ", " + addComp.district + ", " + addComp.street + ", " + addComp.streetNumber;
                    // 创建标注，为单击处的具体地点
                    marker = new BMap.Marker(pt);
                    var infoWindow = new BMap.InfoWindow("<p style='font-size:14px;'>" + claim_place_str + "</p>");
                    marker.addEventListener("mouseover", function () { this.openInfoWindow(infoWindow); });
                    marker.addEventListener("mouseout", function () { this.closeInfoWindow(infoWindow); });
                    map.addOverlay(marker);
                });
            });

        }
        else {
            //提示失败信息
            alert('failed'+this.getStatus());
        }
    },{enableHighAccuracy: true});

}

//选择地点确认单击事件
function choose_place_submit() {
    var choose_place = document.getElementById("choose-place-btn");
    if(claim_place_str!=null){
        claim_place.innerText = claim_place_str;
        claim_place.hidden=false;
        choose_place.innerText="重新选择";
    }
    else{
        claim_place.innerText=null;
        claim_place.hidden=true;
        choose_place.innerText="选择丢失地点";
    }
}

//验证发布信息表单内容
function valid() {
    //验证时间
    if(claim_time.value==""||claim_time.value==null){
        claim_time_error.style.display="block";
        claim_place_error.style.display="none";
        claim_message_error.style.display="none";
        file_error.style.display="none";
        claim_phone_error.style.display="none";
        return false;
    }else{
        claim_time_error.style.display="none";
    }
    //验证地点
    if(claim_place.innerText==""||claim_place.innerText==null){
        claim_place_error.style.display="block";
        claim_message_error.style.display="none";
        file_error.style.display="none";
        claim_phone_error.style.display="none";
        return false;
    }else{
        claim_place_error.style.display="none";
    }
    //验证具体信息
    if(claim_message.value==""||claim_message.value==null){
        claim_message_error.style.display="block";
        file_error.style.display="none";
        claim_phone_error.style.display="none";
        return false;
    }else{
        claim_message_error.style.display="none";
    }
    //验证文件上传
    if(ele.files.length<1){
        file_error.innerText = "至少上传一张照片";
        file_error.style.display="block";
        claim_phone_error.style.display="none";
        return false;
    }else if(ele.files.length>5){
        file_error.innerText = "最多上传五张照片";
        file_error.style.display="block";
        claim_phone_error.style.display="none";
        return false;
    }else{
        file_error.style.display="none";
    }
    //验证手机号
    if(claim_phone.value==""||claim_phone.value==null){
        claim_phone_error.style.display="block";
        return false;
    }else{
        claim_phone_error.style.display="none";
    }
}

//确认发布请求
function submit() {
    //创建FormData对象
    var formData = new FormData();
    //向formData中添加所有图片文件
    for(var i=0, f; f=ele.files[i]; i++){
        formData.append('files', f);
    }
    //添加其他信息
    formData.append('claimTimeStr',claim_time.value);
    formData.append('claimPlace',claim_place.innerText);
    formData.append('claimMessage',claim_message.value);
    formData.append('claimPhone',claim_phone.value);

    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    xhr.onreadystatechange = function () {
        if(xhr.readyState == 4 && xhr.status == 200){
            var msg = xhr.responseText;
            if(msg=="发布成功"){
                alert(msg);
                window.location.href="claim";
            }else
                alert(msg);
        }
    }
    xhr.open('POST', "claim/releaseClaim", true);
    xhr.send(formData);

}