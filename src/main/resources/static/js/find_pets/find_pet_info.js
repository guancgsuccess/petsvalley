//创建XMLHttpRequest对象
var xhr = null;
//获取链接传来的fpId
var fpId = window.location.search;
//寻宠信息链接
var url_findPetInfo = "/findPet/findPetInfo"+fpId;
//页面加载时就加载寻宠信息
window.onload = function () {
    findPetInfo(url_findPetInfo);
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

//获取寻宠详情请求
function findPetInfo(url) {
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    xhr.open("GET", url, true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = loadFindPetInfo;
    xhr.send();
}
//加载寻宠详情
function loadFindPetInfo() {
    if (xhr.readyState == 4 && xhr.status == 200) {
        var map = JSON.parse(xhr.responseText);

        for(var key in map){
            var value = map[key];
            if(key==0)
                //寻宠信息
                var findPet = value;
            else if(key==1)
                //宠物信息
                var pet = value;
            else if(key==2)
                //图片列表
                var imgList = value;
            else if(key==3)
                var isMyFindPet = value;
        }

        //获取页面元素
        var petName = document.getElementById("petName");
        var images = document.getElementById("images");
        var fpState = document.getElementById("fpState");
        var lostTime = document.getElementById("lostTime");
        var lostPlace = document.getElementById("lostPlace");
        var lostMessage = document.getElementById("lostMessage");
        var fpReward = document.getElementById("fpReward");
        var fpPhone = document.getElementById("fpPhone");
        //向页面元素中加载数据
        petName.innerText = pet.petName;
        images.innerHTML = "<img alt='无法显示图片' id='petPhoto' style='width:210px;height:150px;margin-right: 5px;' src='"+findPet.petPhoto+"'/>";
        fpState.innerText = findPet.fpState==0?"未找到":"已找到";
        lostTime.innerText = dateToString(findPet.lostTime);
        lostPlace.innerText= findPet.lostPlace;
        lostMessage.innerText= findPet.lostMessage;
        fpReward.innerText= findPet.fpReward;
        fpPhone.innerText= findPet.fpPhone;

        for(var i = 0;i<imgList.length;i++){
            images.innerHTML+="<img alt='无法显示图片' style='width:210px;height:150px;margin-right: 5px;' src='"+imgList[i].path+"'/>";
        }

        var petId = document.getElementById("petId");
        petId.innerText=findPet.petId;
        petId.style.display="none";

        var contact = document.getElementById("contact");
        var update_info = document.getElementById("update_info");
        if(isMyFindPet==1){
            contact.style.display="none";
            update_info.hidden=false;
            update_info.href="/cs_update_find_pet"+fpId;
        }

    }
}

//联系信息验证
function valid() {
    //页面验证信息元素
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

//提交联系信息请求
function submit() {
    //创建FormData对象并添加数据
    var formData=new FormData;
    var petId = document.getElementById("petId");
    var contact_content = document.getElementById("contact-content");
    var contact_phone = document.getElementById("contact-phone");
    formData.append("petId",petId.innerText);
    formData.append("content",contact_content.value);
    formData.append("phone",contact_phone.value);
    xhr.onreadystatechange = function (e) {
        if(xhr.readyState == 4 && xhr.status == 200){
            var msg = xhr.responseText;
            alert(msg);
            window.location.reload();
        }
    }
    xhr.open('POST', "findPet/contact", true);
    xhr.send(formData);
}


