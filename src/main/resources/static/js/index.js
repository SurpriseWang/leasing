$(document).ready(function(){
    $("#button1").mouseover(function(){
        $(this).css("opacity","0.9");
        $(this).css("font-size","80px");
    });
    $("#button1").mouseout(function(){
        $(this).css("opacity","0.5");
        $(this).css("font-size","50px");
    });
    $("#button2").mouseover(function(){
        $(this).css("opacity","0.9");
        $(this).css("font-size","80px");
    });
    $("#button2").mouseout(function(){
        $(this).css("opacity","0.5");
        $(this).css("font-size","50px");
    });
    $("#button1").click(function(){
        window.location.href = "../html/goods.html";
    });
    $("#button2").click(function(){
        window.location.href = "../html/house.html";
    });
});