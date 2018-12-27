package controller;

import pojo.User;
import service.UserService;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doregister")
public class DoRegisterServlet extends HttpServlet {

    UserService u=new UserServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String name =req.getParameter("name");
      String pwd= req.getParameter("pwd");
       String pwds= req.getParameter("pwds");
       String tele= req.getParameter("tele");

       System.out.println(name);

       if (name!=""){
           User user=u.getonee(name);
           if (user==null){
               resp.getWriter().write("4");
               if (pwd!=""&&pwd!=" "){
                   if (pwd.equals(pwds)){
                       System.out.println(pwd);
                   resp.getWriter().write("3");
               }else{
                   resp.getWriter().write("2");
               }
           }
           }
           else{
               resp.getWriter().write("1");
           }
//           System.out.println(name+""+pwd);
       }

    }
}
