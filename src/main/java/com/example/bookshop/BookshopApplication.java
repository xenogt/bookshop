package com.example.bookshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class BookshopApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BookshopApplication.class, args);
	}

}
