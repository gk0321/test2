package com.example.product.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.example.product.Entity.Product;

@Repository
public class dao {
	@Autowired
	prdrepo prdrepo;
	public String insertall(List<Product> e) {
		prdrepo.saveAll(e);
		return "All record saved succesfully";
	}

	public List<Product> getall() {
		return prdrepo.findAll();
	}

}