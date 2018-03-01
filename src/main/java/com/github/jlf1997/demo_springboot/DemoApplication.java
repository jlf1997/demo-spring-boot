package com.github.jlf1997.demo_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.jlf1997.spring_boot_sdk.convert.EnableHttpConvert;
import com.github.jlf1997.spring_boot_sdk.swagger.EnableSwagger2Doc;





@SpringBootApplication
@EnableSwagger2Doc
@EnableHttpConvert
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
		
	}

	

	
		
	
	
	
	

	


	


}
