package com.sampol.countries;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountriesController {

	private CountriesService countriesService = new CountriesService();
	

	/**
	 * Retrieves countries from Service
	 * @return Countries from service wrapped in ResponceEntity
	 */
	@GetMapping(value = "/countries")
	public ResponseEntity<Object> getCountries() {
		return ResponseEntity.ok(this.countriesService.getAllCountries());
	}

	/**
	 * Sends name info to service and retrieves a country based on that name info
	 * @param name The name info specified in the GET request
	 * @return CountryWithInfo wrapped in ResponceEntity
	 */
	@GetMapping(value = "/countries/{name}")
	public ResponseEntity<Object> getCountryByName(@PathVariable String name) {
		return ResponseEntity.ok(this.countriesService.getCountryByName(name));
	}

	/**
	 * Reactive approach is not supported in this build
	 */
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