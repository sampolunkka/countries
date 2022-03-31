package com.sampol.countries;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;

import com.sampol.countries.dtos.Country;
import com.sampol.countries.dtos.CountryWithInfo;
import com.sampol.countries.dtos.CountryWrapper;

@Service
public class CountriesService {
	/**
	 * Queries restcountries.com for all the countries
	 * Response is serialized as a list of Country dtos and wrapped in CountryWrapped
	 * @return wrapped response as "countries:" ...
	 */
    public CountryWrapper getAllCountries() {
		String url = "https://restcountries.com/v3.1/all";
		RestTemplate restTemplate = new RestTemplate();
		Country[] countries = restTemplate.getForObject(url, Country[].class);
		return new CountryWrapper(Arrays.asList(countries));
    }

	/**
	 * Queries restcountries.com a countries matching the name string
	 * Response is serialized as a List of CountryWithInfo dtos
	 * @param name name of the country to find
	 * @return the first country in the list of countries matching the search criteria
	 */
    public CountryWithInfo getCountryByName(String name) {
		String url = "https://restcountries.com/v3.1/name/" + name;
		RestTemplate restTemplate = new RestTemplate();
		CountryWithInfo[] countries = restTemplate.getForObject(url, CountryWithInfo[].class);
		CountryWithInfo mostRelevantResult = countries[0];
		return mostRelevantResult;
	}

    
    
}
