<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2018/11/23
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/statics/javascript/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="/statics/javascript/login.js"></script>
</head>
<body>
<a href="/test/logout">注销</a>
<select id="menuSelect"></select><br/>
<a href="${pageContext.request.contextPath}/test/toPage?pageNum=1">班级</a>
<a href="${pageContext.request.contextPath}/test/getStudent?pageNum=1">学生</a>
<a href="${pageContext.request.contextPath}/test/getUser?pageNum=1">用户</a>
<a href="${pageContext.request.contextPath}/test/getCourse?pageNum=1">课程</a>
<a href="${pageContext.request.contextPath}/test/getMenu?pageNum=1">菜单</a>
</body>
</html>
