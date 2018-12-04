//创建XMLHttpRequest对象
var xhr = null;
//获取志愿列表服务链接
var url_getService = "service/getByPage/page/";
//页面加载时加载志愿服务
window.onload = function() {
    serviceList(url_getService+1);
}
//分页链接
var url_page = "service/getByPage/page/";
//按条件排序按钮
var serviceByTime = document.getElementById("service-by-time");
var serviceByNo = document.getElementById("service-by-no");
var serviceByReward = document.getElementById("service-by-reward");

//按时间排序按钮单击事件
function time_click() {
    if(serviceByTime.innerText=="按时间"||serviceByTime.innerText=="按时间↓"){
        serviceByTime.innerText="按时间↑";
        serviceByNo.innerText="按人数";
        serviceByReward.innerText="按积分";

        serviceByTime.style = "background-color: #40260C;" +
            "    border-color: #40260C;" +
            "    color: #FFFFFF;";
        serviceByNo.style="";
        serviceByReward.style="";

        url_page = "service/getByCondition/condition/timeAsc/page/";
    }else if(serviceByTime.innerText=="按时间↑"){
        serviceByTime.innerText="按时间↓";
        url_page = "service/getByCondition/condition/timeDesc/page/";
    }
    serviceList(url_page+1);
}
//按人数排序单击事件
function no_click() {
    if(serviceByNo.innerText=="按人数"||serviceByNo.innerText=="按人数↓"){
        serviceByNo.innerText="按人数↑";
        serviceByTime.innerText="按时间";
        serviceByReward.innerText="按积分";

        serviceByNo.style = "background-color: #40260C;" +
            "    border-color: #40260C;" +
            "    color: #FFFFFF;";
        serviceByTime.style="";
        serviceByReward.style="";

        url_page = "service/getByCondition/condition/noAsc/page/";
    }else if(serviceByNo.innerText=="按人数↑"){
        serviceByNo.innerText="按人数↓";
        url_page = "service/getByCondition/condition/noDesc/page/";
    }
    serviceList(url_page+1);
}
//按积分排序单击事件
function reward_click() {
    if(serviceByReward.innerText=="按积分"||serviceByReward.innerText=="按积分↓"){
        serviceByReward.innerText="按积分↑";
        serviceByNo.innerText="按人数";
        serviceByTime.innerText="按时间";

        serviceByReward.style = "background-color: #40260C;" +
            "    border-color: #40260C;" +
            "    color: #FFFFFF;";
        serviceByNo.style="";
        serviceByTime.style="";

        url_page = "service/getByCondition/condition/rewardAsc/page/";
    }else if(serviceByReward.innerText=="按积分↑"){
        serviceByReward.innerText="按积分↓";
        url_page = "service/getByCondition/condition/rewardDesc/page/";
    }
    serviceList(url_page+1);
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

//获取志愿服务列表请求
function serviceList(url) {
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    xhr.open("GET", url, true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = loadService;
    xhr.send();
}
//加载志愿服务
function loadService() {
    if(xhr.readyState == 4 && xhr.status==200){
        var list = JSON.parse(xhr.responseText);
        var mapApplyCount = list[0];
        var pageModel = list[1];
        var serviceList = pageModel.modelList;
        var service_list = document.getElementById("service-list");
        service_list.innerHTML = "";
        for(var i = 0;i<serviceList.length;i++){
            var applyCount = 0;
            for(var key in mapApplyCount){
                var value = mapApplyCount[key];
                if(key==serviceList[i].serviceId)
                    applyCount = value;
            }
            service_list.innerHTML += "<article class='service-info' style='width: 80%;margin:10px auto;'>" +
                "                        <header>" +
                "                            <div>" +
                "                                <div class='service-title'><label>服务标题：<b>"+serviceList[i].serviceTitle+"</b></label></div>" +
                "                                <div class='service-time'><label><b>"+dateToString(serviceList[i].serviceTime)+"</b></label></div>" +
                "                            </div>" +
                "                        </header>" +
                "                        <section>" +
                "                            <div class='service-content'>" +
                "                                <label>服务内容：<b>"+serviceList[i].serviceContent+"</b></label>" +
                "                            </div>" +
                "                            <div>" +
                "                                <div class='service-reward'><label>积分奖励：<b>"+serviceList[i].serviceReward+"</b></label></div>" +
                "                                <div class='service-no'><label>已申请人数：<b>"+applyCount+"/"+serviceList[i].serviceNo+"</b></label></div>" +
                "                            </div>" +
                "                        </section>" +
                "                        <footer class='service-footer' style='text-align: right;'>" +
                "                            <button class='btn' onclick='javascript:applyConfirm("+serviceList[i].serviceId+")'>申请服务</button>" +
                "                        </footer>" +
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
            var href = 'javascript:serviceList("'+url_page+(pageModel.currentPageCode-1)+'")';
            ul.innerHTML="<li><a href='"+href+"'>&laquo;</a></li>";
        }

        if(pageModel.totalPages<=5){
            for(var i=1;i<=pageModel.totalPages;i++){
                if(i==pageModel.currentPageCode){
                    ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                }else{
                    var href = 'javascript:serviceList("'+url_page+i+'")';
                    ul.innerHTML+="<li><a href='"+href+"'>"+i+"</a></li>";
                }
            }
        }else{
            if(pageModel.currentPageCode<(pageModel.totalPages-1)&&pageModel.currentPageCode>3){
                for(var i=0;i<5;i++){
                    if(i==2)
                        ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                    else{
                        var href = 'javascript:serviceList("'+(url_page+(pageModel.currentPageCode+i-2))+'")';
                        ul.innerHTML+="<li><a href='"+href+"'>"+(pageModel.currentPageCode+i-2)+"</a></li>";
                    }
                }
            }else{
                if(pageModel.currentPageCode<=3){
                    for(var i=1;i<=5;i++){
                        if(i==pageModel.currentPageCode){
                            ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                        }else{
                            var href = 'javascript:serviceList("'+(url_page+i)+'")';
                            ul.innerHTML+="<li><a href='"+href+"'>"+i+"</a></li>";
                        }
                    }
                }else{
                    if(pageModel.currentPageCode==pageModel.totalPages-1){
                        for(var i=1;i<=5;i++){
                            if(i==4){
                                ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                            }else{
                                var href = 'javascript:serviceList("'+(url_page+(pageModel.currentPageCode+i-4))+'")';
                                ul.innerHTML+="<li><a href='"+href+"'>"+(pageModel.currentPageCode+i-4)+"</a></li>";
                            }
                        }
                    }else if(pageModel.currentPageCode==pageModel.totalPages){
                        for(var i=1;i<=5;i++){
                            if(i==5){
                                ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                            }else{
                                var href = 'javascript:serviceList("'+(url_page+(pageModel.currentPageCode+i-5))+'")';
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
            var href = 'javascript:serviceList("' + url_page +(pageModel.currentPageCode+1)+ '")';
            ul.innerHTML += "<li><a href='" + href + "'>&raquo;</a></li>";
        }
    }

}

//确认申请单击事件
function applyConfirm(id) {
    var r=confirm("确认申请？");
    if (r==true) {
        applyService(id);
    }
}

//申请服务请求
function applyService(serviceId) {
    var url = "service/applyService/serviceId/"+serviceId;
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    xhr.open("GET", url, true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = applyServiceReturn;
    xhr.send();
}

function applyServiceReturn() {

    if(xhr.readyState==4&&xhr.status==200){
        var msg = xhr.responseText;
        alert(msg);
        serviceList(url_getService+1);
    }

}