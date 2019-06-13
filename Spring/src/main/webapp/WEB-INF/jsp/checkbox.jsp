<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2019-06-13/0013
  Time: 上午 11:12
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
    <title>Title</title>
</head>
<body>
<form method="post" action="<%=basePath%>user/array">
    <input type="checkbox" name="device" value="-1" checked style="display: none">
    <input type="checkbox" name="device" value="0">赵乾坤
    <input type="checkbox" name="device" value="1">张旭东
    <input type="checkbox" name="device" value="2">古赛昆
    <input type="checkbox" name="device" value="3">刘庆
    <input type="checkbox" name="device" value="4">APP
    <input type="checkbox" name="device" value="5">F残忍
    <input type="submit" value="提交">
</form>
</body>
</html>
