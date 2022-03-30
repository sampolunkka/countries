package com.sampol.countries;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountriesController {

	private CountriesService countriesService = new CountriesService();

	@GetMapping(value = "/countries")
	public ResponseEntity getCountries() {
		return ResponseEntity.ok(this.countriesService.getAllCountries());
	}

	@GetMapping(value = "/countries/{name}")
	public ResponseEntity getCountryByName(@PathVariable String name) {
		return ResponseEntity.ok(this.countriesService.getCountryByName(name));
	}
	/*
	@GetMapping(value = "/reactive/countries")
	public Flux<Country> getReactiveCountries() {
		return webClient.get()
				.uri("https://restcountries.com/v3.1/all")
				.retrieve()
				.bodyToFlux(Country.class);
	}

	@GetMapping(value = "/reactive/countries/{name}")
	public Flux<CountryWithInfo> getReactiveCountryByName(@PathVariable String name) {
		return webClient.get()
				.uri("https://restcountries.com/v3.1/name/{name}", name)
				.retrieve()
				.bodyToFlux(CountryWithInfo.class);
	}
	*/
}