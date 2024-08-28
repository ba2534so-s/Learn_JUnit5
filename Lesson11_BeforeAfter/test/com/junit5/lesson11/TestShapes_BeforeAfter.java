package com.junit5.lesson11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestShapes_BeforeAfter {

	Shapes shape;
	
	
	@Test
	void testCalcSquareArea() {
		Shapes shape = new Shapes();
		assertEquals(576, shape.calcSquareArea(24));
	}
	
	@Test
	void testCalcCircleArea() {
		Shapes shape = new Shapes();
		assertEquals(78.5, shape.calcCircleArea(5));
	}

}
