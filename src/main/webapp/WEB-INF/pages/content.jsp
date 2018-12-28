<%--
  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2018/12/25
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="author" content="order by dede58.com"/>
    <title>Title</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <style type="text/css">
        body {
            background:#FFF
        }
    </style>
</head>
<body>


<div id="contentWrap">
    <div class="pageTitle"></div>
    <div class="pageColumn">
        <div class="pageButton"></div>
        <form  method="post">
        <input type="text" name="text" placeholder="请输入查找内容..." >
        <input type="submit" value="查询">
        </form>
        <form action="content" method="get">
        <table>
            <thead>
            <th width="25"><input name="" type="checkbox" value="" /></th>
            <th width="7%">id</th>
            <th width="15%">商品名称</th>
            <th width="15%">价格</th>
            <th width="20%">地址</th>
            <th width="">图片</th>

            </thead>
            <tbody>
            <c:forEach items="${list}" var="p">
            <tr>
                <td class="checkBox"><input name="" type="checkbox" value="" /></td>
                <td>${p.pid}</td>
                <td>${p.productName}</td>
                <td>${p.price}</td>
                <td>${p.productDes}</td>
                <td>${p.url}</td>

            </tr>
            </c:forEach>

            </tbody>
        </table>

    </div></div>
</form>
</body>
</html>
