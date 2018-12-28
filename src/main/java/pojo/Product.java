package pojo;

import lombok.Data;

@Data
public class Product {
    private Integer pid;
    private String productName;
    private Double price;
    private String productDes;
    private String url;
    private Integer count;
    private Integer brandId;
    private String text;
}
