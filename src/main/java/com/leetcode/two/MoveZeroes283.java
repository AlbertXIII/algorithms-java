package com.leetcode.two;

import java.util.Arrays;

public class MoveZeroes283 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(moveZeroesK(new int[] {0,1,0,3,12})));
	}

	private static int[] moveZeroesK(int[] nums) {

		int idx = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) nums[idx++] = nums[i];
		}
		
		for(int i = idx; i < nums.length; i++) {
			nums[i] = 0;
		}
		
		return nums;
		
	}

}
