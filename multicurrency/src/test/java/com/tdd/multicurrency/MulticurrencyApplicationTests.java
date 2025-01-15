package com.tdd.multicurrency;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tdd.multicurrency.dto.Dollar;

@SpringBootTest
class MulticurrencyApplicationTests {

	private Dollar five;

	@Test
	void contextLoads() {

	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("before all is called");
	}

	@BeforeEach
	void setUp() throws Exception {
		five = new Dollar(5.0);
	}

	@Test
	void testApplication() {
		five.times(2.0);
		assertEquals(10.0, five.amount);
	}

	@Test
	void testEquality() {
		assertNotEquals(new Dollar(5.0), new Dollar(2.0));
	}

	@AfterEach
	public void tearDown() {
		System.out.println("after each is called");
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after all is called");
	}
}
