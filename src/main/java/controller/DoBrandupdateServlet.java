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

@WebServlet("/brandupdate")
public class DoBrandupdateServlet extends HttpServlet {
        BrandService brandService=new BrandServiceimpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int id =Integer.parseInt(req.getParameter("id"));


          Brand lists =brandService.getones(id);
         req.setAttribute("brandlist",lists);

        req.getRequestDispatcher("WEB-INF/pages/brandupdate.jsp").forward(req,resp);
    }
}
