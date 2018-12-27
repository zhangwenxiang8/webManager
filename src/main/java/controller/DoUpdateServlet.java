package controller;

import com.sun.xml.internal.bind.v2.model.core.ID;
import pojo.Product;
import service.ProductService;
import service.ProductServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doupdatee")
public class DoUpdateServlet extends HttpServlet {

        ProductService productService=new ProductServiceimpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     int id =Integer.parseInt(req.getParameter("id"));
     String name =req.getParameter("name");
    double price =Double.parseDouble(req.getParameter("price"));
     String des =req.getParameter("des");
                   String url =req.getParameter("url");
        System.out.println(id+""+name+price+des);
        Product product=new Product();
        product.setPid(id);
        product.setProductName(name);
        product.setPrice(price);
        product.setProductDes(des);
        product.setUrl(url);
     productService.up(product);
    System.out.println(id+" "+name);
        resp.sendRedirect("doupdate");
    }
}
