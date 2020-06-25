package com.sdavis.cat_project;
//when we are creating a test class, just begin with class name for junit test
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PersianTest {
	public static Persian katniss;
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		katniss= new Persian("Katniss", "female", 1, true, 1.62);
		
		
	}

	@Test
	void test() {
		assertTrue(katniss.isAMouser());
		katniss.meow(2);
		katniss.jump(5);
		
		
	}

}
