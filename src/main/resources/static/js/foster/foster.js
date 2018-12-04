//创建XMLHttpRequest对象
var xhr = null;
//获取所有寄养信息链接
var url_getFosterList = "foster/getFosterList"
//页面加载时加载所有寄养信息
window.onload=function (ev) {
    findFosterList(url_getFosterList);
}

var url_condition = "/condition/所有";
var url_petDisc = "/petDisc/所有种类";
var url_page = "/page/";

//分类按钮
var allLink = document.getElementById("all");
var notLink = document.getElementById("not");
var alreadyLink = document.getElementById("already");
//所有类别单击事件
function conditionAllClick() {
    allLink.style = "background-color: #40260C;" +
                "border-color: #40260C;" +
                "color: #FFFFFF;";
    notLink.style="";
    alreadyLink.style="";
    url_condition = "/condition/"+allLink.innerText;
    findFosterList(url_getFosterList+url_condition+url_petDisc+url_page+1);
}
//未寄养按钮单击事件
function conditionNotClick() {
    notLink.style = "background-color: #40260C;" +
                "border-color: #40260C;" +
                "color: #FFFFFF;";
    allLink.style="";
    alreadyLink.style="";
    url_condition = "/condition/"+notLink.innerText;
    findFosterList(url_getFosterList+url_condition+url_petDisc+url_page+1);
}
//已寄养按钮单击事件
function conditionAlreadyClick() {
    alreadyLink.style = "background-color: #40260C;" +
                "border-color: #40260C;" +
                "color: #FFFFFF;";
    allLink.style="";
    notLink.style="";
    url_condition = "/condition/"+alreadyLink.innerText;
    findFosterList(url_getFosterList+url_condition+url_petDisc+url_page+1);
}
//改变宠物类别时间
function changePetDisc(ele) {
    var petDiscBtn = document.getElementById("pet-disc-btn");
    petDiscBtn.innerHTML = ele.innerText+"<span class='caret'></span>";
    url_petDisc ="/petDisc/"+ele.innerText;
    findFosterList(url_getFosterList+url_condition+url_petDisc+url_page+1);
}
//获取寄养信息请求
function findFosterList(url){
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    xhr.open("GET", url, true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = loadFosterList;
    xhr.send();
}
//加载寄养信息
function loadFosterList() {
    if (xhr.readyState == 4 && xhr.status == 200) {
        var map = JSON.parse(xhr.responseText);
        for(var key in map){
            var value = map[key];
            if(key==0)
                var pageModel = value;
            else if(key==1)
                var petTypeList = value;
        }

        var fosterList = pageModel.modelList;

        var section = document.getElementById("foster-list");
        section.innerHTML="";

        var url = url_getFosterList+url_condition+url_petDisc+url_page;

        for(var i=0;i<fosterList.length;i++){
            var state = fosterList[i].fosterState==0?"未寄养":"已寄养";
            section.innerHTML+="<article class='span3'>" +
                "                        <span>" +
                "                            <a href='/cs_foster_info?fosterId="+fosterList[i].fosterId+"'>" +
                "                               <img alt='无法显示图片' style='width:270px;height:192.733px;' src='"+fosterList[i].fosterPhoto+"'/>" +
                "                            </a>" +
                "                        </span>" +
                "                        <h3>"+state+"</h3>" +
                "                        宠物品种："+petTypeList[i].typeName+"<br>" +
                "                        寄养信息："+fosterList[i].fosterMessage+"<br>" +
                "                        <a href='/cs_foster_info?fosterId="+fosterList[i].fosterId+"' class='read-more'>查看更多信息</a>" +
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
            var href = 'javascript:findFosterList("'+url+(pageModel.currentPageCode-1)+'")';
            ul.innerHTML="<li><a href='"+href+"'>&laquo;</a></li>";
        }

        if(pageModel.totalPages<=5){
            for(var i=1;i<=pageModel.totalPages;i++){
                if(i==pageModel.currentPageCode){
                    ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                }else{
                    var href = 'javascript:findFosterList("'+url+i+'")';
                    ul.innerHTML+="<li><a href='"+href+"'>"+i+"</a></li>";
                }
            }
        }else{
            if(pageModel.currentPageCode<(pageModel.totalPages-1)&&pageModel.currentPageCode>3){
                for(var i=0;i<5;i++){
                    if(i==2)
                        ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                    else{
                        var href = 'javascript:findFosterList("'+(url+(pageModel.currentPageCode+i-2))+'")';
                        ul.innerHTML+="<li><a href='"+href+"'>"+(pageModel.currentPageCode+i-2)+"</a></li>";
                    }
                }
            }else{
                if(pageModel.currentPageCode<=3){
                    for(var i=1;i<=5;i++){
                        if(i==pageModel.currentPageCode){
                            ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                        }else{
                            var href = 'javascript:findFosterList("'+(url+i)+'")';
                            ul.innerHTML+="<li><a href='"+href+"'>"+i+"</a></li>";
                        }
                    }
                }else{
                    if(pageModel.currentPageCode==pageModel.totalPages-1){
                        for(var i=1;i<=5;i++){
                            if(i==4){
                                ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                            }else{
                                var href = 'javascript:findFosterList("'+(url+(pageModel.currentPageCode+i-4))+'")';
                                ul.innerHTML+="<li><a href='"+href+"'>"+(pageModel.currentPageCode+i-4)+"</a></li>";
                            }
                        }
                    }else if(pageModel.currentPageCode==pageModel.totalPages){
                        for(var i=1;i<=5;i++){
                            if(i==5){
                                ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                            }else{
                                var href = 'javascript:findFosterList("'+(url+(pageModel.currentPageCode+i-5))+'")';
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
            var href = 'javascript:findFosterList("' + url +(pageModel.currentPageCode+1)+ '")';
            ul.innerHTML += "<li><a href='" + href + "'>&raquo;</a></li>";
        }
    }
}