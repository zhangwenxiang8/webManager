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

@WebServlet("/dodelete")
public class DoDeleteServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductService productlist=new ProductServiceimpl();
        List<Product> list = productlist.lists();
        req.setAttribute("list",list);
        System.out.println(list);
        req.getRequestDispatcher("WEB-INF/pages/delete.jsp").forward(req,resp);
    }
}
