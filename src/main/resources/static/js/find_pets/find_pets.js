//创建XMLHttpRequest对象
var xhr = null;
//获取寻宠信息列表
var url_getFindPetList = "findPet/getByPage";
//页面加载时获取所有寻宠信息
window.onload = function() {
    findPetList(url_getFindPetList);
}
//按页码获取寻宠信息链接
var url_page = "findPet/getByPage/page/";
//上一页链接
var url_previous_page = "findPet/getByPage/page/";
//下一页链接
var url_next_page = "findPet/getByPage/page/";

//获取页面分类查询按钮元素对象
var all_link = document.getElementById("all-link");
var not_founded_link = document.getElementById("not-founded-link");
var founded_link = document.getElementById("founded-link");

//所有按钮单击事件
function all_link_click(){
    //改变按钮样式
    all_link.style = "background-color: #40260C;" +
        "    border-color: #40260C;" +
        "    color: #FFFFFF;";
    not_founded_link.style="";
    founded_link.style="";

    url_page = "findPet/getByPage/page/";
    url_previous_page = "findPet/getByPage/page/";
    url_next_page = "findPet/getByPage/page/";

    findPetList(url_page+1);
}
//未找到按钮单击事件
function not_founded_link_click(){
    //改变按钮样式
    not_founded_link.style = "background-color: #40260C;" +
        "    border-color: #40260C;" +
        "    color: #FFFFFF;";
    founded_link.style = "";
    all_link.style = "";

    url_page = "findPet/getByCondition/fpState/0/page/";
    url_previous_page = "findPet/getByCondition/fpState/0/page/";
    url_next_page = "findPet/getByCondition/fpState/0/page/";

    findPetList(url_page+1);
}
//已找到按钮单击事件
function founded_link_click(){
    //改变按钮样式
    founded_link.style = "background-color: #40260C;" +
        "    border-color: #40260C;" +
        "    color: #FFFFFF;";
    not_founded_link.style="";
    all_link.style="";

    url_page = "findPet/getByCondition/fpState/1/page/";
    url_previous_page = "findPet/getByCondition/fpState/1/page/";
    url_next_page = "findPet/getByCondition/fpState/1/page/";

    findPetList(url_page+1);
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

//获取寻宠信息请求
function findPetList(url){
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    xhr.open("GET", url, true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = loadFindPets;
    xhr.send();
}
//加载寻宠信息
function loadFindPets() {
    if (xhr.readyState == 4 && xhr.status == 200) {
        var pageModel = JSON.parse(xhr.responseText);
        var section = document.getElementById("find-pet-list");
        var findPetList = pageModel.modelList;
        section.innerHTML = "";
        for(var i = 0; i<findPetList.length;i++){
            var state = findPetList[i].fpState==0?"未找到":"已找到";
            section.innerHTML += "<article class='span3'>" +
                "                        <span>" +
                "                            <a href='/cs_find_pet_info?fpId="+findPetList[i].fpId+"'>" +
                "                               <img alt='无法显示图片' style='width:270px;height:192.733px;' src='"+findPetList[i].petPhoto+"'/>" +
                "                            </a>" +
                "                        </span>" +
                "                        <h3>"+state+"</h3>" +
                "                        丢失时间："+dateToString(findPetList[i].lostTime)+"<br>" +
                "                        丢失地点："+findPetList[i].lostPlace+"<br>" +
                "                        联系方式："+findPetList[i].fpPhone+"" +
                "                        <a href='/cs_find_pet_info?fpId="+findPetList[i].fpId+"' class='read-more'>查看更多信息</a>" +
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
            var href = 'javascript:findPetList("'+url_previous_page+(pageModel.currentPageCode-1)+'")';
            ul.innerHTML="<li><a href='"+href+"'>&laquo;</a></li>";
        }

        if(pageModel.totalPages<=5){
            for(var i=1;i<=pageModel.totalPages;i++){
                if(i==pageModel.currentPageCode){
                    ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                }else{
                    var href = 'javascript:findPetList("'+url_page+i+'")';
                    ul.innerHTML+="<li><a href='"+href+"'>"+i+"</a></li>";
                }
            }
        }else{
            if(pageModel.currentPageCode<(pageModel.totalPages-1)&&pageModel.currentPageCode>3){
                for(var i=0;i<5;i++){
                    if(i==2)
                        ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                    else{
                        var href = 'javascript:findPetList("'+(url_page+(pageModel.currentPageCode+i-2))+'")';
                        ul.innerHTML+="<li><a href='"+href+"'>"+(pageModel.currentPageCode+i-2)+"</a></li>";
                    }
                }
            }else{
                if(pageModel.currentPageCode<=3){
                    for(var i=1;i<=5;i++){
                        if(i==pageModel.currentPageCode){
                            ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                        }else{
                            var href = 'javascript:findPetList("'+(url_page+i)+'")';
                            ul.innerHTML+="<li><a href='"+href+"'>"+i+"</a></li>";
                        }
                    }
                }else{
                    if(pageModel.currentPageCode==pageModel.totalPages-1){
                        for(var i=1;i<=5;i++){
                            if(i==4){
                                ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                            }else{
                                var href = 'javascript:findPetList("'+(url_page+(pageModel.currentPageCode+i-4))+'")';
                                ul.innerHTML+="<li><a href='"+href+"'>"+(pageModel.currentPageCode+i-4)+"</a></li>";
                            }
                        }
                    }else if(pageModel.currentPageCode==pageModel.totalPages){
                        for(var i=1;i<=5;i++){
                            if(i==5){
                                ul.innerHTML+="<li class='active'><a>"+pageModel.currentPageCode+"</a></li>";
                            }else{
                                var href = 'javascript:findPetList("'+(url_page+(pageModel.currentPageCode+i-5))+'")';
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
            var href = 'javascript:findPetList("' + url_next_page +(pageModel.currentPageCode+1)+ '")';
            ul.innerHTML += "<li><a href='" + href + "'>&raquo;</a></li>";
        }
    }
}