package service;

import pojo.Brand;

import java.util.List;

public interface BrandService {
    public List<Brand> brandlists();
    int deleteBrand(int id);
    int addBarnds(Brand brand);
    int updateBarnds(Brand brand);
    Brand getones(int id);
}
