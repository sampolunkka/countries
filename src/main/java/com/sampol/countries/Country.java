package com.sampol.countries;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country implements Serializable {

    private String name;
    private String cca2;
    private String[] capital;
    private int population;
    private Flags flags;
    private String boob;

    public Country() {
    }
    @JsonProperty("country_code")
    public String getCca2() {
        return cca2;
    }
    @JsonProperty("name1")
    public String getBoob() {
        return "boob";
    }

    public String getName() {
        return name;
    }

    public String[] getCapital() {
        return capital;
    }
    
    public int getPopulation() {
        return population;
    }
    public Flags getFlags() {
        return flags;
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("name")
    private void unpackNestedName(Map<String, Object> name) {
        this.name = (String)name.get("common");
    }
    
    @Override
    public String toString() {
      return "Greeting{" +
          "message='" + cca2 + '\'' +
          '}';
    }
}
