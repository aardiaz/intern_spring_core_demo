package com.annot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //starts spring container
@ComponentScan(basePackages = {"com.annot"})
public class AppConfig {
	
	@Bean//(name = "std")
	public  Student getStudentBean() {
		
		return new Student();
	}
	
   
}
