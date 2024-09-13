package com.example.restApi.service;

import com.example.restApi.entity.Product;
import java.util.List;
import java.util.Optional;


public interface productInter {
Product saveProduct (Product product);
List<Product> saveProducts(List<Product> products);
List<Product> getProducts();
Product getProductById(int id);
String deleteProduct(int id);
Product updateProduct(Product product);

}
