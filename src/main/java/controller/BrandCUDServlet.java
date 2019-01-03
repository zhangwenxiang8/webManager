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

@WebServlet("/brandcud")
public class BrandCUDServlet extends HttpServlet {
    BrandService service=new BrandServiceimpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
      List<Brand> listbrand= service.brandlists();
            req.setAttribute("listbrand",listbrand);
            req.getRequestDispatcher("WEB-INF/pages/brandcrud.jsp").forward(req,resp);
    }
}
