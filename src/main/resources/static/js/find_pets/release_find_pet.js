//丢失地点
var lost_place_str;
//创建XMLHttpRequest对象
var xhr = null;

//加载我的宠物列表请求
function choosePet() {
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    xhr.open("GET", "findPet/getPetsByCustId", true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = loadPets;
    xhr.send();
}
//加载我的宠物
function loadPets() {
    if (xhr.readyState == 4 && xhr.status == 200) {
        var petList = JSON.parse(xhr.responseText);
        if(petList=="")
            alert("您还没有宠物，快去添加宠物吧！");
        else{
            var all_pets_div = document.getElementById("all-pets");
            all_pets_div.style.display = "block";
            all_pets_div.innerHTML="";
            for(var i=0;i<petList.length;i++){
                all_pets_div.innerHTML+= "<input type='radio' name='petIdRadio' value='"+petList[i].petId+"'>"+petList[i].petName+"<br>";
            }
        }
    }
}
//获取页面元素
var radios = document.getElementsByName("petIdRadio");
var all_pet_error = document.getElementById("all_pet_error");
var lost_time = document.getElementById("lost-time");
var lost_time_error = document.getElementById("lost_time_error");
var lost_place = document.getElementById("lost-place");
var lost_place_error = document.getElementById("lost_place_error");
var lost_message = document.getElementById("lost-message");
var lost_message_error = document.getElementById("lost_message_error");
var file_error = document.getElementById("file_error");
var reward = document.getElementById("reward");
var reward_error = document.getElementById("reward_error");
var phone = document.getElementById("phone");
var phone_error = document.getElementById("phone_error");
//获取文件上传元素
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

//页面加载时加载地图
window.onload = function (ev) {
    var map = new BMap.Map("map_canvas");
    map.enableScrollWheelZoom();    //启用滚轮放大缩小，默认禁用
    map.enableContinuousZoom();    //启用地图惯性拖拽，默认禁用
    //map.addControl(new BMap.OverviewMapControl()); //添加默认缩略地图控件
    map.addControl(new BMap.OverviewMapControl({ isOpen: true, anchor: BMAP_ANCHOR_BOTTOM_RIGHT }));   //右下角，打开
    var localSearch = new BMap.LocalSearch(map);
    localSearch.enableAutoViewport(); //允许自动调节窗体大小
    //获得当前位置
    var geolocation = new BMap.Geolocation();
    geolocation.getCurrentPosition(function(r){
        if(this.getStatus() == BMAP_STATUS_SUCCESS){
            var point = new BMap.Point(r.point.lng,r.point.lat);
            map.centerAndZoom(point,17);

            var geoc = new BMap.Geocoder();
            //在当前位置创建标注
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
                    lost_place_str=addComp.province + ", " + addComp.city + ", " + addComp.district + ", " + addComp.street + ", " + addComp.streetNumber;
                      // 创建标注，为单击处详细地点
                    marker = new BMap.Marker(pt);
                    var infoWindow = new BMap.InfoWindow("<p style='font-size:14px;'>" + lost_place_str + "</p>");
                    marker.addEventListener("mouseover", function () { this.openInfoWindow(infoWindow); });
                    marker.addEventListener("mouseout", function () { this.closeInfoWindow(infoWindow); });
                    map.addOverlay(marker);
                });
            });

        }
        else {
            alert('failed'+this.getStatus());
        }
    },{enableHighAccuracy: true})

}

//选择地点确认事件
function choose_place_submit() {
    var choose_place = document.getElementById("choose-place-btn");
    if(lost_place_str!=null){
        lost_place.innerText = lost_place_str;
        lost_place.hidden=false;
        choose_place.innerText="重新选择";
    }
    else{
        lost_place.innerText=null;
        lost_place.hidden=true;
        choose_place.innerText="选择丢失地点";
    }
}

//表单验证
function valid() {
    //验证选择宠物
    var checkedNum=0;
    for(var i=0;i<radios.length;i++){
        if(radios.item(i).checked){
            checkedNum++;
        }
    }
    if(checkedNum<1){
        all_pet_error.style.display="block";
        lost_time_error.style.display="none";
        lost_place_error.style.display="none";
        lost_message_error.style.display="none";
        file_error.style.display="none";
        reward_error.style.display="none";
        phone_error.style.display="none";
        return false;
    }else{
        all_pet_error.style.display="none";
    }
    //验证丢失时间
    if(lost_time.value==""||lost_time.value==null){
        lost_time_error.style.display="block";
        lost_place_error.style.display="none";
        lost_message_error.style.display="none";
        file_error.style.display="none";
        reward_error.style.display="none";
        phone_error.style.display="none";
        return false;
    }else{
        lost_time_error.style.display="none";
    }
    //验证丢失地点
    if(lost_place.innerText==""||lost_place.innerText==null){
        lost_place_error.style.display="block";
        lost_message_error.style.display="none";
        file_error.style.display="none";
        reward_error.style.display="none";
        phone_error.style.display="none";
        return false;
    }else{
        lost_place_error.style.display="none";
    }
    //验证详细信息
    if(lost_message.value==""||lost_message.value==null){
        lost_message_error.style.display="block";
        file_error.style.display="none";
        reward_error.style.display="none";
        phone_error.style.display="none";
        return false;
    }else{
        lost_message_error.style.display="none";
    }
    //验证上传图片
    if(ele.files.length<1){
        file_error.innerText = "至少上传一张照片";
        file_error.style.display="block";
        reward_error.style.display="none";
        phone_error.style.display="none";
        return false;
    }else if(ele.files.length>5){
        file_error.innerText = "最多上传五张照片";
        file_error.style.display="block";
        reward_error.style.display="none";
        phone_error.style.display="none";
        return false;
    }else{
        file_error.style.display="none";
    }
    //验证悬赏金额
    if(reward.value==""||reward.value==null){
        reward_error.innerText = "悬赏金额不能为空";
        reward_error.style.display="block";
        phone_error.style.display="none";
        return false;
    }else if(reward.value%1!=0){
        reward_error.innerText = "请输入整数悬赏金额";
        reward_error.style.display="block";
        phone_error.style.display="none";
        return false;
    }else{
        reward_error.style.display="none";
    }
    //验证手机
    if(phone.value == ""||phone.value==null){
        phone_error.innerText = "联系手机不能为空";
        phone_error.style.display="block";
        return false;
    }else if(!(/^1(3|4|5|7|8)\d{9}$/.test(phone.value))){
        phone_error.innerText = "请输入正确的手机号码格式";
        phone_error.style.display="block";
        return false;
    }else{
        phone_error.style.display="none";
    }

    return true;
}

// 提交表单
function submit() {
    //创建FormData对象
    var formData = new FormData();
    //添加图片文件
    for(var i=0, f; f=ele.files[i]; i++){
        formData.append('files', f);
    }
    //添加选中宠物
    for(var i=0;i<radios.length;i++){
        if(radios.item(i).checked){
            var petId = radios.item(i).value;
        }
    }
    //其他元素
    formData.append('petId',petId);
    formData.append('lostTimeStr',lost_time.value);
    formData.append('lostPlace',lost_place.innerText);
    formData.append('lostMessage',lost_message.value);
    formData.append('fpReward',reward.value);
    formData.append('fpPhone',phone.value);
    xhr.onreadystatechange = function () {
        if(xhr.readyState == 4 && xhr.status == 200){
            var msg = xhr.responseText;
            if(msg=="发布成功"){
                alert(msg);
                window.location.href="find_pets";
            }else
                alert(msg);
        }
    }
    xhr.open('POST', "findPet/releaseFindPet", true);
    xhr.send(formData);

}

