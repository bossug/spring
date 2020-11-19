package ru.spring.lessons1;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productList = new ArrayList<>();

    public ProductRepository() {

    }
    @PostConstruct
    public void init(){
        productList.add(new Product(12L,"apple",100.0));
        productList.add(new Product(13L,"orange",110.0));
        productList.add(new Product(14L,"lemon",150.0));
    }

    public List<Product> findAll(){
        return Collections.unmodifiableList(productList);
    }
    public void addProduct(Product product){
        productList.add(product);
    }
}
