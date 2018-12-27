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
import java.util.List;

@WebServlet("/brand")
public class ListBrandServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BrandService service=new BrandServiceimpl();
       List<Brand> list =service.brandlists();
        req.setAttribute("list",list);
        req.getRequestDispatcher("WEB-INF/pages/listbrand.jsp").forward(req,resp);
    }
}
