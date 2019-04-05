package com.ufal.br.organize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.ufal.br.organize.model"})
public class OrganizeApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(OrganizeApplication.class, args);
	}

}
