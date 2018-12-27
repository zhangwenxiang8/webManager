package controller;

import pojo.User;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dologin")
public class DoLoginServlet extends HttpServlet {
    UserServiceImpl userService=new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name=req.getParameter("name");
      String pwd = req.getParameter("password");
/*
      System.out.println(name+""+pwd);
*/
        User user=userService.getonee(name);
        if (user!=null){
           if (user.getPassword().equals(pwd)){

               resp.getWriter().write("1");//1 成功登入
           }else{
               resp.getWriter().write("2");//2  密码错误
           }
        }
        else{
            resp.getWriter().write("3");//3 账号密码都错误
        }

    }
}
