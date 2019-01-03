package controller;

import pojo.User;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
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
               HttpSession session=req.getSession();
               Cookie ucookie=new Cookie("name",name);
               Cookie pcookie=new Cookie("password",pwd);
               ucookie.setMaxAge(60*60*24);
               pcookie.setMaxAge(60*60*24);
               resp.addCookie(ucookie);
               resp.addCookie(pcookie);
               session.setAttribute("user",user);
           }else{
               resp.getWriter().write("2");//2  密码错误
           }
        }
        else{
            resp.getWriter().write("3");//3 账号密码都错误
        }

    }
}
