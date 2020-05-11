$(document).ready(function () {
    //向Cookie中加入访问系统
    $.cookie('system', 'house', {path: '/'});

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

    //每次页面刷新执行查询前4个房屋信息
    $.ajax({
        url: "http://localhost:8080/homeHouse",
        type: "POST",
        data: {},
        success: function (successReturnValue) {
            var tbody_house = $("#tbody_house");
            tbody_house.html("");
            $.each(successReturnValue, function (i, v) {
                $("<tr id=tr" + i + " onclick='aboutHouse(" + v.houseId + ")'></tr>").appendTo(tbody_house);
                var homeTr = $("#tbody_house #tr" + i + "");
                $("<td><img style='height: 100px'  name='housePhoto'src = Http://" + v.housePhoto + " ></td>").appendTo(homeTr);
                $("<td><h4>" + v.houseAddress + "," + v.houseDescribe + "</h4></td>").appendTo(homeTr);
                if (v.houseSell == 1) {
                    if (v.houseLease == 1) {
                        $("<td><h4>出售/出租</h4></td>").appendTo(homeTr);
                        $("<td class=''><h4>&nbsp" + v.houseSellMoney + "&nbsp/&nbsp" + v.houseLeaseMoney + "&nbsp</h4></td>").appendTo(homeTr);
                    } else {
                        $("<td><h4>已出售/出租</h4></td>").appendTo(homeTr);
                        $("<td><h4>&nbsp" + v.houseSellMoney + "&nbsp/&nbspX&nbsp</h4></td>").appendTo(homeTr);
                    }
                } else {
                    if (v.houseLease == 1) {
                        $("<td class=''><h4>出售/已出租</h4></td>").appendTo(homeTr);
                        $("<td class=''><h4>&nbspX&nbsp/&nbsp" + v.houseLeaseMoney + "&nbsp</h4></td>").appendTo(homeTr);

                    } else {
                        $("<td class=''><h4>已出售/已出租</h4></td>").appendTo(homeTr);
                        $("<td class=''><h4>&nbspX&nbsp/&nbspX</h4></td>").appendTo(homeTr);
                    }
                }
                ;
            });
        },
        error: function (errorReturnValue) {
            var tbody_house = $("#tbody_house");
            tbody_house.html("获取失败请刷新网页重新尝试");
        }
    });

    //输入查询条件，跳转更多房屋页面
    $("#search_button").click(function () {
        var search_input = $("#search_value").val();
        window.location.href = "Http://localhost:8080/html/searchHouse.html?search=" + search_input;
    });


});

//绑定事件跳转当前点击的房屋信息详情页面
function aboutHouse(houseId) {
    $.cookie('houseId', houseId, {path: '/'});
    window.location.href = "../html/aboutHouse.html";
}

//跳转用户中心函数
function userCore() {
    var userLogin = $.cookie('userLogin');
    if (userLogin == 'true') {
        window.location.href = "Http://localhost:8080/html/userExtend.html";
    } else {
        alert("请先登录后查看");
    }
}