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

    //获取账户房屋信息
    $.ajax({
        url: "http://localhost:8080/selectUserHouse",
        type: "POST",
        data: {userId: $.cookie('userId')},
        success: function (successReturnValue) {
            $.each(successReturnValue, function (i, v) {
                var houseTable = $("#houseTable");
                $("<tr id=tr" + i + "></tr>").appendTo(houseTable);
                var homeTr = $("#houseTable #tr" + i + "");
                $("<td><input type='checkbox' name='houseId' value=" + v.houseId + "></td>").appendTo(homeTr);
                $("<td class=''><img style='height: 100px'  name='housePhoto'src = Http://" + v.housePhoto + " ></td>").appendTo(homeTr);
                $("<td class=''><h5>" + v.houseDescribe + "</h5></td>").appendTo(homeTr);
                $("<td class=''><h5>出租价格：" + v.houseSellMoney + "</h5></td>").appendTo(homeTr);
                $("<td class=''><h5>出售价格：" + v.houseLeaseMoney + "</h5></td>").appendTo(homeTr);
            });
        }
    });

});