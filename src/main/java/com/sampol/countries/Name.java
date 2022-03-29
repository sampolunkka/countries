package com.sampol.countries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Name {

    private String common;

    public String getCommon() {
        return common;
    }

    @Override
    public String toString() {
        return getCommon();
    }
}
