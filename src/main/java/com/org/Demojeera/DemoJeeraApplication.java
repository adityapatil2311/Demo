package com.org.Demojeera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DemoJeeraApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJeeraApplication.class, args);
	}

}
