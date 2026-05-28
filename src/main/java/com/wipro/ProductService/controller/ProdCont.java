//package com.wipro.ProductService.controller;
//
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.wipro.ProductService.entity.Product;
//
//@RestController
//@RequestMapping("/api")
//public class ProdCont {
//
//    @Value("${server.port}")
//    private String port;
//
//    @GetMapping("/product")
//    public Product getProduct() {
//
//        Product p = new Product();
//
//        p.setPid(101);
//        p.setPname("Laptop");
//        p.setPrice(50000);
//
//        return p;
//    }
//}