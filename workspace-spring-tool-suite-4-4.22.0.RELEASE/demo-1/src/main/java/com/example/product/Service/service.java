package com.example.product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.Dao.dao;
import com.example.product.Entity.Product;
@Service
public class service {
	@Autowired
	dao prddao;
	public String insertall(List<Product> e) {
		return prddao.insertall(e);
	}

	public List<Product> getall() {
		return prddao.getall();
	}

}
