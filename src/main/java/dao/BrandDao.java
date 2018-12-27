package dao;

import pojo.Brand;

import java.util.List;

public interface BrandDao {
    public List<Brand> brandList();
    public int addBrand(Brand brand);
    public int updateBrand(Brand brand);
    int deleteBrand(int id);
    Brand getOneBrand(int id);
}
