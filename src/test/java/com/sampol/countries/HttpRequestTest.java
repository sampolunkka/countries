package com.sampol.countries;


import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    public void getFinlandShouldReturnInCorrectFormat() throws Exception {
        String expectedResponseString = "{\"name\":\"Finland\",\"country_code\":\"FI\",\"capital\":\"Helsinki\",\"population";
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/countries/finland", String.class)).contains(expectedResponseString);

    }

    @Test
    public void getAllCountriesShouldReturnInCorrectFormat() throws Exception {
        String expectedResponseString = "{\"name\":\"Finland\",\"country_code\":\"FI\"}";
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/countries", String.class)).contains(expectedResponseString);
    }
    
}
