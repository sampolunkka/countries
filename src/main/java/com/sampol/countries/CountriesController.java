package com.sampol.countries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CountriesController {
	
	public List<Object> getCountries() { 
		String url = "https://restcountries.com/v3.1/all";
		RestTemplate restTemplate = new RestTemplate();
		Object[] countries = restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(countries);
	}

	public List<Object> getCountryByName(String name) {
		String url = "https://restcountries.com/v3.1/name/" + name;
		RestTemplate restTemplate = new RestTemplate();
		Object[] countries = restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(countries);
	}

}
