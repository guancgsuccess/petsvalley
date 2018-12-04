//创建XMLHttpRequest对象
var xhr = null;
//获取所有认领信息链接
var url_getClaimList = "claim/getClaimList/page/";
//页面加载时显示第一页认领信息
window.onload = function() {
    getClaimList(url_getClaimList+1);
}

//通过认领状态获取认领信息链接
var url_getByState = "claim/getClaimList/claimState/";
//认领状态
var claimState;
//链接中页码
var url_page="/page/";

//所有认领信息按钮
var all_link = document.getElementById("all-link");
//未认领按钮
var not_claimed_link = document.getElementById("not-claimed-link");
//已认领按钮
var claimed_link = document.getElementById("claimed-link");

//all_link单击事件
function all_link_click(){
    //三个按钮样式改变
    all_link.style = "background-color: #40260C;" +
        "    border-color: #40260C;" +
        "    color: #FFFFFF;";
    not_claimed_link.style="";
    claimed_link.style="";

    //获取所有认领信息第一页
    url_getClaimList="claim/getClaimList/page/";
    getClaimList(url_getClaimList+1);
}
//not_claimed_link按钮单击事件
function not_claimed_link_click(){
    //三个按钮样式改变
    not_claimed_link.style = "background-color: #40260C;" +
        "    border-color: #40260C;" +
        "    color: #FFFFFF;";
    all_link.style = "";
    claimed_link.style = "";

    //获取认领状态为0的所有认领信息第一页
    claimState=0;
    url_getClaimList = url_getByState+claimState+url_page;
    getClaimList(url_getClaimList+1);
}
//claimed_link按钮单击事件
function claimed_link_click(){
    //三个按钮样式改变
    claimed_link.style = "background-color: #40260C;" +
        "    border-color: #40260C;" +
        "    color: #FFFFFF;";
    not_claimed_link.style="";
    all_link.style="";

    //获取认领状态为1的所有认领信息第一页
    claimState=1;
    url_getClaimList = url_getByState+claimState+url_page;
    getClaimList(url_getClaimList+1);
}

//日期类型转换为String类型
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

//获取认领信息
function getClaimList(url){
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    xhr.open("GET", url, true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = loadClaimList;
    xhr.send();
}

//加载认领信息
function loadClaimList() {
    if (xhr.readyState == 4 && xhr.status == 200) {
        //获得PageModel类型的返回数据
        var pageModel = JSON.parse(xhr.responseText);
        //获取认领信息列表
        var claimList = pageModel.modelList;
        var section = document.getElementById("claim-list");
        section.innerHTML = "";
        //向section中加载所有认领信息
        for(var i = 0; i<claimList.length;i++){
            //认领状态
            var state = claimList[i].claimState==0?"未认领":"已认领";
            section.innerHTML += "<article class='span3'>" +
                "                        <span>" +
                "                            <a href='/cs_claim_info?claimId="+claimList[i].claimId+"'>" +
                "                               <img alt='无法显示图片' style='width:270px;height:192.733px;' src='"+claimList[i].claimPhoto+"'/>" +
                "                            </a>" +
                "                        </span>" +
                "                        <h3>"+state+"</h3>" +
                "                        发布时间："+dateToString(claimList[i].claimTime)+"<br>" +
                "                        发现地点："+claimList[i].claimPlace+"<br>" +
                "                        联系方式："+claimList[i].claimPhone+"" +
                "                        <a href='/cs_claim_info?claimId="+claimList[i].claimId+"' class='read-more'>查看更多信息</a>" +
                "                    </article>";
        }

        //分页
        var ul = document.getElementById("page-ul");
        if(pageModel.totalPages==0){
            pageModel.totalPages=1;
            pageModel.currentPageCode=1;
        }
        if(pageModel.currentPageCode==1)
            ul.innerHTML="<li class='disabled'><a>&laquo;</a></li>";
        else{
            var href = 'javascript:getClaimList("'+url_getClaimList+(pageModel.currentPageCode-1)+'")';
            ul.innerHTML="<li><a href='"+href+"'>&laquo;</a></li>";
        }

        if(pageModel.totalPages<=5){
            for(var i=1;i<=pageModel.totalPages;i++){
                if(i==pageModel.currentPageCode){
                    ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                }else{
                    var href = 'javascript:getClaimList("'+url_getClaimList+i+'")';
                    ul.innerHTML+="<li><a href='"+href+"'>"+i+"</a></li>";
                }
            }
        }else{
            if(pageModel.currentPageCode<(pageModel.totalPages-1)&&pageModel.currentPageCode>3){
                for(var i=0;i<5;i++){
                    if(i==2)
                        ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                    else{
                        var href = 'javascript:getClaimList("'+(url_getClaimList+(pageModel.currentPageCode+i-2))+'")';
                        ul.innerHTML+="<li><a href='"+href+"'>"+(pageModel.currentPageCode+i-2)+"</a></li>";
                    }
                }
            }else{
                if(pageModel.currentPageCode<=3){
                    for(var i=1;i<=5;i++){
                        if(i==pageModel.currentPageCode){
                            ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                        }else{
                            var href = 'javascript:getClaimList("'+(url_getClaimList+i)+'")';
                            ul.innerHTML+="<li><a href='"+href+"'>"+i+"</a></li>";
                        }
                    }
                }else{
                    if(pageModel.currentPageCode==pageModel.totalPages-1){
                        for(var i=1;i<=5;i++){
                            if(i==4){
                                ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                            }else{
                                var href = 'javascript:getClaimList("'+(url_getClaimList+(pageModel.currentPageCode+i-4))+'")';
                                ul.innerHTML+="<li><a href='"+href+"'>"+(pageModel.currentPageCode+i-4)+"</a></li>";
                            }
                        }
                    }else if(pageModel.currentPageCode==pageModel.totalPages){
                        for(var i=1;i<=5;i++){
                            if(i==5){
                                ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                            }else{
                                var href = 'javascript:getClaimList("'+(url_getClaimList+(pageModel.currentPageCode+i-5))+'")';
                                ul.innerHTML+="<li><a href='"+href+"'>"+(pageModel.currentPageCode+i-5)+"</a></li>";
                            }
                        }
                    }
                }
            }
        }

        if(pageModel.currentPageCode==pageModel.totalPages)
            ul.innerHTML+="<li class='disabled'><a>&raquo;</a></li>";
        else {
            var href = 'javascript:getClaimList("' + url_getClaimList +(pageModel.currentPageCode+1)+ '")';
            ul.innerHTML += "<li><a href='" + href + "'>&raquo;</a></li>";
        }
    }
}

//图片选择控件
var eleList = document.querySelectorAll("#img-search");
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
                    addBtn.style.display="none";
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
        addBtn.style.display="block";
        /*console.log('4',ele.files);*/
    }
}
ele.addEventListener('click', removeImg, false);

//图片识别
function distinguish(){
    var formData = new FormData();
    //向formData中添加要识别的图片文件
    for(var i=0, f; f=ele.files[i]; i++){
        formData.append('files', f);
    }
    //发送请求
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    //数据处理
    xhr.onreadystatechange = function () {
        if(xhr.readyState == 4 && xhr.status == 200){
            //获取认领信息列表
            var claimList = JSON.parse(xhr.responseText);
            var section = document.getElementById("claim-list");
            section.innerHTML = "";
            //向section中加载数据
            var ul = document.getElementById("page-ul");
            if(claimList.length==0){
                section.innerHTML+="<article class='span3'><h3>未识别到相似的认领信息<a href='/claim'>返回</a></h3></article>";
                ul.style.display= "none";
            }else{
                for(var i = 0; i<claimList.length;i++){
                    var state = claimList[i].claimState==0?"未认领":"已认领";
                    section.innerHTML += "<article class='span3'>" +
                        "                        <span>" +
                        "                            <a href='/claim_info?claimId="+claimList[i].claimId+"'>" +
                        "                               <img alt='无法显示图片' style='width:270px;height:192.733px;' src='"+claimList[i].claimPhoto+"'/>" +
                        "                            </a>" +
                        "                        </span>" +
                        "                        <h3>"+state+"</h3>" +
                        "                        发布时间："+dateToString(claimList[i].claimTime)+"<br>" +
                        "                        发现地点："+claimList[i].claimPlace+"<br>" +
                        "                        联系方式："+claimList[i].claimPhone+"" +
                        "                        <a href='/claim_info?claimId="+claimList[i].claimId+"' class='read-more'>查看更多信息</a>" +
                        "                    </article>";
                    ul.style.display= "none";
                }
            }
            var filtrable = document.getElementById("filtrable");
            filtrable.style.display="none";
            var return_claim = document.getElementById("return-claim");
            return_claim.style="display:inline-block;float:right;";
        }
    }
    xhr.open('POST', "claim/distinguish", true);
    xhr.send(formData);
}