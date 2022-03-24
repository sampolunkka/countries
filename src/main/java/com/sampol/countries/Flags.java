package com.sampol.countries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flags {

    private String svg;
    private String png;

    public String getPng() {
        return png;
    }
    public String getSvg() {
        return svg;
    }
}
