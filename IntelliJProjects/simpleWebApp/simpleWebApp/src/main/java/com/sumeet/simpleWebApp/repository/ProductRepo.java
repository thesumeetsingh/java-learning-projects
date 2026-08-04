package com.sumeet.simpleWebApp.repository;

import com.sumeet.simpleWebApp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<Product, String> {
}
