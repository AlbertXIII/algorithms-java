package com.leetcode.zero;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
		System.out.println(Arrays.toString(twoSum(new int[]{3,7,11,5,4,1}, 9)));
	}
	
	private static  int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if(map.containsKey(diff)) {
				res[0] = map.get(diff);
				res[1] = i;
				return res;
			}
			System.out.println(nums[i] + " " + i);
			map.put(nums[i], i);
		}
		return res;
	}

}
