package com.junit5.lesson3;

public class ReverseString {
	
	public String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		
		
		while (left < right) {
			// Swap the chars at the left and right positions
			char temp = charArray[left];
			charArray[left] = charArray[right];
		}
		
		return new String(charArray);
	}

}
