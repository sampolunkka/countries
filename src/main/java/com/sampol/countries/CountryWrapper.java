package com.sampol.countries;

import java.io.Serializable;
import java.util.List;

public class CountryWrapper implements Serializable {
    private List<Country> countries;

    public CountryWrapper(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
    }
}