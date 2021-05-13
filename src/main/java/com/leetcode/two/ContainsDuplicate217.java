package com.leetcode.two;

import java.util.HashSet;

public class ContainsDuplicate217 {

	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] {1, 2, 3, 1}));
		System.out.println(containsDuplicate(new int[] {1, 2, 3, 4}));
	}
	
	private static boolean containsDuplicate(int[] nums) {
		if(nums == null || nums.length == 0) return false;
		HashSet<Integer> set = new HashSet<>();
		for(int i : nums) {
			if(!set.add(i)) return true;
		}
		return false;
	}

}
