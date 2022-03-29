package com.sampol.countries;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;



@RestController
public class CountriesController {

	private WebClient webClient = WebClient.builder().build();

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

	@GetMapping(value = "/reactive/countries")
	public Flux<CountryShortened> getReactiveCountries() {
		return webClient.get()
		.uri("https://restcountries.com/v3.1/all")
		.retrieve()
		.bodyToFlux(CountryShortened.class);
	}

	@GetMapping(value = "/reactive/countries/{name}")
	public Flux<CountryFull> getReactiveCountryByName(@PathVariable String name) {
		return webClient.get()
		.uri("https://restcountries.com/v3.1/name/{name}", name)
		.retrieve()
		.bodyToFlux(CountryFull.class);
	}
}
