package com.leetcode.four;

public class HammingDistance461 {

	public static void main(String[] args) {
		System.out.println(hammingDistanceK(1, 4));
	}
	//binary difference
	//xor bitwise operator ^
	private static int hammingDistanceK(int x, int y) {
		int hd = 0;
		while(x > 0 || y > 0) {
			hd += (x % 2) ^ (y % 2);
			x >>= 1;
			y >>= 1;
		}
		return hd;
	}

}
