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
<h1>成功登录！</h1>
</body>
</html>
