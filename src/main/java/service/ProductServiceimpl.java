package service;

import dao.ProductDao;
import dao.ProductDaoimpl;
import pojo.Product;
import pojo.ResultData;

import java.util.List;

public class ProductServiceimpl  implements ProductService{
    ProductDao productDao=new ProductDaoimpl();
    @Override
    public List<Product> lists() {
        return productDao.Listss();
    }

    @Override
    public int inser(Product product) {
        return productDao.add(product);
    }

    @Override
    public int up(Product product) {
        return productDao.update(product);
    }

    @Override
    public int dl(int pid) {
        return productDao.delete(pid);
    }

    @Override
    public Product getoness(int pid) {
        return productDao.getones(pid);
    }

    @Override
    public int deletebrandId(Integer brandId) {
        return productDao.delte(brandId);
    }

    @Override
    public List<Product> getResulet(String text) {
        return productDao.getResults(text);
    }

    @Override
    public ResultData getLists(int pageNo, int pageSize, String text) {
        ResultData data = new ResultData(pageNo,pageSize,productDao.getCount(text));
        data.setLists(productDao.getLists(pageNo,pageSize,text));
        return data;
    }

    @Override
    public ResultData getLists(int pageNo, int pageSize) {
        ResultData data = new ResultData(pageNo,pageSize,productDao.getCount());
        data.setLists(productDao.getLists(pageNo,pageSize));
        return data;
    }

}
