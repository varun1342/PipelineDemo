//package com.wipro.ProductService.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.wipro.ProductService.entity.Product;
//import com.wipro.ProductService.repository.ProductRepository;
//
//@Service
//public class ProductService {
//
//    @Autowired
//    ProductRepository repo;
//
//    public Product saveProduct(Product p) {
//        return repo.save(p);
//    }
//
//    public List<Product> getProducts() {
//        return repo.findAll();
//    }
//
//    public Product getProduct(int id) {
//        return repo.findById(id).orElse(null);
//    }
//}