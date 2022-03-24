package com.sampol.countries;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.json.*;
import org.springframework.http.ResponseEntity;

@RestController
public class CountriesController {

	
	@GetMapping(value = "/countries")
	public List<Country> getCountries() { 
		String url = "https://restcountries.com/v3.1/all";
		RestTemplate restTemplate = new RestTemplate();
		Country[] countries = restTemplate.getForObject(url, Country[].class);
		return Arrays.asList(countries);
	}

	@GetMapping(value = "/countries/{name}")
	public List<Country> getCountryByName(@PathVariable String name) {
		String url = "https://restcountries.com/v3.1/name/" + name;
		RestTemplate restTemplate = new RestTemplate();
		Country[] countries = restTemplate.getForObject(url, Country[].class);
		return Arrays.asList(countries);
	}
}
