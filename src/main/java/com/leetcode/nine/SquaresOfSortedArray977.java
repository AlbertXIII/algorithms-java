package com.leetcode.nine;

import java.util.Arrays;

public class SquaresOfSortedArray977 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortedSquares(new int[] {-4,-1,0,3,10})));
	}
	
	private static int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}
