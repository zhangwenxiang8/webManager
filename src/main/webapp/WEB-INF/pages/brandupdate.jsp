<%--
  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2018/12/27
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="brandupdate" method="post">
    <input hidden="hidden" name="id" value="${brandlist.pid}">
    商品姓名: <input type="text" name="name" value="${brandlist.brand_name}"><br>
    商品描述: <input type="text" name="des" value="${brandlist.brand_desc}"><br>
    <input type="submit" value="提交">

</form>

</body>
</html>
