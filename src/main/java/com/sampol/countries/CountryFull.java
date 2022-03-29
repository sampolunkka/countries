package com.sampol.countries;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryFull implements Serializable{
    
    private String name;
    private String country_code;
    private String capital;
    private String population;
    private String flag_file_url;


    @SuppressWarnings("unchecked")
    @JsonProperty("name")
    private void unpackNestedName(Map<String, Object> name) {
        this.name = (String)name.get("common");
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("flags")
    private void unpackNestedFlags(Map<String, Object> flags) {
        this.flag_file_url = (String)flags.get("png");
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("capital")
    private void unpackCapitalList(String[] capital) {
        this.capital = capital[0];
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("cca2")
    private void convertCca2(String cca2) {
        this.country_code = cca2;
    }

    public String getCapital() {
        return capital;
    }
    public String getCountry_code() {
        return country_code;
    }
    public String getName() {
        return name;
    }
    public String getPopulation() {
        return population;
    }
    public String getFlag_file_url() {
        return flag_file_url;
    }


}
