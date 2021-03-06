$(document).ready(function () {
    //向Cookie中加入访问系统
    $.cookie('system', 'goods', {path: '/'});

    //判断用户是否登录
    var userLogin = $.cookie('userLogin');
    var userName = $.cookie('userName');
    if (userLogin == 'true') {
        $("#a_login").html('欢迎登录,' + userName);
        $("#a_login").css("color", "white");
        $("#login").attr("id", "");
    }

    //开放用户中心

    //关闭模态框
    $("#insert_a").click(function () {
        $(".close_modal1").trigger("click");
    });
    $("#a_login").click(function () {
        $(".close_modal1").trigger("click");
    });

    //获取前4条数据
    $.ajax({
        url: "http://localhost:8080/homeGoods",
        type: "POST",
        data: {},
        success: function (successReturnValue) {
            var goodsTable = $("#goodsTable");
            goodsTable.html("");
            $.each(successReturnValue, function (i, v) {
                $("<tr id=tr" + i + " onclick='aboutGoods(" + v.goodsId + ")'></tr>").appendTo(goodsTable);
                var homeTr = $("#goodsTable #tr" + i + "");
                $("<td class=''><img style='height: 100px' src='Http://" + v.goodsPhoto + "'></td>").appendTo(homeTr);
                $("<td><h4>" + v.goodsDescribe + "</h4></td>").appendTo(homeTr);
                if (v.goodsSell == 1) {
                    $("<td><h4>出售中</h4></td>").appendTo(homeTr);
                } else {
                    $("<td><h4>已售出</h4></td>").appendTo(homeTr);
                }
                $("<td><h4>" + v.goodsSellMoney + "</h4></td>").appendTo(homeTr);
            });
        }
    });
    //输入查询条件，跳转更多房屋页面
    $("#search_button").click(function () {
        var search_input = $("#search_value").val();
        window.location.href = "Http://localhost:8080/html/searchGoods.html?search=" + search_input;
    });
});


//跳转用户详情函数
function aboutGoods(goodsId) {
    $.cookie('goodsId', goodsId, {path: '/'});
    window.location.href = "Http://localhost:8080/html/aboutGoods.html";
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