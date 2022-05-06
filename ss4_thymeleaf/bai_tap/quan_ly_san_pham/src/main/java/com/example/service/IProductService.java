package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(Integer productId, Product product);

    void remove(Integer productId);
    List<Product> findByName(String name);

}
