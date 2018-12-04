

function refresh(id,page) {
    var url="${pageContext.request.contextPath}/comment/getall";
    if (window.XMLHttpRequest)
    {
        xhr=new XMLHttpRequest();
    }
    else
    {
        xhr=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xhr.open("GET", url_getAllPost,true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
    var formdate=new FormData;
    formdate.append("page",page);
    formdate.append("postId",id);
    xhr.onreadystatechange = function(){
        if (xhr.readyState == 4 && xhr.status == 200){
            var jsArr = JSON.parse(xhr.responseText);
            var div=document.getElementById("post_details");
            var title="<div class=title><span>"+jsArr.postUtil.post.postTitle+"</span><input type='button' value='回复'></div>";
            div.innerHTML+=title;
            var comment="<div class=comment><div class='text'>" +
                "<img class='emo1' src='${pageContext.request.contextPath}/images/小狗.png'>" +
                "<img class='emo2' src='${pageContext.request.contextPath}/images/兔子.png'>" +
                "<div class=aa><span>两人肩并肩地走路本身就是一件令人愉悦的事情</span></div></div><div class='cc'><div class='img1'> <img src='${pageContext.request.contextPath}/images/dog1.jpg'>" +
                "<div class='name'> <img src='${pageContext.request.contextPath}/images/customer.png' style='height: 25px;width: 25px'><span>"+jsArr.postUtil.customer.custName+"</span></div></div>" +
                "<div class='content'><span>"+jsArr.postUtil.post.postContent+"</span> </div><div class='imgs'>";
            if (jsArr.postUtil.imgList!=null){
                for (var i=0;i<jsArr.postUtil.imgList.length;i++){
                    comment+="<img src=${pageContext.request.contextPath}"+jsArr.postUtil.imgList[i].path+">";
                }
            }
            comment+="</div></div></div>";
            div.innerHTML+=comment;
            for (var j=0;j<jsArr.commentUtilList;j++){
              var comm="<div class=comment><div class='text'>" +
                 "<img class='emo1' src='${pageContext.request.contextPath}/images/小狗.png'>" +
                  "<img class='emo2' src='${pageContext.request.contextPath}/images/兔子.png'>" +
                  "<div class=aa><span>两人肩并肩地走路本身就是一件令人愉悦的事情</span></div></div><div class='cc'><div class='img1'> <img src='${pageContext.request.contextPath}/images/dog1.jpg'>" +
                  "<div class='name'> <img src='${pageContext.request.contextPath}/images/customer.png' style='height: 25px;width: 25px'><span>"+jsArr.commentUtilList[j].customer.custName+"</span></div></div>" +
                  "<div class='content'> ";
              if (jsArr.commentUtilList[j].commentUtil!=null){
                  comm+="回复 <span>"+jsArr.commentUtilList[j].commentUtil.customer.custName+"</span>:<span>"+jsArr.commentUtilList[j].commentUtil.comment.commContent+"</span><br><span>"+jsArr.commentUtilList[j].comment.commContent+"</span></div>";

              }
              else {
                  comm+="<span>"+jsArr.commentUtilList[j].comment.commContent+"</span></div>"
              }
              comm+="<div class=date><span>3</span>楼<span>"+jsArr.commentUtilList[j].comment.commTime+"</span><a href=''></a></div></div></div>";

            }
            div.innerHTML+=comm;
        }
    }
    xhr.send(formdate);
}