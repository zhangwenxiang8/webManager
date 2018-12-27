package service;

import dao.BrandDao;
import dao.IBrandDaoimpl;
import pojo.Brand;

import java.util.List;

public class BrandServiceimpl implements BrandService {
    BrandDao brandDao=new IBrandDaoimpl();
    @Override
    public List<Brand> brandlists() {
        return brandDao.brandList();
    }

    @Override
    public int deleteBrand(int id) {
        return brandDao.deleteBrand(id);
    }

    @Override
    public int addBarnds(Brand brand) {
        return brandDao.addBrand(brand);
    }

    @Override
    public int updateBarnds(Brand brand) {
        return brandDao.updateBrand(brand);
    }

    @Override
    public Brand getones(int id) {
        return brandDao.getOneBrand(id);
    }
}
