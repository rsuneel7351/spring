package com.example.kcgspring.controller;

import com.example.kcgspring.Service.ProductService;
import com.example.kcgspring.dto.ProductCreateRequest;
import com.example.kcgspring.dto.ProductPatchRequest;
import com.example.kcgspring.product.Product;
import jakarta.validation.Valid;
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
    public ResponseEntity<Product> createProduct(@Valid @RequestBody ProductCreateRequest request){
        Product createProduct=productService.createProduct(request);
        return ResponseEntity.ok(createProduct);
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
    public ResponseEntity<Product> updateProductById(@PathVariable Long id ,@RequestBody ProductPatchRequest request){
        return productService.updateProductById(id,request).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
