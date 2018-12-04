//创建XMLHttpRequest对象
var xhr = null;
//从链接中获取claimId
var claimId = window.location.search;
//获取认领信息链接
var url_claimInfo = "/claim/claimInfo"+claimId;
//页面加载时加载认领信息
window.onload = function () {
    getClaimInfo(url_claimInfo);
}

//日期转换为String类型
function dateToString(time) {
    var datetime = new Date();
    datetime.setTime(time);
    var year = datetime.getFullYear();
    var month = datetime.getMonth() + 1;
    var date = datetime.getDate();
    /*对月 日 时 分 秒 小于10的时候的处理  --小于 10 时前面加 0*/
    if (month <= 9) {
        month = "0" + month;
    }
    if (date <= 9) {
        date = "0" + date
    }
    return year + "-" + month + "-" + date;
};

//发送请求
function getClaimInfo(url) {
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    xhr.open("GET", url, true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = loadClaimInfo;
    xhr.send();
}

var claimIdVal;
//加载数据
function loadClaimInfo() {
    if (xhr.readyState == 4 && xhr.status == 200) {
        var map = JSON.parse(xhr.responseText);
        //获取map数据
        for(var key in map){
            var value = map[key];
            if(key==0)
                //认领信息详情
                var claim = value;
            else if(key==1)
                //认领信息图片列表
                var imgList = value;
            else if(key==2)
                //认领信息是否本人发布
                var isMyClaim = value;
        }

        claimIdVal=claim.claimId;
        //获取页面对象
        var images = document.getElementById("images");
        var claimState = document.getElementById("claimState");
        var claimTime = document.getElementById("claimTime");
        var claimPlace = document.getElementById("claimPlace");
        var claimMessage = document.getElementById("claimMessage")
        var claimPhone = document.getElementById("claimPhone");

        //向页面对象中加载数据
        images.innerHTML = "<img alt='无法显示图片' id='petPhoto' style='width:210px;height:150px;margin-right: 5px;' src='"+claim.claimPhoto+"'/>";
        claimState.innerText = claim.claimState==0?"未认领":"已认领";
        claimTime.innerText = dateToString(claim.claimTime);
        claimPlace.innerText= claim.claimPlace;
        claimMessage.innerText= claim.claimMessage;
        claimPhone.innerText= claim.claimPhone;

        for(var i = 0;i<imgList.length;i++){
            images.innerHTML+="<img alt='无法显示图片' style='width:210px;height:150px;margin-right: 5px;' src='"+imgList[i].path+"'/>";
        }

        //根据是否本人认领信息加载页面
        var contact = document.getElementById("contact");
        var update_info = document.getElementById("update_info");
        if(isMyClaim==1){
            contact.style.display="none";
            update_info.hidden=false;
            update_info.href="/cs_update_claim"+claimId;
        }

    }
}

//验证联系信息
function valid(){
    var contact_content = document.getElementById("contact-content");
    var contact_phone = document.getElementById("contact-phone");
    var content_error = document.getElementById("content_error");
    var phone_error = document.getElementById("phone_error")

    if(contact_content.value==null||contact_content.value==""){
        content_error.style.display="block";
        phone_error.style.display="none";
        return false;
    }else
        content_error.style.display="none";

    if(contact_phone.value == ""||contact_phone.value==null){
        phone_error.innerText = "请填写联系手机";
        phone_error.style.display="block";
        return false;
    }else if(!(/^1(3|4|5|7|8)\d{9}$/.test(contact_phone.value))){
        phone_error.innerText = "请输入正确的手机号";
        phone_error.style.display="block";
        return false;
    }else
        phone_error.style.display="none";
}

//提交联系信息
function submit() {
    //封装联系信息到formData
    var formData=new FormData;
    var contact_content = document.getElementById("contact-content");
    var contact_phone = document.getElementById("contact-phone");
    formData.append("content",contact_content.value);
    formData.append("phone",contact_phone.value);
    formData.append("claimId",claimIdVal);
    //数据处理
    xhr.onreadystatechange = function () {
        if(xhr.readyState == 4 && xhr.status == 200){
            var msg = xhr.responseText;
            alert(msg);
            window.location.reload();
        }
    }
    xhr.open('POST', "claim/contact", true);
    xhr.send(formData);
}


