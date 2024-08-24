package com.junit5.lesson5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes shape = new Shapes();

	@Test
	void testCalcSquareArea() {
		
		assertEquals(576, shape.calcSquareArea(24), "calcSquareArea Failed");
	}
	
	@Test
	void testCalcCircleArea() {
		assertEquals(78,5, shape.calcCircleArea(5), "calcCircleArea Failed");
	}

}
