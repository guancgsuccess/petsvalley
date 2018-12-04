//创建XMLHttpRequest对象
var xhr = null;
//获取链接中的fosterId
var fosterId = window.location.search;
//获取寄养信息详情链接
var url_fosterInfo = "/foster/fosterInfo"+fosterId;
//页面加载时加载寄养信息详情
window.onload = function () {
    fosterInfo(url_fosterInfo);
}
//获取寄养信息详情请求
function fosterInfo(url) {
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    xhr.open("GET", url, true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = loadFosterInfo;
    xhr.send();
}
//加载寄养信息详情
function loadFosterInfo() {
    if (xhr.readyState == 4 && xhr.status == 200) {
        var map = JSON.parse(xhr.responseText);

        for(var key in map){
            var value = map[key];
            if(key==0)
                var foster = value;
            else if(key==1)
                var pet = value;
            else if(key==2)
                var imgList = value;
        }

        var petName = document.getElementById("petName");
        var images = document.getElementById("images");
        var fosterState = document.getElementById("fosterState");
        var fosterMessage = document.getElementById("fosterMessage");
        var fosterReason = document.getElementById("fosterReason");

        petName.innerText = pet.petName;
        images.innerHTML = "<img alt='无法显示图片' id='fosterPhoto' style='width:270px;height:192.733px;' src='"+foster.fosterPhoto+"'/>";
        fosterState.innerText = foster.fosterState==0?"未寄养":"已寄养";
        fosterMessage.innerText = foster.fosterMessage;
        fosterReason.innerText = foster.fosterReason;

        for(var i = 0;i<imgList.length;i++){
            images.innerHTML+="<img alt='无法显示图片' style='width:270px;height:192.733px;' src='"+imgList[i].path+"'/>";
        }

        var fosterId = document.getElementById("fosterId");
        fosterId.innerText = foster.fosterId;
        fosterId.style.display = "none";

    }
}
//验证申请信息
function valid(){
    var apply_reason = document.getElementById("apply_reason");
    var reason_error = document.getElementById("reason_error");

    if(apply_reason.value==null||apply_reason.value==""){
        reason_error.style.display="block";
        return false;
    }else
        reason_error.style.display="none";
}
//确认领养按钮单击事件
function submit(){
    var formData=new FormData;
    var fosterId = document.getElementById("fosterId");
    var applyReason = document.getElementById("apply_reason");
    formData.append("fosterId",fosterId.innerText);
    formData.append("applyReason",applyReason.value);

    xhr.onreadystatechange = function (e) {
        if(xhr.readyState == 4 && xhr.status == 200){
            var msg = xhr.responseText;
            alert(msg);
            if(msg=="申请成功，请等待管理员审批")
                window.location.reload();
        }
    }
    xhr.open('POST', "foster/apply", true);
    xhr.send(formData);
}
