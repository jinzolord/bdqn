$(function () {
    $.post("/test/getAllMenu", "", function (result) {
        //alert(result);
        var html = "";
        for (var i = 0; i < result.length; i++) {
            html += "<option>" + result[i].menuName + "</option>";
        }
        $("#menuSelect").html(html);
    })
});