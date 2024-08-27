package com.junit5.lesson10;

import java.util.Arrays;

public class SortArray {
	
	public int[] sortArray(int[] array) {
		for (int i = 0; i < 1000000; i++) {
			Arrays.sort(array);
		}
		return array;
	}
}
