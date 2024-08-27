package com.junit5.lesson9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestException {
	
	SortingArray sort = new SortingArray();

	@Test
	void testSortingArray_exception() {
		int[] unsorted = {5, 2, 3};
		int[] sorted = sort.sortArray(unsorted);
		
		fail("Not yet implemented");
	}

}
