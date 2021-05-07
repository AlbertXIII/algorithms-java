package com.leetcode.two;

import java.util.Arrays;

public class ValidAnagram242 {

	public static void main(String[] args) {
		System.out.println(isAnagram("remy", "emyr"));
		System.out.println(isAnagramK("remy", "emyr"));
	}
	
	private static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) return false;
		
		char[] a = s.toCharArray(), b = t.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		return Arrays.equals(a, b) ? true : false;
	}
	
	private static boolean isAnagramK(String s, String t) {
		if(s.length() != t.length()) return false;
		int[] counts = new int[26];
		
		for(int i = 0; i < s.length(); i++) {
			counts[s.charAt(i) - 'a']++;
			counts[t.charAt(i) - 'a']--;
		}
		
		for(int i : counts) {
			if(i != 0) return false;
		}
		
		return true;
	}

}
