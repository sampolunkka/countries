package com.sampol.countries;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country implements Serializable {

    private Name name;
    private String cca2;
    private String[] capital;
    private int population;
    private Flags flags;

    public Country() {
    }

    public String getCca2() {
        return cca2;
    }

    public Name getName() {
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
}
