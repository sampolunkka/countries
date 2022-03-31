package com.sampol.countries.dtos;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryWithInfo extends Country {
    
    private String capital;
    private int population;
    private String flag_file_url;


    @JsonProperty("flags")
    private void unpackNestedFlags(Map<String, Object> flags) {
        this.flag_file_url = (String)flags.get("png");
    }

    @JsonProperty("capital")
    private void unpackCapitalList(String[] capital) {
        this.capital = capital[0];
    }

    public String getCapital() {
        return capital;
    }
    public int getPopulation() {
        return population;
    }
    public String getFlag_file_url() {
        return flag_file_url;
    }


}
