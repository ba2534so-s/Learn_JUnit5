package lesson.junit5.lesson8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestArrays {

	@Test
	void testArrays() {
		int[] expected = {2, 3, 7, 5};
		int[] actual = {2, 3, 5, 7};
	}

}
