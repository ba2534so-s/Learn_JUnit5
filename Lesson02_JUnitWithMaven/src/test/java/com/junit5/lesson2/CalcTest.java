package com.junit5.lesson2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		Calc c = new Calc();
		int actualValue = c.divide(10, 5);
	}

}
