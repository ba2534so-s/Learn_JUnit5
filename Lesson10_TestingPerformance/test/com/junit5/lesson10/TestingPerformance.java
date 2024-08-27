package com.junit5.lesson10;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TestingPerformance {

	@Test
	void testSortingMethod_Performance() {
		SortArray sort = new SortArray();
		
		int[] unsorted = {7, 3, 4};
		
		assertTimeout(Duration.ofMillis(10), () -> sort.sortArray(unsorted));
	}

}
