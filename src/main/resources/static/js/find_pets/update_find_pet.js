//创建XMLHttpRequest对象
var xhr = null;
//获取链接中的fpId
var fpId = window.location.search;
//寻宠详情链接
var url_findPetInfo = "/findPet/findPetInfo"+fpId;
//页面加载时加载寻宠详情
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

//获取页面元素
var petName = document.getElementById("petName");
var imagesAl = document.getElementById("images-al");
var fpState = document.getElementById("fpState");
var lostTime = document.getElementById("lostTime");
var lostPlace = document.getElementById("lostPlace");
var lostMessage = document.getElementById("lostMessage");
var fpReward = document.getElementById("fpReward");
var fpPhone = document.getElementById("fpPhone");

//改变寻宠状态事件
function changeFpState(ele){
    fpState.innerHTML = ele.innerText+"<span class='caret'></span>";
}

//文件上传元素
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

//获取寻宠信息详情请求
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

//上传图片数
var imgNum=0;
//加载寻宠详情
function loadFindPetInfo() {
    if (xhr.readyState == 4 && xhr.status == 200) {
        var map = JSON.parse(xhr.responseText);

        for(var key in map){
            var value = map[key];
            if(key==0)
                var findPet = value;
            else if(key==1)
                var pet = value;
            else if(key==2)
                var imgList = value;
            else if(key==3)
                var isMyFindPet = value;
        }

        imgNum = imgList.length+1;

        petName.innerText = pet.petName;
        imagesAl.innerHTML = "<img alt='无法显示图片' id='petPhoto' style='width:210px;height:150px;margin-right:5px;' src='"+findPet.petPhoto+"'/>";
        fpState.innerHTML = findPet.fpState==0?"未找到<span class='caret'></span>":"已找到<span class='caret'></span>";
        lostTime.innerText = dateToString(findPet.lostTime);
        lostPlace.value= findPet.lostPlace;
        lostMessage.value= findPet.lostMessage;
        fpReward.value= findPet.fpReward;
        fpPhone.value= findPet.fpPhone;

        for(var i = 0;i<imgList.length;i++){
            imagesAl.innerHTML+="<img alt='无法显示图片' style='width:210px;height:150px;margin-right:5px;' src='"+imgList[i].path+"'/>";
        }

        var fpId = document.getElementById("fpId");
        fpId.innerText = findPet.fpId;
        fpId.style.display="none";
        var petId = document.getElementById("petId");
        petId.innerText = findPet.petId;
        petId.style.display="none";

    }
}

//验证修改表单数据
function valid() {
    //错误元素
    var lost_place_error = document.getElementById("lost_place_error");
    var lost_message_error = document.getElementById("lost_message_error");
    var reward_error = document.getElementById("reward_error");
    var phone_error = document.getElementById("phone_error")

    //验证上传图片
    if(ele.files.length>5-imgNum){
        file_error.innerText = "最多可以再上传"+(5-imgNum)+"张照片";
        file_error.style.display="block";
        lost_place_error.style.display="none";
        lost_message_error.style.display="none";
        reward_error.style.display="none";
        phone_error.style.display="none";
        return false;
    }else{
        file_error.style.display="none";
    }
    //验证丢失地点
    if(lostPlace.value==null||lostPlace.value==""){
        lost_place_error.style.display="block";
        lost_message_error.style.display="none";
        reward_error.style.display="none";
        phone_error.style.display="none";
        return false;
    }else
        lost_place_error.style.display="none";
    //验证丢失详情
    if(lostMessage.value==null||lostMessage.value==""){
        lost_message_error.style.display="block";
        reward_error.style.display="none";
        phone_error.style.display="none";
        return false;
    }else
        lost_message_error.style.display="none";
    //验证悬赏金额
    if(fpReward.value==null||fpReward.value==""){
        reward_error.innerText = "悬赏金额不能为空";
        reward_error.style.display="block";
        phone_error.style.display="none";
        return false;
    }else if(reward.value%1!=0){
        reward_error.innerText = "请输入整数悬赏金额";
        reward_error.style.display="block";
        phone_error.style.display="none";
        return false;
    }else
        reward_error.style.display="none";
    //验证手机
    if(fpPhone.value == ""||fpPhone.value==null){
        phone_error.innerText = "请填写联系手机";
        phone_error.style.display="block";
        return false;
    }else if(!(/^1(3|4|5|7|8)\d{9}$/.test(fpPhone.value))){
        phone_error.innerText = "请输入正确的手机号";
        phone_error.style.display="block";
        return false;
    }else
        phone_error.style.display="none";

    return true;
}
//确认修改事件
function confirmUpdate() {
    var r=confirm("确认修改吗？");
    if (r==true) {
        updateFindPet();
    }
}
//修改寻宠信息请求
function updateFindPet() {
    //创建FormData对象
    var formData = new FormData();
    //添加图片文件
    for(var i=0, f; f=ele.files[i]; i++){
        formData.append('files', f);
    }
    //添加其他信息
    var fpId = document.getElementById("fpId");
    var petId = document.getElementById("petId");
    var fpStateVal = 0;
    if(fpState.innerText=="已找到")
        fpStateVal=1;
    formData.append('fpId',fpId.innerText);
    formData.append('petId',petId.innerText);
    formData.append('fpState',fpStateVal);
    formData.append('lostPlace',lostPlace.value);
    formData.append('lostMessage',lostMessage.value);
    formData.append('fpReward',fpReward.value);
    formData.append('fpPhone',fpPhone.value);

    xhr.onreadystatechange = function () {
        if(xhr.readyState == 4 && xhr.status == 200){
            var msg = xhr.responseText;
            if(msg=="修改成功"){
                alert(msg);
                window.history.back(-3);
            }else
                alert(msg);
        }
    }
    xhr.open('POST', "findPet/updateFindPet", true);
    xhr.send(formData);
}