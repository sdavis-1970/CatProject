package com.sdavis.cat_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PersianTest {
	
	private static Cat Garfield;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Garfield = new Cat("Garfield", "male", 10, false, 10.2);
		
	}

	@Test
	// <method under test>_<GivenParameters>_<Result You Expect>()
			void PersianTest_GivenThreeparameters_ShouldConstructPersian() {
				assertTrue(Garfield instanceof Cat);
				assertEquals("Garfield", Garfield.getName());
				assertEquals("male", Garfield.getGender());
				assertEquals(10, Garfield.getAge());
				assertNotEquals(3, Garfield.getAge());
				//assertEquals("Garfield", Garfield.getisAMouser());
	}

}
