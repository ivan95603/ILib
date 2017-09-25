package com.ivan.diplomski;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class DiplomskiRadApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiplomskiRadApplication.class, args);
	}
}
