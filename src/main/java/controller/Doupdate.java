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
@WebServlet("/doupdate")
public class Doupdate extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        ProductService productlist=new ProductServiceimpl();
        List<Product> list = productlist.lists();
        req.setAttribute("list",list);
        System.out.println(list);
        req.getRequestDispatcher("WEB-INF/pages/updatepage.jsp").forward(req,resp);
    }
}
