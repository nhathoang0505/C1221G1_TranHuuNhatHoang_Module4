package com.example.service.impl;

import com.example.model.Product;
import com.example.repository.IProductRepository;
import com.example.repository.impl.ProductRepositoryImpl;
import com.example.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements IProductService {
    IProductRepository productRepository = new ProductRepositoryImpl();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void update(Integer productId, Product product) {
        productRepository.update(productId, product);
    }

    @Override
    public void remove(Integer productId) {
        productRepository.remove(productId);
    }
}
