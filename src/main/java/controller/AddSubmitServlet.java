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

@WebServlet("/addsbm")
public class AddSubmitServlet extends HttpServlet {

    ProductService productService= new ProductServiceimpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
              String name  =req.getParameter("name");
            double price = Double.parseDouble(req.getParameter("price"));
               String des =req.getParameter("des");
             String url =req.getParameter("url");
               System.out.println(name +""+price);
        Product product=new Product();
        product.setProductName(name);
        product.setPrice(price);
        product.setProductDes(des);
        product.setUrl(url);
        productService.inser(product);
        resp.sendRedirect("content");
    }
}
