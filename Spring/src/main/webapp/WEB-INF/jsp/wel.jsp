<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2019-06-12/0012
  Time: 下午 20:20
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
    <title>Welcome</title>
</head>
<body>
<h1>${user.userName}登录成功！</h1>
</body>
</html>
