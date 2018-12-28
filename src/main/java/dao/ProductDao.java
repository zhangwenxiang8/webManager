package dao;

import pojo.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> Listss();

    int add(Product product);
    int update(Product product);
    int delete(int pid);
    Product getones(int pid);
    int delte(Integer brandId);
    public List<Product> getResults(String text);
}
