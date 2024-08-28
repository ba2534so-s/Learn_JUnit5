package com.junit5.lesson9;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestException {
	
	SortingArray sort = new SortingArray();

	@Test
	void testSortingArray_exception() {
		
		//int[] unsorted = {5, 2, 3};
		//int[] sorted = sort.sortArray(unsorted);
		/*
		try {
			int[] unsorted = null;
			int[] sorted = sort.sortArray(unsorted);
			
			for (int i : sorted) {
				System.out.println(i);
			}
			System.out.println("Statement below exception");
			
			
		} catch (NullPointerException e) {
			System.out.println("Exception executed");
		}
		*/
		int[] unsorted = null;
		assertThrows(NullPointerException.class, () -> sort.sortArray(unsorted));
		
	}

}
