package com.leetcode.two;

public class PowerOfTwo231 {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(4));

	}
	
	private static boolean isPowerOfTwo(int n) {
		if(n < 1) return false;
		long i = 1;
		while(i < n) {
			i *= 2;
		}
		return i == n;
	}

}
