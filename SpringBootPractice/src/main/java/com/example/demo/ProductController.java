package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/products")
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping("/{greet}")
	public String sayHello(@PathVariable String greet) {
		return "Hello " + greet;

	}
	
	  @PostMapping
	    public List<Product> saveProduct(@RequestBody  Product product){
	        return service.saveProduct(product);
	    }


	@GetMapping("/search/{productType}") // 404
	public ResponseEntity<?> getProducts(@PathVariable String productType) {
		List<Product> products = service.getProductByType(productType);
		return ResponseEntity.ok(products);
	}

}
