package com.junit5.lesson4;

public class ReverseString {
	
	public String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		
		
		return new String(charArray);
	}

}
