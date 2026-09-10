package com.example.kcgspring.Service;

import com.example.kcgspring.dto.ProductCreateRequest;
import com.example.kcgspring.dto.ProductPatchRequest;
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
    public  Product createProduct(ProductCreateRequest request){
       Product product=new Product();
       product.setName(request.getName());
       product.setPricePerDay(request.getPricePerDay());
       return this.productRepository.save(product);
    }
    public Optional<Product> getProductById(Long id){
        return this.productRepository.findById(id);
    }
    public void deleteProductById(Long id){
        this.productRepository.deleteById(id);
    }
    public Optional<Product> updateProductById(Long id, ProductPatchRequest request){
        return this.productRepository.findById(id).map(product -> {
            if(request.getName()!=null){
                product.setName(request.getName());
            }
            if(request.getPricePerDay()!=null){
                product.setPricePerDay(request.getPricePerDay());
            }
            return productRepository.save(product);
        });
    }
}
