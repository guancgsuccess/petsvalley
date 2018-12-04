//创建XMLHttpRequest对象
var xhr = null;
//获取宠物请求
function choosePet() {
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    xhr.open("GET", "foster/getPetsByCustId", true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = loadPets;
    xhr.send();
}
//加载宠物
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
var foster_message = document.getElementById("foster-message");
var foster_message_error = document.getElementById("foster_message_error");
var foster_reason = document.getElementById("foster-reason");
var foster_reason_error = document.getElementById("foster_reason_error");
var file_error = document.getElementById("file_error");
//图片上传元素
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

//验证
function valid(){
    var checkedNum=0;
    for(var i=0;i<radios.length;i++){
        if(radios.item(i).checked){
            checkedNum++;
        }
    }

    if(checkedNum<1){
        all_pet_error.style.display="block";
        foster_message_error.style.display="none";
        foster_reason_error.style.display="none";
        file_error.style.display="none";
        return false;
    }else{
        all_pet_error.style.display="none";
    }

    if(foster_message.value==""||foster_message.value==null){
        foster_message_error.style.display="block";
        foster_reason_error.style.display="none";
        file_error.style.display="none";
        return false;
    }else{
        foster_message_error.style.display="none";
    }

    if(foster_reason.value==""||foster_reason.value==null){
        foster_reason_error.style.display="block";
        file_error.style.display="none";
        return false;
    }else{
        foster_reason_error.style.display="none";
    }

    if(ele.files.length<1){
        file_error.innerText = "至少上传一张照片";
        file_error.style.display="block";
        return false;
    }else if(ele.files.length>5){
        file_error.innerText = "最多上传五张照片";
        file_error.style.display="block";
        return false;
    }else{
        file_error.style.display="none";
    }
    
    return true;
}

//提交按钮单击事件
function submit() {
    //创建FormData对象并传入数据
    var formData = new FormData();
    for(var i=0, f; f=ele.files[i]; i++){
        formData.append('files', f);
    }
    for(var i=0;i<radios.length;i++){
        if(radios.item(i).checked){
            var petId = radios.item(i).value;
        }
    }
    formData.append('fosterPetId',petId);
    formData.append('fosterMessage',foster_message.value);
    formData.append('fosterReason',foster_reason.value);

    xhr.onreadystatechange = function (e) {
        if(xhr.readyState == 4 && xhr.status == 200){
            var msg = xhr.responseText;
            if(msg=="发布成功"){
                alert(msg);
                window.location.href="foster";
            }else
                alert(msg);
        }
    }
    xhr.open('POST', "foster/releaseFoster", true);
    xhr.send(formData);
}