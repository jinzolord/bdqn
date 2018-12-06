<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2018/11/26
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="/statics/javascript/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="/statics/javascript/grade.js"></script>
<style type="text/css">
    #details {
        position: fixed;
        width: 80%;
        left: 10%;
        top: 10%;
        background: #ccccbb;
        color: red;
    }

    a {
        cursor: pointer;
    }
</style>
<body>
<table style="border-collapse: collapse; border: 1px solid #ccb; width: 100%; ">
    <tr>
        <td>id</td>
        <td>学生姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>学号</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${pageInfo.list}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.studentName}</td>
            <td>${student.gender}</td>
            <td>${student.age}</td>
            <td>${student.studentNum}</td>
            <td><a studentId="${student.id}" class="details">查看</a><a>修改</a><a>删除</a></td>
        </tr>
    </c:forEach>
</table>
<div>共${pageInfo.total}条记录[${pageInfo.pageNum}/${pageInfo.pages}]</div>
<div>
    <c:if test="${pageInfo.isFirstPage}">
        <a>首页</a><a>上一页</a>
    </c:if>
    <c:if test="${!pageInfo.isFirstPage}">
        <a href="${pageContext.request.contextPath}/test/getStudent?pageNum=${pageInfo.firstPage}">首页</a>
        <a href="${pageContext.request.contextPath}/test/getStudent?pageNum=${pageInfo.prePage}">上一页</a>
    </c:if>

    <c:if test="${pageInfo.isLastPage}">
        <a>下一页</a><a>末页</a>
    </c:if>

    <c:if test="${!pageInfo.isLastPage}">
        <a href="${pageContext.request.contextPath}/test/getStudent?pageNum=${pageInfo.nextPage}">下一页</a>
        <a href="${pageContext.request.contextPath}/test/getStudent?pageNum=${pageInfo.lastPage}">末页</a>
    </c:if>

    <div id="details"></div>
</div>
</body>
</html>
