<%--
  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2018/12/26
  Time: 0:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="doupdatee" method="post">
    <input hidden="hidden" name="id" value="${p.pid}">
    姓名: <input type="text" name="name" value="${p.productName}"><br>
    价格: <input type="text" name="price" value="${p.price}"><br>
    描述:   <input type="text" name="des" value="${p.productDes}"><br>
    图片:   <input type="text" name="url" value="${p.url}"><br>
    <input type="submit" value="提交">

</form>

</body>
</html>
