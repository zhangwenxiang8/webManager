<%--
  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2018/12/26
  Time: 9:37
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
<form action="add" method="get">
    <div id="contentWrap">
        <div class="pageTitle"></div>
        <div class="pageColumn">
            <div class="pageButton"></div>

            <table>
                <thead>
                <th width="25"><input name="" type="checkbox" value="" /></th>
                <th width="7%">id</th>
                <th width="15%">商品名称</th>
                <th width="15%">价格</th>
                <th width="15%">地址</th>
                <th width="">图片</th>
                <th width="28%">操作</th>
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
                        <td><a href="add">添加</a></td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>

        </div></div>
</form>
</body>
</html>
