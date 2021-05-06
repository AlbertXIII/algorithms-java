package com.leetcode.three;

public class ReverseString344 {

	public static void main(String[] args) {
		System.out.println(reverseString("marvelous"));
	}
	
	private static String reverseString(String s){
		char[] chars = s.toCharArray();
		int l = 0, r = chars.length - 1;
		System.out.println(r);
		while(l < r) {
			//save left char in tmp 
			char tmp = chars[l];
			//swap left <-> right and increment left
			chars[l++] = chars[r];
			//swap right for left and decrement right
			chars[r--] = tmp;
		}
		return new String(chars);
	}

}
