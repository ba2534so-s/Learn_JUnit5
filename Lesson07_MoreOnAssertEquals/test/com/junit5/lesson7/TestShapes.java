package com.junit5.lesson7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestShapes {
	
	Shapes shape = new Shapes();

	@Test
	void testCalcSquareArea() {
		assertEquals(576, shape.calcSquareArea(24));
	}

}
