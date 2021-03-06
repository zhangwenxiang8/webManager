package dao;

import Jdbcutil.JdbcUtil;
import Jdbcutil.Ronmap;
import pojo.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductDaoimpl implements ProductDao {

    @Override
    public List<Product> Listss() {
        return JdbcUtil.R("select * from product", new Ronmap<Product>() {
            @Override
            public Product RowMapping(ResultSet rs) {
                Product product=new Product();
                try {
                    product.setPid(rs.getInt("product_id"));
                    product.setProductName(rs.getString("product_name"));
                    product.setPrice(rs.getDouble("price"));
                    product.setProductDes(rs.getString("product_des"));
                    product.setUrl(rs.getString("url"));
                    product.setCount(rs.getInt("count"));
                    product.setBrandId(rs.getInt("brand_id"));

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return  product;
            }
        }, null);
    }

    @Override
    public int add(Product product) {
        return JdbcUtil.CUD("insert into product(product_name,price,product_des,url)values(?,?,?,?)",product.getProductName(),product.getPrice(), product.getProductDes(),product.getUrl());
    }

    @Override
    public int update(Product product) {  //根据id来修改
        return JdbcUtil.CUD("update product set product_name=?,price=?,product_des=?,url=? where product_id=?",product.getProductName(),product.getPrice(),product.getProductDes(),product.getUrl(),product.getPid());
    }

    @Override
    public int delete(int pid) {   //删除没值就是全删
        return JdbcUtil.CUD("delete from product where product_id=?",pid);  //这里记得动态绑定参数.
    }

    @Override
    public Product getones(int pid) {
        return JdbcUtil.getone("select * from product where product_id=?", new Ronmap<Product>() {
            @Override
            public Product RowMapping(ResultSet rs) {
                Product product=new Product();
                try {
                    product.setPid(rs.getInt("product_id"));
                    product.setProductName(rs.getString("product_name"));
                    product.setPrice(rs.getDouble("price"));
                    product.setProductDes(rs.getString("product_des"));
                    product.setUrl(rs.getString("url"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                    return product;
            }

        }, pid);
    }

    @Override
    public int delte(Integer brandId) {
        return JdbcUtil.CUD("delete from product where brandId=?",brandId);
    }

    @Override
    public List<Product> getResults(String text) {
        return JdbcUtil.R("select * from product where product_name like concat('%',?,'%') ", new Ronmap<Product>() {
            @Override
            public Product RowMapping(ResultSet rs) {
                Product product = new Product();
                try {
                    product.setPid(rs.getInt("product_id"));
                    product.setProductName(rs.getString("product_name"));
                    product.setPrice(rs.getDouble("price"));
                    product.setProductDes(rs.getString("product_des"));
                    product.setUrl(rs.getString("url"));
                    product.setCount(rs.getInt("count"));

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return product;
            }
        },text);
    }
    @Override
    public List<Product> getLists(int pageNo, int pageSize) {
        return JdbcUtil.R("select * from product limit ?,?", new Ronmap<Product>() {
            @Override
            public Product RowMapping(ResultSet resultSet) {
                Product p = new Product();
                try {
                    p.setPid(resultSet.getInt("product_id"));
                    p.setPrice(resultSet.getDouble("price"));
                    p.setProductDes(resultSet.getString("product_des"));
                    p.setProductName(resultSet.getString("product_name"));
                    p.setUrl(resultSet.getString("url"));
                    p.setCount(resultSet.getInt("count"));
                    p.setBrandId(resultSet.getInt("brand_id"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return p;
            }
        }, (pageNo - 1) * pageSize, pageSize);
    }

    @Override
    public List<Product> getLists(int pageNo, int pageSize, String text) {
        return JdbcUtil.R("select * from product  where product_name like concat('%',?,'%') limit ?,?", new Ronmap<Product>() {
            @Override
            public Product RowMapping(ResultSet resultSet) {
                Product p = new Product();
                try {
                    p.setPid(resultSet.getInt("product_id"));
                    p.setUrl(resultSet.getString("url"));
                    p.setPrice(resultSet.getDouble("price"));
                    p.setProductDes(resultSet.getString("product_des"));
                    p.setProductName(resultSet.getString("product_name"));
                    p.setCount(resultSet.getInt("count"));
                    p.setBrandId(resultSet.getInt("brand_id"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return p;
            }
        }, text, (pageNo - 1) * pageSize, pageSize);
    }


    @Override
    public int getCount() {
        return JdbcUtil.executeCount("select count(*) from product",null);
    }

    @Override
    public int getCount(String text) {
        return JdbcUtil.executeCount("select count(*) from product where product_name like concat('%',?,'%') ",text);
    }

}
