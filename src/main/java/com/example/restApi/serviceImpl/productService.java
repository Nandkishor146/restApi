package com.example.restApi.serviceImpl;

import com.example.restApi.entity.Product;
import com.example.restApi.repository.productRepository;
import com.example.restApi.service.productInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class productService implements productInter {
    @Autowired
    private productRepository repository;
    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    @Override
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Product Removed"+id;
    }

    @Override
    public Product updateProduct(Product product) {
        Product existingProduct=repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
         return repository.save(existingProduct);
    }
}
