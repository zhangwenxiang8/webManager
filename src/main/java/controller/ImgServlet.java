package controller;

import pojo.Product;
import service.ProductService;
import service.ProductServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;

@MultipartConfig
@WebServlet("/addsbm")
public class ImgServlet extends HttpServlet {
    private ProductService service=new ProductServiceimpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        Part part =req.getPart("url");
        String str="D:\\12.21项目\\webManager\\src\\main\\webapp\\images\\"+part.getSubmittedFileName();
        String url= str.substring(str.indexOf("images"));
        File file= new File(str);


        OutputStream outputStream=new FileOutputStream(file);

        byte[] b=new byte[1024];
        InputStream inputStream=part.getInputStream();
        int r= inputStream.read(b,0,b.length);
        while(r!=-1){
            outputStream.write(b);
            r = inputStream.read(b,0,b.length);
        }

//        int id=Integer.parseInt(req.getParameter("pid"));
        String name =req.getParameter("name");
        double price= Double.parseDouble(req.getParameter("price"));
        String des = req.getParameter("des");
//        int count =Integer.parseInt( req.getParameter("count"));
//        System.out.println(id+""+count);

        Product p=new Product();
//        p.setBrandId(id);
        p.setProductName(name);
        p.setPrice(price);
        p.setUrl(url);
        p.setProductDes(des);
//        p.setCount(count);
        service.inser(p);
        resp.sendRedirect("content");
    }
}
