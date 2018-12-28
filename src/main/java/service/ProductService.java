package service;

import pojo.Product;

import java.util.List;

public interface ProductService {
    public List<Product> lists();
    public int inser(Product product);
    public int up(Product product);
    public int dl(int pid);
     Product getoness(int pid);
     int deletebrandId(Integer brandId);
     List<Product> getResulet(String text);
}
