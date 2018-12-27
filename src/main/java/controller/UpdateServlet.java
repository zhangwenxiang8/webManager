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

@WebServlet("/update")
public class UpdateServlet extends HttpServlet{
        ProductService productService=new ProductServiceimpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      int pid =Integer.parseInt(req.getParameter("pid"));
        Product p=productService.getoness(pid);
            req.setAttribute("p",p);
            req.getRequestDispatcher("WEB-INF/pages/update.jsp").forward(req,resp);
    }
}
