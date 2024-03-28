package com.ProductService;


	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ProductDao.Dao;
import com.ProductEntity.ProductEntity;
	@org.springframework.stereotype.Service
	public class Service {
		@Autowired
		Dao prddao;
		public String insertall(List<ProductEntity> e) {
			return prddao.insertall(e);
		}

		public List<ProductEntity> getall() {
			return prddao.getall();
		}

}
