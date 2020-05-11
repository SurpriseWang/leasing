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

    $.ajax({
        url: "http://localhost:8080/selectUserGoods",
        type: "POST",
        data: {userId: $.cookie('userId')},
        success: function (successReturnValue) {
            $.each(successReturnValue, function (i, v) {
                var goodsTable = $("#goodsTable");
                $("<tr id=tr" + i + "></tr>").appendTo(goodsTable);
                var homeTr = $("#goodsTable #tr" + i + "");
                $("<td><input type='checkbox' name='goodsId' value=" + v.goodsId + "></td>").appendTo(homeTr);
                $("<td class=''><img style='height: 100px'  name='housePhoto'src = Http://" + v.goodsPhoto + " ></td>").appendTo(homeTr);
                $("<td class=''><h5>" + v.goodsDescribe + "</h5></td>").appendTo(homeTr);
                if(v.goodsSell==1){
                    $("<td class=''><h5>物品出售</h5></td>").appendTo(homeTr);
                }else {
                    $("<td class=''><h5>暂无库存</h5></td>").appendTo(homeTr);
                }
                $("<td class=''><h5>出售价格：" + v.goodsSellMoney + "</h5></td>").appendTo(homeTr);
            });
        }
    });
});