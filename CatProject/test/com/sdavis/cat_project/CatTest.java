package com.sdavis.cat_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CatTest {
	
	private static Cat felix;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		felix = new Cat("Felix", "male", 6, true, 3.6);
				
		
	}

	@Test
	// <method under test>_<GivenParameters>_<Result You Expect>()
	void cat_GivenThreeparameters_ShouldConstructCat() {
		assertTrue(felix instanceof Cat);
		assertEquals("Felix", felix.getName());
		assertEquals("male", felix.getGender());
		assertEquals(6, felix.getAge());
		assertNotEquals(7, felix.getAge());	
		
	}

}
