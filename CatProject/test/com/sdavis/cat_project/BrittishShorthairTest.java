package com.sdavis.cat_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BrittishShorthairTest {
	
	private static Cat Katniss;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Katniss = new Cat("Katniss", "female", 1, false, 1.62);
		
		
	}

	@Test
	// <method under test>_<GivenParameters>_<Result You Expect>()
		void brittishShorthairTest_GivenThreeparameters_ShouldConstructbrittishShorthair() {
			assertTrue(Katniss instanceof Cat);
			assertEquals("Katniss", Katniss.getName());
			assertEquals("female", Katniss.getGender());
			assertEquals(6, Katniss.getAge());
			assertNotEquals(7, Katniss.getAge());
			
			
			

}
}