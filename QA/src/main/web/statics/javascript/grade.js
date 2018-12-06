$(function () {

    alert(${grade.id});
    $(".details").bind("click", function () {
        var id = $(this).attr("gradeId");
        location.href = "/test/getGradeDetail?gradeId=" + id;
    })

    $(".delete").bind("click", function () {
        var id = $(this).attr("gradeId");
        $.post("/test/deleteGrade", "gradeId=" + id, function (result) {
            if (result > 0) {
                $(this).parents("tr");
            }
        })
    })
});