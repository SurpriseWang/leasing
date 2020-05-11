$(document).ready(function () {
    //判断用户是否登录
    var userLogin = $.cookie('userLogin');
    var userName = $.cookie('userName');
    if (userLogin == 'true') {
        $("#a_login").html('欢迎登录,' + userName);
        $("#a_login").css("color", "white");
        $("#login").attr("id", "");
        $("#userId").val($.cookie("userId"));
    }

    //关闭模态框
    $("#insert_a").click(function () {
        $(".close_modal1").trigger("click");
    });
    $("#a_login").click(function () {
        $(".close_modal1").trigger("click");
    });

    //获取账户信息
    $.ajax({
        url: "http://localhost:8080/selectUserExtend",
        type: "POST",
        data: {userId: $.cookie('userId')},
        success: function (successReturnValue) {
            var userName = $("#userName");
            userName.html(userName.html() + successReturnValue.user.userName);
            var userPassword = $("#userPassword");
            userPassword.html(userPassword.html() + successReturnValue.user.userPassword);
            var userPhone = $("#userPhone");
            userPhone.html(userPhone.html() + successReturnValue.user.userPhone);
            var userAddress = $("#userAddress");
            userAddress.html(userAddress.html() + successReturnValue.userExtend.userAddress);
            var userIdCard = $("#userIdCard");
            userIdCard.html(userIdCard.html() + successReturnValue.userExtend.userIdCard);
        }
    });
});