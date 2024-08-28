package com.junit5.lesson11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestShapes_BeforeAfter {

	Shapes shape;
	
	@BeforeEach
	void init() {
		shape = new Shapes();
		System.out.println("Before Test");
	}
	
	
	@Test
	void testCalcSquareArea() {
		assertEquals(576, shape.calcSquareArea(24));
	}
	
	@Test
	void testCalcCircleArea() {
		assertEquals(78.5, shape.calcCircleArea(5));
	}

}
