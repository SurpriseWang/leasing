$(document).ready(function () {
    //判断用户是否登录
    var userLogin = $.cookie('userLogin');
    var userName = $.cookie('userName');
    if (userLogin == 'true') {
        $("#a_login").html('欢迎登录,' + userName);
        $("#a_login").css("color", "white");
        $("#login").attr("id", "");
    }

    //关闭模态框
    $("#insert_a").click(function () {
        $(".close_modal1").trigger("click");
    });
    $("#a_login").click(function () {
        $(".close_modal1").trigger("click");
    });

    //每次登录自动获取房屋详情。
    $.ajax({
        url: "http://localhost:8080/searchHouseById",
        type: "POST",
        data: {houseId: $.cookie("houseId"),},
        success: function (successReturnValue) {
            var aboutHouse = $("#aboutHouse");
            aboutHouse.html("");
            $("<h4 style='text-align: center;margin: 100px 100px 50px;'>" + successReturnValue.house.houseDescribe + "</h4>").appendTo(aboutHouse);
            if (userLogin == 'true') {
                $("<center><h4>登录后，查看联系方式</h4></center>").appendTo(aboutHouse);
            } else {
                $("<center><h4>姓名：" + successReturnValue.user.userName + "<center></h4>").appendTo(aboutHouse);
                $("<center><h4>联系电话：" + successReturnValue.user.userPhone + "<center></h4>").appendTo(aboutHouse);
            }
            var userComment = $("#userComment");
            userComment.html("");
            $.each(successReturnValue.comment, function (i, v) {
                $("<tr id=tr" + i + ">" + v.commentContent + "</tr>").appendTo(userComment);
                var commentTr = $("#userComment #tr" + i + "");
                $("<td><h5>" + v.commentContent + "</h5></br></td>").appendTo(commentTr);
            });
        },
        error: function (errorReturnValue) {
            $("#aboutHouse").html("");
            $("#aboutHouse").html("获取失败请刷新网页重新尝试");
        }
    });
    $("#commentButton").click(function () {
        if (userLogin == 'true') {
            var commentValue = $("#commentValue").val();
            $.ajax({
                url: "http://localhost:8080/createHouseComment",
                type: "POST",
                data: {commentValue: commentValue},
                success: function (successReturnValue) {
                    window.location.href = "../html/aboutHouse.html";
                }
            });
        } else {
            alert("请先登录后操作")
        }
    });
});

//跳转用户中心函数
function userCore() {
    var userLogin = $.cookie('userLogin');
    if (userLogin == 'true') {
        window.location.href = "Http://localhost:8080/html/userExtend.html";
    } else {
        alert("请先登录后查看");
    }
}