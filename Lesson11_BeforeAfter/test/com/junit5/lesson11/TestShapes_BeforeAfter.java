package com.junit5.lesson11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestShapes_BeforeAfter {

	TestShapes_BeforeAfter() {
		System.out.println("Test object created");
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Starting tests...");
		System.out.println("Before All Tests");
	}
	
	Shapes shape;
	
	// Usually used to get resources that the test methods use
	@BeforeEach
	void init() {
		shape = new Shapes();
		System.out.println("Before Test");
	}
	
	
	@Test
	void testCalcSquareArea() {
		assertEquals(576, shape.calcSquareArea(24));
		System.out.println("Testing calcSquareArea");
	}
	
	@Test
	void testCalcCircleArea() {
		assertEquals(78.5, shape.calcCircleArea(5));
		System.out.println("Testing calcCircleArea");
	}
	
	
	// Usually used to close/destroy resources that the test methods use
	@AfterEach
	void destroy() {
		System.out.println("After Test");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After All Tests");
		System.out.println("Closing Tests...");
	}

}
