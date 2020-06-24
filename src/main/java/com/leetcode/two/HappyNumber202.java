package com.leetcode.two;

import java.util.HashSet;

public class HappyNumber202 {

	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}

	// google fb O(n) O(1)
	static public boolean isHappy(int n) {
		if (n < 1) return false;
		HashSet<Integer> seen = new HashSet<>();
		while (n != 1) {
			int current = n;
			int sum = 0;
			while (current != 0) {
				sum += (current % 10) * (current % 10);
				current /= 10;
			}
			if (seen.contains(sum)) return false;
			System.out.println(sum);
			seen.add(sum);
			n = sum;
		}
		return true;
	}

}
