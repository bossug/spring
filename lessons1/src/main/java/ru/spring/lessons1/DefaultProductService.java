package ru.spring.lessons1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("productService")
public class DefaultProductService implements ProductService{

    private ProductRepository productRepository;

    @Override
    public List<Product> getProductList(){
        return productRepository.findAll();
    }
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
