package com.sampol.countries;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;

@SpringBootTest
class CountriesApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testMultiplication () {
		final int expected = 4;
		final int actual = CountriesApplication.multiply(2, 2);
		Assert.assertEquals(expected, actual);
	}

}
