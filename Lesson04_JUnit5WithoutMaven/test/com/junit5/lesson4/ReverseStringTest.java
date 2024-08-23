package com.junit5.lesson4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString reverse = new ReverseString();
		String actual = reverse.reverseString("Hello");
		String expected = "olleH";
		
		assertEquals(expected, actual);
	}

}
