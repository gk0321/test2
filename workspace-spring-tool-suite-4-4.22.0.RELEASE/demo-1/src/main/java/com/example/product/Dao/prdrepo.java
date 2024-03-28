package com.example.product.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.product.Entity.Product;

public interface prdrepo extends JpaRepository<Product,Integer> {

}
