package com.bike;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController {
	
	@GetMapping(value="/getBrand")
	public String getBrand() {
		return "Honda";
	}

}
