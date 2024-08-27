package lesson.junit5.lesson8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestArrays {

	@Test
	void testArrays() {
		int[] expected = {2, 3, 5, 9};
		int[] actual = {2, 9, 5, 3};
		
		Arrays.sort(actual);
		
		assertArrayEquals(expected, actual);
	}

}
