package com.ProductDao;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

import com.ProductEntity.ProductEntity;

	@Repository
	public class Dao {
		@Autowired
		Productrepo Productdrepo;
		public String insertall(List<ProductEntity> e) {
			Productrepo.saveAll(e);
			return "All record saved succesfully";
		}

		public List<ProductEntity> getall() {
			return Productrepo.findAll();
		}

}
