<%--
  Created by IntelliJ IDEA.
  User: 呓语灬霍
  Date: 2019/11/4
  Time: 0:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px" align="center" width="50%" height="30%">
    <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>生日</td>
        <td>性别</td>
        <td>地址</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.birthday}</td>
            <td>${user.sex}</td>
            <td>${user.address}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
