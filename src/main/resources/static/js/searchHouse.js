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

    //输入查询条件后刷新页面
    $("#search_button").click(function () {
        var search_value = $("#search_value").val();
        window.location.href = "Http://localhost:8080/html/searchHouse.html?search=" + search_value;
    });

    //每次进入页面进行动态根据URL后拼接地址执行查询
    var search = getQueryVariable('search');
    if (search == null || search == false) {
        $.ajax({
            url: "http://localhost:8080/homeHouses",
            type: "POST",
            data: {},
            success: function (successReturnValue) {
                var houseTable = $("#houseTable");
                houseTable.html("");
                $.each(successReturnValue, function (i, v) {
                    $("<div id='house" + i + "' onclick='aboutHouse(" + v.houseId + ")' class='col-4'></div>").appendTo(houseTable);
                    var houseId = $("#house" + i + '');
                    $("<img style='height: 200px;width: 320px'  name='housePhoto'src = Http://" + v.housePhoto + " >").appendTo(houseId);
                    $("<h4>" + v.houseAddress + "," + v.houseDescribe + "</h4>").appendTo(houseId);
                });
            },
            error: function (errorReturnValue) {
                $("#houseTable").html("");
                $("#houseTable").html("获取失败请刷新网页重新尝试");
            }
        });
    } else {
        $.ajax({
            url: "http://localhost:8080/searchEsHouse",
            type: "POST",
            data: {
                search: search
            },
            dataType: "json",
            success: function (successReturnValue) {
                var houseTable = $("#houseTable");
                houseTable.html("");
                $.each(successReturnValue, function (i, v) {
                    $("<div id='house" + i + "' onclick='aboutHouse(" + v.houseId + ")' class='col-4'></div>").appendTo(houseTable);
                    var houseId = $("#house" + i + '');
                    $("<img style='height: 200px;width: 320px'  name='housePhoto'src = Http://" + v.housePhoto + " >").appendTo(houseId);
                    $("<h4>" + v.houseAddress + "," + v.houseDescribe + "</h4>").appendTo(houseId);
                });
            },
            error: function (errorReturnValue) {
                $("#houseTable").html("");
                $("#houseTable").html("获取失败请刷新网页重新尝试");
            }
        });
    }

    //选择条件进行查询，同时判断URL后是否拼接条件
    $("#foxButton").click(function () {
        if (search == null || search == false) {
            $.ajax({
                url: "http://localhost:8080/searchHouse",
                type: "POST",
                data: {
                    address: $("select[name='address']").val()
                    , houseAreaMin: $("input[name='houseAreaMin']").val()
                    , houseAreaMax: $("input[name='houseAreaMax']").val()
                    , use: $("input[name='use']:checked").val()
                    , houseMoneyMin: $("input[name='houseMoneyMin']").val()
                    , houseMoneyMax: $("input[name='houseMoneyMax']").val()
                },
                success: function (successReturnValue) {
                    var houseTable = $("#houseTable");
                    houseTable.html("");
                    $.each(successReturnValue, function (i, v) {
                        $("<div id='house" + i + "' onclick='aboutHouse(" + v.houseId + ")' class='col-4'></div>").appendTo(houseTable);
                        var houseId = $("#house" + i + '');
                        $("<img style='height: 200px;width: 320px'  name='housePhoto'src = Http://" + v.housePhoto + " >").appendTo(houseId);
                        $("<h4>" + v.houseAddress + "," + v.houseDescribe + "</h4>").appendTo(houseId);
                    });
                },
                error: function (errorReturnValue) {
                    $("#houseTable").html("");
                    $("#houseTable").html("获取失败请刷新网页重新尝试");
                }
            });
        } else {
            $.ajax({
                url: "http://localhost:8080/searchHouseBySearch",
                type: "POST",
                data: {
                    search: search
                    , address: $("select[name='address']").val()
                    , houseAreaMin: $("input[name='houseAreaMin']").val()
                    , houseAreaMax: $("input[name='houseAreaMax']").val()
                    , use: $("input[name='use']:checked").val()
                    , houseMoneyMin: $("input[name='houseMoneyMin']").val()
                    , houseMoneyMax: $("input[name='houseMoneyMax']").val()
                },
                success: function (successReturnValue) {
                    var houseTable = $("#houseTable");
                    houseTable.html("");
                    $.each(successReturnValue, function (i, v) {
                        $("<div id='house" + i + "' onclick='aboutHouse(" + v.houseId + ")' class='col-4'></div>").appendTo(houseTable);
                        var houseId = $("#house" + i + '');
                        $("<img style='height: 200px;width: 320px'  name='housePhoto'src = Http://" + v.housePhoto + " >").appendTo(houseId);
                        $("<h4>" + v.houseAddress + "," + v.houseDescribe + "</h4>").appendTo(houseId);
                    });
                },
                error: function (errorReturnValue) {
                    $("#houseTable").html("");
                    $("#houseTable").html("获取失败请刷新网页重新尝试");
                }
            });
        }
    });
});

function getQueryVariable(variable) {
    var query = window.location.search.substring(1);
    var vars = query.split("&");
    for (var i = 0; i < vars.length; i++) {
        var pair = vars[i].split("=");
        if (pair[0] == variable) {
            return pair[1];
        }
    }
    return (false);
}

//绑定事件跳转当前点击的房屋信息详情页面
function aboutHouse(houseId) {
    $.cookie('houseId', houseId);
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