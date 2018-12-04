//创建XMLHttpRequest对象
var xhr = null;
//从链接中获取要更新的claimId
var claimId = window.location.search;
//获取要修改的认领信息
var url_claimInfo = "/claim/claimInfo"+claimId;
//页面加载时加载认领信息
window.onload = function () {
    claimInfo(url_claimInfo);
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
var imagesAl = document.getElementById("images-al");
var claimState = document.getElementById("claimState");
var claimTime = document.getElementById("claimTime");
var claimPlace = document.getElementById("claimPlace");
var claimMessage = document.getElementById("claimMessage");
var claimPhone = document.getElementById("claimPhone");
//改变认领状态事件
function changeClaimState(ele){
    claimState.innerHTML = ele.innerText+"<span class='caret'></span>";
}
//图片上传所有元素
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

//获取认领信息请求
function claimInfo(url) {
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
//认领信息图片数
var imgNum=0;
function loadClaimInfo() {
    if (xhr.readyState == 4 && xhr.status == 200) {
        var map = JSON.parse(xhr.responseText);
        //获取map数据
        for(var key in map){
            var value = map[key];
            if(key==0)
                //认领信息
                var claim = value;
            else if(key==1)
                //图片列表
                var imgList = value;
            else if(key==2)
                var isMyClaim = value;
        }
        //图片数
        imgNum = imgList.length+1;
        //向页面元素加载数据
        imagesAl.innerHTML = "<img alt='无法显示图片' id='petPhoto' style='width:210px;height:150px;margin-right:5px;' src='"+claim.claimPhoto+"'/>";
        claimState.innerHTML = claim.claimState==0?"未认领<span class='caret'></span>":"已认领<span class='caret'></span>";
        claimTime.innerText = dateToString(claim.claimTime);
        claimPlace.value= claim.claimPlace;
        claimMessage.value= claim.claimMessage;
        claimPhone.value= claim.claimPhone;

        for(var i = 0;i<imgList.length;i++){
            imagesAl.innerHTML+="<img alt='无法显示图片' style='width:210px;height:150px;margin-right:5px;' src='"+imgList[i].path+"'/>";
        }

        var claimId = document.getElementById("claimId");
        claimId.innerText = claim.claimId;
        claimId.style.display="none";
    }
}

//修改数据验证
function valid() {
    //获取所有错误信息元素
    var claim_place_error = document.getElementById("claim_place_error");
    var claim_message_error = document.getElementById("claim_message_error");
    var claim_phone_error = document.getElementById("claim_phone_error")
    var file_error = document.getElementById("file_error");

    //验证上传图片数
    if(ele.files.length>5-imgNum){
        file_error.innerText = "最多可以再上传"+(5-imgNum)+"张照片";
        file_error.style.display="block";
        claim_place_error.style.display="none";
        claim_message_error.style.display="none";
        claim_phone_error.style.display="none";
        return false;
    }else{
        file_error.style.display="none";
    }
    //验证地点
    if(claimPlace.value==null||claimPlace.value==""){
        claim_place_error.style.display="block";
        claim_message_error.style.display="none";
        claim_phone_error.style.display="none";
        return false;
    }else
        claim_place_error.style.display="none";
    //验证具体信息
    if(claimMessage.value==null||claimMessage.value==""){
        claim_message_error.style.display="block";
        claim_phone_error.style.display="none";
        return false;
    }else
        claim_message_error.style.display="none";
    //验证手机号
    if(claimPhone.value == ""||claimPhone.value==null){
        claim_phone_error.innerText = "请填写联系手机";
        claim_phone_error.style.display="block";
        return false;
    }else if(!(/^1(3|4|5|7|8)\d{9}$/.test(claimPhone.value))){
        claim_phone_error.innerText = "请输入正确的手机号";
        claim_phone_error.style.display="block";
        return false;
    }else
        claim_phone_error.style.display="none";
    return true;
}
//确认修改事件
function confirmUpdate() {
    var r=confirm("确认修改吗？");
    if (r==true) {
        //确认则修改
        updateClaim();
    }
}

//修改认领信息请求
function updateClaim() {
    //创建FormData对象
    var formData = new FormData();
    //添加图片文件
    for(var i=0, f; f=ele.files[i]; i++){
        formData.append('files', f);
    }
    //认领状态
    var claimStateVal=0;
    if(claimState.innerText=="已认领")
        claimStateVal=1;
    //添加其他数据
    var claimId = document.getElementById("claimId");
    formData.append('claimId',claimId.innerText);
    formData.append('claimState',claimStateVal);
    formData.append('claimPlace',claimPlace.value);
    formData.append('claimMessage',claimMessage.value);
    formData.append('claimPhone',claimPhone.value);
    //数据处理
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
    xhr.open('POST', "claim/updateClaim", true);
    xhr.send(formData);
}