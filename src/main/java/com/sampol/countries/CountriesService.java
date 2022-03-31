package com.sampol.countries;

import com.sampol.countries.dtos.*;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;

import com.sampol.countries.dtos.Country;
import com.sampol.countries.dtos.CountryWithInfo;
import com.sampol.countries.dtos.CountryWrapper;

@Service
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
