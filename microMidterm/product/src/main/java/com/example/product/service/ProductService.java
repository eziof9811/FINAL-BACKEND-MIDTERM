package com.example.product.service;

import com.example.product.entity.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(long proId);
    List<Product> getAllProducts();
    void addProduct(Product product);
    void updateProduct(long proId, Product product);
    void deleteProduct(long proId);
}
