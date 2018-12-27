<%--
  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2018/12/25
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="author" content="order by dede58.com"/>
    <title>Title</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div id="wrap">
    <div id="header">
        <div class="logo fleft"></div>
        <%--<div class="nav fleft">--%>
            <%--<ul>--%>
                <%--<div class="nav-left fleft"></div>--%>
                <%--<li class="first">我的面板</li>--%>
                <%--<li>设置</li>--%>
                <%--<li>模块</li>--%>
                <%--<li>内容</li>--%>
                <%--<li>用户</li>--%>
                <%--<li>扩展</li>--%>
                <%--<li>应用</li>--%>
                <%--<div class="nav-right fleft"></div>--%>
            <%--</ul>--%>
        <%--</div>--%>
        <a class="logout fright" href="http://localhost:8080/webManager/login"> </a>
        <div class="clear"></div>
        <div class="subnav">
            <div class="subnavLeft fleft"></div>
            <div class="fleft"></div>
            <div class="subnavRight fright"></div>
        </div>
    </div><!--#header -->
    <div id="content">
        <div class="space"></div>
        <div class="menu fleft">
            <ul>
                <li class="subMenuTitle">标题标题标题</li>
                <li class="subMenu"><a href="http://localhost:8080/webManager/content" target="right">商&nbsp&nbsp品</a>
                    <ul>
                        <li><a href="http://localhost:8080/webManager/add" target="right">添加</a></li>
                        <li><a href="http://localhost:8080/webManager/doupdate" target="right">修改</a></li>
                        <li><a href="http://localhost:8080/webManager/dodelete" target="right">删除</a></li>
                    </ul>
                </li>
                <li class="subMenu"><a href="http://localhost:8080/webManager/brand"  target="right">品&nbsp&nbsp牌</a>
                    <ul>
                        <li><a href="http://localhost:8080/webManager/brandcud" target="right">管理</a></li>
                        <li><a href="http://localhost:8080/webManager/doupdate" target="right">故事</a></li>
                    </ul>
                </li>

                <li class="subMenu"><a href="" target="right">标题标题标题</a></li>
                <li class="subMenu"><a href="" target="right">标题标题标题</a></li>
                <li class="subMenu"><a href="" target="right">标题标题标题</a></li>
                <li class="subMenu"><a href="" target="right">标题标题标题</a></li>
                <li class="subMenu"><a href="" target="right">标题标题标题</a></li>
            </ul>
        </div>
        <div class="sidebar fleft"><div class="btn"></div></div>
        <div class="page">
            <iframe width="1232px" scrolling="auto" height="500px" frameborder="false" allowtransparency="true" style="border: medium none;" src="" id="rightMain" name="right"></iframe>
        </div>
    </div><!--#content -->
    <div class="clear"></div>
    <div id="footer"></div><!--#footer -->
</div><!--#wrap -->

</body>
</html>
