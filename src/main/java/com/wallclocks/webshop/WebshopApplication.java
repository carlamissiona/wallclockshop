package com.wallclocks.webshop;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.wallclocks.webshop.service.ClockService;
import com.wallclocks.webshop.data.ClockItem;

@SpringBootApplication
public class WebshopApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(WebshopApplication.class, args);
	}
  
public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
}

@Bean
public ApplicationRunner clocksDBInitializer(ClockService cservice) {
		return args -> {
			 cservice.create(new ClockItem("9780061120084", "Country Style Wall Clock", "Old country style clock. Original quartz.", "Quartz", "PHP 200.00" , "Vintage, Country, Wall Clocks" ));
			// bookService.create(new Book("9780451524935", "1984", "George Orwell"));
			// bookService.create(new Book("9780618260300", "The Hobbit", "J.R.R. Tolkien"));
		};
 
}

 
}
