<%--
  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2018/12/27
  Time: 16:03
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
<form action="brand" method="get">
    <div id="contentWrap">
        <div class="pageTitle"></div>
        <div class="pageColumn">
            <div class="pageButton"></div>

            <table>
                <thead>
                <th width="25"><input name="" type="checkbox" value="" /></th>
                <th width="7%">id</th>
                <th width="15%">品牌名称</th>
                <th width="15%">品牌描述</th>
                <th width="20%"></th>
                <th width=""></th>

                </thead>
                <tbody>
                <c:forEach items="${list}" var="b">
                    <tr>
                        <td class="checkBox"><input name="" type="checkbox" value="" /></td>
                        <td>${b.id}</td>
                        <td>${b.brandName}</td>
                        <td>${b.branDesc}</td>

                        <%--<td>${b.createTime}</td>--%>
                        <%--<td>${b.sets}</td>--%>

                    </tr>
                </c:forEach>

                </tbody>
            </table>

        </div></div>
</form>
</body>
</html>