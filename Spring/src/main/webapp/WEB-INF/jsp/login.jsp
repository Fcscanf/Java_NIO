<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2019-06-12/0012
  Time: 下午 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>登录</title>
</head>
<body>
<h1>欢迎登录！</h1>
<form method="post" action="<%=basePath%>/user/loginUser">
    <table>
        <tr>
            <td>用户名</td>
            <td><input name="userName" type="text" value="${user.userName}"></td>
        </tr>
        <tr>
            <td>全名</td>
            <td><input name="fullName" type="text" value="${user.fullName}"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input name="password" type="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录"></td>
            <td><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>
</body>
</html>
