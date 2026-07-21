package com.sumeet.simpleWebApp.Service;

import com.sumeet.simpleWebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    List<Product> products = new ArrayList<>(
            Arrays.asList(
                    new Product("electronic", "el01", "bajaj fan", 2000),
                    new Product("stationary", "st01", "natraj pencil", 10),
                    new Product("electronic", "el02", "cooler", 12000),
                    new Product("hygiene", "hg01", "dettol handwash", 200),
                    new Product("cosmetics", "cs01", "loreal lipstick", 200)
            )
    );

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(String prodId) {

        return products.stream().filter(p-> p.getProdId().equals(prodId)).findFirst().get();
    }

    public Product addProduct(Product product) {

        products.add(product);
        return product;
    }

    public Product updateProduct(Product product) {
        boolean flag=false;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId().equals(product.getProdId())){
                products.set(i, product);
                flag=true;
            }
        }
        if(!flag){
            products.add(product);
        }
        return product;
    }

    public Product deleteProduct(String prodId) {

        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId().equals(prodId)){
                return products.remove(i);
            }
        }

        return null;
    }
}
