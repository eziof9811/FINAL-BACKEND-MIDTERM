package com.example.product.controller;


import com.example.product.entity.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/{proId}")
    public Product getProductById(@PathVariable long proId){
        return productService.getProductById(proId);
    }

    @PostMapping("/products/add")
    public ResponseEntity<String> addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return new ResponseEntity<String>("Product added to database.", HttpStatus.OK);
    }

    @PutMapping("/products/update/{proId}")
    public ResponseEntity<String> updateProduct(@PathVariable long proId, @RequestBody Product product){
        productService.updateProduct(proId, product);
        return new ResponseEntity<String>("Product Updated In  Database.", HttpStatus.OK);
    }

    @DeleteMapping("/products/delete/{proId}")
    public ResponseEntity<String> deleteProduct(@PathVariable long proId){
        productService.deleteProduct(proId);
        return new ResponseEntity<String>("Product Deleted From Database.", HttpStatus.OK);
    }

}
