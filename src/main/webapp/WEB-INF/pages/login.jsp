<%--
  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2018/12/21
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>Title</title>
    <style>
        * { margin: 0 ; padding: 0;}
        html { height: 100%; }
        body { height: 100%; background: #fff url(images/background.jpg) 50% 50% no-repeat; background-size: cover;}
        .dowebok { position: absolute; left: 50%; top:60%; width: 430px; height: 550px; margin: -300px 0 0 -215px;  overflow: hidden;}
        .logo { width: 181px; height: 63px; margin:  auto ; background: url(images/logo.png) 0 0 no-repeat; }
        .form-item { position: relative; width: 360px; margin:  auto; padding-bottom: 30px;}
        .form-item input { width: 360px; height: 50px; padding-left: 70px; border: 1px solid #fff; border-radius: 25px; font-size: 18px; color: #fff; background-color: transparent; outline: none;}
        .form-item button { width: 260px; height: 50px; margin-left: 15%;  border: 0; border-radius: 25px; font-size: 18px; color: #1f6f4a; outline: none; cursor: pointer; background-color: #fff; }
        #username { background: url(images/emil.png) 20px 14px no-repeat; margin:  auto ;}
        #password { background: url(images/password.png) 23px 11px no-repeat; margin:  auto ; }
        .tip1 { display: none; position: absolute; left: 20px; top: 52px; font-size: 14px; color: #f50; }
        .tip2 { display: none; position: absolute; left: 20px; top: 52px; font-size: 14px; color: #f50; }
        .reg-bar { width: 360px; margin: 20px auto 0; font-size: 14px; overflow: hidden;}
        .reg-bar a { color: #fff; text-decoration: none; }
        .reg-bar a:hover { text-decoration: underline; }
        .reg-bar .reg { float: left; }
        .reg-bar .forget { float: right; }
        .dowebok ::-webkit-input-placeholder { font-size: 18px; line-height: 1.4; color: #fff;}
        .dowebok :-moz-placeholder { font-size: 18px; line-height: 1.4; color: #fff;}
        .dowebok ::-moz-placeholder { font-size: 18px; line-height: 1.4; color: #fff;}
        .dowebok :-ms-input-placeholder { font-size: 18px; line-height: 1.4; color: #fff;}

        @media screen and (max-width: 500px) {
            * { box-sizing: border-box; }
            .dowebok { position: static; width: auto; height: auto; margin: 0 30px; border: 0; border-radius: 0; }
            .logo { margin: 50px auto; }
            .form-item { width: auto; }
            .form-item input, .form-item button, .reg-bar { width: 100%; }
        }
    </style>
</head>
<div class="dowebok">
    <form id="fm" method="post">
    <div class="logo"></div>
    <div class="form-item">
        <input id="username" type="text" name="name"  autocomplete="off" placeholder="登陆账户">
        <p class="tip1">请输入正确的账户</p>
    </div>
    <div class="form-item">
        <input id="password" name="password" type="password" autocomplete="off" placeholder="登录密码">
        <p class="tip2">邮箱或密码不正确</p>
    </div>
    <div class="form-item"><button id="submit">登 录</button></div>
    <div class="reg-bar">
        <a class="reg" href="http://localhost:8080/webManager/register">立即注册</a>
        <a class="forget" href="修改密码:">忘记密码</a>
    </div>
    </form>
</div>

<script src="juery/jquery-3.3.1.min.js"></script>
<script>
    $(function () {

        $("#submit").click(function () {
            var fm=$("#fm").serialize();//获取地址栏里的信息
            $.ajax({
                url:"dologin",
                type:"post",
                data:fm,
                success:function (data) {
                    console.log(data);
                    if (data=="1"){
                        alert("登陆成功");  //alert和window窗口共存的
                        window.location.href="http://localhost:8080/webManager/list";
                    }
                    if(data=="2"){
                        alert("密码错误");
                    }
                    if(data=="3"){
                        alert("密码错误");
                    }
                }
            })

        })
    })



</script>

</body>
</html>
