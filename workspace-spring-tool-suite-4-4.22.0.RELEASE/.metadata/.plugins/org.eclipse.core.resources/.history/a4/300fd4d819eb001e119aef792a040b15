package com.ProductController;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.ProductEntity.ProductEntity;

	@RestController
	@RequestMapping(value="/product")
	public class Controller {
		@Autowired
		Service prdserv;
		@PostMapping("/insertAll")
		public  String insertall(@RequestBody List<ProductEntity> e) {
			return prdserv.insertall(e);

		
	}


}
