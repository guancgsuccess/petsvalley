//创建XMLHttpRequest对象
var xhr = null;
//获取我的寻宠信息链接
var url_getMyFindPet = "findPet/getMyFindPet";
//页面加载时加载我的寻宠信息列表
window.onload = function() {
    findPetList(url_getMyFindPet);
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

//获取我的寻宠信息请求
function findPetList(url){
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    xhr.open("GET", url, true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = loadMyFindPets;
    xhr.send();
}
//加载我的寻宠信息
function loadMyFindPets() {
    if (xhr.readyState == 4 && xhr.status == 200) {
        var findPetList = JSON.parse(xhr.responseText);

        var section = document.getElementById("find-pet-list");
        section.innerHTML = "";
        for (var i = 0; i < findPetList.length; i++) {
            var state = findPetList[i].fpState == 0 ? "未找到" : "已找到";
            section.innerHTML += "<article class='span3'>" +
                "                        <span>" +
                "                            <a href='/cs_find_pet_info?fpId=" + findPetList[i].fpId + "'>" +
                "                               <img alt='无法显示图片' style='width:270px;height:192.733px;' src='" + findPetList[i].petPhoto + "'/>" +
                "                            </a>" +
                "                        </span>" +
                "                        <h3>" + state + "</h3>" +
                "                        丢失时间：" + dateToString(findPetList[i].lostTime) + "<br>" +
                "                        丢失地点：" + findPetList[i].lostPlace + "<br>" +
                "                        联系方式：" + findPetList[i].fpPhone + "" +
                "                        <a href='/cs_find_pet_info?fpId=" + findPetList[i].fpId + "' class='read-more'>查看更多信息</a>" +
                "                    </article>";
        }
    }
}