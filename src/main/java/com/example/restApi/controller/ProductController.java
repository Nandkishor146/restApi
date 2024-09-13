package com.example.restApi.controller;

import com.example.restApi.entity.Product;
import com.example.restApi.serviceImpl.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Products")
public class ProductController {
    @Autowired
    private productService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product)
    {
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products)
    {
        return service.saveProducts(products);
    }
   @GetMapping("/getproducts")
   public List<Product> findProducts()
   {
      return service.getProducts();
   }
   @GetMapping("/getproductByID/{id}")
   public Product findById(@PathVariable int id)
   {
   return service.getProductById(id);
   }
   @PutMapping("/update")
   public Product updateProduct(@RequestBody Product product)
   {
       return service.updateProduct(product);
   }
  @DeleteMapping("/delete/{id}")
   public String deleteProduct(@PathVariable int id)
   {
       return service.deleteProduct(id);
   }
}
