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

@WebServlet("/addbrand")
public class AddBrandServlet extends HttpServlet {

//                BrandService brandService=new BrandServiceimpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//          List<Brand> brandlists =brandService.brandlists();
//            req.setAttribute("addlist",brandlists);
            req.getRequestDispatcher("WEB-INF/pages/addbrand.jsp").forward(req,resp);
    }
}
