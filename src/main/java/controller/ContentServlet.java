package controller;

import pojo.Brand;
import pojo.Product;
import pojo.ResultData;
import service.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/content")
public class ContentServlet extends HttpServlet {
    ProductService productlist=new ProductServiceimpl();
    private UserService userService=new UserServiceImpl();
    private BrandService brandService=new BrandServiceimpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int pageNo = req.getParameter("pageNo")==null?1:Integer.parseInt(req.getParameter("pageNo"));
        int pageSize=3;

        List<Brand> brand = brandService.brandlists();
        req.setAttribute("brand",brand);


        List<Product> lists = productlist.lists();
        req.setAttribute("lists", lists);

        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("content-type", "text/html;charset=UTF-8");
        String text = req.getParameter("text");

        if(text==""||text==null){
            ResultData data  = productlist.lists(pageNo,pageSize);
            data.setUrl("list","");
            req.setAttribute("data",data);
            if (user==null){
                User user1 = uservice.getUser(username);
                session.setAttribute("user",user1);
                req.getRequestDispatcher("WEB-INF/pages/list.jsp").forward(req,resp);

            }else {
                req.getRequestDispatcher("WEB-INF/pages/list.jsp").forward(req,resp);
            }
        }else{
            ResultData data = iservice.getLists(pageNo,pageSize,text);
            String params="&text="+text;
            data.setUrl("list",params);
            req.setAttribute("text",text);
            req.setAttribute("data",data);
            if (user==null){
                User user1 = uservice.getUser(username);
                session.setAttribute("user",user1);
                req.getRequestDispatcher("WEB-INF/pages/list.jsp").forward(req,resp);

            }else {
                req.getRequestDispatcher("WEB-INF/pages/list.jsp").forward(req,resp);
            }
        }

        List<Product> list = productlist.lists();
        req.setAttribute("list",list);
        req.getRequestDispatcher("WEB-INF/pages/content.jsp").forward(req,resp);
    }









//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("utf-8");
//       String text =req.getParameter("text");
//
//       if (text==""||text.equals(" ")){
//           List<Product> list = productlist.lists();
//           req.setAttribute("list",list);
//           req.getRequestDispatcher("WEB-INF/pages/content.jsp").forward(req,resp);
//       }else{
//          List<Product> lists = productlist.getResulet(text);
//            System.out.println(lists);
//            req.setAttribute("list",lists);
//            req.getRequestDispatcher("WEB-INF/pages/content.jsp").forward(req,resp);
//       }
    }
}
