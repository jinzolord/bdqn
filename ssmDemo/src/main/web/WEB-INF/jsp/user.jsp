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
        <td>用户姓名</td>
        <td>密码</td>
        <td>昵称</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${pageInfo.list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.userName}</td>
            <td>${user.password}</td>
            <td>${user.nickName}</td>
            <td><a studentId="${user.id}" class="details">查看</a><a>修改</a><a>删除</a></td>
        </tr>
    </c:forEach>
</table>
<div>共${pageInfo.total}条记录[${pageInfo.pageNum}/${pageInfo.pages}]</div>
<div>
    <c:if test="${pageInfo.isFirstPage}">
        <a>首页</a><a>上一页</a>
    </c:if>
    <c:if test="${!pageInfo.isFirstPage}">
        <a href="${pageContext.request.contextPath}/test/getUser?pageNum=${pageInfo.firstPage}">首页</a>
        <a href="${pageContext.request.contextPath}/test/getUser?pageNum=${pageInfo.prePage}">上一页</a>
    </c:if>

    <c:if test="${pageInfo.isLastPage}">
        <a>下一页</a><a>末页</a>
    </c:if>

    <c:if test="${!pageInfo.isLastPage}">
        <a href="${pageContext.request.contextPath}/test/getUser?pageNum=${pageInfo.nextPage}">下一页</a>
        <a href="${pageContext.request.contextPath}/test/getUser?pageNum=${pageInfo.lastPage}">末页</a>
    </c:if>

    <div id="details"></div>
</div>
</body>
</html>
