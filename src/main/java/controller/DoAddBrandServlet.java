package controller;

import pojo.Brand;
import service.BrandService;
import service.BrandServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doaddbrand")
public class DoAddBrandServlet extends HttpServlet {

                BrandService brandService=new BrandServiceimpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name =req.getParameter("name");
        String des= req.getParameter("des");
        Brand brand=new Brand();
        brand.setBrandName(name);
        brand.setBranDesc(des);
        brandService.addBarnds(brand);
        resp.sendRedirect("brandcud");
    }
}
