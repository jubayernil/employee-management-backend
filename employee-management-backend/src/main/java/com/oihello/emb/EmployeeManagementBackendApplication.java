package com.oihello.emb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class EmployeeManagementBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementBackendApplication.class, args);
	}

}
