package com.junit5.lesson6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrial {

	@Test
	void test() {
		assertEquals(6, 3+3);
	}
	
	@Test
	void testCalcSquareArea() {
		Shapes shape = new Shapes();
	}

}
