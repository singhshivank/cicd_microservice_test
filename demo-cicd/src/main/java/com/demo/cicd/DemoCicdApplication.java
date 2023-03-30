package com.demo.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoCicdApplication {
	
	@GetMapping("/test")
	public String test() {
		return "TESTING CICD project";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoCicdApplication.class, args);
	}

}
