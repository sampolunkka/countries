package com.sampol.countries;

import org.springframework.web.client.RestTemplate;
import java.util.Arrays;

public class CountriesService {

    public CountryWrapper getAllCountries() {
		String url = "https://restcountries.com/v3.1/all";
		RestTemplate restTemplate = new RestTemplate();
		Country[] countries = restTemplate.getForObject(url, Country[].class);
		return new CountryWrapper(Arrays.asList(countries));
    }

    public CountryWithInfo getCountryByName(String name) {
		String url = "https://restcountries.com/v3.1/name/" + name;
		RestTemplate restTemplate = new RestTemplate();
		CountryWithInfo[] countries = restTemplate.getForObject(url, CountryWithInfo[].class);
		CountryWithInfo mostRelevantResult = countries[0];
		return mostRelevantResult;
	}

    
    
}
