// Content Contact Form
$(function () {
    $('.error').hide();
    $('.text-input').css({backgroundColor:"#883E00"});
     $('.text-input').focus(function () {
     $(this).css({backgroundColor:"#883E00"});
     });
     $('.text-input').blur(function () {
     $(this).css({backgroundColor:"#883E00"});
     });
    $(".form-button").click(function () {
        // validate and process form
        // first hide any error messages
        $('.error').hide();
        var name = $("input#name").val();
        if (name == "") {
            $("label#name_error").show();
            $("input#name").focus();
            return false;
        }
        var email = $("input#email").val();
        var filter = /^[a-zA-Z0-9]+[a-zA-Z0-9_.-]+[a-zA-Z0-9_-]+@[a-zA-Z0-9]+[a-zA-Z0-9.-]+[a-zA-Z0-9]+.[a-z]{2,4}$/;
        console.log(filter.test(email));
        if (!filter.test(email)) {
            $("label#email_error").show();
            $("input#email").focus();
            return false;
        }
        var message = $("#input-message").val();
        if (message == "") {
            $("label#message_error").show();
            $("#input-message").focus();
            return false;
        }
        var dataString = 'name=' + name + '&email=' + email + '&message=' + message;
        //alert (dataString);return false;
        $.ajax({
            type:"POST",
            url:"process.php",
            data:dataString,
            success:function () {
                $('#af-form').prepend("<div class=\"alert alert-success fade in\"><button class=\"close\" data-dismiss=\"alert\" type=\"button\">&times;</button><strong>Contact Form Submitted!</strong> We will be in touch soon.</div>");
                $('#af-form')[0].reset();
            }
        });
        return false;
    });
});
function name_check(){
    var name=document.getElementById("name");
    name.bgColor="black !important";
    var filter=/^.{3,12}$/;
    if(name.value==null || name.value==""){
        document.getElementById("name_error").innerText="用户名不能为空!";
        document.getElementById("name_error").style.display="block";
        return false;
    }else if(!filter.test(name.value)){
        document.getElementById("name_error").innerText="用户名长度为3-12位";
        document.getElementById("name_error").style.display="block";
        return false;
    }else{
        document.getElementById("name_error").style.display="none";
        return true;
    }

}
function name_psw(){
    var psw=document.getElementById("psd");
    var filter=/^.{6,12}$/;
    if(psw.value==null || psw.value==""){
        document.getElementById("psd_erroe").innerText="密码不能为空!";
        document.getElementById("psd_erroe").style.display="block";
        return false;
    }else if(!filter.test(psw.value)){
        document.getElementById("psd_erroe").innerText="密码长度为6-12位";
        document.getElementById("psd_erroe").style.display="block";
        return false;
    }else{
        document.getElementById("psd_erroe").style.display="none";
        return true;
    }
}
function psw_check(){
    var psw=document.getElementById("psd_again");
    var psd=document.getElementById("psd");
    if(psw.value==null || psw.value==""){
        document.getElementById("psdagain_error").innerText="确认密码不能为空!";
        document.getElementById("psdagain_error").style.display="block";
        return false;
    }else if(psw.value!=psd.value){
        document.getElementById("psdagain_error").innerText="两次密码不一致";
        document.getElementById("psdagain_error").style.display="block";
        return false;
    }else{
        document.getElementById("psdagain_error").style.display="none";
        return true;
    }
}
function age_check(){
    var age=document.getElementById("age");

    if(age.value==null || age.value==""){
        document.getElementById("age_error").innerText="请输入年龄!";
        document.getElementById("age_error").style.display="block";
        return false;
    }else if(age.value<10||!(/^\d{2}$/.test(age.value))){
        document.getElementById("age_error").innerText="年龄必须是大于10小于100的用户";
        document.getElementById("age_error").style.display="block";
        return false;
    }else {
        document.getElementById("age_error").style.display="none";
        return true;
    }

}
function phone_check(){
    var phone=document.getElementById("phone");
    if(phone.value==null || phone.value==""){
        document.getElementById("phone_error").innerText="请输入联系电话!";
        document.getElementById("phone_error").style.display="block";
        return false;
    }else if(phone.value<10||!(/^[1][3,4,5,7,8][0-9]{9}$/.test(phone.value))){
        document.getElementById("phone_error").innerText="电话格式不正确";
        document.getElementById("phone_error").style.display="block";
        return false;
    }else {
        document.getElementById("phone_error").style.display="none";
        return true;
    }
}
function email_check(){
    var email = document.getElementById("email").value;
    var filter =/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    console.log(filter.test(email));
    if(email==null || email==""){
        document.getElementById("email_error").innerText="请输入邮箱地址!";
        document.getElementById("email_error").style.display="block";
        return false;
    }else if (!filter.test(email)) {
        document.getElementById("email_error").innerText="邮箱格式不正确";
        document.getElementById("email_error").style.display="block";
        return false;
    }else {
        document.getElementById("email_error").style.display="none";
        return true;
    }
}
function submit_btn23(){
   return(name_check()&&name_psw()&&psw_check()&&age_check()&&phone_check()&&email_check());
}
// Footer Contact Form
$(function () {

    $('.ferror').hide();

    $(".footer-button").click(function () {
        // validate and process form
        // first hide any error messages
        $('.ferror').hide();

        var name = $("#inputName").val();
        if (name == "") {
            $("label#fname_error").show();
            $("#inputName").focus();
            return false;
        }
        var email = $("#inputEmail").val();
        var filter = /^[a-zA-Z0-9]+[a-zA-Z0-9_.-]+[a-zA-Z0-9_-]+@[a-zA-Z0-9]+[a-zA-Z0-9.-]+[a-zA-Z0-9]+.[a-z]{2,4}$/;
        console.log(filter.test(email));
        if (!filter.test(email)) {
            $("label#femail_error").show();
            $("#inputEmail").focus();
            return false;
        }
        var message = $("#inputMessage").val();
        if (message == "") {
            $("label#fmessage_error").show();
            $("#inputMessage").focus();
            return false;
        }

        var dataString = 'name=' + name + '&email=' + email + '&message=' + message;
        //alert (dataString);return false;

        $.ajax({
            type:"POST",
            url:"process.php",
            data:dataString,
            success:function () {
                $('#contact').append('<div class="modal hide" id="contactModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"><div class="modal-body"><p><strong class="color2">Your message was sent!</strong> - We will get back at You soon!</p></div><div class="modal-footer"><a href="#" class="btn" data-dismiss="modal">Close</a></div></div>');
                $('#contactModal').modal();
                $('#contact')[0].reset();
            }
        });
        return false;
    });
});