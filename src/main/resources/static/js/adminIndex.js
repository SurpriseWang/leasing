$(document).ready(function () {
    $('.nav-left-container').on('click', 'li', function () {
        $(this).find('.glyphicon-menu-right').removeClass('glyphicon-menu-right').addClass('glyphicon-menu-down');
        $(this).addClass('active').children('.nav-left-container-small').slideDown()

        $(this).siblings().removeClass('active').children('.nav-left-container-small').slideUp()
        $(this).siblings().find('.glyphicon-menu-down').removeClass('glyphicon-menu-down').addClass('glyphicon-menu-right ');
    });

    //提示账号人员
    var adminName = $.cookie('adminName');
    $("#adminName").html('欢迎登录,' + adminName);

    //用户信息管理操作
    $("#userAdmin").click(function () {
        var indexBody = $("#indexBody");
        indexBody.html("");
        $("<h2>用户信息管理:</h2><form id='userAdminForm' action='Http://localhost:8080/deleteUsersById'>" +
            "<table id='userAdminDiv' class='table table-hover'></table></form>").appendTo(indexBody);
        var userAdminDiv = $("#userAdminDiv");
        $.ajax({
            url: "Http://localhost:8080/queryAllUser", type: "post",
            success: function (successReturnValue) {
                $.each(successReturnValue, function (i, v) {
                    $("<tr id=tr" + i + "></tr>").appendTo(userAdminDiv);
                    var homeTr = $("#userAdminDiv #tr" + i + "");
                    $("<td><input type='checkbox' name='userId' value=" + v.userId + "></td>").appendTo(homeTr);
                    $("<td><h5>用户名：" + v.userName + " </h5></td>").appendTo(homeTr);
                    $("<td><h5>用户密码：" + v.userPassword + "</h5></td>").appendTo(homeTr);
                    $("<td><h5>用户手机号：" + v.userPhone + "</h5></td>").appendTo(homeTr);
                });
                $("<center><button type='submit' style='background-color: #17a2b8;border-radius: 6px;" +
                    "height: 50px;width: 100px;color: white'>删除所选账号</button></center>").appendTo($("#userAdminForm"));
            }
        });
    });

    //物品信息管理
    $("#goodsAdmin").click(function () {
        var indexBody = $("#indexBody");
        indexBody.html("");
        $("<h2>物品信息管理:</h2><form id='goodsAdminForm' action='Http://localhost:8080/deleteGoodsById'>" +
            "<table id='goodsAdminDiv' class='table table-hover'></table></form>").appendTo(indexBody);
        var goodsAdminDiv = $("#goodsAdminDiv");
        $.ajax({
            url: "Http://localhost:8080/queryAllGoods", type: "post",
            success: function (successReturnValue) {
                $.each(successReturnValue, function (i, v) {
                    $("<tr id=tr" + i + "></tr>").appendTo(goodsAdminDiv);
                    var homeTr = $("#goodsAdminDiv #tr" + i + "");
                    $("<td><input type='checkbox' name='goodsId' value=" + v.goodsId + "></td>").appendTo(homeTr);
                    $("<td><h5>物品描述：" + v.goodsDescribe + " </h5></td>").appendTo(homeTr);
                    $("<td><h5>是否出售：" + v.goodsSell + "</h5></td>").appendTo(homeTr);
                    $("<td><h5>出售价格：" + v.goodsSellMoney + "</h5></td>").appendTo(homeTr);
                });
                $("<center><button type='submit' style='background-color: #17a2b8;border-radius: 6px;" +
                    "height: 50px;width: 100px;color: white'>删除所选物品</button></center>").appendTo($("#goodsAdminForm"));
            }
        });
    });

    //房屋信息管理
    $("#houseAdmin").click(function () {
        var indexBody = $("#indexBody");
        indexBody.html("");
        $("<h2>房屋信息管理:</h2><form id='houseAdminForm' action='Http://localhost:8080/deleteHouseById'>" +
            "<table id='houseAdminDiv' class='table table-hover'></table></form>").appendTo(indexBody);
        var houseAdminDiv = $("#houseAdminDiv");
        $.ajax({
            url: "Http://localhost:8080/queryAllHouse", type: "post",
            success: function (successReturnValue) {
                $.each(successReturnValue, function (i, v) {
                    $("<tr id=tr" + i + "></tr>").appendTo(houseAdminDiv);
                    var homeTr = $("#houseAdminDiv #tr" + i + "");
                    $("<td><input type='checkbox' name='houseId' value=" + v.houseId + "></td>").appendTo(homeTr);
                    $("<td><h5>房屋地址：" + v.houseAddress + " </h5></td>").appendTo(homeTr);
                    $("<td><h5>房产编号：" + v.houseCardNumber + " </h5></td>").appendTo(homeTr);
                    $("<td><h5>房屋大小（平）：" + v.houseArea + " </h5></td>").appendTo(homeTr);
                    $("<td><h5>房屋描述：" + v.houseDescribe + " </h5></td>").appendTo(homeTr);
                    $("<td><h5>是否出售：" + v.houseSell + "</h5></td>").appendTo(homeTr);
                    $("<td><h5>出售价格：" + v.houseSellMoney + "</h5></td>").appendTo(homeTr);
                    $("<td><h5>是否出租：" + v.houseLease + "</h5></td>").appendTo(homeTr);
                    $("<td><h5>出租价格：" + v.houseLeaseMoney + "</h5></td>").appendTo(homeTr);
                });
                $("<center><button type='submit' style='background-color: #17a2b8;border-radius: 6px;" +
                    "height: 50px;width: 100px;color: white'>删除所选物品</button></center>").appendTo($("#houseAdminForm"));
            }
        });
    });

    //评论信息管理
    $("#commentAdmin").click(function () {
        var indexBody = $("#indexBody");
        indexBody.html("");
        $("<h2>房屋信息管理:</h2><form id='commentAdminForm' action='Http://localhost:8080/deleteCommentById'>" +
            "<table id='commentAdminDiv' class='table table-hover'></table></form>").appendTo(indexBody);
        var commentAdminDiv = $("#commentAdminDiv");
        $.ajax({
            url: "Http://localhost:8080/queryAllComment", type: "post",
            success: function (successReturnValue) {
                $.each(successReturnValue, function (i, v) {
                    $.each(v.comments, function (j, k) {
                        $("<tr id='tr" + i + "in" + j + "'></tr>").appendTo(commentAdminDiv);
                        var homeTr = $("#commentAdminDiv #tr" + i + "in" + j);
                        $("<td><input type='checkbox' name='commentId' value=" + v.user.userId + "></td>").appendTo(homeTr);
                        $("<td><h5>用户名：" + v.user.userName + " </h5></td>").appendTo(homeTr);
                        $("<td><h5>评论系统：" + k.commentUseSystem + " </h5></td>").appendTo(homeTr);
                        $("<td><h5>评论物品对应系统编号：" + k.commentPointSystemId + " </h5></td>").appendTo(homeTr);
                        $("<td><h5>评论信息：" + k.commentContent + " </h5></td>").appendTo(homeTr);
                    });
                });
                $("<center><button type='submit' style='background-color: #17a2b8;border-radius: 6px;" +
                    "height: 50px;width: 100px;color: white'>删除所选物品</button></center>").appendTo($("#commentAdminForm"));
            }
        });
    });
});