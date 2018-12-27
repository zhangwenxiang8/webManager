<%--
  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2018/12/24
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Precise Contact Form template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs Sign up Web Templates,
 Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free web designs for Nokia, Samsung, LG, SonyEricsson, Motorola web design">
    <script type="application/x-javascript">
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    <!--// Meta Tags -->
    <!-- Stylesheet -->
    <link href="css/registerstyle.css" rel='stylesheet' type='text/css' />
    <!--// Stylesheet -->
    <!--fonts-->
    <link href="//fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700,800" rel="stylesheet">
    <!--//fonts-->

</head>
<body>
<!--background-->
<!-- Contact form -->
<h1>Register</h1>
<div class="contact-main-w3-agile">
    <div class="top-section-wthree" style="background-color:rgba(136%,136%,136%,0.1) ">
        <h2 class="sub-title">Contact Us</h2>
        <p>We are available to answer all your questions.</p>
    </div>
    <div class="form-agileits-w3layouts" style="background-color:rgba(136%,136%,136%,0.1) " >
        <form>
            <div class="form-w3layouts-fields" >
                <input type="text" name="name" id="name" class="a" placeholder="Name" required="" style="background-color: white; border-radius:4px" /><span id="mo" style="color: red"></span>
            </div>
            <div class="form-w3layouts-fields">
                <input type="password" name="pwd"  id="pwd" class="a" placeholder="Password" required="" style="background-color: white; border-radius:4px"  /><span id="mt" style="color: red"></span>
            </div>
            <div class="form-w3layouts-fields">
                <input type="password" name="pwds"  id="pwds" class="a"  placeholder="Passwords" required="" style="background-color: white; border-radius:4px" />
            </div>
            <div class="form-w3layouts-fields">
                <textarea name="tele" placeholder="Tele..."  id="tele" class="a" required="" style="background-color: white; border-radius:4px"></textarea>
            </div>
            <input type="button" id="button" disabled="disabled" value="Send" >
        </form>
    </div>
    <!-- // Contact form -->
</div>
<div class="clear"></div>

<!--//background-->


<script type="text/javascript" src="juery/jquery-3.3.1.min.js"></script>
<script>
    $(function () {
        var n;
        var p;
        var ps;
        var t;
        $(".a").blur(function () {
            n=$("#name").val();
            p=$("#pwd").val();
            ps=$("#pwds").val();
            t=$("#t").val();
            console.log(n)
            $.ajax({
                url:"doregister",
                type:"get",
                data:{"name":n,"pwd":p,"pwds":ps,"tele":t},
                success:function (result) {

                    if (result=="1"){
                        $("#mo").text("用户名已存在").css("color","red");
                    }
                    if (result=="4"){
                        $("#mo").text("用户名可用").css("color","white");
                    }
                    if (result=="42"){
                        $("#mt").text("两次密码不一致").css("color","red");
                    }
                    if (result=="43"){
                        $("#mo").text("用户名可用").css("color","white");
                        $("#mt").text("密码一致").css("color","white");
                        $("#button").attr("disabled",false);
                    }

                }
            })
        })

        $("#button").click(function () {
            $.ajax({
                url:"doadd",
                type:"post",
                data:{"name":n,"pwd":p,"pwds":ps,"tele":t},
                success:function (data) {
                    if (data>0){
                        alert("注册成功");
                        window.location.href="http://localhost:8080/webManager/login";
                    }
                }
            })
        })
    })
</script>
</body>
</html>
