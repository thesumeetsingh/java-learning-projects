package com.sumeet.ProductApp.service;


import com.sumeet.ProductApp.model.Product;
import com.sumeet.ProductApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(
//            Arrays.asList(
//                    new Product("electronic", "el01", "bajaj fan", 2000),
//                    new Product("stationary", "st01", "natraj pencil", 10),
//                    new Product("electronic", "el02", "cooler", 12000),
//                    new Product("hygiene", "hg01", "dettol handwash", 200),
//                    new Product("cosmetics", "cs01", "loreal lipstick", 200)
//            )
//    );

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(String prodId) {

//        return products.stream().filter(p-> p.getProdId().equals(prodId)).findFirst().get();

        return repo.findById(prodId).orElse(new Product());
    }

    public Product addProduct(Product product) {

//        products.add(product);
        repo.save(product);
        return product;

    }

    public Product updateProduct(Product product) {
//        boolean flag=false;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId().equals(product.getProdId())){
//                products.set(i, product);
//                flag=true;
//            }
//        }
//        if(!flag){
//            products.add(product);
//        }

        repo.save(product);
        return product;
    }

    public Product deleteProduct(String prodId) {
//
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId().equals(prodId)){
//                return products.remove(i);
//            }
//        }

        repo.deleteById(prodId);

        return null;
    }
}
