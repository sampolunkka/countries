package com.sampol.countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CountriesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CountriesApplication.class, args);

	}
	/*
	public static void getAllCountries() {
		CountriesController controller = new CountriesController();
		System.out.println(controller.getCountries());
	}

	public static void getCountry(String name) {
		CountriesController controller = new CountriesController();
		System.out.println(controller.getCountryByName(name));
	}

	public static int multiply(int number, int multiplier) {
		return number * multiplier;
	}
*/
}
