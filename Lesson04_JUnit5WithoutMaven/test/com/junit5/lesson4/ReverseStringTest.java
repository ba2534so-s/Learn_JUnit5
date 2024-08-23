package com.junit5.lesson4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString reverse = new ReverseString();
		assertEquals("olleH", reverse.reverseString("Hello"));
	}

}
