package pojo;

import lombok.Data;

import java.util.Set;

@Data
public class Brand {
    private Integer id;
    private String brandName;
    private String branDesc;
     private Set<Product> sets;
}
