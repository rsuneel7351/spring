package com.example.kcgspring.controller;

import com.example.kcgspring.Service.ProductService;
import com.example.kcgspring.product.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;
    public ProductController( ProductService productService){
        this.productService=productService;
    }

    @GetMapping
    public List<Product> getProduct() {
        return productService.getProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductbyId(@PathVariable Long id){
        return productService.getProductById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id){
        productService.deleteProductById(id);
    }
    @PatchMapping("/{id}")
    public ResponseEntity<Product> updateProductById(@PathVariable Long id ,@RequestBody Product productDetails){
        return productService.updateProductById(id,productDetails).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
