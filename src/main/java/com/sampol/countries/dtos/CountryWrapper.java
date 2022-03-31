package com.sampol.countries.dtos;

import java.io.Serializable;
import java.util.List;
/**
 * Wrapper class to wrap Country DTOs
 * Made to achieve response format "countries: .... "
 */
public class CountryWrapper implements Serializable {
    private List<Country> countries;

    public CountryWrapper(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
    }
}