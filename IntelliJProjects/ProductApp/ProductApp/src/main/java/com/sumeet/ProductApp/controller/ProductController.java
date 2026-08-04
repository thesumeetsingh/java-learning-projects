package com.sumeet.ProductApp.controller;

import com.sumeet.ProductApp.model.Product;
import com.sumeet.ProductApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/getproducts")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/getproduct/{prodId}")
    public Product getProductById(@PathVariable String prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product){
        return service.addProduct(product);
    }

    @PutMapping("/updateproduct")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/deleteproduct/{prodId}")
    public Product deleteProduct(@PathVariable String prodId){
        return service.deleteProduct(prodId);
    }
}
