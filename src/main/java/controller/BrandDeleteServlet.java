package controller;

import service.BrandService;
import service.BrandServiceimpl;
import service.ProductService;
import service.ProductServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deletebrand")
public class BrandDeleteServlet extends HttpServlet {
        ProductService productService=new ProductServiceimpl();
        BrandService brandService=new BrandServiceimpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int id =Integer.parseInt(req.getParameter("id"));
        brandService.deleteBrand(id);
        productService.deletebrandId(id);
        resp.sendRedirect("brandcud");
    }
}
