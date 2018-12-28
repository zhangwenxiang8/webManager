package controller;

import pojo.Product;
import service.ProductService;
import service.ProductServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/content")
public class ContentServlet extends HttpServlet {
    ProductService productlist=new ProductServiceimpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Product> list = productlist.lists();
        req.setAttribute("list",list);
        req.getRequestDispatcher("WEB-INF/pages/content.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
       String text =req.getParameter("text");
       if (text==""||text.equals(" ")){
           List<Product> list = productlist.lists();
           req.setAttribute("list",list);
           req.getRequestDispatcher("WEB-INF/pages/content.jsp").forward(req,resp);
       }else{
          List<Product> lists = productlist.getResulet(text);
                req.setAttribute("lists",lists);
                req.getRequestDispatcher("WEB-INF/pages/content.jsp").forward(req,resp);
       }
    }
}
