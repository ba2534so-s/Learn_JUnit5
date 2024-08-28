package com.junit5.lesson7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestShapes {
	
	Shapes shape = new Shapes();

	@Test
	void testCalcSquareArea() {
		assertEquals(576, shape.calcSquareArea(24), "Area of square calculation is wrong");
	}
	
	@Test
	void testCalcCircleArea() {
		assertEquals(78.5, shape.calcCircleArea(5), "Area of circle calculation is wrong");
	}
	
	@Test
	void testCalcCircleArea_Supplier() {
		assertEquals(76.5, shape.calcCircleArea(5), () -> "Area of circle calculation is wrong");
	}

}
