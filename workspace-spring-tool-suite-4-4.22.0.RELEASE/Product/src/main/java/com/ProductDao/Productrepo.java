package com.ProductDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProductEntity.ProductEntity;

public interface Productrepo  extends JpaRepository<ProductEntity,Integer> {

}
