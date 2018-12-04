//创建XMLHttpRequest对象
var xhr = null;
//获取我发布的所有认领信息
var url_getMyClaim = "claim/getMyClaim";
//页面加载时加载所有认领信息
window.onload = function() {
    findPetList(url_getMyClaim);
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
function findPetList(url){
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        xhr = new ActiveXObject('Microsoft.XMLHTTP');
    }
    xhr.open("GET", url, true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    xhr.onreadystatechange = loadMyClaim;
    xhr.send();
}
//加载数据
function loadMyClaim() {
    if (xhr.readyState == 4 && xhr.status == 200) {
        var claimList = JSON.parse(xhr.responseText);
        //向section中加载所有认领信息
        var section = document.getElementById("claim-list");
        section.innerHTML = "";
        for (var i = 0; i < claimList.length; i++) {
            var state = claimList[i].claimState == 0 ? "未认领" : "已认领";
            section.innerHTML += "<article class='span3'>" +
                "                        <span>" +
                "                            <a href='/cs_claim_info?claimId=" + claimList[i].claimId + "'>" +
                "                               <img alt='无法显示图片' style='width:270px;height:192.733px;' src='" + claimList[i].claimPhoto + "'/>" +
                "                            </a>" +
                "                        </span>" +
                "                        <h3>" + state + "</h3>" +
                "                        丢失时间：" + dateToString(claimList[i].claimTime) + "<br>" +
                "                        丢失地点：" + claimList[i].claimPlace + "<br>" +
                "                        联系方式：" + claimList[i].claimPhone + "" +
                "                        <a href='/cs_claim_info?claimId=" + claimList[i].claimId + "' class='read-more'>查看更多信息</a>" +
                "                    </article>";
        }
    }
}