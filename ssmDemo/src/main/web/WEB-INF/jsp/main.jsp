<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="/statics/javascript/jquery-2.1.4.min.js"></script>
<script type="text/javascript">
</script>
<body>
<div>
    <form method="post" action="/test/login">
        <table>
            <tr>
                <td>
                    用户名：
                </td>
                <td><input type="text" name="userName"/></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="text" name="password"/></td>
            </tr>
            <c:if test="${loginFailed=='falied'}">
                <tr>
                    <td colspan="2">
                        用户名或密码错误
                    </td>
                </tr>
            </c:if>
            <tr>
                <td colspan="2"><input type="submit" value="登录"/></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
