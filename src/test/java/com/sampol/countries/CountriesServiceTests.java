package com.sampol.countries;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CountriesServiceTests {


    @Autowired
    CountriesService service;

    @Test
    void countriesServiceLoads() {
        assertThat(service).isNotNull();
    }

    @Test
    void getAllCountriesShouldReturnNotNull() {
        assertThat(service.getAllCountries()).isNotNull();
    }
}
