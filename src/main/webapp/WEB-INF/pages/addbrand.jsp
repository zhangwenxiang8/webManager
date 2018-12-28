<%--
  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2018/12/28
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="doaddbrand" method="post">
    <input hidden="hidden" name="id">
    商品姓名: <input type="text" name="name" ><br>
    商品描述: <input type="text" name="des" ><br>
    <input type="submit" value="提交">

</form>

</body>
</html>