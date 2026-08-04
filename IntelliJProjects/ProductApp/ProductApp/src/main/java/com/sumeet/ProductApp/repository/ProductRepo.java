package com.sumeet.ProductApp.repository;

import com.sumeet.ProductApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<Product, String> {
}
