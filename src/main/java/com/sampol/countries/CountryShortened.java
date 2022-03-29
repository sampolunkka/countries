package com.sampol.countries;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryShortened implements Serializable{
    
    private String name;
    private String country_code;


    @SuppressWarnings("unchecked")
    @JsonProperty("name")
    private void unpackNestedName(Map<String, Object> name) {
        this.name = (String)name.get("common");
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("cca2")
    private void convertCca2(String cca2) {
        this.country_code = cca2;
    }

    public String getCountry_code() {
        return country_code;
    }

    public String getName() {
        return name;
    }
}