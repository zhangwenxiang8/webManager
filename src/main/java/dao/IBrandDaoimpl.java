package dao;


import Jdbcutil.JdbcUtil;
import Jdbcutil.Ronmap;
import pojo.Brand;
import pojo.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IBrandDaoimpl implements BrandDao {

    @Override
    public List<Brand> brandList() {
        return JdbcUtil.R("select * from brand,product where brand.id=product.brand_id",new Ronmap<Brand>() {
            @Override
            public Brand RowMapping(ResultSet rs) {
               Brand brand=new Brand();
                try {
                    brand.setId(rs.getInt("id"));
                    brand.setBrandName(rs.getString("brand_name"));
                    brand.setBranDesc(rs.getString("brand_desc"));
                    Set<Product> sets=new HashSet<>();
                     Product p=new Product();
                     p.setProductName(rs.getString("product_name"));
                     sets.add(p);
                     brand.setSets(sets);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return brand;
            }
        }, null);
    }

    @Override
    public int addBrand(Brand brand) {
        return JdbcUtil.CUD("insert into brand(brand_name,brand_desc) values(?,?)",brand.getBrandName(),brand.getBranDesc());
    }

    @Override
    public int updateBrand(Brand brand) {
        return JdbcUtil.CUD("update brand set brand_name=?,brand_desc=? where id=?",brand.getBrandName(),brand.getBranDesc(),brand.getId());
    }

    @Override
    public int deleteBrand(int id) {
        return JdbcUtil.CUD("delete from brand where id=?",id);
    }

    @Override
    public Brand getOneBrand(int id) {
        return JdbcUtil.getone("select * from brand where id=?", new Ronmap<Brand>() {
            @Override
            public Brand RowMapping(ResultSet rs) {
                Brand brand=new Brand();
                try {
                    brand.setId(rs.getInt("id"));
                    brand.setBrandName(rs.getString("brand_name"));
                    brand.setBranDesc(rs.getString("brand_desc"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return brand;
            }
        },id);
    }


}
