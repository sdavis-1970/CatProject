package com.sdavis.cat_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BrittishShortHairTest {
	
	public static BrittishShortHair garfield;
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		garfield = new BrittishShortHair("Garfield", "male", 10, false, 10.2);
		
		
	}

	@Test
	void test() {
		assertTrue(garfield instanceof Cat);
		assertEquals("Garfield", garfield.getName());
		assertEquals("male", garfield.getGender());
		assertEquals(10, garfield.getAge());
		assertNotEquals(7, garfield.getAge());
		assertEquals(10.2, garfield.getWeight());
		
		
		garfield.meow(5);
		garfield.scratch(1);
		
		
		
	}

}
