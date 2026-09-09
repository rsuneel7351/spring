package com.example.kcgspring.Service;

import com.example.kcgspring.product.Product;
import com.example.kcgspring.product.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    public List<Product> getProducts(){
        return this.productRepository.findAll();
    }
    public  Product createProduct(Product product){
        return this.productRepository.save(product);
    }
    public Optional<Product> getProductById(Long id){
        return this.productRepository.findById(id);
    }
    public void deleteProductById(Long id){
        this.productRepository.deleteById(id);
    }
    public Optional<Product> updateProductById(Long id, Product productDetails){
        return this.productRepository.findById(id).map(product -> {
            if(productDetails.getName()!=null){
                product.setName(productDetails.getName());
            }
            if(productDetails.getPricePerDay()!=null){
                product.setPricePerDay(productDetails.getPricePerDay());
            }
            return productRepository.save(product);
        });
    }
}
