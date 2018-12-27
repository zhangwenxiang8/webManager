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

@WebServlet("/doadd")
public class DoAddServlet extends HttpServlet {
    UserService userService=new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String n =req.getParameter("name");
        String p  =req.getParameter("pwd");
        String  ps =req.getParameter("pwds");
        String t =req.getParameter("tele");
        ;
        User u=new User();
        u.setUsername(n);
        u.setPassword(p);
        u.setTele(t);

       int i =userService.add(u);
        if (i>0){
            resp.getWriter().write("1");
        }else {
            resp.getWriter().write("0");
        }

    }
}
