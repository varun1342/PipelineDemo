package com.wipro.ProductService.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/{id}")
    public String getProduct(@PathVariable int id) {

        logger.info("************** Inside Product Service **************");

        return "Laptop Product Id : " + id;
    }
}
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.wipro.ProductService.entity.Product;
//import com.wipro.ProductService.service.ProductService;
//
//@RestController
//public class ProductController {
//
//    @Autowired
//    ProductService service;
//
//    @GetMapping("/test")
//    public String test() {
//        return "Product Service Working Successfully";
//    }
//
//    @PostMapping("/save")
//    public Product saveProduct(@RequestBody Product p) {
//        return service.saveProduct(p);
//    }
//
//    @GetMapping("/products")
//    public List<Product> getAllProducts() {
//        return service.getProducts();
//    }
//
//    @GetMapping("/products/{id}")
//    public Product getProductById(@PathVariable int id) {
//        return service.getProduct(id);
//    }
//}